# Version 1.68.0

## release on 20261106
## description
## changes
API

* Add null guards and API usage logging for tracing, metrics, propagation, and context APIs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8913" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8913/hovercard">#8913</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8968" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8968/hovercard">#8968</a>)
* Add stable <code>io.opentelemetry.api.impl.Base16EncodingUtils</code> and <code>TemporaryBuffers</code> utilities (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8929" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8929/hovercard">#8929</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8955" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8955/hovercard">#8955</a>)
* Fix uncompilable Javadoc examples in context APIs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8934" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8934/hovercard">#8934</a>)

Incubating

* Avoid false type warnings in <code>DeclarativeConfigProperties.toMap()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8921" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8921/hovercard">#8921</a>)

Extensions

* Trace propagators: Handle malformed URL escapes in Jaeger headers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8912" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8912/hovercard">#8912</a>)
* Trace propagators: Include the B3 debug header in multi-header propagation fields (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8930" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8930/hovercard">#8930</a>)
* Trace propagators: Fix hexadecimal flag parsing in Jaeger headers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8975" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8975/hovercard">#8975</a>)

SDK

* Remove cross-module internal utility dependencies from resource and retry code (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8916" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8916/hovercard">#8916</a>)
* Add experimental <code>SdkResourceProvider</code> support shared by tracer, meter, and logger providers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8865" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8865/hovercard">#8865</a>)

Traces

* Retain invalid span links with attributes or trace state (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8917" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8917/hovercard">#8917</a>)

Metrics

* Use a dedicated export worker in <code>PeriodicMetricReader</code>, queue concurrent flushes, and add <code>setExporterTimeout()</code> with a default equal to the export interval (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8827" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8827/hovercard">#8827</a>)

Exporters

* Logging: Fall back to the observed timestamp in <code>SystemOutLogRecordExporter</code> when the timestamp is unset (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8944" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8944/hovercard">#8944</a>)
* OTLP: Close the JDK HTTP response body on unsupported <code>Content-Encoding</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8962" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8962/hovercard">#8962</a>)
* OTLP: Match the <code>Host</code> header case-insensitively in the managed-channel gRPC sender (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8957" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8957/hovercard">#8957</a>)
* OTLP: Fix exporter metric server attributes for hosts that <code>java.net.URI</code> cannot parse (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8941" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8941/hovercard">#8941</a>)
* OTLP: Pass the original exception to the JDK HTTP sender's error callback (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8963" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8963/hovercard">#8963</a>)
* OTLP: Retry OkHttp gRPC exports on the current thread to avoid rejection by bounded executors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8965" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8965/hovercard">#8965</a>)
* OTLP: Restore per-attempt retry logging in the OkHttp gRPC sender (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8967" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8967/hovercard">#8967</a>)
* OTLP: Correct exporter builder Javadoc (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8996" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8996/hovercard">#8996</a>)
* OTLP: Accept <code>0</code> as no limit for maximum request body and message sizes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8945" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8945/hovercard">#8945</a>)
* OTLP: gRPC exporter internal telemetry uses <code>rpc.status_code</code> instead of <code>rpc.response.status.code</code> when <code>InternalTelemetryVersion</code> is set to <code>LATEST</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/9007" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/9007/hovercard">#9007</a>)
* Prometheus: Give exemplar <code>trace_id</code> and <code>span_id</code> precedence over filtered attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8959" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8959/hovercard">#8959</a>)

Extensions

* <strong>BREAKING</strong> Incubator: Change <code>SamplingIntent.create()</code> and <code>getTraceStateUpdater()</code> from <code>Function</code> to <code>BiFunction</code> accepting the final <code>SamplingDecision</code>, and fix consistent sampling corner cases (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8952" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8952/hovercard">#8952</a>)
* Autoconfigure: Match environment variables for configuration keys containing underscores (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8933" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8933/hovercard">#8933</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8951" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8951/hovercard">#8951</a>)
* Autoconfigure: Support <code>PeriodicMetricReader</code> batch sizes through <code>otel.metric.export.max.batch.size</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8935" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8935/hovercard">#8935</a>)
* Autoconfigure: Correct SPI Javadoc (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8900" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8900/hovercard">#8900</a>)

Testing

* Add fluent metric point assertions to <code>MetricAssert</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8994" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8994/hovercard">#8994</a>)
* Add a builder supporting aggregation temporality selectors to <code>InMemoryMetricExporter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8993" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8993/hovercard">#8993</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bogdandrutu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bogdandrutu">@bogdandrutu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jameyg42/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jameyg42">@jameyg42</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jsuereth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jsuereth">@jsuereth</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kamikazeayoup/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kamikazeayoup">@kamikazeayoup</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nbiswal1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nbiswal1">@nbiswal1</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NithinU2802/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NithinU2802">@NithinU2802</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Rajkaran-122/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Rajkaran-122">@Rajkaran-122</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rooks-ns/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rooks-ns">@rooks-ns</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thswlsqls/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thswlsqls">@thswlsqls</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

