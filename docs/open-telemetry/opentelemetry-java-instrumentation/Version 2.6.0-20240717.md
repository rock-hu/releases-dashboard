# Version 2.6.0

## release on 20240717

## description

## changes

This release targets the OpenTelemetry SDK 1.40.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

The Spring Boot Starter (<code>opentelemetry-spring-boot-starter</code>) is now stable.

Migration notes

* The <code>opentelemetry-spring-boot</code> and <code>opentelemetry-spring-boot-3</code> artifacts have been merged into a single artifact named <code>opentelemetry-spring-boot-autoconfigure</code> which supports both Spring Boot 2 and Spring Boot 3
* Two experimental HTTP metrics have been renamed: - <code>http.server.request.size</code> → <code>http.server.request.body.size</code>, - <code>http.server.response.size</code> → <code>http.server.response.body.size</code>

🌟 New javaagent instrumentation

* Javalin (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11587" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11587/hovercard">#11587</a>)
* ClickHouse (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11660" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11660/hovercard">#11660</a>)

📈 Enhancements

* Support HTTP client instrumentation configuration in Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11620" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11620/hovercard">#11620</a>)
* Influxdb client: don't fill <code>db.statement</code> for create/drop database and write operations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11557" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11557/hovercard">#11557</a>)
* Support <code>otel.instrumentation.common.default-enabled</code> in the Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11746" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11746/hovercard">#11746</a>)
* Support Jetty HTTP client 12 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11519" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11519/hovercard">#11519</a>)
* Add Pulsar <code>messaging.producer.duration</code> metric (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11591" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11591/hovercard">#11591</a>)
* Improve instrumentation suppression behavior (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11640" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11640/hovercard">#11640</a>)
* Propagate OpenTelemetry context through custom AWS client context for Lambda direct calls (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11675" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11675/hovercard">#11675</a>)
* Spring Native support for <code>@WithSpan</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11757" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11757/hovercard">#11757</a>)
* Support HTTP server instrumentation config properties in the Spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11667" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11667/hovercard">#11667</a>)

🛠️ Bug fixes

* Fix <code>http.server.active_requests</code> metric with async requests (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11638" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11638/hovercard">#11638</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/devurandom/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/devurandom">@devurandom</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lucasamoroso/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lucasamoroso">@lucasamoroso</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pandaji/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pandaji">@pandaji</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiepuhuan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiepuhuan">@xiepuhuan</a>

@Yindazz

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

