package com.internal.developer.platform.releases.configuration;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "atom")
@Getter
@Setter
@Component
public class AtomProperties {

	private List<String> repositories;
}
