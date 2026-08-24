# Postgres Operator v2.0.2

## release on 20260820
## description
## changes
This is a bugfix release to the 2.0 version of the Postrges Operator. Thanks to everyone who gave feedback, raised issues or fixed bugs.

Bugfixes

* fix schema validation of <code>sidecars</code> option in OperatorConfiguration CRD <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5063169816" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3160" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3160/hovercard" href="https://github.com/zalando/postgres-operator/pull/3160">#3160</a>
* skip ALTER ROLE when the stored SCRAM verifier already matches the password <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5144280077" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3171" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3171/hovercard" href="https://github.com/zalando/postgres-operator/pull/3171">#3171</a>
* skip owner references on user secrets when secret deletion is disabled <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5118869418" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3165" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3165/hovercard" href="https://github.com/zalando/postgres-operator/pull/3165">#3165</a>
* [UI] bump js-yaml from 4.3.0 to 4.3.1 <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5124017599" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3166" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3166/hovercard" href="https://github.com/zalando/postgres-operator/pull/3166">#3166</a>
* [helm] update helm chart index <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5015819907" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3148" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3148/hovercard" href="https://github.com/zalando/postgres-operator/pull/3148">#3148</a>
* [helm] add deployment strategy type <code>Recreate</code> to deployment template for smoother upgrade experience between v1.x to v2.x <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5110382149" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3164" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3164/hovercard" href="https://github.com/zalando/postgres-operator/pull/3164">#3164</a>

Breaking Change

* add major version v2 to go module path which was forgotten during the v2 release. If you're using the Posthres Operator as a library you need to update your go code! <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5048520018" data-permission-text="Title is private" data-url="https://github.com/zalando/postgres-operator/issues/3156" data-hovercard-type="pull_request" data-hovercard-url="/zalando/postgres-operator/pull/3156/hovercard" href="https://github.com/zalando/postgres-operator/pull/3156">#3156</a>

Images

Postgres Operator: ghcr.io/zalando/postgres-operator:v2.0.2  

Pooler: UI: ghcr.io/zalando/postgres-operator/pgbouncer:v2.0.2  

UI: ghcr.io/zalando/postgres-operator-ui:v2.0.2  

Logical Backup: ghcr.io/zalando/postgres-operator/logical-backup:v2.0.2

Helm charts

via ghcr.io  

ghcr.io/zalando/charts/postgres-operator:2.0.2  

ghcr.io/zalando/charts/postgres-operator-ui:2.0.2

Thanks to our contributors: <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/l0wl3vel/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/l0wl3vel">@l0wl3vel</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/rasoanaivo-r/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/rasoanaivo-r">@rasoanaivo-r</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/g2px1/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/g2px1">@g2px1</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/adshin21/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/adshin21">@adshin21</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Jan-M/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Jan-M">@Jan-M</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/mikkeloscar/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/mikkeloscar">@mikkeloscar</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/idanovinda/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/idanovinda">@idanovinda</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/jopadi/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/jopadi">@jopadi</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sdudoladov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sdudoladov">@sdudoladov</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/FxKu/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/FxKu">@FxKu</a>

