# Fix error that occur when creating XCFramework

## release on 20240214
## description
## changes
Background

* Public header issue occurs when using Objective-C package in <a href="https://github.com/tuist/tuist">Tuist</a>'s Dependency. To resolve this issue, I want to provide xcframework.
* Resolve the issue that occurs when creating xcframework due to duplicate 'postfix operator %'.

Contents

* remove unnecessary files and headers
  * Modified to manage yoga directly in FlexLayout. Buck dependency is now unnecessary.
* remove duplicated postfix operator
* update Podfile.lock
* remove Info.plist
* move <code>FlexLayout.h</code> to public header directory

Added by <a href="https://github.com/OhKanghoon">OhKanghoon</a> in Pull Request <a href="https://github.com/layoutBox/FlexLayout/pull/244" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/244/hovercard">#244</a>

