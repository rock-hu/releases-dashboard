# Version 1.55.0

## release on 20251013
## description
## changes
API

Common

* Improve GraalVM native image compatibility (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7160" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7160/hovercard">#7160</a>)

Traces

* Fix <code>TraceState</code> key validation limits to match W3C specification (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7575" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7575/hovercard">#7575</a>)

Incubator

* Add <code>ExtendedOpenTelemetry</code> API (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7496" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7496/hovercard">#7496</a>)
* Add incubator implementation of composite sampling specification (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7626" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7626/hovercard">#7626</a>)

SDK

Traces

* Proactively avoid <code>Unsafe</code> on Java 23+ to avoid triggering JVM warning message (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7691" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7691/hovercard">#7691</a>)

Metrics

* Add <code>setMeterConfigurator()</code> support to <code>MeterProvider</code> (incubating API) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7346" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7346/hovercard">#7346</a>)

Exporters

* OTLP: Configure metric exporter to use SDK's <code>MeterProvider</code> for internal metrics (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7541" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7541/hovercard">#7541</a>)
* OTLP: Suppress logging of <code>InterruptedException</code> from managed OkHttp threads (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7565" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7565/hovercard">#7565</a>)
* OTLP: Update dependency from <code>okhttp-jvm</code> back to <code>okhttp</code> for Gradle users, preserving <code>okhttp-jvm</code> for Maven users (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7681" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7681/hovercard">#7681</a>)
* Prometheus: Remove separate <code>otel_scope_info</code> metric and always add scope labels to data points (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7398" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7398/hovercard">#7398</a>)
* Prometheus: Update exporter dependencies to use protobuf-free formats (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7664" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7664/hovercard">#7664</a>)

Profiling

* Update profiles exporter to support proto v1.8.0-alpha changes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7638" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7638/hovercard">#7638</a>)
* Add abstractions to assist with dictionary table assembly (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7717" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7717/hovercard">#7717</a>)
* Add abstractions to assist with sample composition (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7727" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7727/hovercard">#7727</a>)

Extensions

* Autoconfigure: Improve exception logging when running in Maven (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7336" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7336/hovercard">#7336</a>)
* Declarative configuration: Return <code>Resource</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7639" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7639/hovercard">#7639</a>)
* Declarative configuration: Invoke auto-configure listeners (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7654" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7654/hovercard">#7654</a>)
* Declarative configuration: Add logging when incompatible types are found (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7693" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7693/hovercard">#7693</a>)

Shims

OpenTracing Shim

* Improve log levels in error scenarios (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6832" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6832/hovercard">#6832</a>)

Project tooling

* Respect <code>testJavaVersion</code> property when running JMH benchmarks (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7697" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7697/hovercard">#7697</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/50c/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/50c">@50c</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuragagarwal561994/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuragagarwal561994">@anuragagarwal561994</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ArthurSens/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ArthurSens">@ArthurSens</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bidetofevil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bidetofevil">@bidetofevil</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brendenehlers/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brendenehlers">@brendenehlers</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cbruegg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cbruegg">@cbruegg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cyrille-leclerc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cyrille-leclerc">@cyrille-leclerc</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ericdallo/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ericdallo">@ericdallo</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/fandreuz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/fandreuz">@fandreuz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/greatvovan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/greatvovan">@greatvovan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/iNikem/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/iNikem">@iNikem</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/maryliag/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/maryliag">@maryliag</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/priettt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/priettt">@priettt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vidyadharamurthy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vidyadharamurthy">@vidyadharamurthy</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

