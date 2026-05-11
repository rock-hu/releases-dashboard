# Version 1.62.0

## release on 20260508
## description
## changes
API

Context

* Fix <a href="https://github.com/open-telemetry/opentelemetry-java/security/advisories/GHSA-rcgg-9c38-7xpx">GHSA-rcgg-9c38-7xpx</a>: Apply limits to baggage entries for <code>W3CBaggagePropagator</code>, <code>OtTracePropagator</code>, <code>JaegerPropagator</code>  
  (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8378" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8378/hovercard">#8378</a>)

SDK

Traces

* Avoid <code>parentContext</code> allocation on span start for the common case (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8332" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8332/hovercard">#8332</a>)

Metrics

* Add <code>setMaxExportBatchSize</code> to <code>PeriodicMetricReaderBuilder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8296" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8296/hovercard">#8296</a>)
* Fix <code>PeriodicMetricReader</code> shutdown race that could drop the final flush (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8299" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8299/hovercard">#8299</a>)

Exporters

* <strong>BREAKING</strong> Prometheus: Change default server host from <code>0.0.0.0</code> to <code>localhost</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8298" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8298/hovercard">#8298</a>)
* <strong>BREAKING</strong> Prometheus: Stop converting unit <code>"1"</code> to <code>"ratio"</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8252" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8252/hovercard">#8252</a>)
* OTLP: Fix null input handling in <code>StringEncoder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8312" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8312/hovercard">#8312</a>)
* OTLP: Align proto field types and wire tag names in marshalers (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8293" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8293/hovercard">#8293</a>)
* OTLP: Fix <code>MarshalerUtil</code> <code>sizeRepeatedString</code> calculation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8284" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8284/hovercard">#8284</a>)
* OTLP: Bound <code>JdkHttpSender</code> thread pool size to prevent unbounded thread creation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8276" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8276/hovercard">#8276</a>)
* OTLP Profiles: Split profiles data model into separate <code>sdk-profiles</code> and JFR shim modules (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8207" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8207/hovercard">#8207</a>)
* OTLP Profiles: Publish alpha release of <code>opentelemetry-sdk-profiles</code> and <code>opentelemetry-exporter-otlp-profiles</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8351" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8351/hovercard">#8351</a>)

Extensions

* <strong>BREAKING</strong> Declarative config: Extract to new <code>opentelemetry-sdk-extension-declarative-config</code> artifact with new package <code>io.opentelemetry.sdk.autoconfigure.declarativeconfig</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8265" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8265/hovercard">#8265</a>)
* Autoconfigure: Add file size validation in <code>OtlpConfigUtil</code> to avoid unsafe cast to <code>int</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8287" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8287/hovercard">#8287</a>)
* Declarative config: Fix collection fields to not be initialized to empty by default (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8356" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8356/hovercard">#8356</a>)
* Incubator: Add <code>EventToSpanEventBridge</code> to bridge log-based events to span events (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8372" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8372/hovercard">#8372</a>)

Testing

* Add <code>@Nullable</code> to <code>equalTo</code> value argument in <code>OpenTelemetryAssertions</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8301" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8301/hovercard">#8301</a>)
* Add <code>hasValueSatisfying</code> to <code>LongPointAssert</code> and <code>DoublePointAssert</code> for fuzzy value matching (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8328" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8328/hovercard">#8328</a>)
* Add <code>containsPointsSatisfying</code> to metric data asserts for "each given assertion must be satisfied by at least one point, extras allowed" checks on sum, gauge, histogram, exponential histogram, and summary data (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8329" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8329/hovercard">#8329</a>)

Project tooling

* Add initial OSGi support (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7964" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7964/hovercard">#7964</a>)
* Promote <code>ApiUsageLogger</code> to <code>opentelemetry-common</code> public API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8318" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8318/hovercard">#8318</a>)
* Establish exception logging guidelines and fix inconsistent patterns across exporters and SDK (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8231" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8231/hovercard">#8231</a>)
* Add <code>*.impl.*</code> package naming convention for internal code with japicmp compatibility (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8325" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8325/hovercard">#8325</a>)
* Add Sonatype dependency audit to build (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8365" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8365/hovercard">#8365</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/abdessattar23/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/abdessattar23">@abdessattar23</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuq/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuq">@anuq</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cijothomas/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cijothomas">@cijothomas</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jsuereth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jsuereth">@jsuereth</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laeubi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laeubi">@laeubi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maxiking203/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maxiking203">@maxiking203</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/royteeuwen/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/royteeuwen">@royteeuwen</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Sandared/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Sandared">@Sandared</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stbischof/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stbischof">@stbischof</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/utafrali/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/utafrali">@utafrali</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/VamshikrishnaMonagari/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/VamshikrishnaMonagari">@VamshikrishnaMonagari</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

