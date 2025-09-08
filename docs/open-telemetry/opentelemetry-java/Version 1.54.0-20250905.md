# Version 1.54.0

## release on 20250905
## description
## changes
API

Baggage

* Fix guard against ArrayIndexOutOfBoundsException in BaggageCodec (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7239" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7239/hovercard">#7239</a>)

SDK

Metrics

* Fix MetricData.getDoubleSumData() ClassCastException with custom implementations (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7597" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7597/hovercard">#7597</a>)

Exporters

* Fix HttpExporterBuilder.copy() and GrpcExporterBuilder.copy() to preserve component loader (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7596" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7596/hovercard">#7596</a>)

Extensions

* Autoconfigure: Remove support for old EnvironmentResourceProvider package name (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7622" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7622/hovercard">#7622</a>)
* Declarative config: Add DeclarativeConfigurationProvider SPI (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7472" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7472/hovercard">#7472</a>)
* Declarative config: Pass meter provider to avoid using the global OpenTelemetry instance (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7475" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7475/hovercard">#7475</a>)

Project tooling

* Update to Gradle v9 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/7590" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/7590/hovercard">#7590</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/chengchen/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/chengchen">@chengchen</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/halasz-csaba/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/halasz-csaba">@halasz-csaba</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/opentelemetrybot/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/opentelemetrybot">@opentelemetrybot</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rlacksgus97/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rlacksgus97">@rlacksgus97</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/xiangtianyu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/xiangtianyu">@xiangtianyu</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

