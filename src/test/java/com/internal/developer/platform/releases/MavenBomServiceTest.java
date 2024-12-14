package com.internal.developer.platform.releases;

import com.internal.developer.platform.releases.service.MavenBomService;
import com.internal.developer.platform.releases.service.ReleaseService;
import com.internal.developer.platform.releases.service.RssService;
import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MavenBomServiceTest {

	@Autowired
	MavenBomService mavenBomService;

	String pom = "docs/dependencies/spring-boot-dependencies-3.2.3.pom";

	@Disabled
	@Test
	public void testMavenBomService() throws IOException, XmlPullParserException {
		mavenBomService.artifacts(pom);
	}

}
