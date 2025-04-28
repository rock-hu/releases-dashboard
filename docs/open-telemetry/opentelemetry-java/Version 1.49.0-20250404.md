# Version 1.49.0

## release on 20250404

## description

## changes

SDK

Trace

* Avoid linear queue.size() calls in span producers by storing queue size separately (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7141" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7141/hovercard">#7141</a>)

Exporters

* OTLP: Add support for setting exporter executor service (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7152" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7152/hovercard">#7152</a>)
* OTLP: Refine delay jitter for exponential backoff (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7206" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7206/hovercard">#7206</a>)

Extensions

* Autoconfigure: Remove support for otel.experimental.exporter.otlp.retry.enabled (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7200" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7200/hovercard">#7200</a>)
* Autoconfigure: Add stable cardinality limit property otel.java.metrics.cardinality.limit (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7199" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7199/hovercard">#7199</a>)
* Incubator: Add declarative config model customizer SPI (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7118" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7118/hovercard">#7118</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/MrAlias/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/MrAlias">@MrAlias</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/raipc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/raipc">@raipc</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stevesea/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stevesea">@stevesea</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vbedrosova/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vbedrosova">@vbedrosova</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/YuriyHolinko/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/YuriyHolinko">@YuriyHolinko</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

