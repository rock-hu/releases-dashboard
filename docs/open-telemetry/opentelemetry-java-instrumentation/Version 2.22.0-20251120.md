# Version 2.22.0

## release on 20251120
## description
## changes
This release targets the OpenTelemetry SDK 1.56.0.

Note that many artifacts have the <code>-alpha</code> suffix attached to their version number, reflecting that they are still alpha quality and will continue to have breaking changes. Please see the <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/blob/main/VERSIONING.md#opentelemetry-java-instrumentation-versioning">VERSIONING.md</a> for more details.

:warning: Breaking Changes

* AWS SDK 2.x attributes updated to align with semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15028" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15028/hovercard">#15028</a>) - The following attributes have been renamed: - <code>aws.bucket.name</code> (S3) → <code>aws.s3.bucket</code> - <code>aws.queue.url</code> (SQS) → <code>aws.sqs.queue.url</code> - <code>aws.stream.name</code> (Kinesis) → <code>aws.kinesis.stream_name</code> - <code>aws.table.name</code> (DynamoDB) → <code>aws.dynamodb.table_names</code> - <code>aws.dynamodb.provisioned_throughput.read_capacity_units</code> → <code>aws.dynamodb.provisioned_read_capacity</code> (type changed from long to double) - <code>aws.dynamodb.provisioned_throughput.write_capacity_units</code> → <code>aws.dynamodb.provisioned_write_capacity</code> (type changed from long to double) - <code>aws.dynamodb.exclusive_start_table_name</code> → <code>aws.dynamodb.exclusive_start_table</code> - <code>aws.dynamodb.projection_expression</code> → <code>aws.dynamodb.projection</code> - <code>aws.dynamodb.scan_index_forward</code> → <code>aws.dynamodb.scan_forward</code> - The following attribute types have changed: - <code>aws.dynamodb.table_names</code>: string → string[] - <code>aws.dynamodb.consumed_capacity</code>: string → string[] - <code>aws.dynamodb.global_secondary_indexes</code>: string → string[] - <code>aws.dynamodb.local_secondary_indexes</code>: string → string[] - <code>aws.dynamodb.consistent_read</code>: string → boolean - <code>aws.dynamodb.table_count</code>: string → long - <code>aws.dynamodb.limit</code>: string → long - <code>aws.dynamodb.attributes_to_get</code>: string → string[] - <code>aws.dynamodb.segment</code>: string → long - <code>aws.dynamodb.total_segments</code>: string → long - <code>aws.dynamodb.count</code>: string → long - <code>aws.dynamodb.scanned_count</code>: string → long - The following attributes are no longer emitted by default but can be enabled with <code>otel.instrumentation.aws-sdk.experimental-span-attributes=true</code>: - <code>aws.queue.name</code> (SQS) - <code>aws.lambda.function.name</code> (Lambda) - <code>aws.lambda.function.arn</code> (Lambda)
* JDBC library data source instrumentation now disabled by default (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15074" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15074/hovercard">#15074</a>)
* JMX state metrics unit changed from empty string to <code>1</code> to align with semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15093" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15093/hovercard">#15093</a>)
* AWS SDK 1.x attributes updated to align with semantic conventions (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15094" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15094/hovercard">#15094</a>) - Only affects users with <code>otel.instrumentation.aws-sdk.experimental-span-attributes=true</code> - The following attributes have been renamed and are now emitted by default (no experimental flag required): - <code>aws.bucket.name</code> (S3) → <code>aws.s3.bucket</code> - <code>aws.queue.url</code> (SQS) → <code>aws.sqs.queue.url</code> - <code>aws.stream.name</code> (Kinesis) → <code>aws.kinesis.stream_name</code> - <code>aws.table.name</code> (DynamoDB) → <code>aws.dynamodb.table_names</code>
* Finatra controller spans now disabled by default to match other controller spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15118" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15118/hovercard">#15118</a>)
* Netty HTTP request wrapper class renamed from HttpRequestAndChannel to NettyRequest (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15247" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15247/hovercard">#15247</a>)
* JSP compile spans now disabled by default to match other view spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15261" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15261/hovercard">#15261</a>)

🚫 Deprecations

* TracingConsumerInterceptor and TracingProducerInterceptor deprecated in favor of new configurable interceptors (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14929" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14929/hovercard">#14929</a>)
* Various builder methods updated to use UnaryOperator instead of Function<X, X> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15101" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15101/hovercard">#15101</a>)
* DbClientCommonAttributesGetter deprecated in favor of DbClientAttributesGetter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15139" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15139/hovercard">#15139</a>)

🌟 New javaagent instrumentation

* Add JFinal instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15216" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15216/hovercard">#15216</a>)

📈 Enhancements

* Avoid Unsafe usage on Java 23+ (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14855" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14855/hovercard">#14855</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15091" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15091/hovercard">#15091</a>)
* Update Azure SDK instrumentation so <code>az.namespace</code> can be used for sampling (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15068" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15068/hovercard">#15068</a>)
* Spring Boot Starter: Add cache to reduce environment variable lookups (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15132" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15132/hovercard">#15132</a>)
* HTTP instrumentations now emit semantic convention schema URL (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15144" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15144/hovercard">#15144</a>)
* Added instrumentation support for AsyncHttpClient version 1.8 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15195" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15195/hovercard">#15195</a>)
* Instrumenter customizer now receives instrumentation type (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15227" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15227/hovercard">#15227</a>)
* Added support for Spring Framework 7.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15287" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15287/hovercard">#15287</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15299" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15299/hovercard">#15299</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15301" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15301/hovercard">#15301</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15304" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15304/hovercard">#15304</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15311" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15311/hovercard">#15311</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15362" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15362/hovercard">#15362</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15371" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15371/hovercard">#15371</a>)
* Added span status customizer to incubating InstrumenterCustomizer API (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15288" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15288/hovercard">#15288</a>)
* Added configuration options for sqlcommenter (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15169" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15169/hovercard">#15169</a>)
* GraphQL instrumentation now records data fetcher errors (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15289" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15289/hovercard">#15289</a>)
* Add http client url template customizer (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15217" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15217/hovercard">#15217</a>)
* Introduce idiomatic <code>JmxTelemetry</code> API for JMX metrics library (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15220" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15220/hovercard">#15220</a>)
* Add instrumentation for OpenTelemetry API incubator's <code>ExtendedOpenTelemetry</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15178" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15178/hovercard">#15178</a>)

🛠️ Bug fixes

* Fix missing <code>peer.service</code> in Netty HTTP spans (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14963" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14963/hovercard">#14963</a>)
* Fix Couchbase span kind to be <code>CLIENT</code> instead of <code>INTERNAL</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/14995" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/14995/hovercard">#14995</a>)
* Link attributes are now bridged to the Java agent when using OpenTelemetry API (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15143" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15143/hovercard">#15143</a>)
* Potential race condition in JFR runtime metrics initialization fixed (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15231" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15231/hovercard">#15231</a>)
* Regression fixed related to context propagation when using Spring <code>@EnableAsync</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15249" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15249/hovercard">#15249</a>)
* Declarative configuration now uses snake_case for distro resource provider attribute name (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15260" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15260/hovercard">#15260</a>)
* Logback appender fixed to capture Logstash <code>StructuredArguments.entries()</code> (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15341" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15341/hovercard">#15341</a>)
* Fix context propagation in Spring WebFlux 7.0 client reactive callbacks (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/15336" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/15336/hovercard">#15336</a>)

🙇 Thank you

This release was possible thanks to the following contributors who shared their brilliant ideas and awesome pull requests:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/bioplasticlining/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/bioplasticlining">@bioplasticlining</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/breedx-splk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/breedx-splk">@breedx-splk</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/brunobat/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/brunobat">@brunobat</a>  

<a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/copilot-pull-request-reviewer/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/copilot-pull-request-reviewer">@copilot-pull-request-reviewer</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/defields923/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/defields923">@defields923</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dixanms/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dixanms">@dixanms</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jack-berg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jack-berg">@jack-berg</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jaydeluca/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jaydeluca">@jaydeluca</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jeanbisutti/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jeanbisutti">@jeanbisutti</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/JonasKunz/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/JonasKunz">@JonasKunz</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/kasiditi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/kasiditi">@kasiditi</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/koksay/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/koksay">@koksay</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Kresshy/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Kresshy">@Kresshy</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/laurit/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/laurit">@laurit</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LikeTheSalad/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LikeTheSalad">@LikeTheSalad</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/lukaszgryglicki/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/lukaszgryglicki">@lukaszgryglicki</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mateuszrzeszutek/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mateuszrzeszutek">@mateuszrzeszutek</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mlbiscoc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mlbiscoc">@mlbiscoc</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mznet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mznet">@mznet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/PaarthB/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/PaarthB">@PaarthB</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pepeshore/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pepeshore">@pepeshore</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/roberttoyonaga/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/roberttoyonaga">@roberttoyonaga</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/robsunday/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/robsunday">@robsunday</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/steverao/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/steverao">@steverao</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SylvainJuge/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SylvainJuge">@SylvainJuge</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tharsanrp/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tharsanrp">@tharsanrp</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/trask/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/trask">@trask</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/vasireddy99/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/vasireddy99">@vasireddy99</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/wyctxwd1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/wyctxwd1">@wyctxwd1</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/zeitlinger/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/zeitlinger">@zeitlinger</a>

