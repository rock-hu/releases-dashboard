# Version 2.0.0

## release on 20240201

## description

## changes

This release targets the OpenTelemetry SDK 1.34.1.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

The 2.0.0 release contains significant breaking changes that will most likely affect all users, please be sure to read the breaking changes below carefully.

Note: 1.32.x will be security patched for at least 6 months in case some of the changes below are too disruptive to adopt right away.

:warning::warning: Breaking changes :warning::warning:

* The default OTLP protocol has been changed from <code>grpc</code> to <code>http/protobuf</code> in order to align with the <a href="https://github.com/open-telemetry/opentelemetry-specification/blob/v1.28.0/specification/protocol/exporter.md#specify-protocol">specification</a>. You can switch to the <code>grpc</code> protocol using <code>OTEL_EXPORTER_OTLP_PROTOCOL=grpc</code> or <code>-Dotel.exporter.otlp.protocol=grpc</code>.
* Micrometer metric bridge has been disabled by default. You can enable it using <code>OTEL_INSTRUMENTATION_MICROMETER_ENABLED=true</code> or <code>-Dotel.instrumentation.micrometer.enabled=true</code>.
* The OTLP logs exporter is now enabled by default. You can disable it using <code>OTEL_LOGS_EXPORTER=none</code> or <code>-Dotel.logs.exporter=none</code>.
* Controller spans are now disabled by default. You can enable them using <code>OTEL_INSTRUMENTATION_COMMON_EXPERIMENTAL_CONTROLLER_TELEMETRY_ENABLED=true</code> or <code>-Dotel.instrumentation.common.experimental.controller-telemetry.enabled=true</code>.
* View spans are now disabled by default. You can enable them using <code>OTEL_INSTRUMENTATION_COMMON_EXPERIMENTAL_VIEW_TELEMETRY_ENABLED=true</code> or <code>-Dotel.instrumentation.common.experimental.view-telemetry.enabled=true</code>.
* :warning::warning: Stable HTTP semantic conventions are now emitted :warning::warning:
  * TOO MANY CHANGES TO LIST HERE, be sure to review the full <a href="https://github.com/open-telemetry/semantic-conventions/blob/main/docs/http/migration-guide.md#summary-of-changes">list of changes</a>.
* Stable JVM semantic conventions are now emitted.
  *

  Memory metrics
  * <code>process.runtime.jvm.memory.usage</code> renamed to <code>jvm.memory.used</code>
  * <code>process.runtime.jvm.memory.committed</code> renamed to <code>jvm.memory.committed</code>
  * <code>process.runtime.jvm.memory.limit</code> renamed to <code>jvm.memory.limit</code>
  * <code>process.runtime.jvm.memory.usage_after_last_gc</code> renamed to <code>jvm.memory.used_after_last_gc</code>
  * <code>process.runtime.jvm.memory.init</code> renamed to <code>jvm.memory.init</code> (still experimental)
  * <strong>Metric attributes:</strong>
  * <code>type</code> renamed to <code>jvm.memory.type</code>
  * <code>pool</code> renamed to <code>jvm.memory.pool.name</code>
  *

  Garbage collection metrics
  * <code>process.runtime.jvm.gc.duration</code> renamed to <code>jvm.gc.duration</code>
  * <strong>Metric attributes:</strong>
  * <code>name</code> renamed to <code>jvm.gc.name</code>
  * <code>action</code> renamed to <code>jvm.gc.action</code>
  *

  Thread metrics
  * <code>process.runtime.jvm.threads.count</code> renamed to <code>jvm.threads.count</code>
  * <strong>Metric attributes:</strong>
  * <code>daemon</code> renamed to <code>jvm.thread.daemon</code>
  *

  Classes metrics
  * <code>process.runtime.jvm.classes.loaded</code> renamed to <code>jvm.classes.loaded</code>
  * <code>process.runtime.jvm.classes.unloaded</code> renamed to <code>jvm.classes.unloaded</code>
  * <code>process.runtime.jvm.classes.current_loaded</code> renamed to <code>jvm.classes.count</code>
  *

  CPU metrics
  * <code>process.runtime.jvm.cpu.utilization</code> renamed to <code>jvm.cpu.recent_utilization</code>
  * <code>process.runtime.jvm.system.cpu.load_1m</code> renamed to <code>jvm.system.cpu.load_1m</code> (still experimental)
  * <code>process.runtime.jvm.system.cpu.utilization</code> renamed to <code>jvm.system.cpu.utilization</code> (still experimental)
  *

  Buffer metrics
  * <code>process.runtime.jvm.buffer.limit</code> renamed to <code>jvm.buffer.memory.limit</code> (still experimental)
  * <code>process.runtime.jvm.buffer.count</code> renamed to <code>jvm.buffer.count</code> (still experimental)
  * <code>process.runtime.jvm.buffer.usage</code> renamed to <code>jvm.buffer.memory.usage</code> (still experimental)
  * <strong>Metric attributes:</strong>
  * <code>pool</code> renamed to <code>jvm.buffer.pool.name</code>

