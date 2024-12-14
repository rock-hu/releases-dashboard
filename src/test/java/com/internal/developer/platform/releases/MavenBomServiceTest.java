package com.internal.developer.platform.releases;

import com.internal.developer.platform.releases.service.MavenBomService;
import java.io.IOException;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
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
