# Version 1.59.0

## release on 20260206
## description
## changes
API

* Stabilize complex attributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7973" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7973/hovercard">#7973</a>)
* Limit init valid hex array to range that can be true (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7809" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7809/hovercard">#7809</a>)

Extensions

* Trace propagators: Deprecate OtTracePropagator (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8020" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8020/hovercard">#8020</a>)
* Trace propagators: Deprecate JaegerPropagator (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8019" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8019/hovercard">#8019</a>)

SDK

* Move io.opentelemetry.sdk.internal to io.opentelemetry.sdk.common.internal (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8003" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8003/hovercard">#8003</a>)
* Always return ExtendedOpenTelemetry when incubator is available (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7991" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7991/hovercard">#7991</a>)

Traces

* Fix memory leak in SdkSpan#spanEndingThread (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7984" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7984/hovercard">#7984</a>)

Metrics

* Rework and publish metric benchmarks (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8000" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8000/hovercard">#8000</a>)
* Update LongLastValueAggregator algo to avoid allocations (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8017" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8017/hovercard">#8017</a>)

Testing

* Fix OTel JUnit5 Extension cleanup when using Nested test classes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7999" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7999/hovercard">#7999</a>)
* Add assertion support for Span hasException(null) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8033" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8033/hovercard">#8033</a>)

Exporters

* <strong>DEPRECATION</strong>: <code>opentelemetry-exporter-zipkin</code> is now deprecated with the last release planned for 1.65.0 (August 2026) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7974" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7974/hovercard">#7974</a>)
* Refactor http, grpc senders and promote to public API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7782" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7782/hovercard">#7782</a>)

Extensions

* Jaeger remote sampler: Remove unused code (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7970" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7970/hovercard">#7970</a>)
* Incubator: Add AlwaysRecordSampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7877" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7877/hovercard">#7877</a>)

Project tooling

* Align generate release contributors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8023" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8023/hovercard">#8023</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/austince/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/austince">@austince</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/baolongnt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/baolongnt">@baolongnt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/blueswhisper/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/blueswhisper">@blueswhisper</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bogdandrutu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bogdandrutu">@bogdandrutu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gerolf-da/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gerolf-da">@gerolf-da</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/majanjua-amzn/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/majanjua-amzn">@majanjua-amzn</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/michaeljohnalbers/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/michaeljohnalbers">@michaeljohnalbers</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ps-mir/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ps-mir">@ps-mir</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

