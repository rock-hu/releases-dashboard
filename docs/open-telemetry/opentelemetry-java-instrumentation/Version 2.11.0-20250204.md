# Version 2.11.0

## release on 20250204

## description

## changes

This release targets the OpenTelemetry SDK 1.45.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

In preparation for stabilizing HTTP library instrumentation soon:

* <code>addAttributeExtractor</code> methods in a few <code>*TelemetryBuilder</code> classes have been deprecated and renamed to <code>addAttributesExtractor</code> (which is how most of them were named already) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12860" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12860/hovercard">#12860</a>)
* <code>setEmitExperimental*</code> methods in <code>*TelemetryBuilder</code> classes have been deprecated and moved to internal/experimental classes, see Javadoc <code>@deprecated</code> for exact relocation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12847" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12847/hovercard">#12847</a>)
* <code>ApacheHttpClient5*</code> classes have been deprecated and renamed to <code>ApacheHttpClient*</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12854" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12854/hovercard">#12854</a>)
* <code>RatpackTelemetry*</code> classes have been deprecated and split into <code>RatpackClientTelemetry*</code> and <code>RatpackServerTelemetry*</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12853" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12853/hovercard">#12853</a>)
* <code>SpringWebfluxTelemetry*</code> classes have been deprecated and split into <code>SpringWebfluxClientTelemetry*</code> and <code>SpringWebfluxServerTelemetry*</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12852" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12852/hovercard">#12852</a>)
* <code>ArmeriaTelemetry*</code> classes have been deprecated and split into <code>ArmeriaClientTelemetry*</code> and <code>ArmeriaServerTelemetry*</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12851" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12851/hovercard">#12851</a>)
* <code>*KtorClientTracing*</code> and <code>*KtorServerTracing*</code> have been deprecated and renamed to <code>*KtorClientTelemetry*</code> and <code>*KtorServerTelemetry*</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12855" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12855/hovercard">#12855</a>)
* Experimental opt-in attribute <code>spring-webflux.handler.type</code> was removed in favor of standard <code>code.*</code> attributes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12887" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12887/hovercard">#12887</a>)

📈 Enhancements

* Map lettuce 5.1 <code>db.namespace</code> to <code>db.name</code> (unless using experimental database semconv stability opt-in) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12609" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12609/hovercard">#12609</a>)
* Log4j2: add option to fill code attributes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12592" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12592/hovercard">#12592</a>)
* Fill jvm.thread.state attribute for jvm.thread.count metric on jdk8 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12724" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12724/hovercard">#12724</a>)
* Update Spring Scheduling <code>code.*</code> attribute extraction for latest release of Spring Scheduling (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12739" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12739/hovercard">#12739</a>)
* Add jctools classes to <code>reflect-config.json</code> for better native image support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12736" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12736/hovercard">#12736</a>)
* Support Pulsar Client send message with transaction (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12731" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12731/hovercard">#12731</a>)
* Implement reading of simple key-value Logstash JSON Marker attributes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12513" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12513/hovercard">#12513</a>)
* Add agent instrumentation for Ratpack 1.7+ (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12572" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12572/hovercard">#12572</a>)
* Added <code>spring-scheduling.enabled</code> property to spring-configuration-metadata.json (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12791" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12791/hovercard">#12791</a>)
* Remove class files from spring-boot-autoconfigure source jar (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12798" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12798/hovercard">#12798</a>)
* Updated Camel rules adding route.started, route.added, and thread pools' pool.core_size (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12763" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12763/hovercard">#12763</a>)
* Add database client metrics (when using experimental database semconv stability opt-in) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12806" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12806/hovercard">#12806</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12818" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12818/hovercard">#12818</a>)
* Add dynamodb instrumenter for aws v1_11 sdk (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12756" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12756/hovercard">#12756</a>)
* Remove public suffixes list from the agent (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10763" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10763/hovercard">#10763</a>)
* Add an option to disable automatic kafka interceptor configuration in spring starter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12833" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12833/hovercard">#12833</a>)
* Add code attributes to spring webmvc controller spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12839" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12839/hovercard">#12839</a>)
* Hibernate 6: don't record error on NoResultException (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12879" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12879/hovercard">#12879</a>)
* Add support for missing spring list properties (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12819" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12819/hovercard">#12819</a>)
* Ktor: support setting custom <code>spanNameExtractor</code> (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2724665912" data-permission-text="Title is private" data-url="https://github.com/open-telemetry/opentelemetry-java-instrumentation/issues/12842" data-hovercard-type="issue" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/issues/12842/hovercard" href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/issues/12842">#12842</a>) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12850" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12850/hovercard">#12850</a>)
* Rename "db.client.connections.usage" to "db.client.connection.count" (when using experimental database semconv stability opt-in) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12886" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12886/hovercard">#12886</a>)
* Support Struts 7.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12935" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12935/hovercard">#12935</a>)
* Support latest Ktor release (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12937" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12937/hovercard">#12937</a>)

🛠️ Bug fixes

* Logback: don't make MDCPropertyMap of logging event immutable (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12718" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12718/hovercard">#12718</a>)
* Avoid exception when redisson address is null (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12883" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12883/hovercard">#12883</a>)
* Add close to fix CWE-404 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/12908" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/12908/hovercard">#12908</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/akats7/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/akats7">@akats7</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/andrewj2048/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/andrewj2048">@andrewj2048</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/austinlparker/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/austinlparker">@austinlparker</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/coderzc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/coderzc">@coderzc</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cuichenli/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cuichenli">@cuichenli</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dao-jun/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dao-jun">@dao-jun</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/howan36/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/howan36">@howan36</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jackshirazi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jackshirazi">@jackshirazi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/johnrengelman/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/johnrengelman">@johnrengelman</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/KimDoubleB/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/KimDoubleB">@KimDoubleB</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kuisathaverat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kuisathaverat">@kuisathaverat</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/larryluogit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/larryluogit">@larryluogit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/luigidemasi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/luigidemasi">@luigidemasi</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/micd/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/micd">@micd</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nityanandagohain/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nityanandagohain">@nityanandagohain</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/oldium/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/oldium">@oldium</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sam9291/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sam9291">@sam9291</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SIMULATAN/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SIMULATAN">@SIMULATAN</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/the-vj/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/the-vj">@the-vj</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

