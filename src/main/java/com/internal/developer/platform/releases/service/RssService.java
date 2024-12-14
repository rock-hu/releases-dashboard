package com.internal.developer.platform.releases.service;

import com.internal.developer.platform.releases.domain.Releases;
import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public interface RssService {

	public Releases releases(String atom) throws IllegalArgumentException, MalformedURLException, FeedException, IOException;

}
