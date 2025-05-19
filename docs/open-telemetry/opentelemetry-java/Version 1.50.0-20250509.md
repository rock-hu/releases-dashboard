# Version 1.50.0

## release on 20250509

## description

## changes

API

* Clarify that AttributesBuilder.put allows nulls (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7271" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7271/hovercard">#7271</a>)
* Stabilize log record event name (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7277" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7277/hovercard">#7277</a>)

Context

* Fix duplicated ExecutorService wrap (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7245" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7245/hovercard">#7245</a>)
* Promote getAll to TextMapGetter stable API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7267" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7267/hovercard">#7267</a>)

Incubator

* Add ExtendedLogRecordBuilder#setException (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7182" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7182/hovercard">#7182</a>)
* Add experimental support for log extended attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7123" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7123/hovercard">#7123</a>)

SDK

* Remove Java9VersionSpecific clock implementation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7221" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7221/hovercard">#7221</a>)
* Add addProcessorFirst to SdkTracerProviderBuilder, SdkLoggerProviderBuilder (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7243" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7243/hovercard">#7243</a>)

Logs

* Add <code>setLoggerConfigurator</code> support to <code>LoggerProvider</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7332" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7332/hovercard">#7332</a>)

Metrics

* Add DelegatingMetricData (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7229" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7229/hovercard">#7229</a>)
* Spatial aggregation for async instruments with filtering views (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7264" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7264/hovercard">#7264</a>)

Exporters

* Prometheus: Add Authenticator support for PrometheusHttpServer (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7225" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7225/hovercard">#7225</a>)
* OTLP: Fix OTLP metric exporter toBuilder() loosing temporality (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7280" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7280/hovercard">#7280</a>)
* OTLP: Allow Otlp*MetricExporter's to publish export stats (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7255" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7255/hovercard">#7255</a>)

Extensions

* Declarative config: Add support for escaping env var substitution (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7033" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7033/hovercard">#7033</a>)
* Declarative config: update to opentelemetry-configuration 0.4 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7064" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7064/hovercard">#7064</a>)
* Declarativeconfig: Refactor internals to add DeclarativeConfigContext (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7293" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7293/hovercard">#7293</a>)

Project tooling

* Kotlin extension: Update min kotlin version to 1.8 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7155" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7155/hovercard">#7155</a>)
* Add javadoc site crawler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7300" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7300/hovercard">#7300</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/7316" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7316/hovercard">#7316</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Emily-Jiang/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Emily-Jiang">@Emily-Jiang</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fandreuz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fandreuz">@fandreuz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gavarava/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gavarava">@gavarava</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/iNikem/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/iNikem">@iNikem</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/onurkybsi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/onurkybsi">@onurkybsi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ShadabGentle/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ShadabGentle">@ShadabGentle</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SoftlySplinter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SoftlySplinter">@SoftlySplinter</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tsloughter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tsloughter">@tsloughter</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vasantteja/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vasantteja">@vasantteja</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

