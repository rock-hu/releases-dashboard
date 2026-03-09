# Version 1.60.0

## release on 20260306
## description
## changes
API

* Support W3C trace context random flag (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8012" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8012/hovercard">#8012</a>)
* Clarify that <code>SpanBuilder.setAttribute</code> allows null values (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8072" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8072/hovercard">#8072</a>)

Incubating

* Implement environment variable context propagation carriers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8074" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8074/hovercard">#8074</a>)
* Deprecate <code>ExtendedAttributes</code>, <code>ExtendedAttributeKey</code>, <code>ExtendedAttributeType</code>, <code>ExtendedAttributesBuilder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8060" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8060/hovercard">#8060</a>)
* Deprecate <code>peerServiceMapping</code> accessor from <code>InstrumentationConfigUtil</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8088" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8088/hovercard">#8088</a>)

SDK

Traces

* Disable warning when using <code>TraceIdRatioBasedSampler</code> as root sampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8065" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8065/hovercard">#8065</a>)
* User-supplied attributes take precedence over exception-derived attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7993" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7993/hovercard">#7993</a>)
* Exclude META-INF/maven from traces SDK shaded dependencies (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8096" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8096/hovercard">#8096</a>)
* Fix inverted condition in LegacySpanProcessorInstrumentation#finishSpans (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8145" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8145/hovercard">#8145</a>)

Metrics

* Split out cumulative vs. delta storage (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8015" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8015/hovercard">#8015</a>)
* Add metrics for <code>PeriodicMetricReader</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8038" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8038/hovercard">#8038</a>)
* Allow configuring min/max in histograms (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8095" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8095/hovercard">#8095</a>)
* Remove deprecated <code>otel.experimental.metrics.cardinality.limit</code> property (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8124" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8124/hovercard">#8124</a>)
* <strong>BREAKING</strong> bug fix: <code>GlobUtil</code> and <code>IncludePatternMatching</code>, used in views and declarative config matching, previously were inconsistent in case sensitivity. If a glob char (* or ?) was present, it was evaluated with case sensitivity. If no glob chars were present, it was evaluated with case insensitivity. Now, all are consistently evaluated with case sensitivity. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8152" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8152/hovercard">#8152</a>)

Logs

* Stabilize <code>LogRecordBuilder.setException</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8089" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8089/hovercard">#8089</a>)
* Clarify <code>setTimestamp</code> javadoc for event timestamp behavior (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8104" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8104/hovercard">#8104</a>)

Exporters

* OTLP: Fix marshaling for empty string attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8014" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8014/hovercard">#8014</a>)
* Prometheus: Update Prometheus client to 1.5.0 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8080" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8080/hovercard">#8080</a>)
* OTLP: Serialize exponential histogram sum as optional double (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8107" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8107/hovercard">#8107</a>)
* OTLP: Use <code>KeyManagerFactory.getDefaultAlgorithm()</code> in <code>TlsUtil.keyManager()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8122" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8122/hovercard">#8122</a>)
* OTLP: Ensure proto serializer idCache is cleared when exception is thrown (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8147" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8147/hovercard">#8147</a>)

Extensions

* Autoconfigure: Decode plus sign in resource attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8059" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8059/hovercard">#8059</a>)
* Declarative config: update to 1.0 schema (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8123" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8123/hovercard">#8123</a>)
* Declarative config: add support for setting schema URL (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8028" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8028/hovercard">#8028</a>)
* Declarative config: add version mismatch warning (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8069" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8069/hovercard">#8069</a>)
* Declarative config: cache component providers in <code>DeclarativeConfigContext</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8070" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8070/hovercard">#8070</a>)
* Declarative config: add system property substitution (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8073" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8073/hovercard">#8073</a>)
* Declarative config: add exporter customizers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8081" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8081/hovercard">#8081</a>)
* Declarative config: add support for setting internal telemetry version (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8045" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8045/hovercard">#8045</a>)
* Deprecate View File Configuration mechanism (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8133" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8133/hovercard">#8133</a>)
* Autoconfigure: add property to allow autoconfiguration of SDK telemetry version (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8037" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8037/hovercard">#8037</a>)
* Jaeger remote sampler: refactor to leverage senders (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8046" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8046/hovercard">#8046</a>)
* Declarative config: document ObjectMapper config (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8075" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8075/hovercard">#8075</a>)
* Declarative config: Remove unchecked warning (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8090" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8090/hovercard">#8090</a>)

Project tooling

* Add architecture test to detect usage of shared internal code (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6978" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6978/hovercard">#6978</a>)
* Replace Xlint deprecation check with custom error-prone check (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8061" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8061/hovercard">#8061</a>)
* Enable error-prone's UnnecessarilyFullyQualified check (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8078" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8078/hovercard">#8078</a>)
* Small refactoring to make safety clearer (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8083" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8083/hovercard">#8083</a>)
* Rework span record benchmark and publish results (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8031" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8031/hovercard">#8031</a>)
* Add <code>LogRecordBenchmark</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8106" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8106/hovercard">#8106</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8117" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8117/hovercard">#8117</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/adrielp/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/adrielp">@adrielp</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/andrzejressel/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/andrzejressel">@andrzejressel</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/antonio-mazzini/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/antonio-mazzini">@antonio-mazzini</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/arnav-dasgupta/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/arnav-dasgupta">@arnav-dasgupta</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Bhagirath00/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Bhagirath00">@Bhagirath00</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/blakeli0/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/blakeli0">@blakeli0</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/carlosalberto/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/carlosalberto">@carlosalberto</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/GerardoGR/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/GerardoGR">@GerardoGR</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jmacd/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jmacd">@jmacd</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lbarrios/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lbarrios">@lbarrios</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marcingrzejszczak/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marcingrzejszczak">@marcingrzejszczak</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/MikeGoldsmith/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/MikeGoldsmith">@MikeGoldsmith</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mosesn/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mosesn">@mosesn</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Quaffel/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Quaffel">@Quaffel</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ruturajjadhav07/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ruturajjadhav07">@ruturajjadhav07</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wglad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wglad">@wglad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

