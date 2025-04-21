# Logback 1.5.17

## release on 20250225
## description
## changes
<strong>2025-02-25 Release of logback version 1.5.17</strong>

• Fixed Jansi 2.4.0 color-coded output not working on Windows CMD.exe console when the default terminal application is set to "Windows Console Host". This problem was reported in issues/753 by Michael Lyubkin.

• Fixed race condition occurring in case MDC class is initialized while org.slf4j.LoggerFactory is initializing logback-classic's LoggerContext. When this race conditions occurs, the MDCAdapter instance used by MDC does not match the instance used by logback-classic. This issue was reported in SLF4J issues/450. While logback-classic version 1.5.17 remains compatible with SLF4J versions in the 2.0.x series, fixing this particular MDC issue requires SLF4J version 2.0.17.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/10358724ed723b3745c010aa40cb02a2dfed4593/hovercard" href="https://github.com/qos-ch/logback/commit/10358724ed723b3745c010aa40cb02a2dfed4593"><tt>1035872</tt></a> associated with the tag v_1.5.17. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

