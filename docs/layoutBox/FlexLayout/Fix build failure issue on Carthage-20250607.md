# Fix build failure issue on Carthage

## release on 20250607
## description
## changes
<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3120787305" data-permission-text="Title is private" data-url="https://github.com/layoutBox/FlexLayout/issues/275" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/275/hovercard" href="https://github.com/layoutBox/FlexLayout/pull/275">#275</a>

Since version 2.1.0, Yoga is managed as a separate dependency, so the project cannot be built on its own. Therefore, it cannot be used with Carthage.

Providing a pre-built static framework or adopting a different structure would require significant changes.  

Instead, this PR updates the guide and some settings to maintain the current project structure while enabling Carthage support.

