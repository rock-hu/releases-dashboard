# Version 2.15.0

## release on 20250410

## description

## changes

This release targets the OpenTelemetry SDK 1.49.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

📈 Enhancements

* Delete deprecated java http client classes (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13527" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13527/hovercard">#13527</a>)
* Support latest version of kafka client library (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13544" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13544/hovercard">#13544</a>)
* Implement genai events for bedrock (streaming) (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13507" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13507/hovercard">#13507</a>)
* JMX metrics support unit conversion (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13448" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13448/hovercard">#13448</a>)
* Rename experimental method, use Telemetry instead of Metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13574" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13574/hovercard">#13574</a>)
* End metric description with dot (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13559" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13559/hovercard">#13559</a>)
* Add initial gen_ai instrumentation of bedrock InvokeModel (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13547" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13547/hovercard">#13547</a>)
* Delete deprecated library instrumentation methods (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13575" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13575/hovercard">#13575</a>)
* Add experimental http client url.template attribute (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13581" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13581/hovercard">#13581</a>)
* Add <code>error.type</code> for JDBC under <code>otel.semconv-stability.opt-in</code> flag (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13331" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13331/hovercard">#13331</a>)
* Add azure resource provider (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13627" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13627/hovercard">#13627</a>)
* Remove <code>aws.endpoint</code> attribute from SQS instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13620" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13620/hovercard">#13620</a>)
* Avoid conflicts with user-defined Apache Dubbo filters with default order (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13625" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13625/hovercard">#13625</a>)
* Support filtering negative values from JMX metrics (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13589" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13589/hovercard">#13589</a>)
* Instrument bedrock InvokeModelWithResponseStream (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13607" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13607/hovercard">#13607</a>)
* Use context instead of request attributes for servlet async instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13493" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13493/hovercard">#13493</a>)
* Improve handling of quoted table names (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13612" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13612/hovercard">#13612</a>)

🛠️ Bug fixes

* Fix aws timeseries requests misdetected as dynamodb (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13579" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13579/hovercard">#13579</a>)
* Fix pekko route naming (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13491" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13491/hovercard">#13491</a>)
* Fix route handling when local root span wasn't created by instrumentation api (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13588" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13588/hovercard">#13588</a>)
* The <code>HostIdResourceProvider</code> should instantiate an <code>HostIdResource</code>, not an <code>HostResource</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13628" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13628/hovercard">#13628</a>)
* Fix OpenTelemetryPreparedStatement and the returned ResultSet.getStatement() do not match (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/13646" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13646/hovercard">#13646</a>)
* Fix Spring boot starter dependency resolution failure with Gradle and Java 11 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/issues/13384" data-hovercard-type="issue" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/issues/13384/hovercard">#13384</a>)
* Fix extremely large DB statements may cause memory leak (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/issues/13353" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/13353/hovercard">#13353</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/123liuziming/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/123liuziming">@123liuziming</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/alexgenon/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/alexgenon">@alexgenon</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/anuraaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/anuraaga">@anuraaga</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/codefromthecrypt/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/codefromthecrypt">@codefromthecrypt</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crossoverJie/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crossoverJie">@crossoverJie</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cyrille-leclerc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cyrille-leclerc">@cyrille-leclerc</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hannahchan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hannahchan">@hannahchan</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/MarcusDunn/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/MarcusDunn">@MarcusDunn</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/masonedmison/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/masonedmison">@masonedmison</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/railsharipov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/railsharipov">@railsharipov</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/samwright/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/samwright">@samwright</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/shaokeyibb/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/shaokeyibb">@shaokeyibb</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/victor-noel-pfx/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/victor-noel-pfx">@victor-noel-pfx</a>

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

