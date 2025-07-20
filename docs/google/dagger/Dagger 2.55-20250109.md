# Dagger 2.55

## release on 20250109
## description
## changes
Notable/breaking changes

* Added support for injecting <code>jakarta.inject.Provider</code>. This should be usable anywhere <code>javax.inject.Provider</code> is usable. Note that this technically comes with a breaking change to disallow providing <code>jakarta.inject.Provider</code> types in the same way it is disallowed for <code>javax.inject.Provider</code>. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/caa7e178bd1a1ca6bd6ea569f2334f02a55b59cc/hovercard" href="https://github.com/google/dagger/commit/caa7e178bd1a1ca6bd6ea569f2334f02a55b59cc"><tt>caa7e17</tt></a>)
* Fixed a number of binding graph related issues.  
  These fixes can be enabled with, <code>-Adagger.useBindingGraphFix=ENABLED</code>, but due to this sometimes being a breaking change we’ve set the default behavior to “disabled” for now. We will flip the default to “enabled” in a future release, and eventually remove the flag altogether. Enabling this feature can fix a number of confusing error messages. See <a href="https://dagger.dev/dev-guide/compiler-options#useBindingGraphFix" rel="nofollow">https://dagger.dev/dev-guide/compiler-options#useBindingGraphFix</a> for more details.

Bug fixes

* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2753500901" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4549" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4549/hovercard" href="https://github.com/google/dagger/issues/4549">#4549</a>: Fixed incremental processing for LazyClassKey proguard files by adding the  
  originating element to the <code>writeResource</code> call. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/98a0275416cae5afaad5e70a051137a28b3a8201/hovercard" href="https://github.com/google/dagger/commit/98a0275416cae5afaad5e70a051137a28b3a8201"><tt>98a0275</tt></a>)

