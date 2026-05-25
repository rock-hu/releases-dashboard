# Version 2.28.0

## release on 20260519
## description
## changes
This release targets the OpenTelemetry SDK 1.62.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they will continue to have breaking changes. Please see <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking changes to non-stable APIs

* Removed the obsolete internal <code>ClassInjector</code>/<code>ProxyInjectionBuilder</code> API used by the old <code>ExperimentalInstrumentationModule.injectClasses(ClassInjector)</code> path; use <code>ExperimentalInstrumentationModule.exposedClassNames()</code> instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18112" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18112/hovercard">#18112</a>)
* Removed previously deprecated non-stable API methods and the deprecated <code>opentelemetry-runtime-telemetry-java8</code> and <code>opentelemetry-runtime-telemetry-java17</code> library aliases. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18136" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18136/hovercard">#18136</a>)
* Removed the previously deprecated <code>captureEventName</code> library builder setting from the logback-appender-1.0 and log4j-appender-2.17 <code>OpenTelemetryAppender</code>, and the corresponding <code>otel.instrumentation.{logback-appender,log4j-appender,jboss-logmanager}.experimental.capture-event-name</code> javaagent properties. Use the <code>otel.event.name</code> key in MDC / context data / key-value pairs / Logstash markers / structured arguments instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18223" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18223/hovercard">#18223</a>)
* Removed previously deprecated experimental config properties <code>otel.instrumentation.http.client.experimental.redact-query-parameters</code> and <code>otel.instrumentation.common.experimental.db-sqlcommenter.enabled</code>; use <code>otel.instrumentation.sanitization.url.experimental.sensitive-query-parameters</code> and <code>otel.instrumentation.common.db.experimental.sqlcommenter.enabled</code> instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18229" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18229/hovercard">#18229</a>)
* Removed the deprecated <code>otel.instrumentation.servlet.experimental.add-trace-id-request-attribute</code> property; use <code>otel.instrumentation.servlet.experimental.trace-id-request-attribute.enabled</code> instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18237" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18237/hovercard">#18237</a>)
* Reshaped the ktor <code>Experimental</code> helper from a class with a <code>companion object</code> to a top-level <code>object</code>. Kotlin source callers (<code>Experimental.emitExperimentalTelemetry(...)</code>) are unaffected, but pre-compiled consumers must be recompiled against the new artifact. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18343" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18343/hovercard">#18343</a>)

🚫 Deprecations

* Deprecate <code>otel.instrumentation.jaxws-cxf-3.0.enabled</code> in favor of <code>otel.instrumentation.jaxws-2.0-cxf-3.0.enabled</code>, and <code>otel.instrumentation.jaxws-metro-2.2.enabled</code> in favor of <code>otel.instrumentation.jaxws-2.0-metro-2.2.enabled</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18184" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18184/hovercard">#18184</a>)

🌟 New javaagent instrumentation

* Add Apache Thrift 0.13 instrumentation for RPC client and server spans and metrics. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18405" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18405/hovercard">#18405</a>)

🌟 New library instrumentation

* Add Apache Thrift 0.13 library instrumentation for RPC client and server spans and metrics. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18405" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18405/hovercard">#18405</a>)

📈 Enhancements

* Couchbase 3.1 javaagent instrumentation now emits the more conventional instrumentation scope name <code>io.opentelemetry.couchbase-3.1</code> instead of <code>io.opentelemetry.javaagent.couchbase-3.1</code> when <code>otel.instrumentation.common.v3-preview</code> is enabled. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18426" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18426/hovercard">#18426</a>)
* Wicket resource requests now use the resource reference class name in the server span name when <code>otel.instrumentation.common.v3-preview</code> is enabled. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18312" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18312/hovercard">#18312</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18775" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18775/hovercard">#18775</a>)
* Decide whether javaagent helper classes are injected into the application class loader or isolated based on the advice classes used by an instrumentation. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/17815" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/17815/hovercard">#17815</a>)
* Improve cgroup v2 container ID detection for Podman by supporting additional <code>mountinfo</code> layouts and warning when multiple candidate IDs are found. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18272" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18272/hovercard">#18272</a>)

🛠️ Bug fixes

