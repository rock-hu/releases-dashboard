# Version 1.58.0

## release on 20260109
## description
## changes
API

Incubator

* Delete GlobalConfigProvider in favor of access via ExtendedOpenTelemetry (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7914" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7914/hovercard">#7914</a>)
* Add DeclarativeConfigProperties#get method (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7923" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7923/hovercard">#7923</a>)
* Update ConfigProvider#getInstrumentationConfig response to be non-null (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7954" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7954/hovercard">#7954</a>)
* Add declarative config utility methods for common operations (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7927" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7927/hovercard">#7927</a>)

SDK

Traces

* Implement SDK metrics for trace (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7895" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7895/hovercard">#7895</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/7930" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7930/hovercard">#7930</a>)
* Emit warning when TraceIdRatioBasedSampler is used as child sampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7937" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7937/hovercard">#7937</a>)

Logs

* Implement SDK metrics for logs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7931" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7931/hovercard">#7931</a>)

Exporters

* Prom exporter update (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7934" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7934/hovercard">#7934</a>)

Extensions

* Declarative config: update to opentelemetry-configuration 1.0.0-rc.3 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7861" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7861/hovercard">#7861</a>)
* Declarative config: update jaeger remote sampler to require endpoint, initial_sampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7943" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7943/hovercard">#7943</a>)
* Declarative config: add support for view unit (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7942" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7942/hovercard">#7942</a>)
* Declarative config: add support for new logger config minimum_severity and trace_based properties (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7940" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7940/hovercard">#7940</a>)
* Declarative config: add support for composable parent threshold sampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7941" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7941/hovercard">#7941</a>)
* Declarative config: improve pattern for validating and loading SDK extension plugins (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7947" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7947/hovercard">#7947</a>)

Project tooling

* Use develocity build cache in PRs and local builds (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7906" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7906/hovercard">#7906</a>)
* Configure japicmp classpath to avoid false positives (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7945" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7945/hovercard">#7945</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Gosling-dude/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Gosling-dude">@Gosling-dude</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

