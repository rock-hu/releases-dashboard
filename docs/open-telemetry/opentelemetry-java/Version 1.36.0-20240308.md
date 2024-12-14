# Version 1.36.0

## release on 20240308

## description

## changes

SDK

Traces

* Lazily initialize the container for events in the SDK Span implementation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6244" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6244/hovercard">#6244</a>)

Exporters

* Add basic proxy configuration to OtlpHttp{Signal}Exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6270" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6270/hovercard">#6270</a>)
* Add connectTimeout configuration option OtlpGrpc{Signal}Exporters (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6079" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6079/hovercard">#6079</a>)

Extensions

* Add ComponentLoader to autoconfigure support more scenarios (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6217" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6217/hovercard">#6217</a>)
* Added MetricReader customizer for AutoConfiguredOpenTelemetrySdkBuilder (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6231" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6231/hovercard">#6231</a>)
* Return AutoConfiguredOpenTelemetrySdkBuilder instead of the base type (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6248" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6248/hovercard">#6248</a>)

Tooling

* Add note about draft PRs to CONTRIBUTING.md (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6247" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6247/hovercard">#6247</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/alexandru-roman-db/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/alexandru-roman-db">@alexandru-roman-db</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lmolkova/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lmolkova">@lmolkova</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marcschumacher/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marcschumacher">@marcschumacher</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tydhot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tydhot">@tydhot</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

