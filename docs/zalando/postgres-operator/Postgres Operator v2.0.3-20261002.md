# Postgres Operator v2.0.3

## release on 20261002
## description
## changes
This is a bugfix release to the 2.0 version of the Postrges Operator. Thanks to everyone who gave feedback, raised issues or fixed bugs.

Bugfixes

* Allowing <code>scram-sha-256</code> authentication as the new default for pgBouncer connections (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5570559151" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3193" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3193/hovercard" href="https://github.com/zalando/postgres-operator/pull/3193">#3193</a>)
* Fix retry loop to move the primary pod off nodes (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5315179948" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3179" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3179/hovercard" href="https://github.com/zalando/postgres-operator/pull/3179">#3179</a>, <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5540202852" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3190" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3190/hovercard" href="https://github.com/zalando/postgres-operator/pull/3190">#3190</a>)
* Avoid switchover after migrating a single-pod cluster (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5492778691" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3187" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3187/hovercard" href="https://github.com/zalando/postgres-operator/pull/3187">#3187</a>)
* Pass CLONE_AWS_REGION and STANDBY_AWS_REGION when IRSA is configured (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5333693463" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3180" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3180/hovercard" href="https://github.com/zalando/postgres-operator/pull/3180">#3180</a>)
* Set <code>SPILO_PROVIDER=aws</code> when using IRSA to avoid unnecessary warning messages (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5387475943" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3185" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3185/hovercard" href="https://github.com/zalando/postgres-operator/pull/3185">#3185</a>)
* [UI] Bump js-yaml dependency to 4.3.2 (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5438098965" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3186" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3186/hovercard" href="https://github.com/zalando/postgres-operator/pull/3186">#3186</a>)
* [helm] make UI helm chart released via gh-pages includes the values.yaml file is (back patched also for v2.0.2) - (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5313272818" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3178" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3178/hovercard" href="https://github.com/zalando/postgres-operator/pull/3178">#3178</a>)

Breaking change

* If you rely on <code>md5</code> auth for pooler connections you have to configure <code>password_encryption: md5</code> in the manifest (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5570559151" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3193" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3193/hovercard" href="https://github.com/zalando/postgres-operator/pull/3193">#3193</a>)

Images

Postgres Operator: ghcr.io/zalando/postgres-operator:v2.0.3  

Pooler: UI: ghcr.io/zalando/postgres-operator/pgbouncer:v2.0.3  

UI: ghcr.io/zalando/postgres-operator-ui:v2.0.3  

Logical Backup: ghcr.io/zalando/postgres-operator/logical-backup:v2.0.3

<em>Default Spilo image</em>: ghcr.io/zalando/spilo-17:4.1-p2

Helm charts

via ghcr.io  

ghcr.io/zalando/charts/postgres-operator:2.0.3  

ghcr.io/zalando/charts/postgres-operator-ui:2.0.3

Thanks to our contributors: <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Shubham-Padkonde/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Shubham-Padkonde">@Shubham-Padkonde</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/pdixit26/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/pdixit26">@pdixit26</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tcondeixa/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tcondeixa">@tcondeixa</a> , <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FxKu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FxKu">@FxKu</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jopadi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jopadi">@jopadi</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/idanovinda/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/idanovinda">@idanovinda</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rpalfi-stratec/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rpalfi-stratec">@rpalfi-stratec</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nctram/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nctram">@nctram</a>

