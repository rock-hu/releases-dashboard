# Version 1.65.0

## release on 20260807
## description
## changes
<strong>NOTE:</strong> The <code>opentelemetry-exporter-zipkin</code> artifact has stopped being published. It was deprecated in a prior release. Users should migrate to OTLP or use a Zipkin-compatible collector exporter.

API

* Ignore empty baggage keys in <code>ImmutableBaggage.put</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8658" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8658/hovercard">#8658</a>)
* Use <code>NumberFormatException</code> in baggage decoder (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8593" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8593/hovercard">#8593</a>)
* Fix <code>TraceStateBuilder.remove</code> corrupting the builder when the same key is removed twice (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8613" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8613/hovercard">#8613</a>)

Incubating

* Add bound instrument APIs (<code>BoundLongCounter</code>, <code>BoundDoubleCounter</code>, <code>BoundLongHistogram</code>, <code>BoundDoubleHistogram</code>, <code>BoundLongUpDownCounter</code>, <code>BoundDoubleUpDownCounter</code>, <code>BoundLongGauge</code>, <code>BoundDoubleGauge</code>) to the incubator metrics API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8527" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8527/hovercard">#8527</a>)

Extensions

* Trace propagators: Fix <code>JaegerPropagator</code> baggage header key case sensitivity (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8496" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8496/hovercard">#8496</a>)
* Trace propagators: Do not overwrite existing baggage with empty baggage in <code>JaegerPropagator</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8632" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8632/hovercard">#8632</a>)
* Trace propagators: Skip empty baggage keys in <code>OtTracePropagator</code> extract (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8631" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8631/hovercard">#8631</a>)
* Trace propagators: Stop parsing a <code>jaeger-baggage</code> header after 64 tokens, including malformed tokens (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8702" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8702/hovercard">#8702</a>)

SDK

* Update SDK attributes implementation (<code>AttributesMap</code>) to enforce last-value-win semantics based on string value of <code>AttributeKey.getKey()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8548" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8548/hovercard">#8548</a>)

Traces

* Add <code>Sampler</code> shutdown lifecycle: <code>Sampler</code> now extends <code>Closeable</code> and exposes a default <code>shutdown()</code> invoked when the <code>SdkTracerProvider</code> is shut down; <code>JaegerRemoteSampler</code> implements it to stop its polling executor (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8574" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8574/hovercard">#8574</a>)

Metrics

* Gate <code>PeriodicMetricReader</code> self-observability metrics by internal telemetry version (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8597" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8597/hovercard">#8597</a>)
* Record <code>error.type</code> on failed collections in <code>PeriodicMetricReader</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8650" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8650/hovercard">#8650</a>)
* Testing: Fix <code>LongExemplarAssert.hasFilteredAttributesSatisfyingExactly</code> to enforce exact attribute matching (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8518" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8518/hovercard">#8518</a>)

Logs

* Fix <code>ReadWriteLogRecord</code> default <code>getObservedTimestampEpochNanos</code> returning the record timestamp (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8504" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8504/hovercard">#8504</a>)

Profiles

* Fix profiles data model attribute count parameter name and timestamp doc unit (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8514" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8514/hovercard">#8514</a>)

Exporters

* <strong>WARNING</strong> Zipkin: Delete <code>opentelemetry-exporter-zipkin</code>; the artifact is no longer published (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8677" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8677/hovercard">#8677</a>)
* OTLP: Use HTTP error response bodies in <code>HttpExporter</code> warning logs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8428" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8428/hovercard">#8428</a>)
* OTLP: Fix <code>OkHttpHttpSender</code> mTLS when using the platform default trust store (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8565" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8565/hovercard">#8565</a>)
* OTLP: Fix sign extension on <code>LogRecord</code> flags in the low-allocation log marshaler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8493" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8493/hovercard">#8493</a>)
* OTLP: Standardize <code>OkHttpHttpSender</code>, <code>JdkHttpSender</code>, and <code>UpstreamGrpcSender</code> shutdown to await executor/channel termination (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8495" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8495/hovercard">#8495</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8627" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8627/hovercard">#8627</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8624" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8624/hovercard">#8624</a>)
* OTLP: Log the underlying except/ion when a gRPC response frame is invalid (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8626" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8626/hovercard">#8626</a>)
* OTLP: Avoid the unsafe string encoder on Android (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8637" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8637/hovercard">#8637</a>)
* Prometheus: Merge colliding Prometheus label values (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8364" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8364/hovercard">#8364</a>)
* Prometheus: Fix <code>PrometheusHttpServer.toBuilder()</code> dropping the configured default handler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8619" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8619/hovercard">#8619</a>)
* Logging: Output event name in <code>SystemOutLogRecordExporter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8609" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8609/hovercard">#8609</a>)
* Logging: Include aggregation temporality in <code>LoggingMetricExporter</code> <code>toString</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8623" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8623/hovercard">#8623</a>)

Extensions

* Autoconfigure: Avoid exposing configuration values in error messages (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8669" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8669/hovercard">#8669</a>)
* Declarative config: Fix Jaeger sampler polling interval configuration (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8668" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8668/hovercard">#8668</a>)
* Declarative config: Remove duplicate <code>getStringList</code> resolver in <code>DeclarativeConfigPropertyUtil</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8572" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8572/hovercard">#8572</a>)
* Declarative config: Replace <code>jsonschema2pojo</code> with a hand-rolled POJO generator (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8600" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8600/hovercard">#8600</a>)
* Incubator: Restore compliance between composite samplers code and the spec (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8450" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8450/hovercard">#8450</a>)

Shims

* <strong>DEPRECATION</strong> Deprecate the OpenCensus shim public API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8674" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8674/hovercard">#8674</a>)
* OpenCensus: Preserve OpenCensus status description when converting to OpenTelemetry (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8511" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8511/hovercard">#8511</a>)
* OpenCensus: Add links to the OpenTelemetry span instead of logging a warning and dropping them (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8635" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8635/hovercard">#8635</a>)
* OpenTracing: Return <code>null</code> from <code>TracerShim</code> extract when the carrier has no span context (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8505" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8505/hovercard">#8505</a>)
* OpenTracing: Return the extracted <code>SpanContext</code> when it is sampled but invalid (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8634" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8634/hovercard">#8634</a>)

Project tooling

* Pin japicmp baseline in <code>version.gradle.kts</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8591" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8591/hovercard">#8591</a>)
* Update contributing guide in response to feedback (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8655" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8655/hovercard">#8655</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/abdessattar23/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/abdessattar23">@abdessattar23</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ADITYA-CODE-SOURCE/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ADITYA-CODE-SOURCE">@ADITYA-CODE-SOURCE</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anoopjb/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anoopjb">@anoopjb</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/calohmn/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/calohmn">@calohmn</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ChenX1993/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ChenX1993">@ChenX1993</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cijothomas/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cijothomas">@cijothomas</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Dainerx/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Dainerx">@Dainerx</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Debashismitra01/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Debashismitra01">@Debashismitra01</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/EvgeniiR/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/EvgeniiR">@EvgeniiR</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fossadvocate86/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fossadvocate86">@fossadvocate86</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kevinburkesegment/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kevinburkesegment">@kevinburkesegment</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LarryHu0217/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LarryHu0217">@LarryHu0217</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maryliag/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maryliag">@maryliag</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NithinU2802/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NithinU2802">@NithinU2802</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/prasadw/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/prasadw">@prasadw</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Rajkaran-122/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Rajkaran-122">@Rajkaran-122</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Sabaev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Sabaev">@Sabaev</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Teseus84/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Teseus84">@Teseus84</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thswlsqls/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thswlsqls">@thswlsqls</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/TimurRakhmatullin86/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/TimurRakhmatullin86">@TimurRakhmatullin86</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vadyanuch13-ai/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vadyanuch13-ai">@vadyanuch13-ai</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

