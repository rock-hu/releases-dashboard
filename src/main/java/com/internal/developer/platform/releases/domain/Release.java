package com.internal.developer.platform.releases.domain;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Release {

	private String title;
	private String link;

	private String version;
	private Date releaseDate;
	private Content description;

	private String id;

	private List<Content> contents;
}
