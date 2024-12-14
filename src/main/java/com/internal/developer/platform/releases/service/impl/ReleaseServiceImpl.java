package com.internal.developer.platform.releases.service.impl;

import com.internal.developer.platform.releases.domain.Content;
import com.internal.developer.platform.releases.domain.Release;
import com.internal.developer.platform.releases.domain.Releases;
import com.internal.developer.platform.releases.service.MarkdownService;
import com.internal.developer.platform.releases.service.ReleaseService;
import com.internal.developer.platform.releases.service.RssService;
import com.rometools.rome.io.FeedException;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	MarkdownService markdownService;

	@Autowired
	RssService rssService;
	@Autowired
	FlexmarkHtmlConverter flexmarkHtmlConverter;

	@Override
	public int releases(String atom) throws IOException, IllegalArgumentException, FeedException {

		int totals = 0;

		String canonical = StringUtils.substringBetween(atom, "github.com/", "/releases.atom");

		System.out.println(canonical);

		String[] tokens = StringUtils.split(canonical, "/");

		String organization = tokens[0];
		String repository = tokens[1];

		log.debug("organization:{},repository:{}", organization, repository);

		File docs = new File("docs");
		docs.mkdirs();

		File dir = new File(docs, String.format("%s/%s", organization, repository));
		dir.mkdirs();

		File gitkeep = new File(dir, ".gitkeep");
		gitkeep.createNewFile();

		File readme = new File(dir, "README.md");
		readme.createNewFile();

		Releases releases = rssService.releases(atom);

		if (CollectionUtils.isNotEmpty(releases.getReleases())) {

			log.debug("{} markdown files would create under {}", releases.getReleases().size(), dir.getAbsolutePath());

			for (Release release : releases.getReleases()) {
				int update = release(release, dir);
				totals = totals + update;
			}
		} else {
			log.warn("none releases found for :{}", atom);
		}

		index(dir, readme, organization, repository);
		return totals;
	}

	private void index(File dir, File readme, String organization, String repository) throws IOException {
		List<String> lines = new ArrayList<String>();
		lines.add(String.format("# %s	", repository));

		lines.add(System.lineSeparator());

		lines.add("|version|release date|changes|");
		lines.add("|---|---|---|");

		String[] releases = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return StringUtils.endsWith(name, ".md") && !StringUtils.equals(name, readme.getName());
			}

		});

		if (ArrayUtils.isNotEmpty(releases)) {

			for (String release : releases) {
				String filename = StringUtils.substringBeforeLast(release, ".md");

				String version = StringUtils.substringBeforeLast(filename, "-");
				String date = StringUtils.substringAfterLast(filename, "-");

				lines.add(String.format("|%s|%s|[%s](./%s)|", version, date, version, release));
			}

		}

		FileUtils.writeLines(readme, Charsets.UTF_8.name(), lines, System.lineSeparator(), false);
	}

	private int release(Release release, File dir) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		String releaseDate = sdf.format(release.getReleaseDate());

		dir.mkdirs();

		File markdown = new File(dir, String.format("%s-%s.md", release.getTitle(), releaseDate));

		if (markdown.exists()) {
			System.out.println(String.format("release found: %s, ignore generate markdown from rss feed.", markdown.getName()));
			return 0;
		}
		markdown.createNewFile();

		List<String> lines = new ArrayList<String>();

		lines.add("# " + release.getTitle() + System.lineSeparator());

		lines.add(String.format("## release on %s", releaseDate));

		lines.add("## description");
		if (release.getDescription() != null) {
			if (StringUtils.equals(release.getDescription().getType(), "html")) {
				lines.add(htmlMarkdown(release.getDescription()));
			} else {
				lines.add(release.getDescription().getValue());
			}
		}

		lines.add("## changes");

		if (CollectionUtils.isNotEmpty(release.getContents())) {
			for (Content change : release.getContents()) {
				if (StringUtils.equals(change.getType(), "html")) {
					lines.add(htmlMarkdown(change));
				} else {
					lines.add(change.getValue());
				}
			}
		}

		FileUtils.writeLines(markdown, lines, System.lineSeparator(), false);

		return 1;
	}

	private String htmlMarkdown(Content content) {
		return flexmarkHtmlConverter.convert(content.getValue());
	}
}
