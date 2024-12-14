# Release v1.7.0

## release on 20210121

## description

## changes

Enhancements

* RateLimiter: Reduce RateLimiter memory footprint of high cardinality keys <a href="https://github.com/resilience4j/resilience4j/issues/1221" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1221/hovercard">#1221</a>
* CircuitBreaker: When waitDurationInOpenState and waitIntervalFunctionInOpenStat are used together, waitDurationInOpenState will be overridden <a href="https://github.com/resilience4j/resilience4j/issues/1214" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1214/hovercard">#1214</a>
* TimeLimiterAspect does not refresh static timeLimiterExecutorService on Spring context shutdown and restart <a href="https://github.com/resilience4j/resilience4j/issues/1203" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1203/hovercard">#1203</a>
* CircuitBreaker: Record a failure on result <a href="https://github.com/resilience4j/resilience4j/issues/384" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/384/hovercard">#384</a>
* Added support for Micronaut
* Updated Spring Boot from 2.3.0.RELEASE to 2.4.1
* Updated Reactor from 3.3.0.RELEASE to 3.4.0
* Updated Spring Cloud Context from 2.2.2.RELEASE to 3.0.0
* Updated Spring Framework from 5.2.6.RELEASE to 5.3.2
* Updated Spring Boot Open Feign from 2.2.2.RELEASE to 2.2.6.RELEASE
* Updated Kotlin Coroutines from 1.3.2 to 1.4.2
* Updated Dropwizard Metrics from 3.2.6 to 4.1.16
* Prevent the decoration of default methods in feign client <a href="https://github.com/resilience4j/resilience4j/pull/1245" data-hovercard-type="pull_request" data-hovercard-url="/resilience4j/resilience4j/pull/1245/hovercard">#1245</a>
* Added RateLimiter.drainPermissions method <a href="https://github.com/resilience4j/resilience4j/pull/1240" data-hovercard-type="pull_request" data-hovercard-url="/resilience4j/resilience4j/pull/1240/hovercard">#1240</a>
* Added failAfterMaxAttempts flag to RetryConfig and a new MaxRetriesExceededException <a href="https://github.com/resilience4j/resilience4j/pull/1293" data-hovercard-type="pull_request" data-hovercard-url="/resilience4j/resilience4j/pull/1293/hovercard">#1293</a>

Bugs

* NullPointerException requesting actuator metrics for retries using retryOnResult <a href="https://github.com/resilience4j/resilience4j/issues/1205" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1205/hovercard">#1205</a>
* CircuitBreakers events endpoint doesn't work after replacing instances at runtime <a href="https://github.com/resilience4j/resilience4j/issues/1116" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1116/hovercard">#1116</a>

