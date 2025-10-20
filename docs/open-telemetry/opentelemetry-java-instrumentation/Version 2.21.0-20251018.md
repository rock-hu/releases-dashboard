# Version 2.21.0

## release on 20251018
## description
## changes
This release targets the OpenTelemetry SDK 1.55.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking Changes

* Hadoop JMX metrics have been renamed to align with semantic conventions. If you are using Hadoop JMX metrics, you will need to update your dashboards and alerts. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14411" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14411/hovercard">#14411</a>)
* Lettuce 5.1 instrumentation now aligns with other instrumentations and no longer sets the span status description. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14886" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14886/hovercard">#14886</a>)

🚫 Deprecations

* The following Logback appender configuration properties have been renamed for clarity. The old property names have been deprecated and will be removed in a future release: - Java agent: <code>otel.instrumentation.logback-appender.experimental.capture-logstash-attributes</code> → <code>otel.instrumentation.logback-appender.experimental.capture-logstash-marker-attributes</code> - Spring Boot starter<code>otel.instrumentation.logback-appender.experimental.capture-logstash-markers</code> → <code>otel.instrumentation.logback-appender.experimental.capture-logstash-marker-attributes</code> - Logback appender configuration property: <code>captureLogstashAttributes</code> → <code>captureLogstashMarkerAttributes</code> - Logback appender API: <code>setCaptureLogstashAttributes()</code> → <code>setCaptureLogstashMarkerAttributes()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14959" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14959/hovercard">#14959</a>)

🌟 New javaagent instrumentation

* Add Helidon instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13776" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13776/hovercard">#13776</a>)
* Add NATS instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13999" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13999/hovercard">#13999</a>)
* OpenSearch Transport v3.0 Implementation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14823" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14823/hovercard">#14823</a>)
* Add Kafka Connect API instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14478" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14478/hovercard">#14478</a>)

🌟 New library instrumentation

* Add Helidon Instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13776" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13776/hovercard">#13776</a>)
* Add NATS instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13999" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13999/hovercard">#13999</a>)
* <a href="https://failsafe.dev/" rel="nofollow">Failsafe</a> 3.0 instrumentation introduced (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14057" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14057/hovercard">#14057</a>)

📈 Enhancements

* Add experimental sqlcommenter support for JDBC and R2DBC (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13714" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13714/hovercard">#13714</a>)
* Align Hadoop JMX metrics with semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14411" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14411/hovercard">#14411</a>)
* Introduce experimental API for operation attributes to be passed only to OperationListeners (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14590" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14590/hovercard">#14590</a>)
* Add span logging support for declarative configuration (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14591" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14591/hovercard">#14591</a>)
* Add span logging support for Spring Boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14594" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14594/hovercard">#14594</a>)
* Support capturing event names in logback, log4j, and jboss-logmanager appenders (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14649" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14649/hovercard">#14649</a>)
* Include contrib sampler in java agent, e.g. for filtering health check endpoints (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14677" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14677/hovercard">#14677</a>)
* Collect RPC metrics in Apache Dubbo instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14690" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14690/hovercard">#14690</a>)
* Add experimental option to disable noisy <code>redis.encode</code> span events in Lettuce instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14750" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14750/hovercard">#14750</a>)
* Support ListIterator in Kafka consumer instrumentation for Spark Structured Streaming (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14757" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14757/hovercard">#14757</a>)
* Exclude wrapper classes in JDBC instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14760" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14760/hovercard">#14760</a>)
* Support JDBC URL parsing for OceanBase, PolarDB, and Lindorm databases (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14790" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14790/hovercard">#14790</a>)
* Support context propagation in Guava AsyncEventBus (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14791" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14791/hovercard">#14791</a>)
* Make <code>db.statement</code> attribute available during sampling in Lettuce instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14856" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14856/hovercard">#14856</a>)
* Add <code>code.namespace</code> and <code>code.function</code> attributes to Vaadin controller spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14882" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14882/hovercard">#14882</a>)
* Add <code>code.namespace</code> and <code>code.function</code> attributes to Grails controller spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14885" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14885/hovercard">#14885</a>)
* Support Hibernate 7.2.0.CR1 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14921" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14921/hovercard">#14921</a>)
* Support capturing Logstash StructuredArguments as log record attributes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14959" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14959/hovercard">#14959</a>)
* Add gRPC request/response size metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14342" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14342/hovercard">#14342</a>)

🛠️ Bug fixes

* Fix datasource instrumentation to support connection pools like Druid (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14602" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14602/hovercard">#14602</a>)
* Fix Java HTTP client instrumentation to properly propagate request cancellation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14747" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14747/hovercard">#14747</a>)
* Fix Reactor Netty HTTP client instrumentation to handle IllegalStateException (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14778" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14778/hovercard">#14778</a>)
* Fix executor context propagation when a stateless lambda instance is passed multiple times (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14841" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14841/hovercard">#14841</a>)
* Remove span status description from Lettuce 5.1 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14886" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14886/hovercard">#14886</a>)
* Fix Spring Boot autoconfiguration ordering for micrometer bridge (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15011" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15011/hovercard">#15011</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/1095071913/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/1095071913">@1095071913</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlixBa/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlixBa">@AlixBa</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asarkar/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asarkar">@asarkar</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asweet-confluent/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asweet-confluent">@asweet-confluent</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/changliu-wk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/changliu-wk">@changliu-wk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/copilot-swe-agent/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/copilot-swe-agent">@copilot-swe-agent</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/damienburke/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/damienburke">@damienburke</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/defields923/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/defields923">@defields923</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ericmm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ericmm">@ericmm</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ghilainm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ghilainm">@ghilainm</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/grcevski/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/grcevski">@grcevski</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hoteye/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hoteye">@hoteye</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/igor-suhorukov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/igor-suhorukov">@igor-suhorukov</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jiten686/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jiten686">@jiten686</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jonatan-ivanov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jonatan-ivanov">@jonatan-ivanov</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LiouChong/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LiouChong">@LiouChong</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/malafeev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/malafeev">@malafeev</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maxxedev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maxxedev">@maxxedev</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/MrCull/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/MrCull">@MrCull</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/neilfordyce/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/neilfordyce">@neilfordyce</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nenadnoveljic/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nenadnoveljic">@nenadnoveljic</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/onurkybsi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/onurkybsi">@onurkybsi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/patpatpat123/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/patpatpat123">@patpatpat123</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/philsttr/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/philsttr">@philsttr</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SentryMan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SentryMan">@SentryMan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sorobon/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sorobon">@sorobon</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steffan-westcott/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steffan-westcott">@steffan-westcott</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/survivant/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/survivant">@survivant</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tjquinno/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tjquinno">@tjquinno</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vasantteja/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vasantteja">@vasantteja</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wl2027/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wl2027">@wl2027</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiangtianyu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiangtianyu">@xiangtianyu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xuminwlt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xuminwlt">@xuminwlt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

