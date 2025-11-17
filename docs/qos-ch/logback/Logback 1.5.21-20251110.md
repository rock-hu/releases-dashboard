# Logback 1.5.21

## release on 20251110
## description
## changes
<strong>2025-11-10 Release of logback version 1.5.21</strong>

• Invocations of turbo filters in isDebugEnabled, isInfoEnabled()... remain as they were, untouched. However, any installed instances of TurboFilter are now invoked also from within the log(LoggingEvent) method of <a href="https://github.com/qos-ch/logback/blob/master/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java#L817">Logger</a> with the contents of the LoggingEvent, typically via the fluent API. This fixes <a href="https://github.com/qos-ch/logback/issues/871" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/871/hovercard">issues/871</a>.

• Removed reentry-guard in most subclasses of <code>UnsynchronizedAppenderBase</code> where it was not needed.

• <a href="https://logback.qos.ch/manual/configuration.html#auto_configuration" rel="nofollow">Initialization procedure</a> has been simplified by removing the step instantiating a <code>SerializedModelConfigurator</code>. However, it is still possible to set up <code>SerializedModelConfigurator</code> as a custom configurator.

• JsonEncoder is now friendlier to derivation by sub-classes as requested in <a href="https://github.com/qos-ch/logback/issues/979" data-hovercard-type="issue" data-hovercard-url="/qos-ch/logback/issues/979/hovercard">issues/979.</a>

• Fixed XMLLayout thread safety issue reported in <a href="https://jira.qos.ch/browse/LOGBACK-427" rel="nofollow">LOGBACK-427</a>.

• Removed superfluous buffering in Zip, GZ and XZ compression code.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/fed6f37ffe3449e40f6a9fffe050936a33116bd1/hovercard" href="https://github.com/qos-ch/logback/commit/fed6f37ffe3449e40f6a9fffe050936a33116bd1"><tt>fed6f37</tt></a> associated with the tag v_1.5.21. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

