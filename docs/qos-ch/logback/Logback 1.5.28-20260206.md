# Logback 1.5.28

## release on 20260206
## description
## changes
<strong>2026-02-06 Release of logback version 1.5.28</strong>

• Appender names or appender references are no longer subject to variable substitution.

• Fixed issue with configurations with conditionals encompassing appenders. This was reported in <a href="https://github.com/qos-ch/logback/issues/1016" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1016/hovercard">issues/1016</a> reported by Sergey Sazonov.

• The element now admits a 'scan' attribute which can be used to override the 'scan' attribute in the element.

• Fixed NullPointerException thrown by VersionUtil.checkForVersionEquality method occurring with GraalVM Native Images. This issue was reported in <a href="https://github.com/qos-ch/logback/issues/1014" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1014/hovercard">issues/1014</a>.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/e7a1855ab562bb102333f754603ff89359bf3cfc/hovercard" href="https://github.com/qos-ch/logback/commit/e7a1855ab562bb102333f754603ff89359bf3cfc"><tt>e7a1855</tt></a> associated with the tag v_1.5.28. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

