# Version 2.33.0

## release on 20261023
## description
## changes
This release targets the OpenTelemetry SDK 1.67.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they will continue to have breaking changes. Please see <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Update the OpenTelemetry SDK version to 1.67.0. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/20598" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/20598/hovercard">#20598</a>)

🛠️ Bug fixes

* Preserve repeated baggage header values when extracting context through the Java agent's OpenTelemetry API bridge. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/20598" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/20598/hovercard">#20598</a>)
* Avoid converting lists and maps to strings in Spring Boot declarative configuration. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/20598" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/20598/hovercard">#20598</a>)
* Improve SQL parsing. (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/20864" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/20864/hovercard">#20864</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ishg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ishg">@ishg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jamesylgan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jamesylgan">@jamesylgan</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/safris/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/safris">@safris</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

