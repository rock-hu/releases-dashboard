# Logback 1.5.36

## release on 20260701
## description
## changes
<strong>2026-06-25 Release of logback version 1.5.36</strong>

• The 'condition' attribute in <code>&lt;if&gt;</code> elements now reject certain references that are associated with ACE attacks. This issue was reported by "yulate" (<a href="mailto:yulate531@gmail.com.com">yulate531@gmail.com.com</a>) and registered as <a href="https://www.cve.org/cverecord?id=CVE-2026-13006" rel="nofollow">CVE-2026-13006</a>. <strong>Please note that version 1.5.37 provides the full fix to this vulnerability.</strong>

• A bitwise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/9b94c37562bf25a6a944146701d42ee6c4eee888/hovercard" href="https://github.com/qos-ch/logback/commit/9b94c37562bf25a6a944146701d42ee6c4eee888"><tt>9b94c37</tt></a> associated with the tag v_1.5.36. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

