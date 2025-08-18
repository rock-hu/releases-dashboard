# Version 2.19.0

## release on 20250817
## description
## changes
This release targets the OpenTelemetry SDK 1.53.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Align WildFly metrics with semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14208" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14208/hovercard">#14208</a>)
* Add streaming chat instrumentation for OpenAI SDK (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14271" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14271/hovercard">#14271</a>)
* Add OpenAI async client instrumentation support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14322" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14322/hovercard">#14322</a>)
* Add embeddings instrumentation for OpenAI client (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14353" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14353/hovercard">#14353</a>)
* Support OpenAI 3.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14423" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14423/hovercard">#14423</a>)

🛠️ Bug fixes

* Fix OpenTelemetryDataSource error when refresh configuration (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14255" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14255/hovercard">#14255</a>)
* Fix NPE when consuming Kafka messages with null headers (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14332" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14332/hovercard">#14332</a>)
* Fix RxJava context propagation for ObservableFromCallable (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14393" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14393/hovercard">#14393</a>)
* Avoid test failures on Spring Boot 4-m1 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14420" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14420/hovercard">#14420</a>)

🧰 Tooling

* Add support for extensions in attributesExtractors, contextCustomizers, operationListeners and spanNameExtractor (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13917" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13917/hovercard">#13917</a>)
* Add declarative config early initialization and property mapping support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14184" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14184/hovercard">#14184</a>)
* Add consistent exclusion of boot libraries (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14306" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14306/hovercard">#14306</a>)
* Build smoke-test-fake-backend Docker image for ARM64 architecture (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14387" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14387/hovercard">#14387</a>)
* Implement all JUL Logger methods in PatchLogger (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14409" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14409/hovercard">#14409</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Algieba4/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Algieba4">@Algieba4</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asweet-confluent/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asweet-confluent">@asweet-confluent</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/charlie-world/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/charlie-world">@charlie-world</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/copilot-pull-request-reviewer/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/copilot-pull-request-reviewer">@copilot-pull-request-reviewer</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/danielgblanco/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/danielgblanco">@danielgblanco</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/iNikem/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/iNikem">@iNikem</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kkz-01/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kkz-01">@kkz-01</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Munken/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Munken">@Munken</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiangtianyu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiangtianyu">@xiangtianyu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

