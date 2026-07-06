# Logback 1.5.35

## release on 20260701
## description
## changes
<strong>026-06-23 Release of logback version 1.5.35</strong>

• The 'condition' attribute in <code>&lt;if&gt;</code> elements now rejects unicode escape sequences (\u and \U). This closes a bypass of the existing prohibition on the new operator in Janino-evaluated conditions. This issue was reported by IcySun (<a href="mailto:icysun@qq.com">icysun@qq.com</a>) and registered as <a href="https://www.cve.org/cverecord?id=CVE-2026-13006" rel="nofollow">CVE-2026-13006</a>. <strong>Please note that version 1.5.37 provides the full fix to this vulnerability.</strong>

• Added <code>ConfiguratorRank.AUTHENTICATING</code> (rank 100), the highest configurator rank, for certified/authenticating configurators discovered via the ServiceLoader mechanism. <code>ContextInitializer</code> now requires that at most one such configurator exist on the classpath; if more than one is found, initialization aborts with an error.

• <code>ConsoleCharsetPropertyDefiner</code> is no longer shipped. The Java 21 multi-release compilation of logback-core has been disabled, which removes this class from the published artifact. Configurations that referenced <code>ch.qos.logback.core.property.ConsoleCharsetPropertyDefiner</code> will need an alternative approach for console charset detection.

• The logback-examples module is now included in artifacts published to Maven Central.

• <code>JoranConfigurator.makeAnotherInstance()</code> and <code>DefaultJoranConfigurator.performMultiStepConfigurationFileSearch()</code> are now protected, allowing derived configurators to override these methods.

• A bitwise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/08bd1598d565d83444f72983935e7da4746783b7/hovercard" href="https://github.com/qos-ch/logback/commit/08bd1598d565d83444f72983935e7da4746783b7"><tt>08bd159</tt></a> associated with the tag v_1.5.35. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

