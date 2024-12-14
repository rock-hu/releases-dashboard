# Version 1.37.0

## release on 20240406

## description

## changes

<strong>NOTICE:</strong> This release contains a significant restructuring of the experimental event API and the API incubator artifact. Please read the notes in the <code>API -&gt; Incubator</code> section carefully.

API

* Promote <code>Span#addLink</code> to stable API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6317" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6317/hovercard">#6317</a>)

Incubator

* BREAKING: Rename <code>opentelemetry-extension-incubator</code> to <code>opentelemetry-api-incubator</code>, merge <code>opentelemetry-api-events</code> into <code>opentelemetry-api-incubator</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6289" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6289/hovercard">#6289</a>)
* BREAKING: Remove domain from event api. <code>EventEmitterProvider#setEventDomain</code> has been removed. The <code>event.name</code> field should now be namespaced to avoid collisions. See <a href="https://opentelemetry.io/docs/specs/semconv/general/events/" rel="nofollow">Semantic Conventions for Event Attributes</a> for more details. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6253" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6253/hovercard">#6253</a>)
* BREAKING: Rename <code>EventEmitter</code> and related classes to <code>EventLogger</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6316" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6316/hovercard">#6316</a>)
* BREAKING: Refactor Event API to reflect spec changes. Restructure API to put fields in the <code>AnyValue</code> log record body. Add setters for timestamp, context, and severity. Set default severity to <code>INFO=9</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6318" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6318/hovercard">#6318</a>)

SDK

* Add <code>get{Signal}Exporter</code> methods to <code>Simple{Signal}Processor</code>, <code>Batch{Signal}Processor</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6078" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6078/hovercard">#6078</a>)

Metrics

* Use synchronized instead of reentrant lock in explicit bucket histogram (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6309" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6309/hovercard">#6309</a>)

Exporters

* Fix typo in OTLP javadoc (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6311" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6311/hovercard">#6311</a>)
* Add <code>PrometheusHttpServer#toBuilder()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6333" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6333/hovercard">#6333</a>)
* Bugfix: Use <code>getPrometheusName</code> for Otel2PrometheusConverter map keys to avoid metric name conflicts (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6308" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6308/hovercard">#6308</a>)

Extensions

* Add Metric exporter REUSABLE_DATA memory mode configuration options, including autoconfigure support via env var <code>OTEL_JAVA_EXPERIMENTAL_EXPORTER_MEMORY_MODE=REUSABLE_DATA</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6304" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6304/hovercard">#6304</a>)
* Add autoconfigure console alias for logging exporter (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6027" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6027/hovercard">#6027</a>)
* Update jaeger autoconfigure docs to point to OTLP (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6307" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6307/hovercard">#6307</a>)
* Add <code>ServiceInstanceIdResourceProvider</code> implementation for generating <code>service.instance.id</code> UUID if not already provided by user. Included in <code>opentelemetry-sdk-extension-incubator</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6226" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6226/hovercard">#6226</a>)
* Add GCP resource detector to list of resource providers in autoconfigure docs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6336" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6336/hovercard">#6336</a>)

Tooling

* Check for Java 17 toolchain and fail if not found (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6303" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6303/hovercard">#6303</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bogdandrutu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bogdandrutu">@bogdandrutu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/helpermethod/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/helpermethod">@helpermethod</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jonatan-ivanov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jonatan-ivanov">@jonatan-ivanov</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jpkrohling/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jpkrohling">@jpkrohling</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/MSNev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/MSNev">@MSNev</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nluk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nluk">@nluk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robberphex/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robberphex">@robberphex</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/scheler/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/scheler">@scheler</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

