# Logback 1.6.0

## release on 20260723
## description
## changes
<strong>2026-07-23 Release of logback version 1.6.0</strong>

• Removed certain deprecated variables, methods, and classes. For the list of removed members see <a href="https://logback.qos.ch/notes/release_1.6.0.txt" rel="nofollow">release_1.6.0.txt.</a>

• In <code>AsyncAppenderBase</code>, the <code>put(ILoggingEvent)</code> method now has the protected modifier to allow access from derived classes. This change was requested by Thomas Skjølberg in <a href="https://github.com/qos-ch/logback/pull/1053" data-hovercard-type="pull_request" data-hovercard-url="/qos-ch/logback/pull/1053/hovercard">pr#1053</a>.

• Bump SLF4J dependency to version 2.0.18.

• <strong>See also the overview of the <a href="https://logback.qos.ch/news.html#latest_stable" rel="nofollow">1.6.x series</a>.</strong>

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/b07adf36019b51a10f824fdd94009985c587b1d3/hovercard" href="https://github.com/qos-ch/logback/commit/b07adf36019b51a10f824fdd94009985c587b1d3"><tt>b07adf3</tt></a> associated with the tag v_1.6.0. The release was built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

