# Version 2.14.0

## release on 20250314

## description

## changes

This release targets the OpenTelemetry SDK 1.48.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* The <code>java.net.http.HttpClient</code> instrumentation package <code>io.opentelemetry.instrumentation.httpclient</code> was deprecated in favor of the new package name <code>io.opentelemetry.instrumentation.javahttpclient</code>
* The experimental opt-in <code>jvm.buffer.memory.usage</code> metric was renamed to <code>jvm.buffer.memory.used</code> in order to follow general semantic convention naming
* The Http <code>*TelemetryBuilder</code> generic signatures were simplified (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12858" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12858/hovercard">#12858</a>)

🌟 New javaagent instrumentation

* AWS Bedrock instrumentation, following <a href="https://github.com/open-telemetry/semantic-conventions/tree/main/docs/gen-ai#semantic-conventions-for-generative-ai-systems">Gen AI semantic conventions</a> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13355" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13355/hovercard">#13355</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13408" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13408/hovercard">#13408</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13473" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13473/hovercard">#13473</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13410" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13410/hovercard">#13410</a>)
* ActiveJ HTTP server (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13335" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13335/hovercard">#13335</a>)
* Spring Pulsar (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13320" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13320/hovercard">#13320</a>)

🌟 New library instrumentation

* AWS Bedrock instrumentation, following <a href="https://github.com/open-telemetry/semantic-conventions/tree/main/docs/gen-ai#semantic-conventions-for-generative-ai-systems">Gen AI semantic conventions</a> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13355" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13355/hovercard">#13355</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13408" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13408/hovercard">#13408</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13473" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13473/hovercard">#13473</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13410" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13410/hovercard">#13410</a>)

📈 Enhancements

* Support virtual threads in Spring Scheduling instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13370" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13370/hovercard">#13370</a>)
* Redact query string values for http client spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13114" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13114/hovercard">#13114</a>)
* Support attribute lowercase modifier in JMX metrics yaml definitions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13385" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13385/hovercard">#13385</a>)
* Add tapir path matching within pekko instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13386" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13386/hovercard">#13386</a>)
* Support latest Axis2 version (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13490" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13490/hovercard">#13490</a>)
* Add instrumentation for Lambda Java interface HandleStreamRequest (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13466" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13466/hovercard">#13466</a>)
* Remove usage of gRPC internal api (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13510" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13510/hovercard">#13510</a>)
* Add options to disable gRPC per-message events (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13443" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13443/hovercard">#13443</a>)
* Add @WithSpan option to break from existing context and start a new trace (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13112" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13112/hovercard">#13112</a>)

🛠️ Bug fixes

* Fix <code>NoSuchElementException</code> thrown by Akka instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13360" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13360/hovercard">#13360</a>)
* Fix Spring Boot Starter MDC instrumentation for Logback not injecting <code>trace_id</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13391" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13391/hovercard">#13391</a>)
* Fix opt-in invoke dynamic instrumentation mechanism in OpenJ9 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13282" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13282/hovercard">#13282</a>)
* Fix spans in Pekko instrumentation on server timeout (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13435" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13435/hovercard">#13435</a>)
* Avoid overriding user's <code>trace_id</code> in Log4j MDC instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13479" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13479/hovercard">#13479</a>)
* Fix gRPC message ID attribute (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13443" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13443/hovercard">#13443</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/chlos/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chlos">@chlos</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Cirilla-zmh/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Cirilla-zmh">@Cirilla-zmh</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/CodePrometheus/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/CodePrometheus">@CodePrometheus</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Coupon-King/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Coupon-King">@Coupon-King</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/davisjose19/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/davisjose19">@davisjose19</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ejona86/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ejona86">@ejona86</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/grcevski/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/grcevski">@grcevski</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jakobjoachim/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jakobjoachim">@jakobjoachim</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeefy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeefy">@jeefy</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kcsurapaneni/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kcsurapaneni">@kcsurapaneni</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/KimDoubleB/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/KimDoubleB">@KimDoubleB</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/luke-sterkowicz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/luke-sterkowicz">@luke-sterkowicz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lukeina2z/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lukeina2z">@lukeina2z</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/masonedmison/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/masonedmison">@masonedmison</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Matzz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Matzz">@Matzz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/salaboy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/salaboy">@salaboy</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/samwright/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/samwright">@samwright</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiepuhuan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiepuhuan">@xiepuhuan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xrmx/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xrmx">@xrmx</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

