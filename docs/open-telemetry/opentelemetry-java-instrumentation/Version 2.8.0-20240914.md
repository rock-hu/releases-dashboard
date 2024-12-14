# Version 2.8.0

## release on 20240914

## description

## changes

This release targets the OpenTelemetry SDK 1.42.1.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* The unit on the opt-in Java 17 JFR-based metrics was updated from milliseconds to seconds to conform with the semantic conventions. If you are using the Java agent, this only affects you if you are opting in via <code>otel.instrumentation.runtime-telemetry-java17.enable-all=true</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12084" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12084/hovercard">#12084</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12244" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12244/hovercard">#12244</a>)

📈 Enhancements

* Update Pulsar instrumentation to work with next Pulsar release (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11648" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11648/hovercard">#11648</a>)
* Capture <code>network.peer.address</code> in OkHttp 3.0 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12012" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12012/hovercard">#12012</a>)
* Add support for CXF 4.0 JAX-WS (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12077" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12077/hovercard">#12077</a>)
* Add rules for capturing Apache Camel metrics exposed by JMX MBeans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11901" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11901/hovercard">#11901</a>)
* Make RocketMQ span status extractor delegate to the default extractor (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12183" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12183/hovercard">#12183</a>)
* Bridge log body any value (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12204" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12204/hovercard">#12204</a>)
* Add declarative config support for resource providers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12144" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12144/hovercard">#12144</a>)

🛠️ Bug fixes

* Fix Javaagent doesn't work with <code>java.net.spi.InetAddressResolverProvider</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11987" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11987/hovercard">#11987</a>)
* Fix Oracle UCP 11 metrics not emitted (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12052" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12052/hovercard">#12052</a>)
* Fix wrong database info captured while using Apache ShardingSphere (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12066" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12066/hovercard">#12066</a>)
* Fix RabbitMQ NullPointerException (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12109" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12109/hovercard">#12109</a>)
* Fix possible <code>NullPointerException</code> in Play instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12121" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12121/hovercard">#12121</a>)
* Fix error span status for successful requests in Ktor (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12161" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12161/hovercard">#12161</a>)
* Make OpenTelemetryHandlerMappingFilter handle exceptions from <code>ServletRequestPathUtils.parseAndCache()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12221" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12221/hovercard">#12221</a>)
* Fix tracing CoroutineCrudRepository.findById (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12131" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12131/hovercard">#12131</a>)
* Fix capturing context in log4j library instrumentation with async logger (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12176" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12176/hovercard">#12176</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/allati/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/allati">@allati</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dao-jun/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dao-jun">@dao-jun</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hermannpencole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hermannpencole">@hermannpencole</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/huange7/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/huange7">@huange7</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jerrylincs/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jerrylincs">@jerrylincs</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/luigidemasi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/luigidemasi">@luigidemasi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/marychatte/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/marychatte">@marychatte</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ofelbaum/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ofelbaum">@ofelbaum</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/serkan-ozal/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/serkan-ozal">@serkan-ozal</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiepuhuan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiepuhuan">@xiepuhuan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/XuyuFu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/XuyuFu">@XuyuFu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

