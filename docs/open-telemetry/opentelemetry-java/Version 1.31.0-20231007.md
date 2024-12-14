# Version 1.31.0

## release on 20231007

## description

## changes

API

Incubator

* Refactor advice API to simplify usage (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5848" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5848/hovercard">#5848</a>)

SDK

* BatchLogRecordProcessor and BatchSpanProcessor unify <code>queueSize</code> metric description and attribute name for <code>processorType</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5836" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5836/hovercard">#5836</a>)

Metrics

* Allow instrument names to contain a forward slash (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5824" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5824/hovercard">#5824</a>)
* Memory Mode support: Adding memory mode, and implementing it for Asynchronous Instruments (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5709" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5709/hovercard">#5709</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/5855" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5855/hovercard">#5855</a>)
* Stabilize MetricProducer, allow custom MetricReaders (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5835" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5835/hovercard">#5835</a>)
* Drop NaN measurements to metric instruments (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5859" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5859/hovercard">#5859</a>)
* Fix flaky MetricExporterConfigurationTest (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5877" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5877/hovercard">#5877</a>)

Logs

* Add addAllAttributes() to ReadWriteLogRecord. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5825" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5825/hovercard">#5825</a>)

Exporters

* Prometheus exporter: handle colliding metric attribute keys (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5717" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5717/hovercard">#5717</a>)

SDK Extensions

* File configuration ConfigurationReader handles null values as empty (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5829" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5829/hovercard">#5829</a>)

Semantic conventions

* BREAKING: Stop publishing <code>io.opentelemetry:opentelemetry-semconv</code>. Please use <code>io.opentelemetry.semconv:opentelemetry-semconv:1.21.0-alpha</code> instead, which is published from <a href="https://github.com/open-telemetry/semantic-conventions-java">open-telemetry/semantic-conventions-java</a>. The new repository is published in lockstep with <a href="https://github.com/open-telemetry/semantic-conventions">open-telemetry/semantic-conventions</a>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5807" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5807/hovercard">#5807</a>)

Project Tooling

* Add Benchmark workflows (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5842" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5842/hovercard">#5842</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/5874" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5874/hovercard">#5874</a>)
* Add clearer docs around coroutine support with an example (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5799" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5799/hovercard">#5799</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/aabmass/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/aabmass">@aabmass</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cbos/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cbos">@cbos</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cmunger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cmunger">@cmunger</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/evantorrie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/evantorrie">@evantorrie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mateuszrzeszutek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mateuszrzeszutek">@mateuszrzeszutek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/puckpuck/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/puckpuck">@puckpuck</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/scprek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/scprek">@scprek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

