# Version 2.23.0

## release on 20251213
## description
## changes
This release targets the OpenTelemetry SDK 1.57.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking Changes

* ActiveMQ Classic JMX metrics: rename attributes and metrics to align with semantic conventions (see PR description for specifics) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14996" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14996/hovercard">#14996</a>)
* Library instrumentation: remove previously deprecated methods from telemetry builders (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15324" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15324/hovercard">#15324</a>)
* Logback: <code>captureArguments</code> no longer captures message template, use <code>captureTemplate</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15423" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15423/hovercard">#15423</a>)
* Play: disable controller spans by default, re-enable with <code>otel.instrumentation.common.experimental.controller-telemetry.enabled=true</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15604" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15604/hovercard">#15604</a>)

🚫 Deprecations

* Library instrumentation: deprecate <code>setSpanNameExtractor()</code> and <code>setStatusExtractor()</code> in favor of <code>setSpanNameExtractorCustomizer()</code> and <code>setStatusExtractorCustomizer()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15529" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15529/hovercard">#15529</a>)

🌟 New javaagent instrumentation

* Apache ElasticJob (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14933" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14933/hovercard">#14933</a>)

🌟 New library instrumentation

* Apache Iceberg (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15114" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15114/hovercard">#15114</a>)
* Servlets (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15473" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15473/hovercard">#15473</a>)

📈 Enhancements

* Spring starter: add declarative config logging exporter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14917" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14917/hovercard">#14917</a>)
* Failsafe: add support for <code>RetryPolicy</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15255" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15255/hovercard">#15255</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15537" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15537/hovercard">#15537</a>)
* GraphQL: add option to disable capturing query documents (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15384" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15384/hovercard">#15384</a>)
* JMX metrics: allow any classpath resource path in rules (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15413" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15413/hovercard">#15413</a>)
* Spring Boot actuator autoconfigure: support Spring Boot 4 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15433" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15433/hovercard">#15433</a>)
* Spring JMS: support Spring Boot 4 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15434" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15434/hovercard">#15434</a>)
* Spring starter: support Spring Boot 4 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15459" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15459/hovercard">#15459</a>)
* Lettuce: support custom <code>ClientResources</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15470" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15470/hovercard">#15470</a>)
* Lettuce: add reactor-core compatibility checker (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15472" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15472/hovercard">#15472</a>)
* Servlet: propagate context explicitly for async runnables (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15476" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15476/hovercard">#15476</a>)
* Servlet: always add <code>trace_id</code> and <code>span_id</code> attributes to requests (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15485" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15485/hovercard">#15485</a>)
* Pekko HTTP: separate route instrumentation from HTTP server instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15499" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15499/hovercard">#15499</a>)
* MongoDB: emit versioned scope name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15500" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15500/hovercard">#15500</a>)
* Spring WebFlux: support Spring Boot 4 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15502" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15502/hovercard">#15502</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15574" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15574/hovercard">#15574</a>)
* Spring WebMVC: support Spring Boot 4 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15525" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15525/hovercard">#15525</a>)
* Spring Cloud Gateway: support Spring Boot 4 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15540" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15540/hovercard">#15540</a>)
* Spring starter: add missing Kafka configuration options (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15592" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15592/hovercard">#15592</a>)
* OpenTelemetry API interop: support new GlobalOpenTelemetry methods introduced in 1.57 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15620" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15620/hovercard">#15620</a>)

🛠️ Bug fixes

* Spring Web/WebFlux: restore GraalVM native-image compatibility (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15306" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15306/hovercard">#15306</a>)
* Spring Kafka: end span in <code>afterRecord</code> callback (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15367" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15367/hovercard">#15367</a>)
* Spring starter: fix environment variable overrides for array properties in declarative config (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15424" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15424/hovercard">#15424</a>)
* Ktor: prevent double <code>end()</code> calls in <code>KtorServerTelemetry</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15452" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15452/hovercard">#15452</a>)
* OpenTelemetry API interop: fix null handling in <code>ExtendedOpenTelemetry</code> declarative config (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15478" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15478/hovercard">#15478</a>)
* Akka HTTP: fix <code>http.route</code> attribute capture and span naming (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15504" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15504/hovercard">#15504</a>)
* Extensions: fix SPI loading for <code>InstrumenterCustomizerProvider</code> and related classes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15538" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15538/hovercard">#15538</a>)
* Sanitize sql statements that may contain unquoted passwords (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15607" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15607/hovercard">#15607</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bioplasticlining/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bioplasticlining">@bioplasticlining</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Cirilla-zmh/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Cirilla-zmh">@Cirilla-zmh</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/copilot-pull-request-reviewer/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/copilot-pull-request-reviewer">@copilot-pull-request-reviewer</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cyrille-leclerc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cyrille-leclerc">@cyrille-leclerc</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/droidnxs/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/droidnxs">@droidnxs</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gaeljw/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gaeljw">@gaeljw</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/George-C-Odes/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/George-C-Odes">@George-C-Odes</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ghareeb-falazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ghareeb-falazi">@ghareeb-falazi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/GondaliaKaran/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/GondaliaKaran">@GondaliaKaran</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gquintana/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gquintana">@gquintana</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marychatte/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marychatte">@marychatte</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/obs-gh-abhishekrao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/obs-gh-abhishekrao">@obs-gh-abhishekrao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/onurkybsi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/onurkybsi">@onurkybsi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/philsttr/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/philsttr">@philsttr</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/prydin/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/prydin">@prydin</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Tefaier/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Tefaier">@Tefaier</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thompson-tomo/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thompson-tomo">@thompson-tomo</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ThorbenKuck/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ThorbenKuck">@ThorbenKuck</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/toon-borgers-hs/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/toon-borgers-hs">@toon-borgers-hs</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

