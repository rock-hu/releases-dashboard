# Version 1.48.0

## release on 20250307
## description
## changes
API

* Add some helpful logging attribute methods to <code>LogRecordBuilder</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7089" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7089/hovercard">#7089</a>)

Incubator

* Introduce ConfigProvider API. Rename <code>StructuredConfigProperties</code> to <code>DeclarativeConfigProperties</code> and move to <code>opentelemetry-api-incubator</code>. Rename <code>FileConfiguration</code> to <code>DeclarativeConfiguration</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6549" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6549/hovercard">#6549</a>)

SDK

* Log warning and adjust when BatchLogRecordProcessor, BatchSpanProcessor <code>maxExportBatchSize</code> exceeds <code>maxQueueSize</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7045" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7045/hovercard">#7045</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/7148" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7148/hovercard">#7148</a>)
* Fix bug causing <code>ThrottlingLogger</code> to log more than once per minute (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7156" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7156/hovercard">#7156</a>)

Metrics

* Remove obsolete <code>SdkMeterProviderUtil#setCardinalitylimit</code> API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7169" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7169/hovercard">#7169</a>)

Traces

* Fix bug preventing accurate reporting of span event dropped attribute count (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7142" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7142/hovercard">#7142</a>)

Exporters

* OTLP: remove support for <code>otel.java.experimental.exporter.memory_mode</code> which was previously replaced by <code>otel.java.exporter.memory_mode</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7127" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7127/hovercard">#7127</a>)
* OTLP: Extract sender parameters to config carrier class (incubating API) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7151" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7151/hovercard">#7151</a>)
* OTLP: Add support for setting OTLP exporter service class loader (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7150" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7150/hovercard">#7150</a>)

Tooling

* Update android animalsniffer min API version to 23 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7153" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7153/hovercard">#7153</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/chukunx/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chukunx">@chukunx</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/devilcoolyue/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/devilcoolyue">@devilcoolyue</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/geoand/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/geoand">@geoand</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/Github-advanced-security/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Github-advanced-security">@Github-advanced-security</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/joffrey-bion/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/joffrey-bion">@joffrey-bion</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/naumaan123/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/naumaan123">@naumaan123</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pbalint/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pbalint">@pbalint</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/step-security-bot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/step-security-bot">@step-security-bot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tealamore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tealamore">@tealamore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tongshushan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tongshushan">@tongshushan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

