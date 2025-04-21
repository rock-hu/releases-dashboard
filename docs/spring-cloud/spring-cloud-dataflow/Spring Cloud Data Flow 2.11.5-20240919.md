# Spring Cloud Data Flow 2.11.5

## release on 20240919
## description
## changes
Dependent Projects and Compatibility

| Component | Version |
|--------------------------|---------|
| Spring Cloud Deployer | 2.9.5 |
| Spring Cloud Skipper | 2.11.5 |
| Spring Cloud Dataflow UI | 3.4.6 |
| Spring Cloud Dataflow | 2.11.5 |

Issues

* <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2397805404" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer/issues/465" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer/issues/465/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer/issues/465">spring-cloud/spring-cloud-deployer#465</a> Allow setting up more than one initContainer per platform
* <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2392438896" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer/issues/462" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer/issues/462/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer/issues/462">spring-cloud/spring-cloud-deployer#462</a> Node Selector doesn't get applied on K8s platforms
* <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2489765058" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5909" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5909/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5909">#5909</a> User should be able to set app version when creating schedule.
* <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2377556324" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5854" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5854/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5854">#5854</a> Task table prefix is not resolved correctly in CTR

🔨 Dependency Upgrades

* Spring Framework to 5.3.39
* Reactor to 2020.0.47
* Netty to 4.1.113.Final
* Tomcat to 9.0.93
* Snappy Java 1.1.10.6

What's Changed in Spring Cloud Dataflow and Skipper from v2.11.4 to v2.11.5

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2517320241" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5931" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5931/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5931">#5931</a> Update various dependencies patch versions <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/onobc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/onobc">@onobc</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2482961914" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5905" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5905/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5905">#5905</a> [CI] Remove actions that don't add value. <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/corneil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/corneil">@corneil</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2482960605" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5904" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5904/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5904">#5904</a> Update to 2.11.5-SNAPSHOT <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/corneil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/corneil">@corneil</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2448647385" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5887" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5887/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5887">#5887</a> Handle case where docker-compose executable is absent. <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/corneil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/corneil">@corneil</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2398368172" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5866" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5866/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5866">#5866</a> Update documentation for initContainers addition in spring-cloud-deployer <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/corneil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/corneil">@corneil</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2387219124" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5857" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5857/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5857">#5857</a> CTR needs to support boot property styles for the tablePrefix property <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cppwfs/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cppwfs">@cppwfs</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2377313691" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5852" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5852/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5852">#5852</a> Port download-apps.sh to macOs <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/cachescrubber/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/cachescrubber">@cachescrubber</a>  

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2303106458" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5817" data-hovercard-type="pull_request" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/pull/5817/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/pull/5817">#5817</a> Added verification of tasks/thinexecutions in DataflowOAuthIT. <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/corneil/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/corneil">@corneil</a>

<strong>Full Changelog</strong>: <a class="commit-link" href="https://github.com/spring-cloud/spring-cloud-dataflow/compare/v2.11.4...v2.11.5"><tt>v2.11.4...v2.11.5</tt></a>

