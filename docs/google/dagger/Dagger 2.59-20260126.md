# Dagger 2.59

## release on 20260126
## description
## changes
Breaking changes:

This release adds support for AGP 9, which means AGP 9 is now a requirement along with AGP 9’s own requirements like Gradle 9.1+ (<a href="https://developer.android.com/build/releases/agp-9-0-0-release-notes" rel="nofollow">https://developer.android.com/build/releases/agp-9-0-0-release-notes</a>).

<strong>Note:</strong> AGP 9 also seems to cause issues with <code>enableJetifier=true</code> (see <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3843351526" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/5099" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/5099/hovercard" href="https://github.com/google/dagger/issues/5099">#5099</a>).

Bug fixes/features:

* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3385889477" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4944" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4944/hovercard" href="https://github.com/google/dagger/issues/4944">#4944</a>, <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3443497113" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4979" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4979/hovercard" href="https://github.com/google/dagger/issues/4979">#4979</a>: Support AGP 9 in HiltGradlePlugin (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/6afd7ea5a0fb84a38f2d23c990ddbd95e728a39d/hovercard" href="https://github.com/google/dagger/commit/6afd7ea5a0fb84a38f2d23c990ddbd95e728a39d"><tt>6afd7ea</tt></a>)

