# Version 1.34.0

## release on 20240106

## description

## changes

<strong>NOTE:</strong> This is the LAST release for <code>opentelemetry-exporter-jaeger</code> and <code>opentelemetry-exporter-jaeger-thift</code>. Jaeger has <a href="https://opentelemetry.io/blog/2022/jaeger-native-otlp/" rel="nofollow">native support for OTLP</a>, and users should export to jaeger using <a href="https://opentelemetry.io/docs/instrumentation/java/exporters/#otlp-dependencies" rel="nofollow">OTLP</a> instead.

API

* Ability to access version.properties API file with GraalVM native (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6095" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6095/hovercard">#6095</a>)

SDK

Traces

* Only call SpanProcessor onStart / onEnd if required (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6112" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6112/hovercard">#6112</a>)
* Add option to export unsampled spans from span processors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6057" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6057/hovercard">#6057</a>)

Metrics

* Memory Mode: Adding first part support for synchronous instruments - storage (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5998" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5998/hovercard">#5998</a>)
* Base2ExponentialHistogramAggregation maxBuckets must be >= 2 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6093" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6093/hovercard">#6093</a>)
* Convert histogram measurements to double before passing recording exemplar reservoir (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6024" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6024/hovercard">#6024</a>)

Exporters

* Add compressor SPI to support additional compression algos (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5990" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5990/hovercard">#5990</a>)
* Test OTLP exporters with different OkHttp versions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6045" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6045/hovercard">#6045</a>)
* Refactor prometheus exporter to use <code>io.prometheus:prometheus-metrics-exporter-httpserver</code>, add exponential Histogram support (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6015" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6015/hovercard">#6015</a>)
* UpstreamGrpcSenderProvider uses minimal fallback managed channel when none is specified (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6110" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6110/hovercard">#6110</a>)
* OTLP exporters propagate serialization IOException instead of rethrowing as runtime (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6082" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6082/hovercard">#6082</a>)

Extensions

* Autoconfigure reads normalized otel.config.file property (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6105" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6105/hovercard">#6105</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/axw/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/axw">@axw</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fax4ever/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fax4ever">@fax4ever</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fstab/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fstab">@fstab</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/HaloFour/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/HaloFour">@HaloFour</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lchdev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lchdev">@lchdev</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nluk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nluk">@nluk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NthPortal/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NthPortal">@NthPortal</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/patrick-me/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/patrick-me">@patrick-me</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ricardo-mestre/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ricardo-mestre">@ricardo-mestre</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/TomasChladekSL/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/TomasChladekSL">@TomasChladekSL</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

