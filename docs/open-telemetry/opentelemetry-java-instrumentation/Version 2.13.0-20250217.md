# Version 2.13.0

## release on 20250217
## description
## changes
This release targets the OpenTelemetry SDK 1.47.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* <code>io.opentelemetry.instrumentation.api.incubator.semconv.util.SpanNames</code> has been deprecated, replaced by the stable <code>io.opentelemetry.instrumentation.api.semconv.util.SpanNames</code>
* In preparation for stabilizing HTTP library instrumentation, the classes and methods that were deprecated in the prior two releases have now been removed (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13135" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13135/hovercard">#13135</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13150" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13150/hovercard">#13150</a>)
* Deprecated Dubbo instrumentation method was removed (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13076" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13076/hovercard">#13076</a>)

🌟 New javaagent instrumentation

* <code>jdk.httpserver</code> instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13243" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13243/hovercard">#13243</a>)

🌟 New library instrumentation

* <code>jdk.httpserver</code> instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13243" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13243/hovercard">#13243</a>)

📈 Enhancements

* Add database client metrics to Lettuce instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13032" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13032/hovercard">#13032</a>)
* Stabilize io.opentelemetry.instrumentation.api.semconv.util.SpanNames (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12487" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12487/hovercard">#12487</a>)
* Implement ExtendedTextMapGetter in http server instrumentations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13053" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13053/hovercard">#13053</a>)
* Implement ExtendedTextMapGetter in kafka-clients instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13068" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13068/hovercard">#13068</a>)
* Scrub system property secrets from process resource attribute values (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13225" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13225/hovercard">#13225</a>)
* Add database client metrics to AWS SDK 2.x DynamoDB instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13283" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13283/hovercard">#13283</a>)
* Add runtime metrics to Spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13173" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13173/hovercard">#13173</a>)

🛠️ Bug fixes

* Fix akka shutdown hanging (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13073" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13073/hovercard">#13073</a>)
* Fix MalformedInputException on z/OS (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13042" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13042/hovercard">#13042</a>)
* Fix scope leak in aws sdk instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13129" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13129/hovercard">#13129</a>)
* Fix MapConverter does not get initialized when <code>OTEL_SDK_DISABLED</code> is set to true (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13224" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13224/hovercard">#13224</a>)
* Fix logback appender on android (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13234" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13234/hovercard">#13234</a>)
* Fix Ktor 3 CallLogging and StatusPages don't have Trace IDs (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13239" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13239/hovercard">#13239</a>)
* Fix Micrometer-bridge breaking Spring Actuator metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13083" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13083/hovercard">#13083</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/adrielp/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/adrielp">@adrielp</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlchemyDing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlchemyDing">@AlchemyDing</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bencehornak/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bencehornak">@bencehornak</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/chalin/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chalin">@chalin</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/e5l/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/e5l">@e5l</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/edwardxia/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/edwardxia">@edwardxia</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/Github-advanced-security/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Github-advanced-security">@Github-advanced-security</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/inssein/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/inssein">@inssein</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jamesmoessis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jamesmoessis">@jamesmoessis</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NomadBlacky/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NomadBlacky">@NomadBlacky</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rolaca11/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rolaca11">@rolaca11</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/santerivairio/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/santerivairio">@santerivairio</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SentryMan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SentryMan">@SentryMan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SoftlySplinter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SoftlySplinter">@SoftlySplinter</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/step-security-bot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/step-security-bot">@step-security-bot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/StiviiK/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/StiviiK">@StiviiK</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiepuhuan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiepuhuan">@xiepuhuan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