* Fix Pekko HTTP and Tapir server route tracking so server span names and <code>http.route</code> preserve the most specific matched route across nested directives, exceptions, and timeouts; this may change span names and <code>http.route</code> values for affected routes. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16390" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16390/hovercard">#16390</a>)
* Fix context loss in Finagle HTTP instrumentation across Netty-to-Finagle request conversion and <code>twitter-util</code> Future/Promise asynchronous boundaries. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/17867" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/17867/hovercard">#17867</a>)
* Fix virtual-thread pinning caused by weak-map stale-entry cleanup running on virtual threads; cleanup now runs from the background thread instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18113" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18113/hovercard">#18113</a>)
* Avoid linking batch consumer spans to the ambient consumer span when records or messages have no propagation headers. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18154" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18154/hovercard">#18154</a>)
* Fix <code>resetOnEachOperator()</code> for Reactor 3.1 so it also removes the scheduler hook when instrumentation is disabled. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18258" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18258/hovercard">#18258</a>)
* End spans when RxJava 1.0 subscriptions throw synchronously. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18265" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18265/hovercard">#18265</a>)
* Fix Spring Boot service version auto-detection so <code>META-INF/build-info.properties</code> is read from the jar root instead of <code>BOOT-INF/classes/</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18292" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18292/hovercard">#18292</a>)
* Clear the Netty <code>VirtualField</code> after finishing a response in the Netty 3.8 server instrumentation. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18358" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18358/hovercard">#18358</a>)
* Fix <code>JarDetails</code> to close <code>JarFile</code> handles while reading archives and embedded jars, preventing resource leaks during runtime telemetry collection. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18385" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18385/hovercard">#18385</a>)
* Fix a <code>NullPointerException</code> when converting an agent context without an associated application context to an application context. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18444" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18444/hovercard">#18444</a>)
* Fix Ktor server instrumentation to prevent OpenTelemetry context leaks caused by incomplete coroutine context restoration. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18456" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18456/hovercard">#18456</a>)
* Fix Vert.x sub-router <code>http.route</code> attributes by prepending the mount point to the relative route path; this may change server span names and <code>http.route</code> values for mounted sub-routes. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18462" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18462/hovercard">#18462</a>)
* Fix oshi metrics startup and RSS memory reporting with <code>oshi</code> 7.0.0. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18478" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18478/hovercard">#18478</a>)
* Fix Play MVC and Play WS instrumentation on Play 3.x applications. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18624" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18624/hovercard">#18624</a>)
* Record an error receive span when a wrapped Kafka consumer <code>poll()</code> fails. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18625" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18625/hovercard">#18625</a>)
* Fix weak-map cleanup during agent startup by starting <code>WeakConcurrentMapCleaner</code> before Byte Buddy installation. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18628" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18628/hovercard">#18628</a>)
* Fix indy instrumentation so it works with the security manager without recursive bootstrap failures. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18634" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18634/hovercard">#18634</a>)
* Avoid a deadlock in weak caches when stale entries are expunged during <code>computeIfAbsent</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18635" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18635/hovercard">#18635</a>)
* Declarative config customizers now handle missing processor and detector lists without throwing <code>NullPointerException</code> during startup. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18641" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18641/hovercard">#18641</a>)
* Fix a race that could prevent HTTP server spans from ending correctly in Netty 3.8 and 4.0 instrumentation. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18645" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18645/hovercard">#18645</a>)
* Avoid <code>NumberFormatException</code> when a JDBC URL port is null. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18708" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18708/hovercard">#18708</a>)
* Fix Vert.x <code>TaskQueue</code> and <code>OrderedExecutorFactory</code> task execution so span context propagates to queued runnables. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18709" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18709/hovercard">#18709</a>)
* Limit Redisson batch query text length to avoid oversized <code>db.statement</code> values for large batches. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18744" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18744/hovercard">#18744</a>)
* Fix SQL query sanitization so password clauses in SAP HANA administrative statements are redacted without redacting <code>password</code> identifiers. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/18754" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/18754/hovercard">#18754</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Ari4ka/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Ari4ka">@Ari4ka</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asvanberg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asvanberg">@asvanberg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Channyboy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Channyboy">@Channyboy</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/chatgpt-codex-connector/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chatgpt-codex-connector">@chatgpt-codex-connector</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/deejay1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/deejay1">@deejay1</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dengliming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dengliming">@dengliming</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dmarkwat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dmarkwat">@dmarkwat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dtaveras/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dtaveras">@dtaveras</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/filipl/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/filipl">@filipl</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/michaelnimbs-ehex/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/michaelnimbs-ehex">@michaelnimbs-ehex</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/otbe/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/otbe">@otbe</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rohitmohan96/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rohitmohan96">@rohitmohan96</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/samwright/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/samwright">@samwright</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stefanroeck/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stefanroeck">@stefanroeck</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wrobelma/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wrobelma">@wrobelma</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/YaoYingLong/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/YaoYingLong">@YaoYingLong</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

