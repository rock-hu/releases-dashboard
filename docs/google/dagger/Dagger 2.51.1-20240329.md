# Dagger 2.51.1

## release on 20240329
## description
## changes
New Dagger Features

* Added <code>BindingGraphPlugin#onProcessingRoundBegin</code> for pre-processing initialization. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/2a6a0b46160eb484892195f0e832a26e18fbff88/hovercard" href="https://github.com/google/dagger/commit/2a6a0b46160eb484892195f0e832a26e18fbff88"><tt>2a6a0b4</tt></a>)

Dagger bug fixes

Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2030026227" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4181" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4181/hovercard" href="https://github.com/google/dagger/issues/4181">#4181</a>: Associate Dagger Android output with the generated Component, so that incremental builds with Ksp won’t fail.  

Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2163375536" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4254" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4254/hovercard" href="https://github.com/google/dagger/issues/4254">#4254</a>: Support using scoped <code>@LazyClassKey</code> map bindings.  

Fixed <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="2183402204" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4262" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4262/hovercard" href="https://github.com/google/dagger/issues/4262">#4262</a>: Support referencing an array of annotations in a map key annotation.

