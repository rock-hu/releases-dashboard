# Version 1.66.0

## release on 20260911
## description
## changes
API

* Fix <code>Baggage.fromContext()</code> and <code>Baggage.fromContextOrNull()</code> to handle a <code>null</code> context (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8667" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8667/hovercard">#8667</a>)
* Do not percent-encode W3C baggage metadata (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8682" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8682/hovercard">#8682</a>)
* Fix <code>ArrayIndexOutOfBoundsException</code> in <code>OtelEncodingUtils</code> for invalid hex characters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8748" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8748/hovercard">#8748</a>)

SDK

Traces

* Record processed spans before export completes and reject new spans on shutdown in <code>SpanProcessor</code> self-observability instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8735" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8735/hovercard">#8735</a>)

Metrics

* Improve explicit bucket histogram contention performance (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8717" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8717/hovercard">#8717</a>)

Logs

* Record processed logs before export completes and reject new logs on shutdown in <code>LogRecordProcessor</code> self-observability instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8698" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8698/hovercard">#8698</a>)

Exporters

* OTLP: Respect <code>Retry-After</code> in OTLP HTTP senders (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8633" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8633/hovercard">#8633</a>)
* OTLP: Add <code>setEnabledProtocols</code> option to OTLP HTTP exporter builders (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8610" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8610/hovercard">#8610</a>)
* OTLP: Reject mixing <code>keyManager</code> and <code>sslContext</code> in <code>TlsConfigHelper</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8710" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8710/hovercard">#8710</a>)
* OTLP: Fix <code>OkHttpGrpcSender</code> mTLS when using the platform default trust store (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8758" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8758/hovercard">#8758</a>)
* OTLP: Suppress instrumentation of exporter requests in <code>JdkHttpSender</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8757" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8757/hovercard">#8757</a>)
* OTLP: Accept RFC 1123 hostnames in <code>EndpointUtil.validateEndpoint</code> for OkHttp senders (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8746" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8746/hovercard">#8746</a>)
* OTLP: Include the number of affected items in exporter error logging (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8780" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8780/hovercard">#8780</a>)
* OTLP: Add <code>toString</code> to <code>OtlpJsonLogging{Span,Metric,LogRecord}Exporter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8725" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8725/hovercard">#8725</a>)
* OTLP Profiles: Improve JFR export example and align <code>LinkData</code> null-element handling with the spec (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8349" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8349/hovercard">#8349</a>)
* Prometheus: Remove default host log warning in <code>PrometheusHttpServerBuilder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8679" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8679/hovercard">#8679</a>)
* Prometheus: Align UCUM byte unit conversions with the specification table (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8752" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8752/hovercard">#8752</a>)

Extensions

* <strong>BREAKING</strong> Declarative config: Rename generated model POJO setters from <code>with&lt;Prop&gt;</code> to <code>set&lt;Prop&gt;</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8742" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8742/hovercard">#8742</a>)
* Declarative config: Resolve experimental properties on stable APIs in generated model POJOs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8654" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8654/hovercard">#8654</a>)
* Declarative config: Fix inverted <code>scope_info_enabled</code> and <code>target_info_enabled</code> flags in the Prometheus component provider (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8750" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8750/hovercard">#8750</a>)
* Declarative config: Support <code>output_stream</code> in <code>otlp_file/development</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8676" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8676/hovercard">#8676</a>)
* Incubator: Add <code>toString</code> to <code>ComposableAnnotatingSampler</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8645" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8645/hovercard">#8645</a>)

Project tooling

* Remediate <code>zizmor</code> findings in GitHub Actions workflows (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8592" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8592/hovercard">#8592</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/abdessattar23/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/abdessattar23">@abdessattar23</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/adhamahmad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/adhamahmad">@adhamahmad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ADITYA-CODE-SOURCE/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ADITYA-CODE-SOURCE">@ADITYA-CODE-SOURCE</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anoopjb/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anoopjb">@anoopjb</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/arimu1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/arimu1">@arimu1</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/basti1302/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/basti1302">@basti1302</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bogdandrutu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bogdandrutu">@bogdandrutu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cdsap/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cdsap">@cdsap</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/chatgpt-codex-connector/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chatgpt-codex-connector">@chatgpt-codex-connector</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gniadeck/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gniadeck">@gniadeck</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/itsmehotpants/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/itsmehotpants">@itsmehotpants</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ivamly/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ivamly">@ivamly</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jameyg42/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jameyg42">@jameyg42</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kalayciburak/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kalayciburak">@kalayciburak</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LarryHu0217/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LarryHu0217">@LarryHu0217</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maryliag/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maryliag">@maryliag</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NithinU2802/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NithinU2802">@NithinU2802</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/noor-ahmadi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/noor-ahmadi">@noor-ahmadi</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Rajkaran-122/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Rajkaran-122">@Rajkaran-122</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rmannibucau/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rmannibucau">@rmannibucau</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robintra/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robintra">@robintra</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thswlsqls/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thswlsqls">@thswlsqls</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

