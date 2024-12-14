# Version 1.33.0

## release on 20231209

## description

## changes

API

* Fix issue where wrapping "invalid" SpanContexts in Span does not preserve SpanContext (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6044" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6044/hovercard">#6044</a>)

Incubator

* Refactor and add to ExtendedTracer, add ExtendedContextPropagators (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6017" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6017/hovercard">#6017</a>)
* Base64 encode AnyValue bytes in string representation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6003" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6003/hovercard">#6003</a>)

SDK

Exporters

* Add connectTimeout configuration option OtlpHttp{Signal}Exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5941" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5941/hovercard">#5941</a>)
* Add ability for Otlp{Protocol}LogRecordExporter to serialize log body any value (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5938" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5938/hovercard">#5938</a>)
* Android environments can now handle base64 encoded PEM keys, remove exception handling in TlsUtil#decodePem (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6034" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6034/hovercard">#6034</a>)
* Add header supplier configuration option to OTLP exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6004" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6004/hovercard">#6004</a>)

Extensions

* Add autoconfigure option for customizing SpanProcessor, LogRecordProcessor (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5986" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5986/hovercard">#5986</a>)
* Incubator allows for simpler creation of start-only and end-only SpanProcessors. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5923" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5923/hovercard">#5923</a>)

Testing

* Add hasAttributesSatisfying overload to AbstractPointAssert (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6048" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6048/hovercard">#6048</a>)

Project Tooling

* Building animal sniffer signatures directly from android corelib (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5973" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5973/hovercard">#5973</a>)
* Target kotlin 1.6 in kotlin extension (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5910" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5910/hovercard">#5910</a>)
* Define language version compatibility requirements (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/5983" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/5983/hovercard">#5983</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/chungngoops/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chungngoops">@chungngoops</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/felixscheinost/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/felixscheinost">@felixscheinost</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mateuszrzeszutek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mateuszrzeszutek">@mateuszrzeszutek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mikelaspina/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mikelaspina">@mikelaspina</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/scheler/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/scheler">@scheler</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SenNeonoveNoci/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SenNeonoveNoci">@SenNeonoveNoci</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shadow0wolf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shadow0wolf">@shadow0wolf</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

