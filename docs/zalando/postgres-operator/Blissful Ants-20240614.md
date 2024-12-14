# Blissful Ants

## release on 20240614

## description

## changes

This is a bugfix release to the <code>1.12</code> version of the Postrges Operator. Thanks to everyone who gave feedback, raised issues or fixed bugs.

Fixes and enhancements

* use json tag for schema mapping of InfrastructureRole struct (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2345782862" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2659" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2659/hovercard" href="https://github.com/zalando/postgres-operator/pull/2659">#2659</a>)
* align base images in arm build pipeline with Docker images (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2352098859" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2663" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2663/hovercard" href="https://github.com/zalando/postgres-operator/pull/2663">#2663</a>)
* align dependencies in Makefile (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2328652715" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2647" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2647/hovercard" href="https://github.com/zalando/postgres-operator/pull/2647">#2647</a>)
* [UI] fix exec format error on ARM (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2352098859" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2663" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2663/hovercard" href="https://github.com/zalando/postgres-operator/pull/2663">#2663</a>, <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2330097708" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2649" data-hovercard-type="issue" data-hovercard-url="/zalando/postgres-operator/issues/2649/hovercard" href="https://github.com/zalando/postgres-operator/issues/2649">#2649</a>)
* [UI] use nodejs-lts instead of outdated alpine version to workaround permission issue with old npm version (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2335587873" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2653" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2653/hovercard" href="https://github.com/zalando/postgres-operator/pull/2653">#2653</a>)

Breaking changes

* removed helm chart version 1.10.0, 1.12.0 and 1.12.1 and only provide the last point release of each version (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2352846490" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/2664" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/2664/hovercard" href="https://github.com/zalando/postgres-operator/pull/2664">#2664</a>)

amd images:

<strong>Docker image</strong>: registry.opensource.zalan.do/acid/postgres-operator:v1.12.2

<strong>UI Docker image</strong>: registry.opensource.zalan.do/acid/postgres-operator-ui:v1.12.2

<strong>Logical Backup Docker image</strong>: registry.opensource.zalan.do/acid/logical-backup:v1.12.2

Multi-arch image (arm):

Postgres Operator: ghcr.io/zalando/postgres-operator:v1.12.2

UI: ghcr.io/zalando/postgres-operator-ui:v1.12.2

Logical Backup: ghcr.io/zalando/postgres-operator/logical-backup:v1.12.2

<strong>Default Spilo image</strong>: ghcr.io/zalando/spilo-16:3.2-p3

Thanks to our contributors: <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/macedigital/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/macedigital">@macedigital</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FxKu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FxKu">@FxKu</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/idanovinda/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/idanovinda">@idanovinda</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/hemakshis/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/hemakshis">@hemakshis</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Skoucail/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Skoucail">@Skoucail</a> <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/crkochan/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/crkochan">@crkochan</a>

