# Logback 1.6.5

## release on 20261002
## description
## changes
2026-09-30 Release of logback version 1.6.5

• Fixed a vulnerability <a href="https://www.cve.org/CVERecord?id=CVE-2026-104721" rel="nofollow">CVE-2026-104721</a> closely related to <a href="https://www.cve.org/cverecord?id=CVE-2026-19880" rel="nofollow">CVE-2026-19880</a>. The fix in version 1.6.3, which strips forward and backward slashes from <code>MDC</code> values, was insufficient. An <code>MDC</code> value could still contain relative path components such as .., variable references such as /, or characters that are special in file name patterns and email addresses. This latest vulnerability was found and reported by François Martin (GitHub: <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/martinfrancois/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/martinfrancois">@martinfrancois</a>, <a href="https://github.com/martinfrancois">https://github.com/martinfrancois</a>).

<code>MDCBasedDiscriminator</code>, used by <a href="https://logback.qos.ch/manual/appenders-async-sift.html#SiftingAppender" rel="nofollow"><code>SiftingAppender</code></a>, now rejects <code>MDC</code> values instead of stripping characters from them. An MDC value is rejected if it is empty, if it is longer than 64 characters, if it contains the sequence .., or if it contains any of the following characters: <code>/ \ $ { } [ ] ( ) | ? * + % , @</code>. When an <code>MDC</code> value is rejected, the discriminator returns the value of its <code>DefaultValue</code> property. A warning is emitted for each rejected value. These warnings are rate-limited.

• When compression is enabled, <code>TimeBasedRollingPolicy</code> and <code>SizeAndTimeBasedRollingPolicy</code> now also remove old log files that were never compressed, for example because the application was not running at rollover time. Previously, such files were ignored by <code>maxHistory</code> and accumulated indefinitely. This issue was discussed in <a href="https://github.com/qos-ch/logback/discussions/1032" data-hovercard-type="discussion" data-hovercard-url="/qos-ch/logback/discussions/1032/hovercard">discussions/1032</a>. See <a href="https://logback.qos.ch/manual/appenders-rolling.html#TimeBasedRollingPolicy" rel="nofollow"><code>TimeBasedRollingPolicy</code></a>.

• <code>SimpleInvocationGate</code>, deprecated in version 1.6.3, is now marked for removal. Use <code>FixedIntervalInvocationGate</code> instead.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/d1b829dcdb9fd98511c64401beb1419a9c9384aa/hovercard" href="https://github.com/qos-ch/logback/commit/d1b829dcdb9fd98511c64401beb1419a9c9384aa"><tt>d1b829d</tt></a> associated with the tag v_1.6.5. The release was built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

