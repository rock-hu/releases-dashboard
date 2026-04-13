# Version 1.61.0

## release on 20260410
## description
## changes
API

* Stabilize <code>isEnabled()</code> on <code>Tracer</code>, <code>Logger</code>, and metric instruments (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8200" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8200/hovercard">#8200</a>)

Incubating

* <strong>BREAKING</strong> Update <code>EnvironmentGetter</code> and <code>EnvironmentSetter</code> key normalization to reflect spec changes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8233" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8233/hovercard">#8233</a>)

SDK

Traces

* Retain propagated context when generating random trace IDs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8263" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8263/hovercard">#8263</a>)
* Add rate-limited warning log when <code>BatchSpanProcessor</code> drops spans (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8167" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8167/hovercard">#8167</a>)

Metrics

* Track series start time per aggregator rather than at <code>SdkMeterProvider</code> creation time (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8180" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8180/hovercard">#8180</a>)
* Capture context class loader during async callback registration (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8091" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8091/hovercard">#8091</a>)
* Make include/exclude work correctly with empty (but non-null) lists (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8185" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8185/hovercard">#8185</a>)

Logs

* Fix condition for recording successful log processing metrics (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8226" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8226/hovercard">#8226</a>)

Exporters

* OTLP: add configurable bounds to response body reading (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8224" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8224/hovercard">#8224</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8277" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8277/hovercard">#8277</a>)
* OTLP: only throw invalid response exception when gRPC response size < 5 bytes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8194" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8194/hovercard">#8194</a>)
* OTLP: remove duplicate FINEST-level error logging in gRPC exporter (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8216" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8216/hovercard">#8216</a>)
* OTLP Profiles: clean up profile signal exporters for consistency (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8172" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8172/hovercard">#8172</a>)

Extensions

* <strong>BREAKING</strong> Autoconfigure: remove deprecated <code>ComponentLoader</code> class (use <code>io.opentelemetry.common.ComponentLoader</code> instead) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8243" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8243/hovercard">#8243</a>)
* Declarative config: fix <code>DeclarativeConfigProperties</code> javadoc to not throw exceptions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8079" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8079/hovercard">#8079</a>)
* Declarative config: resource attribute filtering should include attributes by default (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8177" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8177/hovercard">#8177</a>)
* Declarative config: enforce IncludedExcludeModel .included and .excluded are not empty (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8266" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8266/hovercard">#8266</a>)
* Autoconfigure: restructure SDK incubator to not depend on autoconfigure internals (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8242" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8242/hovercard">#8242</a>)

Project tooling

* Disable Gradle build cache on releases to mitigate supply chain risk (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8254" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8254/hovercard">#8254</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/adp2201/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/adp2201">@adp2201</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/arun-annamalai/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/arun-annamalai">@arun-annamalai</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Bhagirath00/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Bhagirath00">@Bhagirath00</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cleverchuk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cleverchuk">@cleverchuk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dashpole/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dashpole">@dashpole</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/eamonn-kearns-ibm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/eamonn-kearns-ibm">@eamonn-kearns-ibm</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/filipetrovic/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/filipetrovic">@filipetrovic</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/martincostello/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/martincostello">@martincostello</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maryliag/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maryliag">@maryliag</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/MikeGoldsmith/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/MikeGoldsmith">@MikeGoldsmith</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opensourcevk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opensourcevk">@opensourcevk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pellared/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pellared">@pellared</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/TruongNguyen1305/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/TruongNguyen1305">@TruongNguyen1305</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Tusharika725/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Tusharika725">@Tusharika725</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/VamshikrishnaMonagari/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/VamshikrishnaMonagari">@VamshikrishnaMonagari</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

