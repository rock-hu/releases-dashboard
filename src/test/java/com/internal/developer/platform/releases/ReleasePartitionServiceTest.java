package com.internal.developer.platform.releases;

import com.internal.developer.platform.releases.configuration.AtomProperties;
import com.internal.developer.platform.releases.service.ReleasePartitionService;
import com.internal.developer.platform.releases.service.ReleaseService;
import com.internal.developer.platform.releases.service.RssService;
import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReleasePartitionServiceTest {
	@Autowired
	ReleasePartitionService releasePartitionService;

	@Autowired
	AtomProperties atomProperties;

	@Disabled
	@Test
	public void testReleases() throws IllegalArgumentException, IOException, FeedException, InterruptedException, ExecutionException {
		releasePartitionService.releases(atomProperties.getRepositories(), 5);
	}

}
