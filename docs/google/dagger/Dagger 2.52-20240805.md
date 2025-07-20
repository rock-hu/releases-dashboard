# Dagger 2.52

## release on 20240805
## description
## changes
Dagger 2.52

Notes:  

Dagger KSP now requires at least KSP 1.9.24-1.0.20.

Bug fixes

* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2281451270" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4302" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4302/hovercard" href="https://github.com/google/dagger/issues/4302">#4302</a>: Suppress deprecation warnings in generated code. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/f41033cc448eb7bdb83af2356c8802f1208d1824/hovercard" href="https://github.com/google/dagger/commit/f41033cc448eb7bdb83af2356c8802f1208d1824"><tt>f41033c</tt></a>)
* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2338605661" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4323" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4323/hovercard" href="https://github.com/google/dagger/issues/4323">#4323</a>: Added rules to stop LazyClassKey referenced classes being merged with R8 (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/81512af9ee6465c992ffb81464978be15f5d76e7/hovercard" href="https://github.com/google/dagger/commit/81512af9ee6465c992ffb81464978be15f5d76e7"><tt>81512af</tt></a>).
* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2390020955" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4345" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4345/hovercard" href="https://github.com/google/dagger/issues/4345">#4345</a>: Fixes intersection type bounds order in generated factories when using KSP (<a href="https://android-review.googlesource.com/c/platform/frameworks/support/+/3164197" rel="nofollow">aosp/3164197</a>).
* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2404479771" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4352" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4352/hovercard" href="https://github.com/google/dagger/issues/4352">#4352</a>: Fixes an issue where the parameter name "instance" could conflict with fields of the same name in the component. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/952c2504ae4ddd4f1fa7939ac101b27dd17f0b6c/hovercard" href="https://github.com/google/dagger/commit/952c2504ae4ddd4f1fa7939ac101b27dd17f0b6c"><tt>952c250</tt></a>)
* Merged pull request <a href="https://github.com/google/dagger/pull/4305" data-hovercard-type="pull_request" data-hovercard-url="/google/dagger/pull/4305/hovercard">#4305</a>: Skip view injection when in edit mode for previews. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/65b74f832c6323195bd1a20a3af56ca30fa9c5e0/hovercard" href="https://github.com/google/dagger/commit/65b74f832c6323195bd1a20a3af56ca30fa9c5e0"><tt>65b74f8</tt></a>)
* Fixed an issue where base classes with a package private constructor would cause the generated code to fail (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/db25237df0f59943e47b89486383a7d7a5605b3c/hovercard" href="https://github.com/google/dagger/commit/db25237df0f59943e47b89486383a7d7a5605b3c"><tt>db25237</tt></a>)
* Add a jakarta.inject.Provider runtime dependency in preparation for supporting Jakarta Providers (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/a8581e0a62b7cb3d1f5a13da26a8f40e22aad3d0/hovercard" href="https://github.com/google/dagger/commit/a8581e0a62b7cb3d1f5a13da26a8f40e22aad3d0"><tt>a8581e0</tt></a>)

