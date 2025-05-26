# Release 5.14.0

## release on 20250430
## description
## changes
<a href="https://github.com/callstack/react-native-paper/compare/v5.13.5...v5.14.0">5.14.0</a> (2025-04-30)

Deprecation

The <code>createMaterialBottomTabNavigator</code> has been deprecated as of <code>react-native-paper@5.14.0</code>. Instead, use <code>@react-navigation/bottom-tabs</code> version <code>7.x</code> or later, combined with <code>BottomNavigation.Bar</code> to achieve a Material Design look.

For implementation details, see the <a href="https://callstack.github.io/react-native-paper/docs/components/BottomNavigation/BottomNavigationBar#with-react-navigation" rel="nofollow">dedicated example</a>.

* deprecate createMaterialBottomTabNavigator <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3014121461" data-permission-text="Title is private" data-url="https://github.com/callstack/react-native-paper/issues/4694" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4694/hovercard" href="https://github.com/callstack/react-native-paper/pull/4694">#4694</a>

Bug Fixes

* add set selection to the searchbar (<a href="https://github.com/callstack/react-native-paper/issues/4708" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4708/hovercard">#4708</a>) (<a href="https://github.com/callstack/react-native-paper/commit/218cc327dd31588adf0d10ab02bc92adfe1880b5">218cc32</a>)
* allow to override content style (<a href="https://github.com/callstack/react-native-paper/issues/4707" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4707/hovercard">#4707</a>) (<a href="https://github.com/callstack/react-native-paper/commit/e69f9d2694284113ff27f3bcd77716b052c84ead">e69f9d2</a>)

Features

* support for react-native-vector-icons@11.0 <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3015344843" data-permission-text="Title is private" data-url="https://github.com/callstack/react-native-paper/issues/4696" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4696/hovercard" href="https://github.com/callstack/react-native-paper/pull/4696">#4696</a>
* adjust adaptNavigationTheme to the latest navigation theme changes (<a href="https://github.com/callstack/react-native-paper/issues/4690" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4690/hovercard">#4690</a>) (<a href="https://github.com/callstack/react-native-paper/commit/699bb06bffa1a114fb573bc080bafca3db534fe9">699bb06</a>)
* add container style prop (<a href="https://github.com/callstack/react-native-paper/issues/4691" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4691/hovercard">#4691</a>) (<a href="https://github.com/callstack/react-native-paper/commit/95c9390267756102197f61337a61d2a677fd2503">95c9390</a>)
* add content style prop (<a href="https://github.com/callstack/react-native-paper/issues/4697" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4697/hovercard">#4697</a>) (<a href="https://github.com/callstack/react-native-paper/commit/c98a01c3f52c612103cdf871fd7d9ce77be981d7">c98a01c</a>)
* enable adding styles to the action-wrapper in FABGroup (<a href="https://github.com/callstack/react-native-paper/issues/4657" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4657/hovercard">#4657</a>) (<a href="https://github.com/callstack/react-native-paper/commit/a91a4c8c54d6804ad05548e1f6e87dfd31d3dd8c">a91a4c8</a>)

