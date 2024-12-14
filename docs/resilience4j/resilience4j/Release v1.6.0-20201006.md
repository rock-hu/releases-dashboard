# Release v1.6.0

## release on 20201006

## description

## changes

Enhancements

* RetryConfig.DEFAULT_MAX_ATTEMPTS should be public <a href="https://github.com/resilience4j/resilience4j/issues/1180" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1180/hovercard">#1180</a>
* Circuitbreaker doesn't open when nested TimeLimiter throws TimeOutCancellationException <a href="https://github.com/resilience4j/resilience4j/issues/1123" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1123/hovercard">#1123</a>
* Enhance Server Side Events <code>/circuitbreaker/events</code> <a href="https://github.com/resilience4j/resilience4j/issues/1076" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1076/hovercard">#1076</a>
* CallNotPermittedException should contain circuit breaker name (and possibly other information) <a href="https://github.com/resilience4j/resilience4j/issues/1062" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1062/hovercard">#1062</a>
* Retry: Exponential backoff with constant behaviour after certain time <a href="https://github.com/resilience4j/resilience4j/issues/1044" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1044/hovercard">#1044</a>
* Respecting the clock set in the CircuitBreakerStateMachine for detecting slow calls <a href="https://github.com/resilience4j/resilience4j/issues/734" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/734/hovercard">#734</a>

Bugs

* Circuit breaker stuck in HALF_OPEN state <a href="https://github.com/resilience4j/resilience4j/issues/935" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/935/hovercard">#935</a>
* Circuit breaker global fallback seems to not work when annotated method has more than 1 parameter <a href="https://github.com/resilience4j/resilience4j/issues/1174" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1174/hovercard">#1174</a>
* Timelimiter metrics not calculated when using resilince4j-kotlin <a href="https://github.com/resilience4j/resilience4j/issues/1168" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1168/hovercard">#1168</a>
* Problem with registering metrics for more than one circuit breaker <a href="https://github.com/resilience4j/resilience4j/issues/1131" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1131/hovercard">#1131</a>
* ConcurrentModificationException warning log while consuming events <a href="https://github.com/resilience4j/resilience4j/issues/1115" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1115/hovercard">#1115</a>
* CircuitBreakerConfig.Builder.waitDurationInOpenState() false documentation of when the function throws exception <a href="https://github.com/resilience4j/resilience4j/issues/1092" data-hovercard-type="issue" data-hovercard-url="/resilience4j/resilience4j/issues/1092/hovercard">#1092</a>

