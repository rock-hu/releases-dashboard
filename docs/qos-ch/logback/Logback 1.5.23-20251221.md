# Logback 1.5.23

## release on 20251221
## description
## changes
<strong>2025-12-21 Release of logback version 1.5.23</strong>

• In response to <a href="https://github.com/qos-ch/logback/issues/959" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/959/hovercard">issues/959</a> file name collisions are detected at configuration time by analyzing the configuration file and no longer at run time. This avoids the <code>ConcurrentModificationException</code> reported in the issue.

• ZIP and XZ compression now use a <code>BufferedOutputStream</code> when writing to the compressed file. This issue was reported in <a href="https://github.com/qos-ch/logback/issues/988" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/988/hovercard">issues/988</a>.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/0bcc3feb54a6d99caac70969ee5f8334aad1fbaf/hovercard" href="https://github.com/qos-ch/logback/commit/0bcc3feb54a6d99caac70969ee5f8334aad1fbaf"><tt>0bcc3fe</tt></a> associated with the tag v_1.5.23. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

