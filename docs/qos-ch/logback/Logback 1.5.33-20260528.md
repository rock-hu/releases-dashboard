# Logback 1.5.33

## release on 20260528
## description
## changes
<strong>2026-05-27 Release of logback version 1.5.33</strong>

• <code>PropertiesConfiguratorModelHandler</code> now registers properties file URLs to the <code>ConfigurationWatchList</code> when scan is enabled (via local scan="true" attribute or top-level configuration scan), ensuring changes are detected and reconfiguration occurs. This problem was reported in <a href="https://github.com/qos-ch/logback/issues/1034" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1034/hovercard">issues/1034</a>.

• When processing <code>&lt;conversionRule&gt;</code> elements and both <code>class</code> and <code>converterClass</code> attributes are specified, silently use the class attribute without issuing a warning. However, if the attribute values differ, a warning will be issued. This change was requested in <a href="https://github.com/qos-ch/logback/issues/1031" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1031/hovercard">issues/1031</a>.

• <code>HardenedModelInputStream</code> will no longer accept to deserialize all classes located under the "java.lang" and "java.util" packages but a limited number of explicitly authorized classes in those packages. This potential deserialization whitelist bypass vulnerability was reported by <a href="https://github.com/york-shen">York Shen</a> and registered as <a href="https://www.cve.org/cverecord?id=CVE-2026-9828" rel="nofollow">CVE-2026-9828</a>.

• SSL parameters for <code>SSLSocketAppender</code> now enable hostname verification by default. Moreover, the default protocol is now "TLSv1.2". This potential vulnerability was reported by York Shen.

• When printing the status message field, <code>ViewStatusMessagesServletBase</code> now escapes special characters such as "&" as character entities. This potential vulnerability was reported by York Shen.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/124e8b49b55ac34d08743a0646bd463410192647/hovercard" href="https://github.com/qos-ch/logback/commit/124e8b49b55ac34d08743a0646bd463410192647"><tt>124e8b4</tt></a> associated with the tag v_1.5.33. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

