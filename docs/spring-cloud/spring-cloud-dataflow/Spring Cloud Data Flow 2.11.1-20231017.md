# Spring Cloud Data Flow 2.11.1

## release on 20231017

## description

## changes

Notable changes in 2.11.1

* Updated versions and mitigations for CVEs.
  * json-smart: 2.4.11
  * nimbus-jose-jwt: 9.31
  * snappy-java: 1.1.10.4
  * commons-compress: 1.24.0
* Ensure TaskOperations launch API is backwards compatible.
* Fix issues in dependency managements of modules after creating mono-repo

Dependent Projects and Compatibility

|              Component              |       Version       |
|-------------------------------------|---------------------|
| Spring Cloud Dataflow Build         | <code>2.11.1</code> |
| Spring Cloud Dataflow Common        | <code>2.11.1</code> |
| Spring Cloud Deployer               | <code>2.9.1</code>  |
| Spring Cloud Deployer Local         | <code>2.9.1</code>  |
| Spring Cloud Deployer CF            | <code>2.9.1</code>  |
| Spring Cloud Deployer K8S           | <code>2.9.1</code>  |
| Spring Cloud Common Security Config | <code>2.11.1</code> |
| Spring Cloud Skipper                | <code>2.11.1</code> |
| Spring Cloud Dataflow UI            | <code>3.4.1</code>  |
| Spring Cloud Dataflow               | <code>2.11.1</code> |

Issues

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1927121085" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5492" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5492/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5492">#5492</a> TaskOperations launch API is not backwards compatible

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1924736650" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5488" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5488/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5488">#5488</a> Update dependencies for latest CVEs

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1916072760" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5485" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5485/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5485">#5485</a> Add common-security-config modules to dependency management

Installer

The scripts for installing the Carvel package on Kubernetes and local development is <a href="https://github.com/spring-cloud/spring-cloud-dataflow/releases/download/v2.11.1/spring-cloud-dataflow-oss-install-2.11.1.zip">attached</a> below

