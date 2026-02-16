# Version 2.25.0

## release on 20260213
## description
## changes
This release targets the OpenTelemetry SDK 1.59.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking changes to non-stable APIs

* Make Netty 4.1 library public API self-contained (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15981" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15981/hovercard">#15981</a>)
* Remove previously deprecated methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15892" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15892/hovercard">#15892</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15929" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15929/hovercard">#15929</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15943" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15943/hovercard">#15943</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15944" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15944/hovercard">#15944</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15945" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15945/hovercard">#15945</a>)

🚫 Deprecations

* Deprecated <code>getDelegate()</code>, <code>request()</code>, <code>channel()</code>, <code>remoteAddress()</code> in HTTP client request wrapper classes in favor of <code>getRequest()</code>, <code>getChannel()</code>, <code>getRemoteAddress()</code> for consistency (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15942" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15942/hovercard">#15942</a>)
* Deprecated <code>NettyClientTelemetry.setChannelContext()</code> in favor of <code>setParentContext()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16010" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16010/hovercard">#16010</a>)
* Deprecated <code>new*</code> methods in favor of <code>create*</code> methods in Armeria and Jetty client instrumentation (e.g., <code>newDecorator()</code> → <code>createDecorator()</code>, <code>newHttpClient()</code> → <code>createHttpClient()</code>) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16009" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16009/hovercard">#16009</a>)
* Deprecated <code>NettyServerTelemetry.createResponseHandler()</code> and <code>createCombinedHandler()</code> overloads that expose internal classes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16011" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16011/hovercard">#16011</a>)
* Deprecated <code>RatpackServerTelemetry.getHandler()</code>, <code>getExecInterceptor()</code>, and <code>getExecInitializer()</code> in favor of <code>createHandler()</code>, <code>createExecInterceptor()</code>, and <code>createExecInitializer()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16013" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16013/hovercard">#16013</a>)
* Deprecated <code>setPeerService()</code> in HTTP, gRPC, Dubbo, and Armeria instrumentation builders in favor of <code>addAttributesExtractor()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16059" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16059/hovercard">#16059</a>)
* Deprecated <code>RpcAttributesGetter.getMethod()</code> in favor of <code>getRpcMethod()</code> to support stable RPC semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16121" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16121/hovercard">#16121</a>)
* Deprecated <code>PeerServiceResolver</code>, <code>PeerServiceAttributesExtractor</code>, and <code>HttpClientPeerServiceAttributesExtractor</code> in favor of renamed classes <code>ServicePeerResolver</code>, <code>ServicePeerAttributesExtractor</code>, and <code>HttpClientServicePeerAttributesExtractor</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16071" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16071/hovercard">#16071</a>)
* Deprecated <code>setStatementSanitizationEnabled()</code> in favor of <code>setQuerySanitizationEnabled()</code> across database instrumentation builders (Cassandra, JDBC, Lettuce, Mongo, R2DBC) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16133" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16133/hovercard">#16133</a>)
* Deprecated individual runtime metric classes (<code>Classes</code>, <code>Cpu</code>, <code>GarbageCollector</code>, <code>MemoryPools</code>, <code>Threads</code>) in favor of <code>RuntimeMetrics</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16064" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16064/hovercard">#16064</a>)
* Deprecated <code>SqlStatementInfo</code> in favor of <code>SqlQuery</code>, and <code>SqlStatementSanitizer</code> in favor of <code>SqlQuerySanitizer</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16074" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16074/hovercard">#16074</a>)

🌟 New library instrumentation

* Servlet 5 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16033" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16033/hovercard">#16033</a>)

📈 Enhancements

* Logback appender: add declarative config support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15813" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15813/hovercard">#15813</a>)
* OkHttp: avoid weak reference in library instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15977" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15977/hovercard">#15977</a>)
* HTTP clients: Enable query redaction by default in library instrumentations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16096" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16096/hovercard">#16096</a>)
* HttpURLConnection: mark as early instrumentation to ensure virtual fields are used (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16142" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16142/hovercard">#16142</a>)

🛠️ Bug fixes

* Dropwizard metrics: Sanitize names where needed to comply with OpenTelemetry requirements (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15954" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15954/hovercard">#15954</a>)
* Instrumentation API incubator: Fix span key mapping for MESSAGING_CONSUMER_PROCESS (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16001" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16001/hovercard">#16001</a>)
* Couchbase: Fix local address occasionally missing (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16035" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16035/hovercard">#16035</a>)
* Internal logging: Map jul config level to debug instead of info (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/16141" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/16141/hovercard">#16141</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/imavroukakis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/imavroukakis">@imavroukakis</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/roberttoyonaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/roberttoyonaga">@roberttoyonaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/surbhiia/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/surbhiia">@surbhiia</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thiagohora/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thiagohora">@thiagohora</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/toon-borgers-hs/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/toon-borgers-hs">@toon-borgers-hs</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

