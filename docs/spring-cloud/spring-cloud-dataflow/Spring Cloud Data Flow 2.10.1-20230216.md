# Spring Cloud Data Flow 2.10.1

## release on 20230216

## description

## changes

Notable changes

Library updates

* Spring Boot <code>2.7.8</code>
* Spring Framework <code>5.3.25</code>
* Spring Shell <code>2.1.5</code>

Kubernetes

* Added ability to fully configure pod and container security contexts.
* Container security context is propagated to init container and additional containers.

Dependent Projects and Compatibility

|              Component              | Version |
|-------------------------------------|---------|
| Spring Cloud Dataflow Build         | 2.10.1  |
| Spring Cloud Dataflow Common        | 2.10.1  |
| Spring Cloud Deployer               | 2.8.1   |
| Spring Cloud Deployer Local         | 2.8.1   |
| Spring Cloud Deployer CF            | 2.8.1   |
| Spring Cloud Deployer K8S           | 2.8.1   |
| Spring Cloud Common Security Config | 1.8.1   |
| Spring Cloud Skipper                | 2.9.1   |
| Spring Cloud Dataflow UI            | 3.3.1   |
| Spring Cloud Dataflow               | 2.10.1  |

Issues

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1523648178" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow-build/issues/95" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow-build/issues/95/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow-build/issues/95">spring-cloud/spring-cloud-dataflow-build#95</a> Update spring-shell 2.1.5

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1487336732" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer-local/issues/219" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer-local/issues/219/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer-local/issues/219">spring-cloud/spring-cloud-deployer-local#219</a> maxConcurrentExecutionsReached() has a race-condition where multiple instances can start before it returns a result

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1479243902" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer-kubernetes/issues/512" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer-kubernetes/issues/512/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer-kubernetes/issues/512">spring-cloud/spring-cloud-deployer-kubernetes#512</a> Add support to configure SecurityContext/allowPrivilegeEscalation for the deployed containers

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1549880188" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow-ui/issues/1904" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow-ui/issues/1904/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow-ui/issues/1904">spring-cloud/spring-cloud-dataflow-ui#1904</a> Task executions status label

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1558298220" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5200" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5200/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5200">#5200</a> Clarify docs on extending classpath

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1554211767" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5194" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5194/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5194">#5194</a> Remove workaround for missing pivotal-cloudfoundry-client-reactor

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1553736232" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5193" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5193/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5193">#5193</a> Remove all uses of repo.spring.io/release (main)

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1550884938" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5191" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5191/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5191">#5191</a> Update to Spring Boot 2.7.8

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1549264777" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5188" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5188/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5188">#5188</a> Flyway error migrating from SCDF 2.9.5 to 2.10.0

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1538324910" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5187" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5187/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5187">#5187</a> AppRegistryCommands missing ApplicationType completion

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1532338489" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5184" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5184/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5184">#5184</a> As user I want to set <code>runAsGroup</code> property in podSecurityContext

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1532227142" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5183" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5183/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5183">#5183</a> Task execustion view report wrong status

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1520939036" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5174" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5174/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5174">#5174</a> dataflow.spring.io Batch related documentation issues

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1516703948" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5172" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5172/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5172">#5172</a> spring-cloud-dataflow-shell fails to parse kebab-case arguments

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1516081358" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5171" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5171/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5171">#5171</a> Misalignment of spring-security-oauth2-client versions in spring-cloud-dataflow-server module

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1514245556" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5170" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5170/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5170">#5170</a> Spring Batch run in K8S pod in SCDF fails to load MariaDB driver class

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1499509467" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5164" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5164/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5164">#5164</a> MySQL 5.7 not working w/ SCDF 2.10 when using config server

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1497424245" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5163" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5163/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5163">#5163</a> Documentation for 2.10.0 local SCDF still points to 2.10.0-SNAPSHOT for manual downloads

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1290297121" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4971" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4971/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4971">#4971</a> Deprecate Count attribute for Step History

