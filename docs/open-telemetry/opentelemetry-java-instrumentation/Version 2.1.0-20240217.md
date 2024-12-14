# Version 2.1.0

## release on 20240217

## description

## changes

This release targets the OpenTelemetry SDK 1.35.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* Deprecated config properties have been removed in favor of the new names:
  * <code>otel.instrumentation.kafka.client-propagation.enabled</code> -> <code>otel.instrumentation.kafka.producer-propagation.enabled</code>
  * <code>otel.instrumentation.netty.always-create-connect-span</code> -> <code>otel.instrumentation.netty.connection-telemetry.enabled</code>
  * <code>otel.instrumentation.http.capture-headers.client.request</code> -> <code>otel.instrumentation.http.client.capture-request-headers</code>
  * <code>otel.instrumentation.http.capture-headers.client.response</code> -> <code>otel.instrumentation.http.client.capture-response-headers</code>
  * <code>otel.instrumentation.http.capture-headers.server.request</code> -> <code>otel.instrumentation.http.server.capture-request-headers</code>
  * <code>otel.instrumentation.http.capture-headers.server.response</code> -> <code>otel.instrumentation.http.server.capture-response-headers</code>
  * <code>otel.instrumentation.http.client.emit-experimental-metrics</code> -> <code>otel.instrumentation.http.client.emit-experimental-telemetry</code>
  * <code>otel.instrumentation.http.server.emit-experimental-metrics</code> -> <code>otel.instrumentation.http.server.emit-experimental-telemetry</code>  
    (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10349" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10349/hovercard">#10349</a>)
* The deprecated Jaeger exporter has been removed (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10241" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10241/hovercard">#10241</a>)
* Actuator instrumentation has been disabled by default. You can enable using <code>OTEL_INSTRUMENTATION_SPRING_BOOT_ACTUATOR_AUTOCONFIGURE_ENABLED=true</code> or <code>-Dotel.instrumentation.spring-boot-actuator-autoconfigure.enabled=true</code>. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10394" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10394/hovercard">#10394</a>)
* Spring starter: removed support for the deprecated @io.opentelemetry.extension.annotations.WithSpan annotation. Use @io.opentelemetry.instrumentation.annotations.WithSpan annotation instead. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10530" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10530/hovercard">#10530</a>)

🌟 New javaagent instrumentation

* MyBatis framework instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10258" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10258/hovercard">#10258</a>)
* Finagle instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10141" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10141/hovercard">#10141</a>)

🌟 New library instrumentation

* Apache HttpClient 5 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10100" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10100/hovercard">#10100</a>)

📈 Enhancements

* Spring starter: add distro version resource attribute (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10276" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10276/hovercard">#10276</a>)
* Add context propagation for rector schedulers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10311" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10311/hovercard">#10311</a>)
* Spring starter: automatic addition of the OTel Logback appender (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10306" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10306/hovercard">#10306</a>)
* Spring starter: add resource detectors (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10277" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10277/hovercard">#10277</a>)
* Allow closing the observables for System and Process metrics gathered by OSHI (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10364" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10364/hovercard">#10364</a>)
* Spring starter: Allow to configure the OTel Logback appender from system properties (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10355" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10355/hovercard">#10355</a>)
* Spring starter: re-use sdk logic for configuring otlp exporters (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10292" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10292/hovercard">#10292</a>)
  * All available spring starter properties (including the new properties) can be found  
    <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/v2.1.0/instrumentation/spring/spring-boot-autoconfigure/src/main/resources/META-INF/additional-spring-configuration-metadata.json">here</a>
  * You can also use auto-completion in your IDE to see the available properties in  
    <code>application.properties</code> or <code>application.yml</code>
* Spring starter: add SystemOutLogRecordExporter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10420" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10420/hovercard">#10420</a>)
* Spring starter: use duration parser of config properties (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10512" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10512/hovercard">#10512</a>)
* Spring starter: support <code>otel.propagators</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10408" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10408/hovercard">#10408</a>)
* Set route only on the SERVER span (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10290" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10290/hovercard">#10290</a>)
* Convert Apache HttpClient 4.3 library instrumentation to "low-level" HTTP instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10253" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10253/hovercard">#10253</a>)

🛠️ Bug fixes

* Fix log replay of the Log4j 2 appender (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10243" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10243/hovercard">#10243</a>)
* Fix Netty addListener instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10254" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10254/hovercard">#10254</a>)
* Fix Calling shutdown() multiple times warning in spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10222" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10222/hovercard">#10222</a>)
* Correctly fix NPE in servlet AsyncListener (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10250" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10250/hovercard">#10250</a>)
* add @ConditionalOnMissingBean to LoggingMetricExporter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10283" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10283/hovercard">#10283</a>)
* Make Netty Instrumentation HttpServerRequestTracingHandler propagate "Channel Inactive" event to downstream according to parent contract (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10303" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10303/hovercard">#10303</a>)
* Improve rediscala instrumentation to address sporadic test failure (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10301" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10301/hovercard">#10301</a>)
* Undertow: restore attached context only when it is for different trace (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10336" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10336/hovercard">#10336</a>)
* Reactor kafka wrapper delegates to wrong method (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10333" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10333/hovercard">#10333</a>)
* Spring starter: add missing LoggingMetricExporterAutoConfiguration to spring factories (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10282" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10282/hovercard">#10282</a>)
* Spring starter: Fix MapConverter does not get initialized if some exporters are turned off (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10346" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10346/hovercard">#10346</a>)
* Update azure-core-tracing-opentelemetry version and fix double-collection for synchronous HTTP requests (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10350" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10350/hovercard">#10350</a>)
* Allow OSGI dynamic import for <code>io.opentelemetry</code> package when matching (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10385" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10385/hovercard">#10385</a>)
* Use direct peer address in <code>client.address</code> when X-Forwarded-For is not present (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10370" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10370/hovercard">#10370</a>)
* Netty: don't expose tracing handler in handlers map (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10410" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10410/hovercard">#10410</a>)
* Wrap request to avoid modifying attributes of the original request (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10389" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10389/hovercard">#10389</a>)
* Fix JarAnalyzer warnings on Payara (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10458" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10458/hovercard">#10458</a>)
* Return wrapped connection from <code>Statement.getConnection()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10554" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10554/hovercard">#10554</a>)
* Spring starter: Fix <code>otel.propagators</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10559" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10559/hovercard">#10559</a>)
* Populate <code>server.address</code> and <code>server.port</code> in Cassandra instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10357" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10357/hovercard">#10357</a>)

🧰 Tooling

* Allow multiple invokedynamic InstrumentationModules to share classloaders (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10015" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10015/hovercard">#10015</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlchemyDing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlchemyDing">@AlchemyDing</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cartersocha/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cartersocha">@cartersocha</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cbeneke/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cbeneke">@cbeneke</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codeboten/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codeboten">@codeboten</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dmarkwat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dmarkwat">@dmarkwat</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/elbiocaetano/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/elbiocaetano">@elbiocaetano</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hadesy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hadesy">@hadesy</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jakub-pomykala/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jakub-pomykala">@jakub-pomykala</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jonasrutishauser/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jonasrutishauser">@jonasrutishauser</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/KayWu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/KayWu">@KayWu</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kenfinnigan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kenfinnigan">@kenfinnigan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lichenglin/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lichenglin">@lichenglin</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lmolkova/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lmolkova">@lmolkova</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lukny/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lukny">@lukny</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/manikmagar/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/manikmagar">@manikmagar</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mmorel-35/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mmorel-35">@mmorel-35</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pellmont/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pellmont">@pellmont</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Periecle/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Periecle">@Periecle</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pmitura-lucid/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pmitura-lucid">@pmitura-lucid</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rgrochowicz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rgrochowicz">@rgrochowicz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rickardoberg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rickardoberg">@rickardoberg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Roiocam/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Roiocam">@Roiocam</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rvenancio/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rvenancio">@rvenancio</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shaykeren/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shaykeren">@shaykeren</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/theletterf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/theletterf">@theletterf</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

