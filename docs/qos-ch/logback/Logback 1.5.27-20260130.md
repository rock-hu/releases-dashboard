# Logback 1.5.27

## release on 20260130
## description
## changes
<strong>2026-01-30 Release of logback version 1.5.27</strong>

• Updated license to Eclipse Public License version 2.0 from version 1.0, retaining the GPL 2.1 dual-license.

• Fixed missing MDC data transmitted by <code>SocketAppender</code> reported in <a href="https://github.com/qos-ch/logback/issues/1010" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1010/hovercard">issues/1010</a> by Lars Vogel.

• Removed all <code>Receiver</code> classes and components which were already disabled for several years.

• Refactored file scanning code for improved clarity.

• In <code>SizeAndTimeBasedRollingPolicy</code> modified <code>totalSizeCap</code> and <code>maxFileSize</code> comparison to taking into account file compression. This fixes <a href="https://github.com/qos-ch/logback/issues/1007" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1007/hovercard">issues/1007</a>.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/3618eb01aad6672f9cd250dccf7546a69cbe982f/hovercard" href="https://github.com/qos-ch/logback/commit/3618eb01aad6672f9cd250dccf7546a69cbe982f"><tt>3618eb0</tt></a> associated with the tag v_1.5.27. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

