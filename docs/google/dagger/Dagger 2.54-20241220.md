# Dagger 2.54

## release on 20241220
## description
## changes
Bug fixes

* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2284335411" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4303" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4303/hovercard" href="https://github.com/google/dagger/issues/4303">#4303</a>: Upgrade Hilt Gradle Plugin to support KSP2 configuration. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/76b581999a81a4a6e91d5f5fc6b51639095575b2/hovercard" href="https://github.com/google/dagger/commit/76b581999a81a4a6e91d5f5fc6b51639095575b2"><tt>76b5819</tt></a>)
* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2751091211" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4544" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4544/hovercard" href="https://github.com/google/dagger/issues/4544">#4544</a>: Removes private from InstanceHolder field to avoid unnecessary accessor method. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/07d8f883f1f1e1fe6787228b05741d8dd8633bd4/hovercard" href="https://github.com/google/dagger/commit/07d8f883f1f1e1fe6787228b05741d8dd8633bd4"><tt>07d8f88</tt></a>)
* Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2727205254" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4533" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4533/hovercard" href="https://github.com/google/dagger/issues/4533">#4533</a>: Fixes path separator for Windows when creating LazyClassKey proguard file. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/efa421a3fcd03a0453f76825741cd8307eea067e/hovercard" href="https://github.com/google/dagger/commit/efa421a3fcd03a0453f76825741cd8307eea067e"><tt>efa421a</tt></a>)

Notable changes

* In preparation for jakarta support, Dagger’s generated factories now include a <code>create()</code> method that uses <code>dagger.internal.Provider</code> rather than <code>javax.inject.Provider</code>. For now, the <code>javax.inject.Provider</code> <code>create()</code> method is also kept for compatibility, but it will be removed in a future release. When that happens, libraries built with the newer version of Dagger may break downstream users of <code>@Component</code> that are built with an older version of Dagger. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/d60729d20cd0daf422916b1e2b90e5d73c951699/hovercard" href="https://github.com/google/dagger/commit/d60729d20cd0daf422916b1e2b90e5d73c951699"><tt>d60729d</tt></a>)

