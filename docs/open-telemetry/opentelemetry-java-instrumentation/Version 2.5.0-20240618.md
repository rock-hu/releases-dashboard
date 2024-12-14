# Version 2.5.0

## release on 20240618
## description
## changes
This release targets the OpenTelemetry SDK 1.39.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Add support for Informix connection string parsing in JDBC instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11542" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11542/hovercard">#11542</a>)
* Generate an SBOM for the javaagent artifact (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11075" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11075/hovercard">#11075</a>)
* Extract sql operation even when the sanitizer is disabled (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11472" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11472/hovercard">#11472</a>)
* Improve security manager support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11466" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11466/hovercard">#11466</a>)
* Generate Log4j2Plugin.dat for OpenTelemetryAppender (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11503" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11503/hovercard">#11503</a>)
* Stop kotlin coroutine dispatcher from propagating context (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11500" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11500/hovercard">#11500</a>)
* Handle Vert.x sub routes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11535" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11535/hovercard">#11535</a>)
* Undertow: run response customizer on all ServerConnection implementations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11539" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11539/hovercard">#11539</a>)
* Allow configuring MDC key names for trace_id, span_id, trace_flags (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11329" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11329/hovercard">#11329</a>)
* Apply async end strategy to all kotlin coroutine flows (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11583" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11583/hovercard">#11583</a>)

🛠️ Bug fixes

* Fix container.id issue in some crio scenarios (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11382" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11382/hovercard">#11382</a>)
* Fix Finagle http client context propagation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11400" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11400/hovercard">#11400</a>)
* Fix sporadically failing finagle test (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11441" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11441/hovercard">#11441</a>)
* Fix request header capture corrupting tomcat request (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11469" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11469/hovercard">#11469</a>)
* Fix Ktor server instrumentation when Ktor client library is not present (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11454" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11454/hovercard">#11454</a>)
* Fix gRPC instrumentation adding duplicates to metadata instead of overwriting (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11308" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11308/hovercard">#11308</a>)
* Avoid NullPointerException when JMS destination is not available (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11570" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11570/hovercard">#11570</a>)
* Fix Spring Kafka instrumentation closing the trace too early (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11471" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11471/hovercard">#11471</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlchemyDing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlchemyDing">@AlchemyDing</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cleverchuk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cleverchuk">@cleverchuk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/himamulch/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/himamulch">@himamulch</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/KarinaGanieva-sl/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/KarinaGanieva-sl">@KarinaGanieva-sl</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kintan-singh-backend/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kintan-singh-backend">@kintan-singh-backend</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kjschnei001/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kjschnei001">@kjschnei001</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/liurui-1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/liurui-1">@liurui-1</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ofelbaum/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ofelbaum">@ofelbaum</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pavelvodrazka/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pavelvodrazka">@pavelvodrazka</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/philsttr/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/philsttr">@philsttr</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Questlog/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Questlog">@Questlog</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rickardoberg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rickardoberg">@rickardoberg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/s-af/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/s-af">@s-af</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wgy035/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wgy035">@wgy035</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zhangjiabin1010/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zhangjiabin1010">@zhangjiabin1010</a>

