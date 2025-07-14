# Version 2.17.0

## release on 20250620

## description

## changes

This release targets the OpenTelemetry SDK 1.51.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* Changes have been made to Tomcat metric definitions provided by JMX Metric Insight component
  * metric <code>http.server.tomcat.errorCount</code> --> <code>tomcat.error.count</code>
    * attribute: <code>name</code> --> <code>tomcat.request.processor.name</code>
    * type: Gauge --> Counter
  * metric <code>http.server.tomcat.requestCount</code> --> <code>tomcat.request.count</code>
    * attribute: <code>name</code> --> <code>tomcat.request.processor.name</code>
    * type: Gauge --> Counter
  * metric <code>http.server.tomcat.maxTime</code> --> <code>tomcat.request.duration.max</code>
    * attribute: <code>name</code> --> <code>tomcat.request.processor.name</code>
    * unit: <code>ms</code> --> <code>s</code>
  * metric <code>http.server.tomcat.processingTime</code> --> <code>tomcat.request.duration.sum</code>
    * attribute: <code>name</code> --> <code>tomcat.request.processor.name</code>
    * unit: <code>ms</code> --> <code>s</code>
  * metric <code>http.server.tomcat.traffic</code> --> <code>tomcat.network.io</code>
    * attribute: <code>name</code> --> <code>tomcat.request.processor.name</code>, <code>direction</code> --> <code>network.io.direction</code>
  * metric <code>http.server.tomcat.sessions.activeSessions</code> --> <code>tomcat.session.active.count</code>
    * attribute: <code>context</code> --> <code>tomcat.context</code>
  * metric <code>http.server.tomcat.threads</code> split into two metrics: <code>tomcat.thread.count</code> and <code>tomcat.thread.busy.count</code>
    * attribute: <code>name</code> --> <code>tomcat.thread.pool.name</code>, <code>state</code> removed

📈 Enhancements

* JMX metrics: require explicit unit in yaml (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13796" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13796/hovercard">#13796</a>)
* Remove deprecated methods from runtime-telemetry (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13885" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13885/hovercard">#13885</a>)
* ClickHouse JDBC URL support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13884" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13884/hovercard">#13884</a>)
* Support Vert.x HTTP client version 5.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13903" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13903/hovercard">#13903</a>)
* Add metric <code>jvm.file_descriptor.count</code> to jvm runtime experimental metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13904" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13904/hovercard">#13904</a>)
* Add support for Vert.x SQL client version 5.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13914" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13914/hovercard">#13914</a>)
* JMX Metric Insights - improved Tomcat metrics alignment to semconv and added new Tomcat metrics <code>tomcat.session.active.limit</code> and <code>tomcat.thread.limit</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13650" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13650/hovercard">#13650</a>)
* Apply method instrumentation only to methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13949" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13949/hovercard">#13949</a>)
* Apply external annotation instrumentation only to methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13948" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13948/hovercard">#13948</a>)
* Log start of spring boot starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13882" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13882/hovercard">#13882</a>)
* Update the OpenTelemetry SDK version to 1.51.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13992" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13992/hovercard">#13992</a>)
* Capture finatra code function name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13939" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13939/hovercard">#13939</a>)
* AWS SDK v2 Secrets Manager auto-instrumentation support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14001" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14001/hovercard">#14001</a>)
* AWS SDK v1 Step Functions auto-instrumentation support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14003" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14003/hovercard">#14003</a>)
* Add auto-instrumentation support for AWS Step Functions SDK v2 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14028" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14028/hovercard">#14028</a>)
* Skip propagating context into mysql jdbc cleanup thread (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14060" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14060/hovercard">#14060</a>)

🛠️ Bug fixes

* Fix instrumentation failure when constructor has @WithSpan annotation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13929" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13929/hovercard">#13929</a>)
* Fix structured concurrency support on jdk 25 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13936" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13936/hovercard">#13936</a>)
* Fix Spring boot starter fails to load when an OpenTelemetry Bean is supplied (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13972" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13972/hovercard">#13972</a>)
* Fix UCP instrumentation scope name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14029" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14029/hovercard">#14029</a>)
* Preload ThreadLocalRandom to avoid java.lang.ClassCircularityError: java/util/concurrent/ThreadLocalRandom (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14030" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14030/hovercard">#14030</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/copilot-pull-request-reviewer/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/copilot-pull-request-reviewer">@copilot-pull-request-reviewer</a>

@github-advanced-security

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/john-hyun-eb/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/john-hyun-eb">@john-hyun-eb</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/john9x/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/john9x">@john9x</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lukeina2z/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lukeina2z">@lukeina2z</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/prdoyle/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/prdoyle">@prdoyle</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/schmikei/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/schmikei">@schmikei</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wl2027/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wl2027">@wl2027</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

