# Logback 1.5.20

## release on 20251029
## description
## changes
<strong>2025-10-19 Release of logback version 1.5.20</strong>

• Due to potential vulnerabilities associated with dynamic, i.e. runtime, java code compilation and execution (using Janino), the <code>'condition'</code> attribute within the <code>&lt;if&gt; </code>element is deprecated and will be removed in 2027.

An <a href="https://logback.qos.ch/translator/services/conditionalConfigMigrator.html" rel="nofollow">online migration service</a> is provided to help with the transition.

The <code>&lt;condition&gt;</code> element, new in this version, admits custom <code>PropertyEvaluator</code> as a recommended alternative. See also the updated documentation on <a href="https://logback.qos.ch/manual/configuration.html#conditional" rel="nofollow">conditional configuration</a>.

• Logback-classic's <a href="https://logback.qos.ch/manual/configuration.html#auto_configuration" rel="nofollow">initialization procedure</a> has been simplified by removing the step instantiating a <code>SerializedModelConfigurator</code>. However, it is still possible to set up <code>SerializedModelConfigurator</code> as a custom configurator.

• A bit-wise identical binary of this version can be reproduced by building from source code at commit <a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/qos-ch/logback/commit/930fb15c993a4344bcecc6ba2225c12a2c38e676/hovercard" href="https://github.com/qos-ch/logback/commit/930fb15c993a4344bcecc6ba2225c12a2c38e676"><tt>930fb15</tt></a> associated with the tag v_1.5.20. Release built using Java "21" 2023-10-17 LTS build 21.0.1.+12-LTS-29 under Linux Debian 11.6.

