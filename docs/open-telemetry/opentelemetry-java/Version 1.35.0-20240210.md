# Version 1.35.0

## release on 20240210

## description

## changes

<strong>NOTE:</strong> The <code>opentelemetry-exporter-jaeger</code> and <code>opentelemetry-exporter-jaeger-thift</code> artifacts have stopped being published. Jaeger has <a href="https://opentelemetry.io/blog/2022/jaeger-native-otlp/" rel="nofollow">native support for OTLP</a>, and users should export to jaeger using <a href="https://opentelemetry.io/docs/instrumentation/java/exporters/#otlp-dependencies" rel="nofollow">OTLP</a> instead.

API

Incubator

* Add Span#addLink, for adding a link after span start (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6084" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6084/hovercard">#6084</a>)

SDK

Traces

* Bugfix: Ensure span status cannot be updated after set to StatusCode.OK (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6209" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6209/hovercard">#6209</a>

Metrics

* Reusable memory Mode: Adding support for exponential histogram aggregation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6058" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6058/hovercard">#6058</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/6136" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6136/hovercard">#6136</a>)
* Reusable memory mode: Adding support for explicit histogram aggregation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6153" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6153/hovercard">#6153</a>)
* Reusable memory mode: Adding support for sum aggregation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6182" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6182/hovercard">#6182</a>)
* Reusable memory mode: Adding support for last value aggregation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6196" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6196/hovercard">#6196</a>)

Exporters

* Recreate / fix graal issue detecting RetryPolicy class (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6139" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6139/hovercard">#6139</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/6134" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6134/hovercard">#6134</a>)
* Restore prometheus metric name mapper tests, fix regressions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6138" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6138/hovercard">#6138</a>)
* WARNING: Remove jaeger exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6119" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6119/hovercard">#6119</a>)
* Update dependency <code>io.zipkin.reporter2:zipkin-reporter-bom</code> to 3.2.1. Note: <code>ZipkinSpanExporterBuilder#setEncoder(zipkin2.codec.BytesEncoder)</code> has been deprecated in favor of <code>ZipkinSpanExporterBuilder#setEncoder(zipkin2.reporter.BytesEncoder)</code>. <code>ZipkinSpanExporterBuilder#setSender(zipkin2.reporter.Sender)</code> has been deprecated in favor of <code>ZipkinSpanExporterBuilder#setSender(zipkin2.reporter.BytesMessageSender)</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6129" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6129/hovercard">#6129</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/6151" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6151/hovercard">#6151</a>)
* Include trace flags in otlp marshaller (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6167" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6167/hovercard">#6167</a>)
* Add Compressor SPI support to OtlpGrpc{Signal}Exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6103" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6103/hovercard">#6103</a>)
* Allow Prometheus exporter to add resource attributes to metric attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6179" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6179/hovercard">#6179</a>)

Extension

* Autoconfigure accepts encoded header values for OTLP exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6164" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6164/hovercard">#6164</a>)

Incubator

* Align file configuration with latest changes to spec (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6088" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6088/hovercard">#6088</a>)

Tooling

* Stop including old artifacts in bom (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6157" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6157/hovercard">#6157</a>)
* Define CODECOV token (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6186" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6186/hovercard">#6186</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/apederson94/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/apederson94">@apederson94</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fstab/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fstab">@fstab</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NicklasWallgren/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NicklasWallgren">@NicklasWallgren</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/patrick-me/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/patrick-me">@patrick-me</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

