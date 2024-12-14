# Version 1.44.0

## release on 20241109
## description
## changes
API

* Fix ConfigUtil#getString ConcurrentModificationException (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6841" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6841/hovercard">#6841</a>)

SDK

Traces

* Stabilize ExceptionEventData (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6795" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6795/hovercard">#6795</a>)

Metrics

* Stabilize metric cardinality limits (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6794" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6794/hovercard">#6794</a>)
* Refactor metrics internals to remove MeterSharedState (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6845" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6845/hovercard">#6845</a>)

Exporters

* Add memory mode option to stdout exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6774" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6774/hovercard">#6774</a>)
* Log a warning if OTLP endpoint port is likely incorrect given the protocol (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6813" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6813/hovercard">#6813</a>)
* Fix OTLP gRPC retry mechanism for unsuccessful HTTP responses (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6829" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6829/hovercard">#6829</a>)
* Add ByteBuffer field type marshaling support (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6686" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6686/hovercard">#6686</a>)
* Fix stdout exporter format by adding newline after each export (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6848" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6848/hovercard">#6848</a>)
* Enable <code>reusuable_data</code> memory mode by default for <code>OtlpGrpc{Signal}Exporter</code>, <code>OtlpHttp{Signal}Exporter</code>, <code>OtlpStdout{Signal}Exporter</code>, and <code>PrometheusHttpServer</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6799" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6799/hovercard">#6799</a>)

Extension

* Rebrand file configuration to declarative configuration in documentation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6812" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6812/hovercard">#6812</a>)
* Fix declarative config <code>file_format</code> validation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6786" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6786/hovercard">#6786</a>)
* Fix declarative config env substitution by disallowing '}' in default value (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6793" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6793/hovercard">#6793</a>)
* Set declarative config default OTLP protocol to http/protobuf (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6800" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6800/hovercard">#6800</a>)
* Stabilize autoconfigure disabling of resource keys via <code>otel.resource.disabled.keys</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6809" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6809/hovercard">#6809</a>)

Tooling

* Run tests on Java 23 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6825" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6825/hovercard">#6825</a>)
* Test Windows in CI (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6824" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6824/hovercard">#6824</a>)
* Add error prone checks for internal javadoc and private constructors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6844" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6844/hovercard">#6844</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cyrille-leclerc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cyrille-leclerc">@cyrille-leclerc</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hboutemy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hboutemy">@hboutemy</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JiwonKKang/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JiwonKKang">@JiwonKKang</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/neugartf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/neugartf">@neugartf</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/OrangeFlag/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/OrangeFlag">@OrangeFlag</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vasantteja/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vasantteja">@vasantteja</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

