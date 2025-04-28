# Version 1.47.0

## release on 20250207

## description

## changes

API

Incubator

* Make <code>ExtendedTracer</code> easier to use (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6943" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6943/hovercard">#6943</a>)
* Add <code>ExtendedLogRecordBuilder#setEventName</code> and corresponding SDK and OTLP serialization (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7012" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7012/hovercard">#7012</a>)
* BREAKING: Drop event API / SDK (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7053" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7053/hovercard">#7053</a>)

SDK

* Remove -alpha artifacts from runtime classpath of stable components (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6944" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6944/hovercard">#6944</a>)

Traces

* Bugfix: Follow spec on span limits, batch processors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7030" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7030/hovercard">#7030</a>)
* Add experimental <code>SdkTracerProvider.setScopeConfigurator(ScopeConfigurator)</code> for updating <code>TracerConfig</code> at runtime (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7021" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7021/hovercard">#7021</a>)

Profiles

* Add AttributeKeyValue abstraction to common otlp exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7026" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7026/hovercard">#7026</a>)
* Improve profiles attribute table handling (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7031" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7031/hovercard">#7031</a>)

Exporters

* Interpret timeout zero value as no limit (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7023" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7023/hovercard">#7023</a>)
* Bugfix - OTLP: Fix concurrent span reusable data marshaler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7041" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7041/hovercard">#7041</a>)
* OTLP: Add ability to customize retry exception predicate (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6991" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6991/hovercard">#6991</a>)
* OTLP: Expand default OkHttp sender retry exception predicate (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7047" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7047/hovercard">#7047</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/7057" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7057/hovercard">#7057</a>)

Extensions

* Autoconfigure: Consistent application of exporter customizers when otel.{signal}.exporter=none (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7017" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7017/hovercard">#7017</a>)
* Autoconfigure: Promote EnvironmentResourceProvider to public API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7052" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7052/hovercard">#7052</a>)
* Autoconfigure: Ensure <code>OTEL_PROPAGATORS</code> still works when <code>OTEL_SDK_DISABLED=true</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7062" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7062/hovercard">#7062</a>)%

Testing

* Add W3CBaggagePropagator to <code>OpenTelemetryRule</code>, <code>OpenTelemetryExtension</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7056" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7056/hovercard">#7056</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/edeweerd1A/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/edeweerd1A">@edeweerd1A</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Mahoney/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Mahoney">@Mahoney</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mikeblum/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mikeblum">@mikeblum</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/onurkybsi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/onurkybsi">@onurkybsi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/YuriyHolinko/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/YuriyHolinko">@YuriyHolinko</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

