# Logback 1.5.25

## release on 20260121
## description
## changes
<strong>2026-01-17 Release of logback version 1.5.25</strong>

• When processing configuration files, logback-core will now only instantiate components compatible with the class expected by the encapsulating class. This fixes an ACE vulnerability recorded as <a href="https://www.cve.org/cverecord?id=CVE-2026-1225" rel="nofollow">CVE-2026-1225</a>.

• In configuration files, referencing a single undeclared appender would cause all referenced appenders to be skipped. This issue was discovered in <a href="https://github.com/qos-ch/logback/issues/997" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/997/hovercard">issues/997</a>.

• Added VersionUtil class to logback-core. This utility class checks for version compatibility issues and alerts the user if need be.

• Added <a href="https://logback.qos.ch/manual/layouts.html#epoch" rel="nofollow">EpochConverter</a> to output milliseconds/seconds since epoch. This enhancement was requested by Duncan Jauncey in <a href="https://github.com/qos-ch/logback/pull/1000" data-hovercard-type="pull_request" data-hovercard-url="/qos-ch/logback/pull/1000/hovercard">issues/1000</a> who also provided the relevant implementation PR.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/f426e0002800cfb507f393fcacffe0761a425220/hovercard" href="https://github.com/qos-ch/logback/commit/f426e0002800cfb507f393fcacffe0761a425220"><tt>f426e00</tt></a> associated with the tag v_1.5.25. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

