# Dagger 2.57

## release on 20250717
## description
## changes
Potential breaking changes

The generated <code>Factory</code>/<code>MembersInjector</code> constructors have changed from public to private. This shouldn’t affect most users since these classes are only meant to be called by Dagger’s other generated code. If you do happen to be broken by this change, you should avoid calling Dagger’s generated <code>Factory</code>/<code>MembersInjector</code> classes directly. For a temporary solution, you can also switch to using the public static methods to create an instance. (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/165cf20eeabbb81da140f140237b10e265059160/hovercard" href="https://github.com/google/dagger/commit/165cf20eeabbb81da140f140237b10e265059160"><tt>165cf20</tt></a>)

Bug fixes

Fixes <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3182615423" data-permission-text="Title is private" data-url="https://github.com/google/dagger/issues/4779" data-hovercard-type="issue" data-hovercard-url="/google/dagger/issues/4779/hovercard" href="https://github.com/google/dagger/issues/4779">#4779</a>. Unshades the Kotlinx Metadata to support Kotlin 2.2.0 (<a class="commit-link" data-hovercard-type="commit" data-hovercard-url="https://github.com/google/dagger/commit/bfa88b962a6b69e3cdb8f84c698f5bf5881fca18/hovercard" href="https://github.com/google/dagger/commit/bfa88b962a6b69e3cdb8f84c698f5bf5881fca18"><tt>bfa88b9</tt></a>)

