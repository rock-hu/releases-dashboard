# Version 2.9.0

## release on 20250204

## description

## changes

This release targets the OpenTelemetry SDK 1.43.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Allow JMX Insight reuse for remote connections (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12178" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12178/hovercard">#12178</a>)
* Add opentelemetry-semconv-incubating to bom-alpha (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12266" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12266/hovercard">#12266</a>)
* Bridge more incubating api (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12230" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12230/hovercard">#12230</a>)
* Jetty HttpClient 12: propagate context to all response listeners (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12326" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12326/hovercard">#12326</a>)
* Add Pekko Scheduler context propagation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12359" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12359/hovercard">#12359</a>)
* Add Akka Scheduler context propagation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12373" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12373/hovercard">#12373</a>)
* Add instrumentation for spring-cloud-aws SqsListener annotation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12314" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12314/hovercard">#12314</a>)
* Align SpringConfigProperties with DefaultConfigProperties (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12398" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12398/hovercard">#12398</a>)
* Clear context propagation virtual field (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12397" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12397/hovercard">#12397</a>)
* The opt-in experimental attribute <code>aws.requestId</code> was renamed to <code>aws.request_id</code> (to match the semantic conventions) and it is now emitted by default. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12352" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12352/hovercard">#12352</a>)
* Ability to set Logback argument capture with a property in Spring Boot Starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12442" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12442/hovercard">#12442</a>)
* Support experimental declarative configuration (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12265" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12265/hovercard">#12265</a>)
* Spring Boot Starter: Add auto configuration for spring scheduling instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12438" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12438/hovercard">#12438</a>)
* Extract <code>APIGatewayProxyRequestEvent</code> headers for context propagation in AWS Lambda instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12440" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12440/hovercard">#12440</a>)
* Support JMX state metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12369" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12369/hovercard">#12369</a>)
* Allow method instrumentation module to trace methods in boot loader (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12454" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12454/hovercard">#12454</a>)

🛠️ Bug fixes

* Fix gc duration metric in runtime-telemetry-java17 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12256" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12256/hovercard">#12256</a>)
* Fix vert.x route containing duplicate segments when RoutingContext.next is used (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12260" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12260/hovercard">#12260</a>)
* Fixes for latest mongo version (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12331" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12331/hovercard">#12331</a>)
* Fix context propagation for ratpack request body stream (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12330" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12330/hovercard">#12330</a>)
* Fix lambda instrumentation to forceFlush logs also (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12341" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12341/hovercard">#12341</a>)
* Can't add custom AttributeExtractor to Apache HttpClient 5 library instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12394" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12394/hovercard">#12394</a>)
* Disable logback capture arguments by default (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12445" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12445/hovercard">#12445</a>)
* Add support for missing list properties in spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12434" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12434/hovercard">#12434</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/aarrsseni/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/aarrsseni">@aarrsseni</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AntonioLyubchev/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AntonioLyubchev">@AntonioLyubchev</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cleverchuk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cleverchuk">@cleverchuk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Dimagreg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Dimagreg">@Dimagreg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dubek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dubek">@dubek</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/egahlin/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/egahlin">@egahlin</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/encodedrose/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/encodedrose">@encodedrose</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fabiolnh/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fabiolnh">@fabiolnh</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kyy1996/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kyy1996">@kyy1996</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/NaveenRamu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/NaveenRamu">@NaveenRamu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pingleig/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pingleig">@pingleig</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pjfanning/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pjfanning">@pjfanning</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rage-shadowman/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rage-shadowman">@rage-shadowman</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/RajatArora08/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/RajatArora08">@RajatArora08</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rdicroce/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rdicroce">@rdicroce</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/s-chance/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/s-chance">@s-chance</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/smoke/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/smoke">@smoke</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stevenschlansker/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stevenschlansker">@stevenschlansker</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

@vanilla-sundae

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wsargent/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wsargent">@wsargent</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiepuhuan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiepuhuan">@xiepuhuan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

