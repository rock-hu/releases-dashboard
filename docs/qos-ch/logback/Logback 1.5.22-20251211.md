# Logback 1.5.22

## release on 20251211
## description
## changes
<strong>2025-12-11 Release of logback version 1.5.22</strong>

• In order to prevent involuntary information leakage, Logback will no longer output the value of a substituted variable, if the variable name contains any of the case-insensitive strings "password", "secret" or "confidential". This problem was reported by Chintan Rohila in <a href="https://github.com/qos-ch/logback/issues/986" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/986/hovercard">issues/986</a>.

• Logback now takes the overridden <code>toString()</code> method of <code>Throwable</code> subclasses into account when printing stack traces. This issue was reported in <a href="https://jira.qos.ch/browse/LOGBACK-543" rel="nofollow">LOGBACK-543</a> by Alvin Chee, with a fix provided in <a href="https://github.com/qos-ch/logback/pull/404" data-hovercard-type="pull_request" data-hovercard-url="/qos-ch/logback/pull/404/hovercard">PR 404</a> by Brett Kail.

• Instead of limit-counting guard, Logback now uses a tumbling-window guard to rate limit internal error messages.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/572379aabd2f672b49593e4020696c624541e5b0/hovercard" href="https://github.com/qos-ch/logback/commit/572379aabd2f672b49593e4020696c624541e5b0"><tt>572379a</tt></a> associated with the tag v_1.5.22. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

