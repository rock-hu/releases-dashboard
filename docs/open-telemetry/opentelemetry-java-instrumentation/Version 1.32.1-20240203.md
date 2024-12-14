# Version 1.32.1

## release on 20240203

## description

## changes

This is a patch release on the previous 1.32.0 release, fixing the issue(s) below.

📈 Enhancements

* Backport: update jackson packages to v2.16.1 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10198" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10198/hovercard">#10198</a>, <a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10199" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10199/hovercard">#10199</a>)
* Backport: implement forEach support for aws sqs tracing list (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10195" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10195/hovercard">#10195</a>)
* Backport: Bridge metric advice in OpenTelemetry API 1.32 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10026" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10026/hovercard">#10026</a>)
* Update the OpenTelemetry SDK version to 1.34.1 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10320" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10320/hovercard">#10320</a>)

🛠️ Bug fixes

* Backport: Handle authority from request when HttpHost is null (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10204" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10204/hovercard">#10204</a>)
* Backport: Null check for nullable response object in aws sdk 1.1 instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10029" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10029/hovercard">#10029</a>)
* Backport: Make Netty Instrumentation HttpServerRequestTracingHandler propagate "Channel Inactive" event to downstream according to parent contract (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10303" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10303/hovercard">#10303</a>)
* Backport: Fix Netty addListener instrumentation (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10254" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10254/hovercard">#10254</a>)
* Backport: Update azure-core-tracing-opentelemetry version and fix sync suppression (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/10350" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/10350/hovercard">#10350</a>)

