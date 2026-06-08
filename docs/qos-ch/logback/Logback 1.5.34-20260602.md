# Logback 1.5.34

## release on 20260602
## description
## changes
<strong>2026-06-01 Release of logback version 1.5.34</strong>

• In case certain StackTraceElement values returned by the Throwable.getStackTrace method are null, StackTraceElementProxy substitutes a dummy instance instead of throwing an IllegalArgumentException. This resolves <a href="https://github.com/qos-ch/logback/issues/1040" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1040/hovercard">issues #1040</a>, reported by Naotsugu Kobayashi.

• HardenedObjectInputStream will now throw an InvalidClassException during deserialization attempts of Proxy classes. This change addresses potential deserialization whitelist bypass vulnerability reported by <a href="https://github.com/york-shen">York Shen</a> and registered as <a href="https://www.cve.org/cverecord?id=CVE-2026-10532" rel="nofollow">CVE-2026-10532</a>.

• A bitwise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/e62272ac152469aec1ede056c3c7d0d7314e7bfe/hovercard" href="https://github.com/qos-ch/logback/commit/e62272ac152469aec1ede056c3c7d0d7314e7bfe"><tt>e62272a</tt></a> associated with the tag v_1.5.34. This release was built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

