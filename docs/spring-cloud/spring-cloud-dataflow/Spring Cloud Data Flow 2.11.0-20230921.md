# Spring Cloud Data Flow 2.11.0

## release on 20230921

## description

## changes

Noteworthy

Spring Boot 3 Applications

* Adds support for Spring Boot 3.x based stream applications.
* Adds support for Spring Cloud Task 3.x based task applications.
* Adds support for Spring Batch 5.x based batch applications.

More info can be found in the <a href="https://docs.spring.io/spring-cloud-dataflow/docs/2.11.0/reference/htmlsingle/#appendix-boot3" rel="nofollow">Boot 3 Appendix</a>.

Library Updates

* Spring Boot 2.7.15
* Spring Cloud 2021.0.8

Kubernetes Update

* The long-awaited update of Kubernetes cronjobs from batch/v1beta -> batch/v1 which allows users to run Kubernetes >= 1.25.0.

Dependent Projects and Compatibility

|              Component              |       Version       |
|-------------------------------------|---------------------|
| Spring Cloud Dataflow Build         | <code>2.11.0</code> |
| Spring Cloud Dataflow Common        | <code>2.11.0</code> |
| Spring Cloud Deployer               | <code>2.9.0</code>  |
| Spring Cloud Deployer Local         | <code>2.9.0</code>  |
| Spring Cloud Deployer CF            | <code>2.9.0</code>  |
| Spring Cloud Deployer K8S           | <code>2.9.0</code>  |
| Spring Cloud Common Security Config | <code>2.11.0</code> |
| Spring Cloud Skipper                | <code>2.11.0</code> |
| Spring Cloud Dataflow UI            | <code>3.4.0</code>  |
| Spring Cloud Dataflow               | <code>2.11.0</code> |

Issues

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1789913968" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer/issues/399" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer/issues/399/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer/issues/399">spring-cloud/spring-cloud-deployer#399</a> Duplicate Kubernetes pod ids when tasks are launched at the same time

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1872838186" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow-ui/issues/1947" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow-ui/issues/1947/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow-ui/issues/1947">spring-cloud/spring-cloud-dataflow-ui#1947</a> App registration details panel not updating when switch between boot versions

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1866681214" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow-ui/issues/1946" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow-ui/issues/1946/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow-ui/issues/1946">spring-cloud/spring-cloud-dataflow-ui#1946</a> Spring Boot 3 / Batch 5: Job execution is empty although shown in DB

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1897567678" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5467" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5467/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5467">#5467</a> Default version is always used to pick the table prefixes

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1885388022" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5459" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5459/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5459">#5459</a> The task configured as boot2 application cannot be executed in <code>SCDF 2.11.0 RC1</code>.

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1882436203" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5456" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5456/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5456">#5456</a> Error Value too long for column "AUDIT_DATA CHARACTER VARYING(4000)

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1876130905" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5452" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5452/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5452">#5452</a> Sensitive data still displayed in audit dashboard

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1875612935" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5450" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5450/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5450">#5450</a> As a user I can easily tell that this repo is no longer active and now lives in the mono repo.

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1874151685" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5446" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5446/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5446">#5446</a> Add tests to the spring-cloud-dataflow-aggregate-task module

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1872815788" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5443" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5443/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5443">#5443</a> [Docs] Missing task 3.x coordinates in ref guide

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1870984198" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5442" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5442/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5442">#5442</a> Add num days option to task cleanup

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1870045067" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5441" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5441/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5441">#5441</a> SCDF 2.11.0-RC1 composed task runner documentation

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1869418520" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5439" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5439/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5439">#5439</a> LOB-Elements broken after migration with PostgreSQLTextToOID

