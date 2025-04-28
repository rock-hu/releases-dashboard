# Version 2.12.0

## release on 20250204

## description

## changes

This release targets the OpenTelemetry SDK 1.46.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* Some Java agent instrumentation suppression keys have been renamed to match their module names: - <code>elasticsearch-rest-6.0</code> --> <code>elasticsearch-rest-6.4</code> - <code>internal-application-logging</code> --> <code>internal-application-logger</code> - <code>javalin-5</code> -> <code>javalin-5.0</code> - <code>pulsar-2.8.0</code> -> <code>pulsar-2.8</code>
* In preparation for stabilizing HTTP library instrumentation soon: - <code>setCaptured*Headers(List)</code> methods in <code>*TelemetryBuilder</code> classes were changed to <code>setCaptured*Headers(Collection)</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12901" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12901/hovercard">#12901</a>) - <code>setKnownMethods(Set)</code> methods in <code>*TelemetryBuilder</code> classes were changed to <code>setKnownMethods(Collection)</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12902" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12902/hovercard">#12902</a>)

📈 Enhancements

* Support <code>ExtendedTextMapGetter</code> in gRPC instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13011" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13011/hovercard">#13011</a>)
* Add database client metrics in DynamoDB instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13033" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13033/hovercard">#13033</a>)
* Propagate context into async http client CompletableFuture callbacks (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13041" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13041/hovercard">#13041</a>)
* Exclude spring routing data source from Spring Starter instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13054" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13054/hovercard">#13054</a>)
* Instrument jdbc batch queries (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12797" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12797/hovercard">#12797</a>)

🛠️ Bug fixes

* Fix incorrect dubbo trace caused by using rpcContext.isProviderSide() (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12930" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12930/hovercard">#12930</a>)
* Fix ClickHouse query failing with syntax error (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13020" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13020/hovercard">#13020</a>)
* Fix instrumentation module not loading silently when duplicate helper classnames are detected (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13005" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13005/hovercard">#13005</a>)
* Fix compatibility problem due to DubboHeadersGetter#keys in Dubbo 2.7.6 and 2.7.7 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12982" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12982/hovercard">#12982</a>)
* Fix appender install for async Logback appenders (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13047" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13047/hovercard">#13047</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlbumenJ/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlbumenJ">@AlbumenJ</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/annettejanewilson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/annettejanewilson">@annettejanewilson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ataraxis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ataraxis">@ataraxis</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cleverchuk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cleverchuk">@cleverchuk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FlorianBruckner/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FlorianBruckner">@FlorianBruckner</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jamesmoessis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jamesmoessis">@jamesmoessis</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/markAtAthena/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/markAtAthena">@markAtAthena</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rghugikar/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rghugikar">@rghugikar</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiepuhuan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiepuhuan">@xiepuhuan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

