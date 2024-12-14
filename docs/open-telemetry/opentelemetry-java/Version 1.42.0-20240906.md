# Version 1.42.0

## release on 20240906

## description

## changes

API

* BREAKING: Stabilize log support for AnyValue bodies. Rename <code>AnyValue</code> to <code>Value</code>, promote from <code>opentelemetry-api-incubator</code> to <code>opentelemetry-api</code>, change package from <code>io.opentelemetry.api.incubator.logs</code> to <code>io.opentelemetry.api.common</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6591" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6591/hovercard">#6591</a>)
* Noop implementations detect when <code>opentelemetry-api-incubator</code> is present and return extended noop implementations. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6617" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6617/hovercard">#6617</a>)%

SDK

Traces

* Added experimental support for SpanProcessor OnEnding callback (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6367" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6367/hovercard">#6367</a>)
* Remove final modifier from SdkTracer.tracerEnabled (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6687" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6687/hovercard">#6687</a>)

Exporters

* Suppress zipkin exporter instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6552" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6552/hovercard">#6552</a>)
* OTLP exporters return status code exceptions via CompletableResultCode in GrpcExporter and HttpExporter. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6645" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6645/hovercard">#6645</a>)
* Align GrpcSender contract with HttpSender (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6658" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6658/hovercard">#6658</a>)

Extensions

* Add autoconfigure support for ns and us durations (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6654" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6654/hovercard">#6654</a>)
* Add declarative configuration ComponentProvider support for resources (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6625" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6625/hovercard">#6625</a>)
* Add declarative configuration ComponentProvider support for processors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6623" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6623/hovercard">#6623</a>)
* Add declarative configuration ComponentProvider support for samplers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6494" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6494/hovercard">#6494</a>)
* Add declarative configuration ComponentProvider support for propagators (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6624" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6624/hovercard">#6624</a>)
* Add declarative configuration missing pieces (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6677" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6677/hovercard">#6677</a>)
* Change jaeger remote sampler autoconfigure property from <code>pollingInterval</code> to <code>pollingIntervalMs</code> to match spec. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6672" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6672/hovercard">#6672</a>)

Testing

* Add asserts for log record body fields (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6509" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6509/hovercard">#6509</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/chungngoops/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chungngoops">@chungngoops</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/drewhammond/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/drewhammond">@drewhammond</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/galahad098/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/galahad098">@galahad098</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jarrodrobins/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jarrodrobins">@jarrodrobins</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

