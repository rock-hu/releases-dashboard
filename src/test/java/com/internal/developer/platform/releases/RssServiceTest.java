package com.internal.developer.platform.releases;

import com.internal.developer.platform.releases.service.ReleaseService;
import com.internal.developer.platform.releases.service.RssService;
import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RssServiceTest {

	@Autowired
	RssService rssService;

	@Autowired
	ReleaseService releaseService;

	@Disabled
	@ParameterizedTest
	@CsvFileSource(resources = "/atom.csv")
	public void testReleases(String atom) throws IllegalArgumentException, MalformedURLException, FeedException, IOException {
		releaseService.releases(atom);
	}
}
