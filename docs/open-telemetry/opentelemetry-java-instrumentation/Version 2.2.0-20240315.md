# Version 2.2.0

## release on 20240315

## description

## changes

This release targets the OpenTelemetry SDK 1.36.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

Migration notes

* Remove deprecated spring properties (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10454" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10454/hovercard">#10454</a>)

🌟 New javaagent instrumentation

* Add cloud resource detectors in javaagent, but keep them disabled by default (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10754" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10754/hovercard">#10754</a>)
* Add support for XXL-JOB (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10421" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10421/hovercard">#10421</a>)

📈 Enhancements

* Don't fill network peer for cassandra SniEndPoint (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10573" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10573/hovercard">#10573</a>)
* Spring boot starter: add service.version detection, improve service.name detection (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10457" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10457/hovercard">#10457</a>)
* Always create a JMS consumer span (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10604" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10604/hovercard">#10604</a>)
* Ability to disable the automatic Logback appender addition (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10629" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10629/hovercard">#10629</a>)
* Allow excluding all methods of a class (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10753" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10753/hovercard">#10753</a>)
* Preserve attribute type for logback key value pairs (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10781" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10781/hovercard">#10781</a>)
* Add instrumentation for graphql 20 that does not use deprecated methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10779" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10779/hovercard">#10779</a>)
* Capture http.route for pekko-http (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10799" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10799/hovercard">#10799</a>)
* Normalize SQL IN(?, ?, ...) statements to "in(?)" to reduce cardinality of db.statement attribute (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10564" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10564/hovercard">#10564</a>)
* Capture <code>db.operation</code> for CREATE/DROP/ALTER SQL statement (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10020" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10020/hovercard">#10020</a>)
* Ignore AWS Lambda Runtime internal handlers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10736" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10736/hovercard">#10736</a>)
* Spring use SDK autoconfig (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10453" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10453/hovercard">#10453</a>)
* Add manifest resource detector (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10621" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10621/hovercard">#10621</a>)
* Add instrumentation for jetty 12 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10575" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10575/hovercard">#10575</a>)
* add host.id resource provider (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10627" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10627/hovercard">#10627</a>)

🛠️ Bug fixes

* Don't fail spring application startup if sdk is disabled (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10602" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10602/hovercard">#10602</a>)
* Fix shading aws propagator (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10669" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10669/hovercard">#10669</a>)
* Disable http and rpc metrics when advice can not be applied (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10671" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10671/hovercard">#10671</a>)
* Fix native tests (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10685" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10685/hovercard">#10685</a>)
* Fix tomcat instrumentation when user includes wrong servlet api (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10757" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10757/hovercard">#10757</a>)
* Override xray trace header instead of appending (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10766" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10766/hovercard">#10766</a>)
* Fix spring boot starter failing without logback (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10802" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10802/hovercard">#10802</a>)
* Fix spring kafka context leak when batch listener is retried (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10741" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10741/hovercard">#10741</a>)
* Fix the logic to get container.id resource attribute (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10737" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10737/hovercard">#10737</a>)
* Configure kafka metrics reporter as class (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10855" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10855/hovercard">#10855</a>)
* Disable context propagation when virtual thread is switched to the carrier thread (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10854" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10854/hovercard">#10854</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bbakerman/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bbakerman">@bbakerman</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bjrara/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bjrara">@bjrara</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cleverchuk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cleverchuk">@cleverchuk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dalbani/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dalbani">@dalbani</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dmarkwat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dmarkwat">@dmarkwat</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/freshchen/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/freshchen">@freshchen</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gaeljw/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gaeljw">@gaeljw</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gdw2/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gdw2">@gdw2</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hatharom/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hatharom">@hatharom</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/heyams/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/heyams">@heyams</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson-verta/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson-verta">@jkwatson-verta</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/liurui-1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/liurui-1">@liurui-1</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Moscagus/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Moscagus">@Moscagus</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/paragniist/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/paragniist">@paragniist</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pmitura-lucid/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pmitura-lucid">@pmitura-lucid</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/qixiaogang/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/qixiaogang">@qixiaogang</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/samwright/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/samwright">@samwright</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/serkan-ozal/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/serkan-ozal">@serkan-ozal</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/swar8080/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/swar8080">@swar8080</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/theletterf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/theletterf">@theletterf</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tkramarczyk-vgw/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tkramarczyk-vgw">@tkramarczyk-vgw</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tylerbenson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tylerbenson">@tylerbenson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wangzlei/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wangzlei">@wangzlei</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

