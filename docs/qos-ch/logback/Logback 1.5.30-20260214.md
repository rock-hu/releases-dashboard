# Logback 1.5.30

## release on 20260214
## description
## changes
<strong>2026-02-14 Release of logback version 1.5.30</strong>

• <strong>In this version, logback-classic.jar was missing the META-INF/services directory, making it unusable with SLF4J. Version 1.5.31 (released later on the same day) fixes this issue.</strong>

• Fix scanning issue when an included file becomes available at a later time. This problem was reported in <a href="https://github.com/qos-ch/logback/issues/1021" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1021/hovercard">issues/1021</a> by Sergey Nazarov.

• Standardized code for version checking across modules.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/44164f10ca3fb44ce0e68519f13564b87e3aca61/hovercard" href="https://github.com/qos-ch/logback/commit/44164f10ca3fb44ce0e68519f13564b87e3aca61"><tt>44164f1</tt></a> associated with the tag v_1.5.30. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

