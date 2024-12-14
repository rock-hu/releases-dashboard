package com.internal.developer.platform.releases.service.impl;

import com.google.common.collect.Lists;
import com.internal.developer.platform.releases.service.ReleasePartitionService;
import com.internal.developer.platform.releases.service.ReleaseService;
import com.internal.developer.platform.releases.worker.ReleaseWorker;
import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReleasePartitionServiceImpl implements ReleasePartitionService {

	@Autowired
	ReleaseService releaseService;

	@Override
	public int releases(List<String> atoms, int partition)
			throws IOException, IllegalArgumentException, FeedException, InterruptedException, ExecutionException {
		int totals = 0;
		List<List<String>> repositories = Lists.partition(atoms, partition);

		for (int index = 0; index < repositories.size(); index++) {
			int releases = partition(partition, 1, repositories.get(index));
			totals = totals + releases;
		}
		return totals;
	}

	private int partition(int partition, long delay, List<String> repositories) throws InterruptedException, ExecutionException {
		int subTotals = 0;

		List<ScheduledFuture<Integer>> holder = new ArrayList<ScheduledFuture<Integer>>();

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(repositories.size());

		try {
			for (String repository : repositories) {
				ReleaseWorker worker = new ReleaseWorker(releaseService, repository);
				ScheduledFuture<Integer> futures = executorService.schedule(worker, delay, TimeUnit.SECONDS);
				holder.add(futures);
			}

			for (ScheduledFuture<Integer> future : holder) {
				subTotals = subTotals + future.get();
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error(String.format("repositories{}, partition:{} , delay:{}", repositories, partition, delay), e);
		} finally {
			if (executorService != null && !executorService.isShutdown() && !executorService.isTerminated()) {
				executorService.shutdown();
			}
		}

		return subTotals;
	}

}
