# Version 1.41.0

## release on 20240809
## description
## changes
API

* Move experimental suppress instrumentation context key to api internal package (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6546" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6546/hovercard">#6546</a>)

Incubator

* Fix bug in <code>ExtendedContextPropagators</code> preventing context extraction when case is incorrect. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6569" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6569/hovercard">#6569</a>)

SDK

* Extend <code>CompletableResultCode</code> with <code>failExceptionally(Throwable)</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6348" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6348/hovercard">#6348</a>)

Metrics

* Avoid allocations when experimental advice doesn't remove any attributes. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6629" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6629/hovercard">#6629</a>)

Exporter

* Enable retry by default for OTLP exporters. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6588" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6588/hovercard">#6588</a>)
* Retry ConnectException, add retry logging. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6614" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6614/hovercard">#6614</a>)
* Extend <code>PrometheusHttpServer</code> with ability to configure default aggregation as function of instrument kind, including experimental env var support. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6541" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6541/hovercard">#6541</a>)
* Add exporter data model impl for profiling signal type. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6498" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6498/hovercard">#6498</a>)
* Add Marshalers for profiling signal type. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6565" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6565/hovercard">#6565</a>)
* Use generateCertificates() of CertificateFactory to process certificates. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6579" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6579/hovercard">#6579</a>)

Extensions

* Add file configuration ComponentProvider support for exporters. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6493" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6493/hovercard">#6493</a>)
* Remove nullable from file config Factory contract. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6612" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6612/hovercard">#6612</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Abhishekkr3003/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Abhishekkr3003">@Abhishekkr3003</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/abvaidya/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/abvaidya">@abvaidya</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/driverpt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/driverpt">@driverpt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/galahad098/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/galahad098">@galahad098</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hongshuai1994/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hongshuai1994">@hongshuai1994</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jarrodrobins/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jarrodrobins">@jarrodrobins</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/junwense/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/junwense">@junwense</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Oberon00/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Oberon00">@Oberon00</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/swar8080/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/swar8080">@swar8080</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wgy035/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wgy035">@wgy035</a>

