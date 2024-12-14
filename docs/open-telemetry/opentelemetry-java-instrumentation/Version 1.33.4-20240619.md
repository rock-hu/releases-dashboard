# Version 1.33.4

## release on 20240619

## description

## changes

This is a patch release on the previous 1.33.3 release, fixing the issue(s) below.

📈 Enhancements

* Backport: Undertow, run response customizer on all ServerConnection implementations (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11548" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11548/hovercard">#11548</a>)
* Backport: Improve security manager support (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11606" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11606/hovercard">#11606</a>)
* Backport: Update the OpenTelemetry SDK version to 1.39.0 (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11603" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11603/hovercard">#11603</a>)

🛠️ Bug fixes

* Backport: Avoid NullPointerException when JMS destination is not available (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11577" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11577/hovercard">#11577</a>)
* Backport: Fix Spring Kafka instrumentation closing the trace too early (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11592" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11592/hovercard">#11592</a>)
* Backport: Fix gRPC instrumentation adding duplicates to metadata instead of overwriting (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11604" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11604/hovercard">#11604</a>)
* Backport: Fix request header capture corrupting tomcat request (<a href="https://github.com/open-telemetry/opentelemetry-java-instrumentation/pull/11607" data-hovercard-type="pull_request" data-hovercard-url="/open-telemetry/opentelemetry-java-instrumentation/pull/11607/hovercard">#11607</a>)