More migration notes

* Lettuce CONNECT spans are now disabled by default. You can enable them using <code>OTEL_INSTRUMENTATION_LETTUCE_CONNECTION_TELEMETRY_ENABLED=true</code> or <code>-Dotel.instrumentation.lettuce.connection-telemetry.enabled=true</code>.
* The configuration property <code>otel.instrumentation.log4j-appender.experimental.capture-context-data-attributes</code> has been renamed to <code>otel.instrumentation.log4j-appender.experimental.capture-mdc-attributes</code>.
* MDC attribute prefixes (<code>log4j.mdc.</code> and <code>logback.mdc.*</code>) have been removed.
* The artifact <code>instrumentation-api-semconv</code> has been renamed to <code>instrumentation-api-incubator</code>.
* HTTP classes have been moved from <code>instrumentation-api-incubator</code> to <code>instrumentation-api</code> and as a result are now stable.

🌟 New javaagent instrumentation

* Vert.x redis client (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9838" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9838/hovercard">#9838</a>)

📈 Enhancements

* Reduce reactor stack trace depth (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9923" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9923/hovercard">#9923</a>)
* Implement <code>error.type</code> in <code>spring-webflux</code> and <code>reactor-netty</code> instrumentations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9967" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9967/hovercard">#9967</a>)
* Bridge metric advice in OpenTelemetry API 1.32 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10026" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10026/hovercard">#10026</a>)
* Capture http.route for akka-http (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10039" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10039/hovercard">#10039</a>)
* Rename <code>telemetry.auto.version</code> to <code>telemetry.distro.version</code> and add <code>telemetry.distro.name</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9065" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9065/hovercard">#9065</a>)
* Implement forEach support for aws sqs tracing list (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10062" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10062/hovercard">#10062</a>)
* Add http client response attributes to aws sqs process spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10074" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10074/hovercard">#10074</a>)
* Add support for <code>OTEL_RESOURCE_ATTRIBUTES</code>, <code>OTEL_SERVICE_NAME</code>, <code>OTEL_EXPORTER_OTLP_HEADERS</code>, and <code>OTEL_EXPORTER_OTLP_PROTOCOL</code> for spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9950" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9950/hovercard">#9950</a>)
* Add elasticsearch-api-client as instrumentation name to elasticsearch-api-client-7.16 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10102" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10102/hovercard">#10102</a>)
* Add instrumentation for druid connection pool (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9935" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9935/hovercard">#9935</a>)
* Remove deprecated rocketmq setting (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10125" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10125/hovercard">#10125</a>)
* JMX metrics for Tomcat with 'Tomcat' JMX domain (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10115" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10115/hovercard">#10115</a>)
* Capture the SNS topic ARN under the 'messaging.destination.name' span attribute. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10096" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10096/hovercard">#10096</a>)
* Add network attributes to rabbitmq process spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10210" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10210/hovercard">#10210</a>)
* Add UserExcludedClassloadersConfigurer (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10134" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10134/hovercard">#10134</a>)
* Apply both server attributes & network attributes to Lettuce 5.1 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10197" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10197/hovercard">#10197</a>)

🛠️ Bug fixes

* Fix aws propagator presence check in spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9924" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9924/hovercard">#9924</a>)
* Capture authority from apache httpclient request when HttpHost is null (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9990" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9990/hovercard">#9990</a>)
* Fix NoSuchBeanDefinitionException with the JDBC driver configuration in spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/9978" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/9978/hovercard">#9978</a>)
* Null check for nullable response object in aws sdk 1.1 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10029" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10029/hovercard">#10029</a>)
* Fix using opentelemetry-spring-boot with Java 8 and Gradle (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10066" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10066/hovercard">#10066</a>)
* Fix transforming Java record types (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10052" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10052/hovercard">#10052</a>)
* Fix warnings from the spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10086" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10086/hovercard">#10086</a>)
* Resolve <code>ParameterNameDiscoverer</code> Bean Conflict in <code>spring-boot-autoconfigure</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10105" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10105/hovercard">#10105</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlchemyDing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlchemyDing">@AlchemyDing</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anhermon/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anhermon">@anhermon</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bcarter97/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bcarter97">@bcarter97</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/happyuser23/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/happyuser23">@happyuser23</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kenfinnigan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kenfinnigan">@kenfinnigan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/knbk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/knbk">@knbk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mateuszrzeszutek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mateuszrzeszutek">@mateuszrzeszutek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/moznion/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/moznion">@moznion</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nilsga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nilsga">@nilsga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PaurushGarg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PaurushGarg">@PaurushGarg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rBrda/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rBrda">@rBrda</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SHaaD94/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SHaaD94">@SHaaD94</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stevesea/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stevesea">@stevesea</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tduncan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tduncan">@tduncan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/theletterf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/theletterf">@theletterf</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/TylerHelmuth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/TylerHelmuth">@TylerHelmuth</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vallabhnatu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vallabhnatu">@vallabhnatu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiongchun/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiongchun">@xiongchun</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

