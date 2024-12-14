
package com.internal.developer.platform.releases.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public interface MavenBomService {

	public static final String DEPENDENCY_TYPE_POM = "pom";
	public static final String DEPENDENCY_SCOPE_IMPORT = "import";

	public void artifacts(String pom) throws IOException, XmlPullParserException;
}
