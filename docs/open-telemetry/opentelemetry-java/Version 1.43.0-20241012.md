# Version 1.43.0

## release on 20241012

## description

## changes

API

* Add helper class to capture context using ScheduledExecutorService (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6712" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6712/hovercard">#6712</a>)
* Adds Baggage.getEntry(String key) (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6765" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6765/hovercard">#6765</a>)

Extensions

* Fix ottracepropagation for short span ids (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6734" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6734/hovercard">#6734</a>)

SDK

Metrics

* Optimize advice with FilteredAttributes (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6633" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6633/hovercard">#6633</a>)

Exporters

* Add experimental stdout log, metric, trace exporters for printing records to stdout in standard OTLP JSON format. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6675" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6675/hovercard">#6675</a>, <a href="https://github.com/open-telemetry/opentelemetry-java/pull/6750" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6750/hovercard">#6750</a>)
* Add Marshalers for profiling signal type (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6680" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6680/hovercard">#6680</a>)

Extensions

* Add <code>*Model</code> suffix to declarative config generated classes. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6721" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6721/hovercard">#6721</a>)
* Use autoconfigured ClassLoader to load declarative config (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6725" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6725/hovercard">#6725</a>)
* Update declarative config to use opentelemetry-configuration v0.3.0 (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6733" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6733/hovercard">#6733</a>)
* Add <code>StructuredConfigProperties#getStructured</code> default method, add <code>StructuredConfigProperties.empty()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6759" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6759/hovercard">#6759</a>)

Testing

* Add context info about wrong span or trace. (<a href="https://github.com/open-telemetry/opentelemetry-java/pull/6703" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java/pull/6703/hovercard">#6703</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ammachado/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ammachado">@ammachado</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codeboten/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codeboten">@codeboten</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jhalliday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jhalliday">@jhalliday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jkwatson/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jkwatson">@jkwatson</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/reta/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/reta">@reta</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shalk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shalk">@shalk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/smola/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/smola">@smola</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/stevesea/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/stevesea">@stevesea</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vasantteja/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vasantteja">@vasantteja</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/viveksing/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/viveksing">@viveksing</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wgy035/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wgy035">@wgy035</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

