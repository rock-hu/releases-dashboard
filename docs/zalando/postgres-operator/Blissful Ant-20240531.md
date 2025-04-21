# Blissful Ant

## release on 20240531
## description
## changes
We are excited to announce yet another new release of the Postgres Operator. Thanks to everyone who contributed with PRs, feedback, raising issues or providing ideas.

New features

* New config option to prevent operator from removing secrets on cluster deletion (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2188565262" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2582" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2582/hovercard" href="https://github.com/zalando/postgres-operator/pull/2582">#2582</a>)
* New flag for volumes to specify subPath as an expression to include <a href="https://kubernetes.io/docs/concepts/storage/volumes/#using-subpath-expanded-environment" rel="nofollow">env variables</a> (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1968504518" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2463" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2463/hovercard" href="https://github.com/zalando/postgres-operator/pull/2463">#2463</a>, <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2315151451" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2638" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2638/hovercard" href="https://github.com/zalando/postgres-operator/pull/2638">#2638</a>)
* [UI] Allow scheduling constraints for UI deployment (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1716040947" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2326" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2326/hovercard" href="https://github.com/zalando/postgres-operator/pull/2326">#2326</a>)
* [LogicalBackup] make bucket prefix for logical backup configurable (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2243365420" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2609" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2609/hovercard" href="https://github.com/zalando/postgres-operator/pull/2609">#2609</a>)

Enhancements

* Apply template on all keys of OperatorConfiguration (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2242130213" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2608" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2608/hovercard" href="https://github.com/zalando/postgres-operator/pull/2608">#2608</a>)
* [UI] Removal of manual authentication for user login (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2308594255" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2635" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2635/hovercard" href="https://github.com/zalando/postgres-operator/pull/2635">#2635</a>)
* [UI] Centralized logging to eliminate logger errors in UI pod logs (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2326098382" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2645" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2645/hovercard" href="https://github.com/zalando/postgres-operator/pull/2645">#2645</a>)
* [LogicalBackup] re-use configured pod tolerations also for logical backup job pods (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1352943947" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2018" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2018/hovercard" href="https://github.com/zalando/postgres-operator/pull/2018">#2018</a>)
* [Helm] charts are using ARM images by default (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2307860042" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2634" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2634/hovercard" href="https://github.com/zalando/postgres-operator/pull/2634">#2634</a>)

Bugfixes

* Add missing json mapping to <code>infrastructure_roles_secrets</code> config option (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2326098382" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2645" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2645/hovercard" href="https://github.com/zalando/postgres-operator/pull/2645">#2645</a>)
* [Helm] fix creation of configuration when ConfigMap is used (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2189611572" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2584" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2584/hovercard" href="https://github.com/zalando/postgres-operator/pull/2584">#2584</a>)
* [Helm] add pdb_master_label_selector to helm chart and example manifests (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2211074931" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2595" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2595/hovercard" href="https://github.com/zalando/postgres-operator/pull/2595">#2595</a>)

Breaking Changes

* Dropped Helm charts for releases 1.8.0 and 1.8.1 (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2315566482" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2639" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2639/hovercard" href="https://github.com/zalando/postgres-operator/pull/2639">#2639</a>)

amd images:  

<strong>Docker image</strong>: registry.opensource.zalan.do/acid/postgres-operator:v1.12.0-dirty  

<strong>UI Docker image</strong>: registry.opensource.zalan.do/acid/postgres-operator-ui:v1.12.0  

<strong>Logical Backup Docker image</strong>: registry.opensource.zalan.do/acid/logical-backup:v1.12.0

Multi-arch image (arm):  

Postgres Operator: ghcr.io/zalando/postgres-operator:v1.12.0  

UI: ghcr.io/zalando/postgres-operator-ui:v1.12.0  

Logical Backup: ghcr.io/zalando/postgres-operator/logical-backup:v1.12.0

<strong>Default Spilo image</strong>: ghcr.io/zalando/spilo-16:3.2-p3

Thanks to our contributors: <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FxKu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FxKu">@FxKu</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/idanovinda/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/idanovinda">@idanovinda</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hughcapet/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hughcapet">@hughcapet</a>  

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/dmotte/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/dmotte">@dmotte</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/LordGaav/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/LordGaav">@LordGaav</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hemakshis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hemakshis">@hemakshis</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/duckhawk/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/duckhawk">@duckhawk</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/smutel/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/smutel">@smutel</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ThoreKr/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ThoreKr">@ThoreKr</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pratheekrebala/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pratheekrebala">@pratheekrebala</a>

