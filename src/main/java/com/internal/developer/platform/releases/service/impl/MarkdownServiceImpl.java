package com.internal.developer.platform.releases.service.impl;

import com.internal.developer.platform.releases.domain.Release;
import com.internal.developer.platform.releases.service.MarkdownService;
import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class MarkdownServiceImpl implements MarkdownService {

	public boolean markdown(Release release, File dir) throws IOException {
		File markdown = new File(dir, String.format("%s.md", release.getTitle()));
		if (markdown.exists()) {
			markdown.delete();
		}
		markdown.createNewFile();
		return true;
	}

}
