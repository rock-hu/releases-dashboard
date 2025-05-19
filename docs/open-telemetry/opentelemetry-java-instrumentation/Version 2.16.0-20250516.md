# Version 2.16.0

## release on 20250516
## description
## changes
This release targets the OpenTelemetry SDK 1.50.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning::warning: Breaking changes :warning::warning:

* Remove operation name from graphql span name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13794" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13794/hovercard">#13794</a>)
* Remove deprecated property for disabling kafka metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13803" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13803/hovercard">#13803</a>)

🌟 New javaagent instrumentation

* Add Avaje Jex Instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13733" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13733/hovercard">#13733</a>)

📈 Enhancements

* Add Gen AI support for additional models (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13682" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13682/hovercard">#13682</a>)
* Add JVM metrics to JMX instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13392" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13392/hovercard">#13392</a>)
* Add <code>jvm.file_descriptor.count</code> metric to JMX instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13722" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13722/hovercard">#13722</a>)
* Optimize lettuce argument splitter regex (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13736" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13736/hovercard">#13736</a>)
* Re-enable Agent Detection on z/OS (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13730" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13730/hovercard">#13730</a>)
* Add GC cause as an opt-in attribute on jvm GC related metric (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13750" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13750/hovercard">#13750</a>)
* Implement stable semconv for db connection pool metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13785" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13785/hovercard">#13785</a>)
* Add Cloud foundry resource provider (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13782" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13782/hovercard">#13782</a>)
* Add instrumentation for opensearch-rest-3.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13823" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13823/hovercard">#13823</a>)
* Run tests with jdk24 and 25-ea (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13824" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13824/hovercard">#13824</a>)
* Propagate context into CompletableFuture returned from aws2 async client methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13810" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13810/hovercard">#13810</a>)
* Added opt-in instrumentation for transaction commit/rollback in jdbc (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13709" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13709/hovercard">#13709</a>)
* Added experimental opt-in JDBC <code>db.query.parameter.&lt;key&gt;</code> span attributes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13719" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13719/hovercard">#13719</a>)
* Add tools support to bedrock InvokeModel instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13832" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13832/hovercard">#13832</a>)

🛠️ Bug fixes

* Fix instrumentation for ibm https url connection connect (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13728" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13728/hovercard">#13728</a>)
* Don't wrap null ResultSet in jdbc library instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13758" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13758/hovercard">#13758</a>)
* Fix NPE in netty 3.8 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13801" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13801/hovercard">#13801</a>)
* Fix ending server span with servlet async request (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13830" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13830/hovercard">#13830</a>)

🧰 Tooling

* Allow advice to define custom mappings (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13751" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13751/hovercard">#13751</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/AlixBa/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/AlixBa">@AlixBa</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/benjamin-confino/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/benjamin-confino">@benjamin-confino</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ezhang6811/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ezhang6811">@ezhang6811</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jannewulf/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jannewulf">@jannewulf</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lily-es/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lily-es">@lily-es</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/navidcs/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/navidcs">@navidcs</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ryanrupp/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ryanrupp">@ryanrupp</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/schmikei/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/schmikei">@schmikei</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SentryMan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SentryMan">@SentryMan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stillya/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stillya">@stillya</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tinnapat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tinnapat">@tinnapat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zhenlin-pay2/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zhenlin-pay2">@zhenlin-pay2</a>

