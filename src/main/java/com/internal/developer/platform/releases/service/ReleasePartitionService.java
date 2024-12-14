package com.internal.developer.platform.releases.service;

import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public interface ReleasePartitionService {
	public int releases(List<String> atoms, int partition)
			throws IOException, IllegalArgumentException, FeedException, InterruptedException, ExecutionException;
}
