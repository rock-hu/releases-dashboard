# Version 2.30.0

## release on 20260722
## description
## changes
This release targets the OpenTelemetry SDK 1.64.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they will continue to have breaking changes. Please see <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking changes to non-stable APIs

* Remove <code>ExperimentalInstrumentationModule#getModuleGroup()</code>. Built-in invokedynamic modules now share a single <code>InstrumentationModuleClassLoader</code>, and each extension is isolated in its own. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18859" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18859/hovercard">#18859</a>)
* Remove the deprecated <code>InstrumentationModule.isIndyModule()</code>; whether a module uses invokedynamic is now determined by the agent rather than declared per module. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19140" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19140/hovercard">#19140</a>)
* Remove deprecated query-related APIs from <code>SqlClientAttributesGetter</code>, <code>CassandraRequest</code>, and <code>Experimental</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19165" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19165/hovercard">#19165</a>)
* Remove the deprecated <code>Enduser*</code> attribute-capturing APIs from the Spring Security 6.0 library; use the <code>User*</code> replacements instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19168" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19168/hovercard">#19168</a>)

🚫 Deprecations

* Deprecate only the Spring Boot starter <code>ConfigProperties</code> compatibility bean used with experimental declarative configuration, in favor of the new <code>ConfigProvider</code> bean; it will be removed in 3.0. The <code>ConfigProperties</code> bean remains supported for non-declarative configuration. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19175" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19175/hovercard">#19175</a>)
* Deprecate <code>DeclarativeConfigPropertiesBridge</code> and <code>DeclarativeConfigPropertiesBridgeBuilder</code>. Use <code>DeclarativeConfigProperties</code> directly or <code>DeclarativeConfigBridge</code> instead. Will be removed in 3.0. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19202" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19202/hovercard">#19202</a>)
* Deprecate <code>ConfigPropertiesBackedConfigProvider</code> in favor of <code>DeclarativeConfigBridge</code>. It will be removed in 2.31.0. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19220" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19220/hovercard">#19220</a>)

🌟 New javaagent instrumentation

* Add Javaagent instrumentation for HBase client 1.4. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19087" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19087/hovercard">#19087</a>)

🌟 New library instrumentation

* Add library instrumentation (<code>ThriftTelemetry</code>) for the Apache Thrift 0.13 async server. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19062" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19062/hovercard">#19062</a>)

📈 Enhancements

