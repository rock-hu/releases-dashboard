# Version 2.3.0

## release on 20240412

## description

## changes

This release targets the OpenTelemetry SDK 1.37.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Handle async requests in spring mvc library instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10868" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10868/hovercard">#10868</a>)
* Support statement sanitizer enabled flag in lettuce 5.1 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10922" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10922/hovercard">#10922</a>)
* Remove AWS Active Tracing span linking (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10930" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10930/hovercard">#10930</a>)
* Make spring boot honor the standard environment variables for maps (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11000" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11000/hovercard">#11000</a>)
* Pulsar: use span links when receive telemetry is enabled (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10650" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10650/hovercard">#10650</a>)
* Rename <code>messaging.kafka.destination.partition</code> to <code>messaging.destination.partition.id</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11086" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11086/hovercard">#11086</a>)
* Support <code>service.instance.id</code> in spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11071" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11071/hovercard">#11071</a>)
* Add library instrumentation for RestTemplateBuilder (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11054" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11054/hovercard">#11054</a>)
* Add cloud resource providers in spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11014" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11014/hovercard">#11014</a>)

🛠️ Bug fixes

* Fix disabling virtual thread context propagation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10881" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10881/hovercard">#10881</a>)
* Fix virtual thread instrumentation for jdk 21 ea versions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10887" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10887/hovercard">#10887</a>)
* Fix spring kafka interceptor wrappers not delegating some methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10935" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10935/hovercard">#10935</a>)
* AWS Lambda Runtime legacy internal handlers need to be ignored from being instrumented and so traced … (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10942" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10942/hovercard">#10942</a>)
* Metro: ignore UnsupportedOperationException when updating span name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10996" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10996/hovercard">#10996</a>)
* Fix jedis plugin for 2.7.2 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10982" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10982/hovercard">#10982</a>)
* Fix idle in druid instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11079" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11079/hovercard">#11079</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlchemyDing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlchemyDing">@AlchemyDing</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cleverchuk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cleverchuk">@cleverchuk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/damienburke/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/damienburke">@damienburke</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/huange7/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/huange7">@huange7</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/itsmykairos/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/itsmykairos">@itsmykairos</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnbley/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnbley">@johnbley</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Moscagus/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Moscagus">@Moscagus</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/phillipdriver/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/phillipdriver">@phillipdriver</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rapphil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rapphil">@rapphil</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robberphex/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robberphex">@robberphex</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/serkan-ozal/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/serkan-ozal">@serkan-ozal</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/srinivas-bode/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/srinivas-bode">@srinivas-bode</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Synthenses/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Synthenses">@Synthenses</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wang007/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wang007">@wang007</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiangtianyu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiangtianyu">@xiangtianyu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

