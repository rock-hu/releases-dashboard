# Gracious Iguanidae

## release on 20220802

## description

## changes

This is a very small bugfix release to the <code>1.8</code> version of the Postrges Operator. Thanks to everyone involved!

Fixes and enhancements

* uses <a href="https://github.com/zalando/spilo/releases/tag/2.1-p6">latest spilo</a> version as default (with Postgres 14.4 release) (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1276677767" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/1932" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/1932/hovercard" href="https://github.com/zalando/postgres-operator/pull/1932">#1932</a>)
* setting CLONE_WAL_BUCKET_SCOPE_PREFIX env variable again (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1246354123" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/1902" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/1902/hovercard" href="https://github.com/zalando/postgres-operator/pull/1902">#1902</a>)
* fix links in operator configuration reference docs (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1270611310" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/1929" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/1929/hovercard" href="https://github.com/zalando/postgres-operator/pull/1929">#1929</a>)
* [UI] hide column title with tooltip behind UI header (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="1276677767" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/1932" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/1932/hovercard" href="https://github.com/zalando/postgres-operator/pull/1932">#1932</a>)

<strong>Docker image</strong>: registry.opensource.zalan.do/acid/postgres-operator:v1.8.2

<strong>UI Docker image</strong>: registry.opensource.zalan.do/acid/postgres-operator-ui:v1.8.2

<strong>Sample logical backup image</strong>: registry.opensource.zalan.do/acid/logical-backup:v1.8.2

<strong>Default Spilo image</strong>: registry.opensource.zalan.do/acid/spilo-14:2.1-p6

Thanks to our contributors: <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FxKu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FxKu">@FxKu</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/idanovinda/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/idanovinda">@idanovinda</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jopadi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jopadi">@jopadi</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sdudoladov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sdudoladov">@sdudoladov</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Jan-M/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Jan-M">@Jan-M</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/CyberDem0n/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/CyberDem0n">@CyberDem0n</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FactorT/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FactorT">@FactorT</a>

