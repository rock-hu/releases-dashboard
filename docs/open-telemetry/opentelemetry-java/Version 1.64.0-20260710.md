# Version 1.64.0

## release on 20260710
## description
## changes
API

* Fix <code>W3CBaggagePropagator</code> to allow empty baggage values per W3C spec (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8468" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8468/hovercard">#8468</a>)
* Fix baggage parsing for invalid percent-encoded members (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8480" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8480/hovercard">#8480</a>)

Incubating

* <strong>BREAKING</strong> Remove deprecated <code>InstrumentationConfigUtil.peerServiceMapping</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8542" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8542/hovercard">#8542</a>)
* Fix <code>EnvironmentGetter</code>/<code>EnvironmentSetter</code> to not enumerate or normalize carrier entries, and normalize empty names consistently (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8474" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8474/hovercard">#8474</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/8481" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8481/hovercard">#8481</a>)

SDK

Traces

* Add <code>BatchSpanProcessor.create(SpanExporter)</code> convenience factory to mirror <code>SimpleSpanProcessor.create(SpanExporter)</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8564" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8564/hovercard">#8564</a>)
* Fix <code>BatchSpanProcessor</code> benchmark aux counters (<code>exportedSpans</code>/<code>droppedSpans</code>) always reporting zero (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8539" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8539/hovercard">#8539</a>)

Metrics

* Fix <code>PooledHashMap</code> dropping live entries when an entry is removed during <code>forEach</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8499" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8499/hovercard">#8499</a>)
* Safely initialize exemplar reservoir storage in <code>FixedSizeExemplarReservoir</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8524" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8524/hovercard">#8524</a>)
* Use <code>failExceptionally</code> in <code>PeriodicMetricReader</code> when the exporter is busy (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8525" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8525/hovercard">#8525</a>)
* Only set <code>valuesRecorded</code> in <code>AggregatorHandle</code> when false (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8559" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8559/hovercard">#8559</a>)
* Use <code>volatile</code> instead of atomics in <code>Double</code>/<code>LongLastValueAggregator</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8560" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8560/hovercard">#8560</a>)
* Randomize per-thread recording order in metric benchmarks to avoid concurrency hotspots (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8550" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8550/hovercard">#8550</a>)

Logs

* Fix <code>BatchLogRecordProcessor</code> worker thread being killed by non-runtime exceptions (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8529" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8529/hovercard">#8529</a>)

Exporters

* <strong>BREAKING</strong> Prometheus: Drop deprecated <code>PrometheusMetricReader</code> constructors (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8541" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8541/hovercard">#8541</a>)
* OTLP: Reject host-less endpoints in <code>EndpointUtil.validateEndpoint</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8489" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8489/hovercard">#8489</a>)
* OTLP: Replace Jackson OTLP JSON serialization with a hand-rolled implementation (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8545" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8545/hovercard">#8545</a>)
* OTLP Profiles: Fix <code>OtlpGrpcProfileExporter</code> <code>toString</code> class name (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8492" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8492/hovercard">#8492</a>)
* Prometheus: Add translation strategy support (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8346" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8346/hovercard">#8346</a>)
* Prometheus: Fix serialization of array-valued scope and resource attributes to JSON strings (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8497" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8497/hovercard">#8497</a>)

Extensions

* <strong>BREAKING</strong> Declarative config: Move experimental types to internal package (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8530" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8530/hovercard">#8530</a>)
* Declarative config: Commit generated schema POJOs to git (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8408" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8408/hovercard">#8408</a>)
* Declarative config: Update to <code>opentelemetry-configuration</code> v1.1.0 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8451" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8451/hovercard">#8451</a>)
* Declarative config: Adjust POJO <code>toString</code>/<code>hashCode</code>/<code>equals</code> to match AutoValue semantics (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8526" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8526/hovercard">#8526</a>)
* Declarative config: Add ref descriptions to generated model classes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8540" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8540/hovercard">#8540</a>)
* Declarative config: Emit consistent <code>@JsonProperty</code> annotations on generated models (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8563" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8563/hovercard">#8563</a>)
* Declarative config: Remove duplicate resolver in <code>DeclarativeConfigPropertyUtil</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8579" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8579/hovercard">#8579</a>)

Project tooling

* Add configuration policy guidance (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8429" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8429/hovercard">#8429</a>)
* Exclude certain GitHub Actions from running on forks (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8466" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8466/hovercard">#8466</a>)
* Add guidance to prefer parameterized tests (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8469" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8469/hovercard">#8469</a>)
* Make benchmark path configurable (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/8557" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/8557/hovercard">#8557</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/abdessattar23/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/abdessattar23">@abdessattar23</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ADITYA-CODE-SOURCE/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ADITYA-CODE-SOURCE">@ADITYA-CODE-SOURCE</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/atoulme/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/atoulme">@atoulme</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/carlosalberto/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/carlosalberto">@carlosalberto</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dahyvuun/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dahyvuun">@dahyvuun</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Develop-KIM/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Develop-KIM">@Develop-KIM</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/EvgeniiR/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/EvgeniiR">@EvgeniiR</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/gfelbing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/gfelbing">@gfelbing</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jimbobbennett/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jimbobbennett">@jimbobbennett</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Kielek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Kielek">@Kielek</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kropptrevor/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kropptrevor">@kropptrevor</a>  

@opentelemetry-pr-dashboard  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pellared/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pellared">@pellared</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/psx95/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/psx95">@psx95</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/seongjun-rpls/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/seongjun-rpls">@seongjun-rpls</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/thswlsqls/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/thswlsqls">@thswlsqls</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Vcode2407/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Vcode2407">@Vcode2407</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vivekp14/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vivekp14">@vivekp14</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

