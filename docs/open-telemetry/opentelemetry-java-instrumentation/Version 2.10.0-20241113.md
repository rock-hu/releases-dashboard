# Version 2.10.0

## release on 20241113
## description
## changes
This release targets the OpenTelemetry SDK 1.44.1.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

🌟 New javaagent instrumentation

* Ktor 3 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12562" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12562/hovercard">#12562</a>)

🌟 New library instrumentation

* Ktor 3 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12562" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12562/hovercard">#12562</a>)

Migration notes

* Spring Boot Starter Scheduling instrumentation scope name changed from <code>io.opentelemetry.spring-scheduling-3.1</code> to <code>io.opentelemetry.spring-boot-autoconfigure</code> to reflect the module's name.
* Default flush timeout for aws lambda javaagent instrumentation changed from 1 second to 10 seconds to match the flush timeout used in the aws lambda library instrumentation. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12576" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12576/hovercard">#12576</a>)

📈 Enhancements

* Delegate loading of java package to platform loader (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12505" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12505/hovercard">#12505</a>)
* Set up virtual field transforms before otel sdk is initialized (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12444" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12444/hovercard">#12444</a>)
* Update azure-core-tracing-opentelemetry version and improve HTTP suppression to back off when Azure SDK tracing is disabled. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12489" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12489/hovercard">#12489</a>)
* Ktor2 http client uses low level instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12530" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12530/hovercard">#12530</a>)
* Add logback mdc instrumentation to spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12515" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12515/hovercard">#12515</a>)
* Run class load listener only once (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12565" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12565/hovercard">#12565</a>)
* Remove duplicate byte buddy classes to reduce agent jar file size (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12571" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12571/hovercard">#12571</a>)
* Support additional JVM arg syntax in service name resource detector (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12544" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12544/hovercard">#12544</a>)

🛠️ Bug fixes

* Fix derby directory connection string parser (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12479" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12479/hovercard">#12479</a>)
* Improve whitespace handling in oracle jdbc url parser (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12512" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12512/hovercard">#12512</a>)
* Fix SpanKey bridging for unbridgeable span (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12511" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12511/hovercard">#12511</a>)
* Fix lettuce instrumentation and tests to pass against latest version (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12552" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12552/hovercard">#12552</a>)
* Fix Kafka initialization occasionally failed due to concurrent injection of OpenTelemetryMetricsReporter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12583" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12583/hovercard">#12583</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AntonioLyubchev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AntonioLyubchev">@AntonioLyubchev</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Cirilla-zmh/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Cirilla-zmh">@Cirilla-zmh</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/e5l/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/e5l">@e5l</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/greatvovan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/greatvovan">@greatvovan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lmolkova/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lmolkova">@lmolkova</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/misaya98/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/misaya98">@misaya98</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/obs-gh-abhishekrao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/obs-gh-abhishekrao">@obs-gh-abhishekrao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pengliaoye/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pengliaoye">@pengliaoye</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/smoke/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/smoke">@smoke</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/v-chernyshev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/v-chernyshev">@v-chernyshev</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vanilla-sundae/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vanilla-sundae">@vanilla-sundae</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

