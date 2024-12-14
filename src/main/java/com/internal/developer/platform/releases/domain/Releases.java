package com.internal.developer.platform.releases.domain;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Releases {

	// <id>tag:github.com,2008:https://github.com/callstack/repack/releases</id>
	// <link type="text/html" rel="alternate" href="https://github.com/callstack/repack/releases"/>
	// <link type="application/atom+xml" rel="self" href="https://github.com/callstack/repack/releases.atom"/>
	// <title>Release notes from repack</title>
	// <updated>2023-12-18T15:09:04Z</updated>

	private String title;
	private String link;
	private Date updated;
	private List<Release> releases;
}
