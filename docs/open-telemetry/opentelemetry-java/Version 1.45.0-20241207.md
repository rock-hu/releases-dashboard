# Version 1.45.0

## release on 20241207
## description
## changes
API

* Add convenience method <code>setAttribute(Attribute&lt;Long&gt;, int)</code> to SpanBuilder (matching the existing convenience method in Span) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6884" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6884/hovercard">#6884</a>)
* Extends TextMapGetter with experimental GetAll() method, implement usage in W3CBaggagePropagator (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6852" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6852/hovercard">#6852</a>)

SDK

Traces

* Add synchronization to SimpleSpanProcessor to ensure thread-safe export of spans (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6885" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6885/hovercard">#6885</a>)

Metrics

* Lazily initialize ReservoirCells (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6851" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6851/hovercard">#6851</a>)

Logs

* Add synchronization to SimpleLogRecordProcessor to ensure thread-safe export of logs (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6885" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6885/hovercard">#6885</a>)

Exporters

* OTLP: Update opentelementry-proto to 1.4 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6906" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6906/hovercard">#6906</a>)
* OTLP: Rename internal Marshaler#writeJsonToGenerator method to allow jackson runtimeOnly dependency (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6896" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6896/hovercard">#6896</a>)
* OTLP: Fix repeated string serialization for JSON. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6888" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6888/hovercard">#6888</a>)
* OTLP: Fix missing unsafe available check (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6920" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6920/hovercard">#6920</a>)

Extensions

* Declarative config: Don't require empty objects when referencing custom components (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6891" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6891/hovercard">#6891</a>)

Tooling

* Add javadoc boilerplate internal comment v2 for experimental classes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6886" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6886/hovercard">#6886</a>)
* Update develocity configuration (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6903" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6903/hovercard">#6903</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/asafm/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/asafm">@asafm</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/edma2/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/edma2">@edma2</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/io7m/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/io7m">@io7m</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jamesmoessis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jamesmoessis">@jamesmoessis</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jsuereth/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jsuereth">@jsuereth</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ravi-nagendran/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ravi-nagendran">@ravi-nagendran</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/slodha/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/slodha">@slodha</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Stoyas/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Stoyas">@Stoyas</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

