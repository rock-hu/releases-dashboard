# Version 1.52.0

## release on 20250711
## description
## changes
API

Common

* Promote <code>ComponentLoader</code> to new <code>opentelemetry-common</code> artifact, standardize SPI loading (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7446" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7446/hovercard">#7446</a>)

Context

* LazyStorage passes its ClassLoader when loading ContextStorageProvider SPI (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7424" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7424/hovercard">#7424</a>)

Incubator

* Add context and severity params to ExtendedLogger#isEnabled (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7268" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7268/hovercard">#7268</a>)
* Add new convenience methods for converting DeclarativeConfigProperties to config model (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7453" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7453/hovercard">#7453</a>)

SDK

* Add custom stacktrace renderer which is length limit aware (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7281" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7281/hovercard">#7281</a>)

Metrics

* Propagate flush to PeriodicMetricReader's metricExporter. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7410" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7410/hovercard">#7410</a>)

Exporters

* OTLP - JdkHttpSender: ensure proper closure of HttpClient in shutdown method (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7390" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7390/hovercard">#7390</a>)
* OTLP: profile exporters fix and test improvements (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7442" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7442/hovercard">#7442</a>)
* OTLP: Loading Compressor SPI via ComponentLoader configured through setComponentLoader (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7428" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7428/hovercard">#7428</a>)
* Prometheus: add scope schema URL and attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7356" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7356/hovercard">#7356</a>)
* Prometheus: extend prometheus declarative config support to include without_scope_info, with_resource_constant_labels (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6840" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6840/hovercard">#6840</a>)

Extensions

* Autoconfigure: fix race condition of <code>GlobalOpenTelemetry</code> initialization with <code>AutoConfiguredOpenTelemetrySdkBuilder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7365" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7365/hovercard">#7365</a>)
* Declarative config: update to declarative config 1.0-rc.1 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7436" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7436/hovercard">#7436</a>)
* Declarative config: resolve environment variable substitution for mixed quotes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7433" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7433/hovercard">#7433</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ArthurSens/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ArthurSens">@ArthurSens</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/atoulme/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/atoulme">@atoulme</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dol/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dol">@dol</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fandreuz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fandreuz">@fandreuz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/felixbarny/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/felixbarny">@felixbarny</a>  

@github-advanced-security  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/indigophox/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/indigophox">@indigophox</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jsuereth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jsuereth">@jsuereth</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nchen000/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nchen000">@nchen000</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pellared/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pellared">@pellared</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vasantteja/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vasantteja">@vasantteja</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

