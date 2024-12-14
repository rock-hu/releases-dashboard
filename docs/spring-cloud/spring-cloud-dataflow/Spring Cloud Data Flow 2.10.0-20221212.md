# Spring Cloud Data Flow 2.10.0

## release on 20221212

## description

## changes

Notable changes

Spring updates

Updates to the following versions:

* Spring Boot <code>2.7.6</code>
* Spring Framework <code>5.3.24</code>
* Spring Cloud <code>2021.0.5</code>

Spring Shell

Spring Shell has been updated to <a href="https://github.com/spring-projects/spring-shell/releases/tag/v2.1.4">2.1.4</a>.

Documentation Updates

Container images for ARM.

Spring Cloud Data Flow and Skipper, and Stream Application projects contain scripts to use in creating containers when running on an ARM platform. The <a href="https://docs.spring.io/spring-cloud-dataflow/docs/current/reference/htmlsingle/#create-containers" rel="nofollow">Reference Guide</a> has a section describing the use of the scripts.

Scripts for local Kuberenetes Development

We have added a collection of scripts to the Spring Cloud Data Flow that makes it easy to launch a local Kuberenetes cluster and install SCDF with MariaDB and RabbitMQ or Kafka. See the <a href="https://docs.spring.io/spring-cloud-dataflow/docs/current/reference/htmlsingle/#local-k8s-development" rel="nofollow">Reference Guide</a> for more info.

Dependent Projects and Compatibility

|              Component              | Version |
|-------------------------------------|---------|
| Spring Cloud Dataflow Build         | 2.10.0  |
| Spring Cloud Dataflow Common        | 2.10.0  |
| Spring Cloud Deployer               | 2.8.0   |
| Spring Cloud Deployer Local         | 2.8.0   |
| Spring Cloud Deployer CF            | 2.8.0   |
| Spring Cloud Deployer K8S           | 2.8.0   |
| Spring Cloud Common Security Config | 1.8.0   |
| Spring Cloud Skipper                | 2.9.0   |
| Spring Cloud Dataflow UI            | 3.3.0   |
| Spring Cloud Dataflow               | 2.10.0  |

Issues

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1484102830" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow-build/issues/93" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow-build/issues/93/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow-build/issues/93">spring-cloud/spring-cloud-dataflow-build#93</a> Update spring-shell 2.1.4

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1319782976" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer-kubernetes/issues/503" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer-kubernetes/issues/503/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer-kubernetes/issues/503">spring-cloud/spring-cloud-deployer-kubernetes#503</a> Improve documentation on kuberenetes deployment properites

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1239626429" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-deployer-kubernetes/issues/494" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-deployer-kubernetes/issues/494/hovercard" href="https://github.com/spring-cloud/spring-cloud-deployer-kubernetes/issues/494">spring-cloud/spring-cloud-deployer-kubernetes#494</a> Support for concurrency policy of a Job Schedule

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1466611583" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-skipper/issues/1068" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-skipper/issues/1068/hovercard" href="https://github.com/spring-cloud/spring-cloud-skipper/issues/1068">spring-cloud/spring-cloud-skipper#1068</a> Ensure reference doc is up-to-date and valid

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1484050807" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5161" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5161/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5161">#5161</a> Shell fails with stream deploy using properties

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1468346635" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5151" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5151/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5151">#5151</a> Review outstanding issues for dataflow.spring.io

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1407969388" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5113" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5113/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5113">#5113</a> Obtain OSM license for SCDF PRO

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1399673688" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5108" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5108/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5108">#5108</a> Support for TAS 3.0

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1366812237" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5083" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/5083/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/5083">#5083</a> Communicate best practice for extending the classpath of Dataflow/Skipper

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1271080206" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4946" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4946/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4946">#4946</a> Revisit shell changes

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1266015810" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4944" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4944/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4944">#4944</a> Arm64 docker images for Apple M1 usage

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1140048093" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4830" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4830/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4830">#4830</a> spring cloud dataflow launch task on other the kubernetes cluster

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1124372320" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4807" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4807/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4807">#4807</a> Ensure reference doc is up-to-date and valid

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1090778131" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4792" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4792/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4792">#4792</a> Update K8s compatibility in test-plan and docs

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1072065666" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4780" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4780/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4780">#4780</a> Add to docker-compose install docs info on env-vars and ssl.

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1071471181" data-permission-text="Title is private" data-url="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4779" data-hovercard-type="issue" data-hovercard-url="/spring-cloud/spring-cloud-dataflow/issues/4779/hovercard" href="https://github.com/spring-cloud/spring-cloud-dataflow/issues/4779">#4779</a> Issue with MariaDB when using skipper-deployment.yaml