* Add async server tracing to the Apache Thrift 0.13 javaagent instrumentation; async server handlers were previously uninstrumented. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18994" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18994/hovercard">#18994</a>)
* Support <code>database=</code> as an alias for <code>databaseName</code> when extracting <code>db.name</code> from MSSQL JDBC URLs. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19029" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19029/hovercard">#19029</a>)
* Add batch-operation support to the experimental stable database semantic-convention opt-in (<code>otel.semconv-stability.opt-in=database</code>) across database instrumentations, including batch span names, <code>db.operation.batch.size</code> (including empty batches), and <code>db.query.summary</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19034" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19034/hovercard">#19034</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19037" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19037/hovercard">#19037</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19054" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19054/hovercard">#19054</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19055" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19055/hovercard">#19055</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19056" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19056/hovercard">#19056</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19057" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19057/hovercard">#19057</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19143" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19143/hovercard">#19143</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19147" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19147/hovercard">#19147</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19161" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19161/hovercard">#19161</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19162" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19162/hovercard">#19162</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19164" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19164/hovercard">#19164</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19172" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19172/hovercard">#19172</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19189" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19189/hovercard">#19189</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19199" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19199/hovercard">#19199</a>)
* Add tracing for Lettuce 4.0 reactive commands, including exceptional completion and cancellation. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19071" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19071/hovercard">#19071</a>)
* Add the experimental Cassandra JMX metrics target system. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19080" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19080/hovercard">#19080</a>)
* Add experimental JFR-based <code>jvm.thread.virtual.pinned</code> and <code>jvm.thread.virtual.submit_failed</code> metrics for Java 19+ virtual threads; enable with <code>otel.instrumentation.runtime-telemetry.emit-experimental-jfr-metrics=true</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19092" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19092/hovercard">#19092</a>)
* Capture custom object values passed to <code>PreparedStatement.setObject()</code> in query parameter attributes. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19093" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19093/hovercard">#19093</a>)
* <code>InstrumentationModule</code> now exposes <code>injectedClassNames()</code> and <code>exposedClassNames()</code> for indy instrumentations, so module authors no longer need <code>ExperimentalInstrumentationModule</code> for those helper-class declarations. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19142" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19142/hovercard">#19142</a>)
* Add <code>captureTemplate</code> and <code>captureArguments</code> options to the log4j, java-util-logging, and jboss-logmanager logging instrumentations, capturing the log message template and arguments as separate <code>log.body.template</code> / <code>log.body.parameters</code> attributes; logback already supported these options (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15423" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15423/hovercard">#15423</a>). (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19154" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19154/hovercard">#19154</a>)
* Add <code>server.address</code> and <code>server.port</code> attributes to Redisson client spans. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19191" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19191/hovercard">#19191</a>)
* Add <code>server.address</code> and <code>server.port</code> attributes to Lettuce Redis client spans. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19192" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19192/hovercard">#19192</a>)
* Add <code>server.address</code> and <code>server.port</code> attributes to Rediscala client spans. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19193" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19193/hovercard">#19193</a>)
* Set <code>server.address</code> on registry-backed Dubbo client spans to the registry address plus the service target (<code>registry://host:port/interface:version:group</code>) and leave <code>server.port</code> unset, gated behind the stable rpc semconv opt-in (<code>otel.semconv-stability.opt-in=rpc</code>); the resolved provider host and port are kept under the default semconv. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/17244" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/17244/hovercard">#17244</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19285" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19285/hovercard">#19285</a>)

🛠️ Bug fixes

* Fix a spurious duplicate warning when the application logger bridge is installed multiple times during startup. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19088" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19088/hovercard">#19088</a>)
* Fix MySQL and MariaDB <code>db.connection_string</code> values so IPv6 hosts stay bracketed instead of becoming ambiguous. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19078" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19078/hovercard">#19078</a>)
* Fix multi-topic Pulsar consumers so the internal background receive no longer creates a spurious extra receive span. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19095" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19095/hovercard">#19095</a>)
* <code>SpringConfigProperties.getMap()</code> no longer evaluates map property values as SpEL expressions; non-special-cased map properties now parse as comma-delimited <code>key=value</code> pairs via the SDK's <code>DefaultConfigProperties</code>, so settings like <code>otel.instrumentation.common.peer-service-mapping</code> work without SpEL syntax. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19113" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19113/hovercard">#19113</a>)
* Fix JMS destination extraction so an unreadable destination now leaves <code>messaging.destination.name</code> unset instead of reporting it as <code>unknown</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19115" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19115/hovercard">#19115</a>)
* Fix the JMX Metric Insight <code>jvm.class.loaded</code> and <code>jvm.class.unloaded</code> metrics to use counter instruments. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/19141" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/19141/hovercard">#19141</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/alokmajumder/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/alokmajumder">@alokmajumder</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bhuvan-somisetty/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bhuvan-somisetty">@bhuvan-somisetty</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/carlosalberto/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/carlosalberto">@carlosalberto</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/CodingFabian/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/CodingFabian">@CodingFabian</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FrankSpitulski/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FrankSpitulski">@FrankSpitulski</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hwxy233/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hwxy233">@hwxy233</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/imavroukakis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/imavroukakis">@imavroukakis</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/inssein/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/inssein">@inssein</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ishg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ishg">@ishg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkoronaAtCisco/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkoronaAtCisco">@jkoronaAtCisco</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maryliag/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maryliag">@maryliag</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maxxedev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maxxedev">@maxxedev</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mmanciop/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mmanciop">@mmanciop</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pavolloffay/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pavolloffay">@pavolloffay</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/philsttr/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/philsttr">@philsttr</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ryanrupp/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ryanrupp">@ryanrupp</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tsawada/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tsawada">@tsawada</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiangtianyu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiangtianyu">@xiangtianyu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/YaoYingLong/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/YaoYingLong">@YaoYingLong</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

