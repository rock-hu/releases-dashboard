# Version 1.57.0

## release on 20251205
## description
## changes
API

* Add <code>GlobalOpenTelemetry#getOrNoop</code>, <code>#isSet</code>. Update <code>#get</code> to always returns obfuscated instance (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7819" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7819/hovercard">#7819</a>)

Incubating

* Logs: Complex attributes incubating implementation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7814" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7814/hovercard">#7814</a>)

SDK

Logs

* Add minimum severity and trace-based logger configuration (incubating API) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7529" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7529/hovercard">#7529</a>)

Exporters

* OTLP: VarHandle string encoder (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7701" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7701/hovercard">#7701</a>)
* OTLP: Fix OkHttpGrpcSender to properly await executor shutdown (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7840" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7840/hovercard">#7840</a>)
* OTLP: avoid auto-config warning (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7881" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7881/hovercard">#7881</a>)
* OTLP: update error message for missing GrpcSenderProvider dependency (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7884" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7884/hovercard">#7884</a>)

Extensions

* Declarative config: add runtime hints for graal VM (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7866" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7866/hovercard">#7866</a>)
* Declarative config: add missing warning about discarded value (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7821" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7821/hovercard">#7821</a>)

Project tooling

* Update macos version to latest and switch to corretto for testing (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7841" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7841/hovercard">#7841</a>)
* Sync Java worflows: Allow re-running prepare release branch workflow (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7845" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7845/hovercard">#7845</a>)
* Simplify and standardize renovate custom managers across Java repos (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7846" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7846/hovercard">#7846</a>)
* Remove misspell workflow (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7852" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7852/hovercard">#7852</a>)
* Fix link checks on main (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7867" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7867/hovercard">#7867</a>)
* Add zeitlinger as approver (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7868" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7868/hovercard">#7868</a>)
* Move snapshot publishing to daily build (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7886" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7886/hovercard">#7886</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/HarshMehta112/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/HarshMehta112">@HarshMehta112</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kevinburkesegment/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kevinburkesegment">@kevinburkesegment</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/michaldo/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/michaldo">@michaldo</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

