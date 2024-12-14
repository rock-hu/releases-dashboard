package com.internal.developer.platform.releases.service;

import com.rometools.rome.io.FeedException;
import java.io.IOException;

public interface ReleaseService {
	public int releases(String atom) throws IOException, IllegalArgumentException, FeedException;
}
