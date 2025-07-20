# Version 2.18.0

## release on 20250718
## description
## changes
This release targets the OpenTelemetry SDK 1.52.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

🌟 New javaagent instrumentation

* Add initial instrumentation for OpenAI client (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14221" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14221/hovercard">#14221</a>)

🌟 New library instrumentation

* Add initial instrumentation for OpenAI client (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14221" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14221/hovercard">#14221</a>)

📈 Enhancements

* Implement stable semantic conventions for <code>code.*</code> attributes with opt-in support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13860" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13860/hovercard">#13860</a>)
* Add span kind configuration support for method instrumentation and declarative tooling (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14014" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14014/hovercard">#14014</a>)
* Add support for vendor-specific declarative configuration properties (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14016" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14016/hovercard">#14016</a>)
* Add auto-instrumentation support for AWS Secrets Manager SDK v1 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14027" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14027/hovercard">#14027</a>)
* Add <code>aws.sns.topic.arn</code> semantic convention support for AWS SNS SDK v1 and v2 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14035" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14035/hovercard">#14035</a>)
* Remove <code>thread.name</code> attribute from experimental JVM metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14061" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14061/hovercard">#14061</a>)
* Enhance and align Jetty JMX metrics with OpenTelemetry semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14067" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14067/hovercard">#14067</a>)
* Add support for latest spring-cloud-aws versions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14207" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14207/hovercard">#14207</a>)
* Add JDBC parameter capture support for <code>PreparedStatement.setObject()</code> method (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14219" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14219/hovercard">#14219</a>)
* Add <code>aws.lambda.resource.mapping.id</code> and experimental Lambda attributes for AWS Lambda SDK (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14229" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14229/hovercard">#14229</a>)
* Clear context class loader from OpenTelemetry internal threads to prevent leaks (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14241" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14241/hovercard">#14241</a>)

🛠️ Bug fixes

* Fix JDBC URL parser StringIndexOutOfBoundsException with malformed connection strings (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14151" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14151/hovercard">#14151</a>)
* Fix empty units in JMX state metrics definitions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14194" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14194/hovercard">#14194</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/atoulme/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/atoulme">@atoulme</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/garethedwards-tass/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/garethedwards-tass">@garethedwards-tass</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jadolgl/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jadolgl">@jadolgl</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhayes2-chwy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhayes2-chwy">@jhayes2-chwy</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lukeina2z/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lukeina2z">@lukeina2z</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PeterF778/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PeterF778">@PeterF778</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stevesea/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stevesea">@stevesea</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wl2027/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wl2027">@wl2027</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

