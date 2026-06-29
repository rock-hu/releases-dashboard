# Logback 1.5.37

## release on 20260626
## description
## changes
<strong>2026-06-26 Release of logback version 1.5.37</strong>

• Given the numerous vulnerabilities related to conditional configuration processing based on the evaluation of Java expressions using the Janino library, support for such expressions has been removed. Users are offered the an <a href="https://logback.qos.ch/translator/services/conditionalConfigMigrator.html" rel="nofollow">online migration service</a> or the element introduced in version 1.5.20. See the <a href="https://logback.qos.ch/manual/configuration.html#conditional" rel="nofollow">relevant documentation</a> for more details.

• A bitwise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/c1df7f522e648eec7b4ef6a12c8758fec0f00048/hovercard" href="https://github.com/qos-ch/logback/commit/c1df7f522e648eec7b4ef6a12c8758fec0f00048"><tt>c1df7f5</tt></a> associated with the tag v_1.5.37. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

