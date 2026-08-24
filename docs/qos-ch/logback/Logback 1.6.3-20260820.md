# Logback 1.6.3

## release on 20260820
## description
## changes
2026-08-14 Release of logback version 1.6.3

* In response <a href="https://www.cve.org/cverecord?id=CVE-2026-19880" rel="nofollow">CVE-2026-19880</a>, <code>MDCBasedDiscriminator</code> (used by <code>SiftingAppender</code>) now strips forward and backward slashes (<code>/</code>, <code>\</code>) from MDC values before they are used as discriminating keys. This prevents path segments from escaping into destinations controlled by an attacker. When sanitisation actually changes a value, a warning is emitted; the warning is rate-limited (a small batch, then a lull of about ten minutes).

* Colour console support is split out into a dedicated <a href="https://logback.qos.ch/manual/appenders.html#JansiConsoleAppender" rel="nofollow"><code>JansiConsoleAppender</code></a>. It wraps stdout or stderr with Jansi so ANSI escape sequences (for example coloured patterns) render correctly on terminals that need it, notably Windows. Prefer this class over the older path described next. See the <a href="https://logback.qos.ch/manual/appenders.html#JansiConsoleAppender" rel="nofollow">appenders documentation</a>.

* The <code>withJansi</code> property on <code>ConsoleAppender</code> is <strong>deprecated</strong>. Existing configurations that still set <code>&lt;withJansi&gt;true&lt;/withJansi&gt;</code> continue to work for compatibility, but new setups should use <code>JansiConsoleAppender</code> instead.

* <code>ConsoleAppender</code> no longer treats the process console as an exclusive resource: stopping it does not close <code>System.out</code> / <code>System.err</code>. <code>JansiConsoleAppender</code> pairs each <code>AnsiConsole.systemInstall()</code> with <code>systemUninstall()</code> on stop, so repeated start/stop cycles do not leave Jansi installed or tear down streams shared with the rest of the JVM. Related behavior is covered by tests for <a href="https://github.com/qos-ch/logback/issues/1063" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/1063/hovercard">issues/1063</a>.

* Invocation throttling helpers were reworked: <code>SimpleInvocationGate</code> is renamed <code>FixedIntervalInvocationGate</code>, and <code>BatchedFixedIntervalInvocationGate</code> allows a short burst of invocations before applying a fixed lull. The sanitisation  

  warning above uses the batched gate.

* The JPMS <code>module-info</code> for logback-core now exports the <code>ch.qos.logback.core.property</code> package, which had been missing from the module descriptor.

* A bit-wise identical binary of this version can be reproduced by building from <a href="https://github.com/qos-ch/logback">source code</a> at commit <code>e8e824dede022a6d7208b36cfa875b0d1b7772f3</code> associated with the tag <code>v_1.6.3</code>. The release was built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

--  

Sponsoring SLF4J/logback/reload4j at <a href="https://github.com/sponsors/qos-ch">https://github.com/sponsors/qos-ch</a>

