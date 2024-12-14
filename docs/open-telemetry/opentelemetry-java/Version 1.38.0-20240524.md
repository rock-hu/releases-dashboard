# Version 1.38.0

## release on 20240524

## description

## changes

API

* Stabilize synchronous gauge (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6419" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6419/hovercard">#6419</a>)

Incubator

* Add put(AttributeKey, T) overload to EventBuilder (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6331" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6331/hovercard">#6331</a>)

Baggage

* Baggage filters space-only keys (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6431" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6431/hovercard">#6431</a>)

SDK

* Add experimental scope config to enable / disable scopes (i.e. meter, logger, tracer) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6375" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6375/hovercard">#6375</a>)

Traces

* Add ReadableSpan#getAttributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6382" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6382/hovercard">#6382</a>)
* Use standard ArrayList size rather than max number of links for initial span links allocation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6252" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6252/hovercard">#6252</a>)

Metrics

* Use low precision Clock#now when computing timestamp for exemplars (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6417" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6417/hovercard">#6417</a>)
* Update invalid instrument name log message now that forward slash <code>/</code> is valid (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6343" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6343/hovercard">#6343</a>)

Exporters

* Introduce low allocation OTLP marshalers. If using autoconfigure, opt in via <code>OTEL_JAVA_EXPERIMENTAL_EXPORTER_MEMORY_MODE=REUSABLE_DATA</code>.
  * Low allocation OTLP logs marshaler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6429" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6429/hovercard">#6429</a>)
  * Low allocation OTLP metrics marshaler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6422" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6422/hovercard">#6422</a>)
  * Low allocation OTLP trace marshaler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6410" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6410/hovercard">#6410</a>)
  * Add memory mode support to OTLP exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6430" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6430/hovercard">#6430</a>)
  * Marshal span status description without allocation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6423" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6423/hovercard">#6423</a>)
  * Add private constructors for stateless marshalers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6434" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6434/hovercard">#6434</a>)
* Mark opentelemetry-exporter-sender-jdk stable (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6357" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6357/hovercard">#6357</a>)
* PrometheusHttpServer prevent concurrent reads when reusable memory mode (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6371" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6371/hovercard">#6371</a>)
* Ignore TLS components (SSLContext, TrustManager, KeyManager) if plain HTTP protocol is used for exporting (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6329" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6329/hovercard">#6329</a>)
* Add is_remote_parent span flags to OTLP exported Spans and SpanLinks (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6388" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6388/hovercard">#6388</a>)
* Add missing fields to OTLP metric exporters <code>toString()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6402" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6402/hovercard">#6402</a>)

Extensions

* Rename otel.config.file to otel.experimental.config.file for autoconfigure (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6396" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6396/hovercard">#6396</a>)

OpenCensus Shim

* Fix opencensus shim spanBuilderWithRemoteParent behavior (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6415" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6415/hovercard">#6415</a>)

Tooling

* Add additional API incubator docs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6356" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6356/hovercard">#6356</a>)
* Run build on java 21 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6370" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6370/hovercard">#6370</a>)
* Fix running tests with java 8 on macos (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6411" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6411/hovercard">#6411</a>)
* Move away from deprecated gradle enterprise APIs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6363" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6363/hovercard">#6363</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlexanderWert/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlexanderWert">@AlexanderWert</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/arosien/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/arosien">@arosien</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gavin-nia/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gavin-nia">@gavin-nia</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jimshowalter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jimshowalter">@jimshowalter</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/oliver-zhang/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/oliver-zhang">@oliver-zhang</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/serkan-ozal/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/serkan-ozal">@serkan-ozal</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tkmsaaaam/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tkmsaaaam">@tkmsaaaam</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

