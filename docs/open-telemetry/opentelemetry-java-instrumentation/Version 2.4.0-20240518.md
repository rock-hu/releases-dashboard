# Version 2.4.0

## release on 20240518

## description

## changes

This release targets the OpenTelemetry SDK 1.38.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

🌟 New javaagent instrumentation

* InfluxDB (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10850" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10850/hovercard">#10850</a>)
* Armeria gRPC (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11351" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11351/hovercard">#11351</a>)
* Apache ShenYu (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11260" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11260/hovercard">#11260</a>)

📈 Enhancements

* Instrument ConnectionSource in Akka/Pekko HTTP Servers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11103" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11103/hovercard">#11103</a>)
* Use constant span name when using Spring AMQP AnonymousQueues (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11141" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11141/hovercard">#11141</a>)
* Add support for <code>RestClient</code> in Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11038" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11038/hovercard">#11038</a>)
* Add support for WebFlux server in Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11185" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11185/hovercard">#11185</a>)
* Add async operation end strategy for Kotlin coroutines flow (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11168" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11168/hovercard">#11168</a>)
* Add automatic JDBC instrumentation to the Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11258" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11258/hovercard">#11258</a>)
* Add <code>StructuredTaskScope</code> instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11202" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11202/hovercard">#11202</a>)
* Allow reading OTel context from reactor ContextView (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11235" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11235/hovercard">#11235</a>)
* Add spring starter r2dbc support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11221" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11221/hovercard">#11221</a>)
* Enable instrumentation of Spring EJB clients (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11104" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11104/hovercard">#11104</a>)
* Support <code>otel.instrumentation.kafka.experimental-span-attributes</code> in Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11263" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11263/hovercard">#11263</a>)
* Remove incubating semconv dependency from library instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11324" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11324/hovercard">#11324</a>)
* Add extension functions for Ktor plugins (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10963" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10963/hovercard">#10963</a>)
* Add dedicated flag for R2DBC statement sanitizer (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11384" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11384/hovercard">#11384</a>)
* Allow library instrumentations to override span name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11355" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11355/hovercard">#11355</a>)
* Don't sanitize PostgreSQL parameter markers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11388" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11388/hovercard">#11388</a>)
* Make statement sanitizer configurable for Spring Boot (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11350" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11350/hovercard">#11350</a>)

🛠️ Bug fixes

* Fix GraphQL instrumentation to work with latest version (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11142" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11142/hovercard">#11142</a>)
* Fix jmx-metrics on WildFly (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11151" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11151/hovercard">#11151</a>)
* End gRPC server span in onComplete instead of close (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11170" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11170/hovercard">#11170</a>)
* Fix a bug in undertow instrumentation related to HTTP/2 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11361" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11361/hovercard">#11361</a>)
* Armeria http client reports wrong protocol version (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11334" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11334/hovercard">#11334</a>)
* Use daemon thread for scheduling in jmx-metrics BeanFinder (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11337" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11337/hovercard">#11337</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/aaron-ai/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/aaron-ai">@aaron-ai</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlchemyDing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlchemyDing">@AlchemyDing</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ArtyomGabeev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ArtyomGabeev">@ArtyomGabeev</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/aschugunov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/aschugunov">@aschugunov</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cxjava/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cxjava">@cxjava</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dengliming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dengliming">@dengliming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ehsannas/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ehsannas">@ehsannas</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/flamiau04/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/flamiau04">@flamiau04</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hannahchan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hannahchan">@hannahchan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jmadureira/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jmadureira">@jmadureira</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lizongwu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lizongwu">@lizongwu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marychatte/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marychatte">@marychatte</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ofelbaum/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ofelbaum">@ofelbaum</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/philsttr/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/philsttr">@philsttr</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/swar8080/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/swar8080">@swar8080</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/v1v/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/v1v">@v1v</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zackman0010/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zackman0010">@zackman0010</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

