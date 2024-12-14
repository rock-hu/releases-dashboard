package com.internal.developer.platform.releases.service.impl;

import com.internal.developer.platform.releases.domain.Content;
import com.internal.developer.platform.releases.domain.Release;
import com.internal.developer.platform.releases.domain.Releases;
import com.internal.developer.platform.releases.service.MarkdownService;
import com.internal.developer.platform.releases.service.RssService;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.io.XmlReader;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RssServiceImpl implements RssService {

	Map<String, String> requestHeaders = new HashMap<String, String>();

	@Override
	public Releases releases(String atom) throws IllegalArgumentException, MalformedURLException, FeedException, IOException {

		Releases releases = new Releases();
		XmlReader reader = null;
		try {
			URL url = new URL(atom);

			URLConnection connection = url.openConnection();

			reader = new XmlReader(connection, requestHeaders);

			SyndFeed feed = new SyndFeedInput().build(reader);

			if (CollectionUtils.isNotEmpty(feed.getEntries())) {
				List<SyndEntry> entries = feed.getEntries();

				List<Release> versions = new ArrayList<Release>();

				for (SyndEntry entry : entries) {
					Release release = release(entry);
					versions.add(release);

				}

				releases.setReleases(versions);

			}
		} catch (Exception e) {
			log.error(atom, e);
		} finally {
			if (reader != null) {
				reader.close();
			}

		}

		return releases;

	}

	private Release release(SyndEntry entry) throws IOException {
		Release release = new Release();

		release.setTitle(entry.getTitle());
		release.setReleaseDate(entry.getPublishedDate() == null ? entry.getUpdatedDate() : entry.getPublishedDate());
		release.setVersion(entry.getTitle());
		release.setLink(entry.getLink());

		if (entry.getDescription() != null) {
			release.setDescription(content(entry.getDescription()));
		}

		List<Content> changes = new ArrayList<Content>();

		List<SyndContent> contents = entry.getContents();
		if (CollectionUtils.isNotEmpty(contents)) {
			for (SyndContent content : contents) {
				Content change = content(content);
				changes.add(change);
			}

		}

		release.setContents(changes);

		return release;
	}

	private Content content(SyndContent synd) {
		Content content = new Content();
		content.setType(synd.getType());
		content.setValue(synd.getValue());
		return content;
	}

}
