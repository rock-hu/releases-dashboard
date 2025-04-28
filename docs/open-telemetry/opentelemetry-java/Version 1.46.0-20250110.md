# Version 1.46.0

## release on 20250110

## description

## changes

SDK

* Remove unused dependencies, cleanup code after stabilizing Value (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6948" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6948/hovercard">#6948</a>)
* Explicitly allow null into CompletableResultCode.failExceptionally() (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6963" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6963/hovercard">#6963</a>)

Traces

* Fix span setStatus (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6990" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6990/hovercard">#6990</a>)

Logs

* Add getters/accessors for readable fields in ReadWriteLogRecord. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6924" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6924/hovercard">#6924</a>)

Exporters

* OTLP: Update to opentelemetry-proto 1.5 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6999" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6999/hovercard">#6999</a>)
* Bugfix - OTLP: Ensure Serializer runtime exceptions are rethrown as IOException (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6969" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6969/hovercard">#6969</a>)
* BREAKING - OTLP: Delete experimental OTLP authenticator concept. See <a href="https://opentelemetry.io/docs/languages/java/sdk/#authentication" rel="nofollow">OTLP authentication docs</a> for supported solutions. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6984" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6984/hovercard">#6984</a>)

Extensions

* BREAKING - Autoconfigure: Remove support for deprecated otel.experimental.resource.disabled.keys (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6931" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6931/hovercard">#6931</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/celikrecep/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/celikrecep">@celikrecep</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/happysiddharth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/happysiddharth">@happysiddharth</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

