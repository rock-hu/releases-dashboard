# Logback 1.6.1

## release on 20260728
## description
## changes
<strong>2026-07-28 Release of logback version 1.6.1</strong>

• In TimeBasedRollingPolicy, when the file option is set, the intermediate file renamed before asynchronous compression now receives the target archive name without the compression suffix (e.g. <code>.gz</code>, <code>.zip</code>, <code>.xz</code>). Previously it used a nanotime-based <code>.tmp</code> suffix. This makes the file easier to identify if compression fails during rollover. (See also the following paragraph.)

• On GZ, ZIP, or XZ compression failure, the original (uncompressed) log file is no longer deleted. Compression strategies now delete the source file only after successful compression and emit a warning that the original was left intact.

• ConsoleAppender with now probes JLine's org.jline.jansi.AnsiConsole first and falls back to the legacy FuseSource org.fusesource.jansi.AnsiConsole class. This keeps ANSI coloring working after Jansi moved under the JLine project. The optional org.jline:jansi-core artifact is declared as a dependency alongside the existing FuseSource jansi dependency. A preferredJansiClassName property was added for tests. This issue was reported in <a href="https://github.com/qos-ch/logback/issues/1043" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1043/hovercard">issues/1043</a> by <a href="https://github.com/seonwooj0810">seonwoo_jung</a> who also provided the relevant PR.

• LayoutWrappingEncoder now reports an error at start() when no layout is set and guards encode() against a null layout. Previously, a missing layout (for example after an ignored // branch) allowed the encoder to start and then fail with a NullPointerException on every event, resulting in silent log loss. This issue was reported in <a href="https://github.com/qos-ch/logback/issues/1046" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1046/hovercard">issues/1046</a> by <a href="https://github.com/seonwooj0810">seonwoo_jung</a> who also provided the relevant PR.

• FileCollisionAnalyser now detects file collisions involving nested appenders of SiftingAppender. When the nested file or fileNamePattern does not textually reference the discriminator key (e.g. ${userId}), a warning is issued at configuration time naming the appender, the key, and the shared target. This closes a gap where statically declared file appenders were checked but sifted nested appenders were not. This enhancement was contributed in <a href="https://github.com/qos-ch/logback/issues/1041" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1041/hovercard">PR #1041</a> by <a href="https://github.com/seonwooj0810">seonwoo_jung</a>.

• More defensive handling in SyslogOutputStream and SyslogAppenderBase: the close() method now ensures that resources are closed, writes and flushes check that the underlying resources are in a valid state and fallback to no-op otherwise.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/57759f433000a133088ef0441038963134437fbd/hovercard" href="https://github.com/qos-ch/logback/commit/57759f433000a133088ef0441038963134437fbd"><tt>57759f4</tt></a> associated with the tag v_1.6.1. The release was built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

• See <a href="https://logback.qos.ch/news.html#1.6.1" rel="nofollow">https://logback.qos.ch/news.html#1.6.1</a> for the original text.

