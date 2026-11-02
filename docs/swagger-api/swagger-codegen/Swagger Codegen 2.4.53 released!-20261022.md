# Swagger Codegen 2.4.53 released!

## release on 20261022
## description
## changes
* chore: bump dependencies (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5956926800" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12770" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12770/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12770">#12770</a>)
* fix: bump PHP client to PHP 8.3+ and Guzzle 8 (old Guzzle has security advisories) (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="5924592587" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12769" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12769/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12769">#12769</a>)
* ci: auto-dismiss security alerts in samples/ (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4452476962" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12742" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12742/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12742">#12742</a>)
* chore: release workflow for codegen 3.0 (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4427763661" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12730" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12730/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12730">#12730</a>)
* chore: prepare release workflow for codegen 3.0 adjustments (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4406581574" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12723" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12723/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12723">#12723</a>)
* chore: prepare release workflow for codegen 3.0 (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4405857511" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12721" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12721/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12721">#12721</a>)
* security: ignore samples catalog (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4391801233" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12714" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12714/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12714">#12714</a>)
* chore: migrate from tibdex/github-app-token to actions/create-github… (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4377261327" data-permission-text="Title is private" data-url="https://github.com/swagger-api/swagger-codegen/issues/12712" data-hovercard-type="pull_request" data-hovercard-url="/swagger-api/swagger-codegen/pull/12712/hovercard" href="https://github.com/swagger-api/swagger-codegen/pull/12712">#12712</a>)

Release notes: PHP client minimum versions

Regenerated PHP clients now require newer versions. Old Guzzle 6 and PHP-CodeSniffer 2.x are end-of-life, and every release in those ranges is blocked by Composer security advisories (this was breaking the PHP build).

<strong>New minimum versions:</strong>

* PHP <strong>8.3+</strong> (was 5.5+)
* <code>guzzlehttp/guzzle</code> <strong>^8.3</strong> (was ^6.2)
* <code>phpunit/phpunit</code> (dev) <strong>^9.6</strong> (was ^8.5)
* <code>squizlabs/php_codesniffer</code> (dev) <strong>^3.0</strong> (was ~2.6)
* <code>friendsofphp/php-cs-fixer</code> (dev) <strong>^3.0</strong> (was ~2.12)

<strong>Who is affected:</strong> only users who regenerate a PHP client with this release. Already generated clients keep working. If you cannot upgrade PHP or Guzzle, keep your current generated client or pin the previous Swagger Codegen version.

<strong>Other changes in the regenerated client:</strong>

* The PHP-CS-Fixer config file is now named <code>.php-cs-fixer.php</code> (was <code>.php_cs</code>).
* Failures without a response (e.g. connection errors) are thrown as <code>ApiException</code>.

