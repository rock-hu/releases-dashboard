# Logback 1.5.26

## release on 20260125
## description
## changes
<strong>2026-01-25 Release of logback version 1.5.26</strong>

• InsertFromJNDIModelHandler was accessing javax.naming package forcing the inclusion of the optional java.naming module. This problem was raised in <a href="https://github.com/qos-ch/logback/issues/1003" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1003/hovercard">issues/1003</a> by Marius Hanl who also provided the relevant PR.

• In applications using shadow/fat/shade jars, module or package information could be lost. Thus, in the absence of version information, logback-classic would warn about version mismatches. Logback components now ship with properties files containing version information that survive shadow/fat/shade jars. This issue was reporteed in <a href="https://github.com/qos-ch/logback/issues/1002" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1002/hovercard">issues/1002</a> by Christoph Gritschenberger.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/33deb54506bbfaf1ff151f26f3a5f86936011619/hovercard" href="https://github.com/qos-ch/logback/commit/33deb54506bbfaf1ff151f26f3a5f86936011619"><tt>33deb54</tt></a> associated with the tag v_1.5.26. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

