package com.internal.developer.platform.releases.service;

import com.internal.developer.platform.releases.domain.Release;
import java.io.File;
import java.io.IOException;

public interface MarkdownService {

	public boolean markdown(Release release, File dir) throws IOException;
}
