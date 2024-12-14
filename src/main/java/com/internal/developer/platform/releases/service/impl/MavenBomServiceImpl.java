
package com.internal.developer.platform.releases.service.impl;

import com.internal.developer.platform.releases.service.MavenBomService;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.DependencyManagement;
import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class MavenBomServiceImpl implements MavenBomService {

	private WebClient webClient = WebClient.create();

	@Override
	public void artifacts(String pom) throws IOException, XmlPullParserException {
		log.info(pom);
		Reader reader = new FileReader(pom);
		MavenXpp3Reader xpp3Reader = new MavenXpp3Reader();
		Model model = xpp3Reader.read(reader);

		model.getProfiles();
		model.getProperties();

		if (model.getDependencyManagement() != null) {
			dependencyManagement(model);
		} else {
			if (CollectionUtils.isNotEmpty(model.getDependencies())) {
				dependencies(model.getDependencies());
			}

		}
	}

	private void dependencyManagement(Model model) throws IOException, XmlPullParserException {
		DependencyManagement management = model.getDependencyManagement();
		if (CollectionUtils.isNotEmpty(management.getDependencies())) {
			for (Dependency dependency : management.getDependencies()) {
				if (StringUtils.equals(MavenBomService.DEPENDENCY_TYPE_POM, dependency.getType())) {
					billOfMaterials(dependency);
				} else {
					log.debug("{}:{}:{}", dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion());
				}

			}
		}
	}

	private void billOfMaterials(Dependency dependency) throws IOException, XmlPullParserException {
		log.info("{}:{}:{}", dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion());
		String xml = String.format("{}-{}.pom", dependency.getArtifactId(), dependency.getVersion());
		File dir = new File("docs/dependencies");
		String url = "https://repo1.maven.org/maven2/%s/%s/%s/%s-%s.pom";

		String uri = url.format(url, RegExUtils.replaceAll(dependency.getGroupId(), ".", "/"), dependency.getArtifactId(), dependency.getVersion(),
				dependency.getArtifactId(), dependency.getVersion());

		log.debug(uri);
		Mono<String> mono = webClient.get().uri(uri).retrieve().bodyToMono(String.class);
		File output = new File(dir, xml);
		mono.subscribe((response) -> {
			try {
				FileUtils.writeStringToFile(output, response, StandardCharsets.UTF_8.name(), false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		// docs/dependencies/
		artifacts(String.format("docs/dependencies/{}", xml));
	}

	private void dependencies(List<Dependency> dependencies) {
		if (CollectionUtils.isNotEmpty(dependencies)) {
			for (Dependency dependency : dependencies) {
				log.debug("{}:{}:{}", dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion());
			}
		}
	}
}
