# Version 1.39.0

## release on 20240607

## description

## changes

API

Incubator

* BREAKING: Refactor ExtendedTracer, ExtendedSpanBuilder to reflect incubating API conventions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6497" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6497/hovercard">#6497</a>)

SDK

Exporter

* BREAKING: Serve prometheus metrics only on <code>/metrics</code> by default. To restore the previous behavior and serve metrics on all paths, override the default handler as <a href="https://github.com/open-telemetry/opentelemetry-java/blob/main/exporters/prometheus/src/test/java/io/opentelemetry/exporter/prometheus/PrometheusHttpServerTest.java#L251-L259">demonstrated here</a>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6476" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6476/hovercard">#6476</a>)
* Make OTLP exporter memory mode API public (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6469" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6469/hovercard">#6469</a>)
* Speed up OTLP string marshaling using sun.misc.Unsafe (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6433" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6433/hovercard">#6433</a>)
* Add exporter data classes for experimental profiling signal type. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6374" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6374/hovercard">#6374</a>)
* Start prometheus http server with daemon thread (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6472" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6472/hovercard">#6472</a>)
* Update the Prometheus metrics library and improve how units are included in metric names. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6473" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6473/hovercard">#6473</a>)
* Remove android animalsniffer check from prometheus exporter (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6478" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6478/hovercard">#6478</a>)

Extensions

* Load file config YAML using core schema, ensure that env var substitution retains string types. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6436" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6436/hovercard">#6436</a>)
* Define dedicated file configuration SPI ComponentProvider (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6457" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6457/hovercard">#6457</a>)

Tooling

* Normalize timestamps and file ordering in jars, making the outputs reproducible (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6471" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6471/hovercard">#6471</a>)
* GHA for generating the post-release pull request (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6449" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6449/hovercard">#6449</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/DPUkyle/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/DPUkyle">@DPUkyle</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fstab/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fstab">@fstab</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hboutemy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hboutemy">@hboutemy</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lizongwu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lizongwu">@lizongwu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nluk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nluk">@nluk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

