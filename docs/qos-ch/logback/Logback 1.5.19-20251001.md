# Logback 1.5.19

## release on 20251001
## description
## changes
<strong>2025-09-30 Release of logback version 1.5.19</strong>

• Disallow "new" operator in the <code>condition</code> attribute of <<code>if</code>> elements. This fixes an ACE vulnerability recorded as <a href="https://www.cve.org/cverecord?id=CVE-2025-11226" rel="nofollow">CVE-2025-11226</a>.

• At initialization time, slightly better reporting about watched configuration files.

• Softer message regarding usage of ConsoleAppender and its potential impact on performance.

• In ViewStatusMessagesServlet, restrict processing of "Clear" button to POST method. This change was proposed by Ralf Wiebicke who also provided the relevant <a href="https://github.com/qos-ch/logback/pull/971" data-hovercard-type="pull_request" data-hovercard-url="/qos-ch/logback/pull/971/hovercard">PR</a>.

• A bit-wise identical binary of this version can be reproduced by building from <a href="https://github.com/qos-ch/logback">source code</a> at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/e572d4f87f06674788eb3ca7148e8d1dffc615fa/hovercard" href="https://github.com/qos-ch/logback/commit/e572d4f87f06674788eb3ca7148e8d1dffc615fa"><tt>e572d4f</tt></a> associated with the tag v_1.5.19. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

