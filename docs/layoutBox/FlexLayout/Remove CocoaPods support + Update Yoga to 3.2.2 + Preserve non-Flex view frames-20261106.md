# Remove CocoaPods support + Update Yoga to 3.2.2 + Preserve non-Flex view frames

## release on 20261106
## description
## changes
Remove CocoaPods and Carthage support

Following the <a href="https://blog.cocoapods.org/CocoaPods-Specs-Repo/" rel="nofollow">CocoaPods trunk read-only plan</a>, FlexLayout is now distributed only through Swift Package Manager. Versions up to 2.2.3 remain available on CocoaPods trunk. CI now runs on Xcode 27.

Added by <a href="https://github.com/OhKanghoon">OhKanghoon</a> in Pull Request <a href="https://github.com/layoutBox/FlexLayout/pull/288" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/288/hovercard">#288</a>

Fix text truncation by updating Yoga to 3.2.2

Yoga 3.2.1 can shrink a measured text node by one physical pixel at a fractional offset, causing a UILabel to truncate text that should fit. The minimum Yoga version is now 3.2.2, which backports <a href="https://github.com/react/yoga/pull/2040" data-hovercard-type="pull_request" data-hovercard-url="/react/yoga/pull/2040/hovercard">react/yoga#2040</a>.

Added by <a href="https://github.com/stleamist">stleamist</a> in Pull Request <a href="https://github.com/layoutBox/FlexLayout/pull/289" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/289/hovercard">#289</a>

Preserve non-Flex view frames during layout

Applying the layout no longer overwrites the manually managed frames of non-Flex views when they share a container with enabled Flex children.

Added by <a href="https://github.com/heoblitz">heoblitz</a> in Pull Request <a href="https://github.com/layoutBox/FlexLayout/pull/287" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/287/hovercard">#287</a>

