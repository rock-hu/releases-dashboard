# Version 2.7.0

## release on 20240822

## description

## changes

This release targets the OpenTelemetry SDK <a href="https://github.com/open-telemetry/opentelemetry-java/releases/tag/v1.41.0">1.41.0</a>.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Add span baggage processor (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11697" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11697/hovercard">#11697</a>)
* Improve tomcat version detection (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11936" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11936/hovercard">#11936</a>)
* Improve akka route handling with java dsl (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11926" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11926/hovercard">#11926</a>)
* Ignore Alibaba fastjson ASMClassLoader (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11954" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11954/hovercard">#11954</a>)
* Use <code>aws-lambda-java-serialization</code> library, which is available by default, while deserializing input and serializing output (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11868" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11868/hovercard">#11868</a>)
* Logback appender: map timestamp in nanoseconds if possible (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11974" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11974/hovercard">#11974</a>)
* Save ILoggingEvent.getArgumentArray() arguments from Logback (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11865" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11865/hovercard">#11865</a>)
* Update Java 17-based metrics to stable semconv (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11914" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11914/hovercard">#11914</a>)
* Add Pulsar Consumer metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11891" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11891/hovercard">#11891</a>)

🛠️ Bug fixes

* Fix missing throw statement in RestClientWrapper (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11893" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11893/hovercard">#11893</a>)
* Fix ClickHouse tracing when database name not included in connection string (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11852" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11852/hovercard">#11852</a>)
* Fix class cast exception, noop meter does not implement incubating API (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11934" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11934/hovercard">#11934</a>)
* Closing a kafka producer/consumer should not disable metrics from other consumers/producers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11975" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11975/hovercard">#11975</a>)
* Fix ending span in Ktor plugin (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11726" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11726/hovercard">#11726</a>)
* Fix netty memory leak (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12003" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12003/hovercard">#12003</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ArtyomGabeev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ArtyomGabeev">@ArtyomGabeev</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asuresh4/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asuresh4">@asuresh4</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/devurandom/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/devurandom">@devurandom</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/halleystar/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/halleystar">@halleystar</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/huange7/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/huange7">@huange7</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/igor-suhorukov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/igor-suhorukov">@igor-suhorukov</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/janfreymann/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/janfreymann">@janfreymann</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jjoslet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jjoslet">@jjoslet</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jpkrohling/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jpkrohling">@jpkrohling</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kjschnei001/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kjschnei001">@kjschnei001</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kyy1996/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kyy1996">@kyy1996</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marrek13/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marrek13">@marrek13</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marychatte/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marychatte">@marychatte</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rapphil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rapphil">@rapphil</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/secustor/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/secustor">@secustor</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/serkan-ozal/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/serkan-ozal">@serkan-ozal</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stanosamek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stanosamek">@stanosamek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/starsliao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/starsliao">@starsliao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

