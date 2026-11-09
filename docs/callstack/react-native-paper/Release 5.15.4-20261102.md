# Release 5.15.4

## release on 20261102
## description
## changes
Bug fixes

* <strong>TextInput:</strong> no longer crashes on iOS with the New Architecture when its style sets no <code>fontWeight</code>; it now takes the font weight from the theme (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4105240060" data-permission-text="Title is private" data-url="https://github.com/callstack/react-native-paper/issues/4880" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4880/hovercard" href="https://github.com/callstack/react-native-paper/pull/4880">#4880</a>, thanks isaacrowntree)
* <strong>AnimatedFAB:</strong> the icon stays in place on iOS after <code>iconMode</code> changes (<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4422194326" data-permission-text="Title is private" data-url="https://github.com/callstack/react-native-paper/issues/4940" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4940/hovercard" href="https://github.com/callstack/react-native-paper/pull/4940">#4940</a>, thanks azizbecha)

Worth knowing

* If your theme gives <code>bodyLarge</code> (MD3) or <code>fonts.regular</code> (MD2) a weight other than regular, TextInput now shows that weight.
* Jest snapshots of TextInput change from <code>fontWeight: undefined</code> to <code>"400"</code>.

<a href="https://github.com/callstack/react-native-paper/compare/v5.15.3...v5.15.4">5.15.4</a> (2026-11-02)

Bug Fixes

* <strong>animated-fab:</strong> keep icon attached when toggling iconMode on iOS (<a href="https://github.com/callstack/react-native-paper/issues/4940" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4940/hovercard">#4940</a>) (<a href="https://github.com/callstack/react-native-paper/commit/5a73999f799ea670083f20d59192d9ec8cd984f9">5a73999</a>)
* <strong>TextInput:</strong> fall back to theme fontWeight to prevent SIGSEGV on Fabric (<a href="https://github.com/callstack/react-native-paper/issues/4880" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4880/hovercard">#4880</a>) (<a href="https://github.com/callstack/react-native-paper/commit/d609939e4b3173d7c34cb6bf7aea3d6f2538ef6a">d609939</a>)

