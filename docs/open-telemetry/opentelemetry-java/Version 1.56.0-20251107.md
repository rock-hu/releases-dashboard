# Version 1.56.0

## release on 20251107
## description
## changes
API

Incubator

* Support ExtendedOpenTelemetry in GlobalOpenTelemetry (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7799" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7799/hovercard">#7799</a>)

SDK

* Changes to MeterConfig, LoggerConfig, TracerConfig are guaranteed to be eventually visible (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7706" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7706/hovercard">#7706</a>)

Metrics

* Stabilize ExemplarFilter (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7768" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7768/hovercard">#7768</a>)
* Type specific exemplar reservoirs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7758" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7758/hovercard">#7758</a>)

Extensions

* SDK incubator: Add incubator ComposableRuleBasedSampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7787" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7787/hovercard">#7787</a>)
* SDK incubator: Add incubator ComposableAnnotatingSampler (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7804" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7804/hovercard">#7804</a>)
* SDK incubator: Rename ComposableTraceIdRatioBased to ComposableProbability (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7786" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7786/hovercard">#7786</a>)
* Declarative config: <strong>BREAKING</strong> Remove component provider generic type (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7606" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7606/hovercard">#7606</a>)
* Declarative config: Add declarative config support for ExemplarFilter (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7769" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7769/hovercard">#7769</a>)
* Declarative config: Fix a few declarative configuration bugs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7807" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7807/hovercard">#7807</a>)

Project tooling

* Move to oracle bare metal benchmark runner (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7740" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7740/hovercard">#7740</a>)
* Enable Develocity build scans (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7776" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7776/hovercard">#7776</a>)
* Document GPG signing key (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7783" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7783/hovercard">#7783</a>)
* Update build to use java 21 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7784" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7784/hovercard">#7784</a>)
* Sync repository-settings.md documentation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7791" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7791/hovercard">#7791</a>)
* Fix gradle deprecation warning (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7780" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7780/hovercard">#7780</a>)
* Small alignments of workflows across the 6 Java repos (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7806" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7806/hovercard">#7806</a>)
* Implement min java version gradle tooling from instrumentation repo (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7801" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7801/hovercard">#7801</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ThomasVitale/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ThomasVitale">@ThomasVitale</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/yogurtearl/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/yogurtearl">@yogurtearl</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

