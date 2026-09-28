# Logback 1.6.4

## release on 20260924
## description
## changes
<strong>2026-09-24 Release of logback version 1.6.4</strong>

• Variable substitution is again applied to the <code>scan</code> attribute of the <code>&lt;configuration&gt;</code> element. The scanning refactoring in version 1.5.27 had dropped substitution, so values such as <code>${logback.scan.enabled:-true}</code> were no longer resolved. As before version 1.5.27, an unrecognized non-empty value turns scanning on. The same substitution now applies to the scan attribute of <code>&lt;propertiesConfigurator&gt;</code>. This regression was reported in <a href="https://github.com/qos-ch/logback/issues/1065" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1065/hovercard">issues/1065</a> by <a href="https://github.com/vaibhavjain2">vaibhavjain2</a>.

• <code>OutputStreamAppender</code> and <code>FileAppender</code> now handle stateful encoders. The <code>Encoder</code> interface has a new default method called <code>isStateful()</code>, which returns <code>false</code>. An encoder that keeps state between calls to <code>encode()</code> can return true. For such encoders, the appender holds its write lock while encoding and while writing, so the output of concurrent appends cannot interleave. Stateless encoders still encode outside the lock, so their performance does not change. Existing encoders need no changes.

• Several race conditions in <code>OutputStreamAppender</code> and <code>FileAppender</code> were fixed. The appender is now marked started and the encoder header is written while the same lock is held, so a concurrent append can no longer write an event before the header. After acquiring the lock, the appender checks again whether it has been stopped, so no event is written after the footer. In prudent mode, FileAppender now encodes and writes each event while holding the lock.

• Fixed a data race on the logger count in LoggerContext. Loggers are created under the lock of their parent logger, so loggers with different parents could be created at the same time and increments of the shared counter could be lost. As a result, <code>LoggerContext.size()</code> could return a value lower than the actual number of loggers. The counter is now an <code>AtomicInteger</code>. This issue was reported in <a href="https://github.com/qos-ch/logback/issues/1038" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1038/hovercard">issues/1038</a> by hcantunc. The fix was contributed in PR <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4917006427" data-permission-text="Title is private" data-url="https://github.com/qos-ch/logback/issues/1055" data-hovercard-type="pull_request" data-hovercard-url="/qos-ch/logback/pull/1055/hovercard" href="https://github.com/qos-ch/logback/pull/1055">#1055</a> by <a href="https://github.com/seonwooj0810">seonwoo_jung</a>.

• <code>TimeBasedRollingPolicy</code> now supports half-day periods. Date patterns with the AM/PM marker, for example %d{yyyy-MM-dd-a}, used to be detected as daily and rolled over only at midnight. They now roll over at both 00:00 and 12:00. This issue was reported in issues/976 by shakthifuture. The fix was contributed in PR <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4882968764" data-permission-text="Title is private" data-url="https://github.com/qos-ch/logback/issues/1051" data-hovercard-type="pull_request" data-hovercard-url="/qos-ch/logback/pull/1051/hovercard" href="https://github.com/qos-ch/logback/pull/1051">#1051</a> by <a href="https://github.com/seonwooj0810">seonwoo_jung</a>. See <code>TimeBasedRollingPolicy</code>.

• If <code>org.jline.jansi.AnsiConsole</code> cannot be found on the class path, <code>JansiConsoleAppender</code> now emits warnings that explain how to add org.jline:jansi-core and then writes to the plain console stream. See codes.html#missingJlineJansi.

• The unused <code>ch.qos.logback.classic.util.LogbackMDCAdapterSimple</code> class was removed. <code>LogbackMDCAdapter</code> remains the default MDC adapter.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/07d291ca0d280bc5da934ec9ff5f1da634fd7937/hovercard" href="https://github.com/qos-ch/logback/commit/07d291ca0d280bc5da934ec9ff5f1da634fd7937"><tt>07d291c</tt></a> associated with the tag v_1.6.4. The release was built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

<strong>Full Changelog</strong>: <a class="commit-link" href="https://github.com/qos-ch/logback/compare/v_1.6.3...v_1.6.4"><tt>v_1.6.3...v_1.6.4</tt></a>

