# Version 1.51.0

## release on 20250606

## description

## changes

API

Context

* Fix context storage provider property name in log message (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7342" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7342/hovercard">#7342</a>)

SDK

* Experimental configurable exception.* attribute resolution for SdkTracerProvider, SdkLoggerProvider (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7266" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7266/hovercard">#7266</a>)

Exporters

* All exporters: implement new SemConv exporter health metrics, with configuration API for selecting schema version (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7265" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7265/hovercard">#7265</a>)
* OTLP: Add gRPC export for profiles signal type. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7301" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7301/hovercard">#7301</a>)
* OTLP: Run JDK HTTP sender on non-daemon threads. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7322" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7322/hovercard">#7322</a>)
* Prometheus: fix serialization of arrays (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7291" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7291/hovercard">#7291</a>)
* OTLP: exporter tolerates instances of LogRecordData when incubator is present (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7393" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7393/hovercard">#7393</a>)

Extensions

* Declarative config: Handle instrumentation node changes in yaml config file format 0.4 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7357" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7357/hovercard">#7357</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/alex-kormukhin/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/alex-kormukhin">@alex-kormukhin</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fandreuz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fandreuz">@fandreuz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/HaloFour/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/HaloFour">@HaloFour</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kevinburkesegment/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kevinburkesegment">@kevinburkesegment</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LaurentTreguier/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LaurentTreguier">@LaurentTreguier</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/onurkybsi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/onurkybsi">@onurkybsi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SoftlySplinter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SoftlySplinter">@SoftlySplinter</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

