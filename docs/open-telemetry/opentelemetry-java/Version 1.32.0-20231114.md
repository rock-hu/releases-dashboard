# Version 1.32.0

## release on 20231114

## description

## changes

API

* Stabilize explicit bucket boundaries advice API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5897" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5897/hovercard">#5897</a>)
* Allow events to be emitted with timestamp (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5928" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5928/hovercard">#5928</a>)

Context

* Add null check to StrictContextStorage (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5954" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5954/hovercard">#5954</a>)

Incubator

* Experimental support for Log AnyValue body (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5880" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5880/hovercard">#5880</a>)

SDK

Metrics

* Dismantle AbstractInstrumentBuilder inheritance hierarchy (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5820" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5820/hovercard">#5820</a>)
* Fix delta metric storage concurrency bug that allows for lost writes when record operations occur during collection. The fix introduces additional work on record threads to ensure correctness. The additional overhead is non-blocking and should be small according to performance testing. Still, there may be an opportunity for further optimization. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5932" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5932/hovercard">#5932</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/5976" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5976/hovercard">#5976</a>)

Exporters

* Prometheus exporter: omit empty otel_scope_info and otel_target_info metrics (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5887" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5887/hovercard">#5887</a>)
* JdkHttpSender should retry on connect exceptions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5867" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5867/hovercard">#5867</a>)
* Expand the set of retryable exceptions in JdkHttpSender (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5942" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5942/hovercard">#5942</a>)
* Identify OTLP export calls with context key used for instrumentation suppression (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5918" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5918/hovercard">#5918</a>)

Testing

* Add log support to junit extensions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5966" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5966/hovercard">#5966</a>)

SDK Extensions

* Add file configuration to autoconfigure (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5831" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5831/hovercard">#5831</a>)
* Update to file configuration to use opentelemetry-configuration v0.1.0 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5899" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5899/hovercard">#5899</a>)
* Add env var substitution support to file configuration (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5914" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5914/hovercard">#5914</a>)
* Stop setting Resource schemaUrl in autoconfigure (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5911" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5911/hovercard">#5911</a>)
* Add AutoConfigureListener to provide components with autoconfigured SDK (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5931" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5931/hovercard">#5931</a>)

OpenCensus Shim

* Clean up OpenCensus shim (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5858" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5858/hovercard">#5858</a>)

OpenTracing Shim

* Fix OpenTracing header name issue (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5840" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5840/hovercard">#5840</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/abdolsamad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/abdolsamad">@abdolsamad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jamesylgan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jamesylgan">@jamesylgan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mateuszrzeszutek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mateuszrzeszutek">@mateuszrzeszutek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mikelaspina/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mikelaspina">@mikelaspina</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nluk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nluk">@nluk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steffan-westcott/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steffan-westcott">@steffan-westcott</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

