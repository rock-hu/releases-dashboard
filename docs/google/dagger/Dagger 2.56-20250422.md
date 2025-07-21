# Dagger 2.56

## release on 20250422

## description

## changes

Notable/breaking changes

* [Jakarta support] Remove deprecated Factory create methods that take a <code>javax.inject.Provider</code>. This means components built with an older Dagger version but with factory dependencies from a newer Dagger version will no longer compile. If you run into this, the Dagger version compiling the component must be upgraded. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/3412e6c03091e9ad6f142b54f5fcf771da238d17/hovercard" href="https://github.com/google/dagger/commit/3412e6c03091e9ad6f142b54f5fcf771da238d17"><tt>3412e6c</tt></a>)
* [Jakarta support] Disallow providing or injecting <code>dagger.internal.Provider</code>. Also disallow injections of raw Provider in Maps, for both javax and dagger Providers. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/962bb333570f32ff14a421ad0609305583a53b3c/hovercard" href="https://github.com/google/dagger/commit/962bb333570f32ff14a421ad0609305583a53b3c"><tt>962bb33</tt></a>)
* [Dagger]: Usages of <code>@Multibinds</code> and <code>@ElementsIntoSet</code> in Kotlin sources must now use Set/Map from the <code>kotlin.collections</code> package rather than the <code>java.util</code> package.

Bug fixes

* [Jakarta support] Add support for Jakarta annotations to Hilt. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/9001b5503ac36ad0d7e76a8d89c6801a3ff4ce42/hovercard" href="https://github.com/google/dagger/commit/9001b5503ac36ad0d7e76a8d89c6801a3ff4ce42"><tt>9001b55</tt></a>)
* [Jakarta support] Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2782463459" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4572" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4572/hovercard" href="https://github.com/google/dagger/issues/4572">#4572</a>. Fix issue with <code>jakarta.inject.Provider</code> support where in certain cases requests for a <code>Map&lt;K, Provider&lt;V&gt;&gt;</code> would fail to compile. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/f4e80036f4b7cc8405851f14c79b187079468242/hovercard" href="https://github.com/google/dagger/commit/f4e80036f4b7cc8405851f14c79b187079468242"><tt>f4e8003</tt></a>)
* [Dagger] Remove private modifier from fields/methods within generated Dagger component's private implementation classes (see <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2751091211" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4544" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4544/hovercard" href="https://github.com/google/dagger/issues/4544">#4544</a>). (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/79f8633e586ab825d1728fb6cd4bfd2635c820d8/hovercard" href="https://github.com/google/dagger/commit/79f8633e586ab825d1728fb6cd4bfd2635c820d8"><tt>79f8633</tt></a>)
* [Hilt] Partially Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2498193286" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4423" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4423/hovercard" href="https://github.com/google/dagger/issues/4423">#4423</a>: Fix project isolation violation when checking that Hilt libraries are applied along the Gradle plugin. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/91450da6a09845e86d92407dfda33b906a6c71bf/hovercard" href="https://github.com/google/dagger/commit/91450da6a09845e86d92407dfda33b906a6c71bf"><tt>91450da</tt></a>)
* Kotlin was upgraded to 2.1.10 to support KSP 2.1.10-1.0.31. This breaks compatibility older Gradle versions (8.10.2 or below). pre-compiled script plugins (included builds) using Hilt Gradle Plugin will fail to compile.

