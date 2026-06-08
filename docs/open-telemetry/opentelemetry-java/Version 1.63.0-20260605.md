# Version 1.63.0

## release on 20260605
## description
## changes
API

* Add missing <code>setAttribute</code> shortcuts to <code>Span</code> and <code>LogRecordBuilder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8255" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8255/hovercard">#8255</a>)
* Promote <code>InstrumentationUtil</code> to public class in <code>io.opentelemetry.api.impl</code> package (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8413" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8413/hovercard">#8413</a>)
* Fix index-out-of-bounds in <code>StrictContextStorage</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8294" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8294/hovercard">#8294</a>)

Incubating

* <strong>BREAKING</strong> Remove deprecated <code>ExtendedAttributes</code> and related code (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8395" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8395/hovercard">#8395</a>)

SDK

Metrics

* Collect async exemplars when exemplar filter is <code>always_on</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8363" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8363/hovercard">#8363</a>)
* Move delta record/collect coordination from instrument to series level (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8313" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8313/hovercard">#8313</a>)

Exporters

* Add <code>noop()</code> factory method to <code>SpanExporter</code> and <code>LogRecordExporter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8435" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8435/hovercard">#8435</a>)
* <strong>BREAKING</strong> OTLP: Remove support for deprecated <code>GrpcSenderProvider</code> and <code>HttpSenderProvider</code> SPI property names (use <code>io.opentelemetry.sdk.common.export.GrpcSenderProvider</code> / <code>io.opentelemetry.sdk.common.export.HttpSenderProvider</code> instead) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8392" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8392/hovercard">#8392</a>)
* OTLP: Bound OkHttp sender dispatchers and surface rejections (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8422" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8422/hovercard">#8422</a>)
* Prometheus: Limit exemplar label characters to conform to Prometheus limits (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8362" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8362/hovercard">#8362</a>)
* Logging: Fix <code>LoggingSpanExporter.flush()</code> to preserve flush failures (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8361" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8361/hovercard">#8361</a>)
* Zipkin: Make exporter self-contained by removing shared internal code dependencies (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8413" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8413/hovercard">#8413</a>)

Extensions

* <strong>BREAKING</strong> Autoconfigure: Remove deprecated <code>otel.experimental.config.file</code> property (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8393" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8393/hovercard">#8393</a>)
* <strong>BREAKING</strong> Incubator: Remove deprecated <code>ViewConfig</code>/<code>ViewConfigCustomizer</code> view file config mechanism (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8394" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8394/hovercard">#8394</a>)
* Declarative config: Fix model package (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8403" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8403/hovercard">#8403</a>)
* Declarative config: Fix Java module name to <code>io.opentelemetry.sdk.autoconfigure.declarativeconfig</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8452" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8452/hovercard">#8452</a>)

Shims

* Deprecate OpenTracing shim public API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8373" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8373/hovercard">#8373</a>)

Project tooling

* Finish adding OSGi support across all modules (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8401" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8401/hovercard">#8401</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8417" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8417/hovercard">#8417</a>)
* Force <code>io.zipkin.zipkin2:zipkin:3.6.1</code> to avoid problematic gson version (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8430" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8430/hovercard">#8430</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ADITYA-CODE-SOURCE/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ADITYA-CODE-SOURCE">@ADITYA-CODE-SOURCE</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuq/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuq">@anuq</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bogdandrutu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bogdandrutu">@bogdandrutu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cijothomas/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cijothomas">@cijothomas</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/khouari1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/khouari1">@khouari1</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kyyril/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kyyril">@kyyril</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ps-mir/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ps-mir">@ps-mir</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/royteeuwen/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/royteeuwen">@royteeuwen</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Sandared/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Sandared">@Sandared</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

