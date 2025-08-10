package com.internal.developer.platform.releases;

import com.internal.developer.platform.releases.configuration.AtomProperties;
import com.internal.developer.platform.releases.service.MavenBomService;
import com.internal.developer.platform.releases.service.ReleasePartitionService;
import com.internal.developer.platform.releases.service.ReleaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	ReleaseService releaseService;

	@Autowired
	MavenBomService mavenBomService;

	@Autowired
	AtomProperties atomProperties;

	@Autowired
	ReleasePartitionService releasePartitionService;

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(Application.class, args)));
	}

	@Override
	public void run(String... args) throws Exception {
		for (String atom : atomProperties.getRepositories()) {
			log.info(atom);
			System.out.println(atom);
		}
		releasePartitionService.releases(atomProperties.getRepositories(), 10);

		releaseService.index();

	}

}
