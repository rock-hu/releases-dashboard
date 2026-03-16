# Version 2.26.0

## release on 20260314
## description
## changes
This release targets the OpenTelemetry SDK 1.60.1.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking changes to non-stable APIs

* Remove deprecated AWS Lambda v2.2 wrappers and <code>forceFlush(int, TimeUnit)</code> overload (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16170" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16170/hovercard">#16170</a>)
* Remove deprecated HTTP client/server methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16167" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16167/hovercard">#16167</a>)
* Remove deprecated database instrumentation methods and classes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16164" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16164/hovercard">#16164</a>)
* Remove deprecated peer-service mapping APIs (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16165" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16165/hovercard">#16165</a>)
* Make runtime-telemetry deprecated classes now internal (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16173" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16173/hovercard">#16173</a>)
* Remove <code>AttributesExtractorUtil</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16152" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16152/hovercard">#16152</a>)
* Remove marker interface from <code>SqlClientAttributesGetter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16205" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16205/hovercard">#16205</a>)
* Merge network/server getter methods into DB attribute getters (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16264" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16264/hovercard">#16264</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16268" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16268/hovercard">#16268</a>)
* Rename SQL sanitizer classes to SQL analyzer (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16269" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16269/hovercard">#16269</a>)
* Rename internal common module packages to follow new naming convention (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16284" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16284/hovercard">#16284</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16308" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16308/hovercard">#16308</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16327" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16327/hovercard">#16327</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16341" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16341/hovercard">#16341</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16373" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16373/hovercard">#16373</a>)

🚫 Deprecations

* Deprecated individual runtime-telemetry module classes in favor of unified module (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16087" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16087/hovercard">#16087</a>)
* Deprecated old HTTP server query parameter methods in favor of sensitive query param handling (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16097" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16097/hovercard">#16097</a>)
* Deprecated old RPC attributes getter methods in favor of new ones supporting stable semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16130" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16130/hovercard">#16130</a>)
* Deprecated old ClickHouse instrumentation methods as part of simplification (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16206" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16206/hovercard">#16206</a>)
* Deprecated old R2DBC methods in favor of ones supporting <code>db.system.name</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16251" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16251/hovercard">#16251</a>)
* Deprecated old <code>DbClientAttributesGetter</code> methods; added <code>getErrorType()</code> with implementations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16276" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16276/hovercard">#16276</a>)
* Deprecated old RPC metrics methods in favor of ones supporting stable semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16298" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16298/hovercard">#16298</a>)
* Deprecated old <code>DbClientAttributesGetter</code> methods; added <code>getDbName()</code> to better support old/stable semconv split (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16318" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16318/hovercard">#16318</a>)

📈 Enhancements

* Add server address and port attributes for Spymemcached (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15242" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15242/hovercard">#15242</a>)
* Add Kafka Connect as a built-in JMX metrics target (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15561" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15561/hovercard">#15561</a>)
* Convert Lettuce instrumentation to use <code>Instrumenter</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15838" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15838/hovercard">#15838</a>)
* OpenSearch Java client: capture sanitized search query bodies (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15634" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15634/hovercard">#15634</a>)
* Apply stable semantic conventions to Camel JMX metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16088" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16088/hovercard">#16088</a>)
* Add <code>jvm.file_descriptor.limit</code> metric (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16174" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16174/hovercard">#16174</a>)
* Run gRPC client callbacks with parent context (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16175" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16175/hovercard">#16175</a>)
* SQL summary: handle <code>EXPLAIN</code> statements (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16184" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16184/hovercard">#16184</a>)
* Simplify InfluxDB instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16207" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16207/hovercard">#16207</a>)
* Update histogram buckets for <code>db.client.operation.duration</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16222" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16222/hovercard">#16222</a>)
* SQL summary: support Oracle dblink syntax (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16230" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16230/hovercard">#16230</a>)
* Add instrumentation for ZIO HTTP server route (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16232" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16232/hovercard">#16232</a>)
* Remove network attributes under database stable semconv flag (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16257" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16257/hovercard">#16257</a>)
* Support Javalin 7 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16261" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16261/hovercard">#16261</a>)
* gRPC: initial stable semconv support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16304" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16304/hovercard">#16304</a>)
* Populate <code>os.version</code> resource attribute (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16311" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16311/hovercard">#16311</a>)
* Camel: don't emit db spans under stable semconv (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16275" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16275/hovercard">#16275</a>)
* Dubbo: stable semconv support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16352" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16352/hovercard">#16352</a>)
* Update the OpenTelemetry SDK version to 1.60.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16407" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16407/hovercard">#16407</a>)
* Use new stable <code>LogRecordBuilder.setException()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16423" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16423/hovercard">#16423</a>)
* Configure <code>semconv-stability.opt-in</code> with declarative config API (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16443" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16443/hovercard">#16443</a>)
* Support <code>otel.event.name</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16220" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16220/hovercard">#16220</a>)

🛠️ Bug fixes

* SQL sanitizer now treats double-quoted fragments as string literals by default (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15582" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15582/hovercard">#15582</a>)
* Clear recorded exception when request completes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16138" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16138/hovercard">#16138</a>)
* Clear URL connection state after ending span (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16155" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16155/hovercard">#16155</a>)
* Fix Spring declarative config with environment variable substitution (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15775" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15775/hovercard">#15775</a>)
* Fix Ktor server send pipeline error handling (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16192" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16192/hovercard">#16192</a>)
* Logging appenders: <code>KeyValue</code> attributes should take priority over MDC (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16239" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16239/hovercard">#16239</a>)
* Create new <code>PekkoRouteHolder</code> for each request (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16258" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16258/hovercard">#16258</a>)
* Tomcat JMX: ignore negative thread and session limits (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16355" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16355/hovercard">#16355</a>)
* <code>server.port</code> is required on HTTP client spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16388" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16388/hovercard">#16388</a>)
* Fix Ktor server instrumentation resolving peer address (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16392" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16392/hovercard">#16392</a>)
* Fix class cast exception in servlet instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16403" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16403/hovercard">#16403</a>)
* Fix empty response body on Jetty HttpClient 9.4.24–9.4.43 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16406" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16406/hovercard">#16406</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/aaaugustine29/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/aaaugustine29">@aaaugustine29</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Arpan200502/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Arpan200502">@Arpan200502</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/filipl/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/filipl">@filipl</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fuleow/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fuleow">@fuleow</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hilmarf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hilmarf">@hilmarf</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/huange7/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/huange7">@huange7</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/imrahul23/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/imrahul23">@imrahul23</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jonasplaum/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jonasplaum">@jonasplaum</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lmolkova/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lmolkova">@lmolkova</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lucacavenaghi97/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lucacavenaghi97">@lucacavenaghi97</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/minwoox/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/minwoox">@minwoox</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/richard-salac/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/richard-salac">@richard-salac</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/samwright/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/samwright">@samwright</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/self-sasi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/self-sasi">@self-sasi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

