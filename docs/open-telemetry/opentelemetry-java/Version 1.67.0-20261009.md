# Version 1.67.0

## release on 20261009
## description
## changes
API

* Deprecate <code>TextMapGetter.keys()</code> and make <code>TextMapGetter</code> a functional interface (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8531" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8531/hovercard">#8531</a>)
* Add null guards and API usage logging for tracing, baggage, attributes, logging, and metrics (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8803" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8803/hovercard">#8803</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8863" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8863/hovercard">#8863</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8864" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8864/hovercard">#8864</a>)
* Bound allocations and avoid regex backtracking when parsing W3C <code>tracestate</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8817" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8817/hovercard">#8817</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8914" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8914/hovercard">#8914</a>)

Incubating

* Add type introspection methods to <code>DeclarativeConfigProperties</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8883" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8883/hovercard">#8883</a>)

Extensions

* Trace propagators: Bound allocations when parsing Jaeger baggage and B3 single-header propagation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8817" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8817/hovercard">#8817</a>)

SDK

* Run <code>CompletableResultCode</code> completion actions outside internal locks to avoid deadlocks (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8773" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8773/hovercard">#8773</a>)
* Do not count attribute overwrites as dropped attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8833" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8833/hovercard">#8833</a>)
* Avoid regex backtracking in glob matching (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8909" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8909/hovercard">#8909</a>)
* Add experimental resource entity support, OTLP export, and configuration through <code>otel.entities</code> and declarative resource detectors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8464" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8464/hovercard">#8464</a>)

Traces

* Return noop tracers when no span processors are configured (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8815" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8815/hovercard">#8815</a>)
* Catch <code>Throwable</code> in <code>SimpleSpanProcessor</code> and <code>MultiSpanExporter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8848" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8848/hovercard">#8848</a>)
* Use <code>{span}</code> units for span processor self-observability metrics (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8873" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8873/hovercard">#8873</a>)

Metrics

* Stabilize <code>PeriodicMetricReaderBuilder.setMaxExportBatchSize(int)</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8829" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8829/hovercard">#8829</a>)
* Delete experimental metric attribute / baggage processing (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8818" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8818/hovercard">#8818</a>)
* Fix: Reset exemplar span context when a reservoir cell is overwritten outside a span (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8871" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8871/hovercard">#8871</a>)

Logs

* Return noop loggers from <code>SdkLoggerProvider.get()</code> when no log record processors are configured (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8838" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8838/hovercard">#8838</a>)
* Catch <code>Throwable</code> in <code>SimpleLogRecordProcessor</code> and <code>MultiLogRecordExporter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8848" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8848/hovercard">#8848</a>)

Profiles

* Fix <code>KeyValueAndUnitData.create()</code> to return the public <code>KeyValueAndUnitData</code> interface (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8875" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8875/hovercard">#8875</a>)

Exporters

* OTLP: Fix missing request size limits, defaulting to 64 MiB, configurable through <code>setMaxRequestBodySize(long)</code> and <code>setMaxRequestMessageSize(long)</code> and through declarative config <code>OtlpGrpcExporter</code>, <code>OtlpHttpExporter</code> (see full schema docs <a href="https://opentelemetry.io/docs/specs/otel-config/types/#type-otlpgrpcexporter" rel="nofollow">here</a>) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8446" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8446/hovercard">#8446</a>)
* OTLP: Reduce failure logs to <code>FINE</code> after shutdown (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8819" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8819/hovercard">#8819</a>)
* OTLP: retry gRPC based on response status codes in trailer headers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8854" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8854/hovercard">#8854</a>)
* Prometheus: Avoid regex backtracking when removing unit annotations (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8910" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8910/hovercard">#8910</a>)

Extensions

* Autoconfigure: Stabilize <code>ServiceInstanceIdResourceProvider</code> and generate <code>service.instance.id</code> by default (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8770" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8770/hovercard">#8770</a>)
* Autoconfigure: Preserve unencoded non-ASCII characters when decoding resource attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8893" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8893/hovercard">#8893</a>)
* Autoconfigure: Add missing artifact hints for <code>experimental-otlp/stdout</code> span and metric exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8897" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8897/hovercard">#8897</a>)
* Declarative config: Update to schema v1.2.0 and support the <code>always_record</code> sampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8801" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8801/hovercard">#8801</a>)
* Declarative config: Ignore resource attributes with null values (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8889" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8889/hovercard">#8889</a>)
* Declarative config: Match array attributes element-wise in the <code>rule_based</code> sampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8895" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8895/hovercard">#8895</a>)
* Jaeger remote sampler: Reduce failure logs to <code>FINE</code> after shutdown (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8819" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8819/hovercard">#8819</a>)
* Jaeger remote sampler: Preserve per-operation sampling strategies when the rate limit is zero (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8888" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8888/hovercard">#8888</a>)
* Incubator: Make <code>OnEndSpanProcessor.create()</code> public (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8892" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8892/hovercard">#8892</a>)
* Incubator: Fix the class name in <code>ComposableProbabilitySampler</code> descriptions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8891" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8891/hovercard">#8891</a>)

Testing

* Fix assertion failure messages reporting the wrong value or type (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8872" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8872/hovercard">#8872</a>)

Shims

* OpenCensus: Skip W3C multi-tenant <code>tracestate</code> keys when converting spans (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8810" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8810/hovercard">#8810</a>)
* OpenTracing: Propagate baggage to the parent context in <code>SpanBuilderShim</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8812" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8812/hovercard">#8812</a>)

Project tooling

* Kotlin extension: Raise the minimum Kotlin version to 2.2 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8804" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8804/hovercard">#8804</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/adhamahmad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/adhamahmad">@adhamahmad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ADITYA-CODE-SOURCE/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ADITYA-CODE-SOURCE">@ADITYA-CODE-SOURCE</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/amit306/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/amit306">@amit306</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AndresBena19/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AndresBena19">@AndresBena19</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anjeongkyun/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anjeongkyun">@anjeongkyun</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/arnabnandy7/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/arnabnandy7">@arnabnandy7</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cfredri4/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cfredri4">@cfredri4</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codedbyadiiii/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codedbyadiiii">@codedbyadiiii</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/colamong/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/colamong">@colamong</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/efegokdemir/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/efegokdemir">@efegokdemir</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/EvgeniiR/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/EvgeniiR">@EvgeniiR</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gfelbing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gfelbing">@gfelbing</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JnRouvignac/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JnRouvignac">@JnRouvignac</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jsuereth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jsuereth">@jsuereth</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kevinburkesegment/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kevinburkesegment">@kevinburkesegment</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Oberon00/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Oberon00">@Oberon00</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Rajkaran-122/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Rajkaran-122">@Rajkaran-122</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rooks-ns/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rooks-ns">@rooks-ns</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rotscher/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rotscher">@rotscher</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/saivarun1410/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/saivarun1410">@saivarun1410</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thswlsqls/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thswlsqls">@thswlsqls</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Vicky677/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Vicky677">@Vicky677</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

