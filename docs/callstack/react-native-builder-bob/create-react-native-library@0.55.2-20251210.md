# create-react-native-library@0.55.2

## release on 20251210
## description
## changes
<a href="https://github.com/callstack/react-native-builder-bob/compare/create-react-native-library@0.55.1...create-react-native-library@0.55.2">0.55.2</a> (2025-12-10)

This CLI is rewritten in this release, so you may ecounter breaking changes. Notable changes are:

* camelCase arguments are no longer supported, the CLI must receive arguments in kebab-case
* the <code>--tools</code> option no longer receives positional arguments, multiple tools can be specified by passing <code>--tools</code> multiple times (<code>--tools eslint --tools jest</code>) or no tools with <code>--tools=</code>

Bug Fixes

* fix module blocklist on windows (<a href="https://github.com/callstack/react-native-builder-bob/commit/a8d8ab628d3b4f4f0241c1331d7141b9af8f82a3">a8d8ab6</a>), closes <a href="https://github.com/callstack/react-native-builder-bob/issues/849" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-builder-bob/pull/849/hovercard">#849</a> <a href="https://github.com/callstack/react-native-builder-bob/issues/913" data-hovercard-type="issue" data-hovercard-url="/callstack/react-native-builder-bob/issues/913/hovercard">#913</a> <a href="https://github.com/callstack/react-native-builder-bob/issues/914" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-builder-bob/pull/914/hovercard">#914</a> - by <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/satya164/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/satya164">@satya164</a>

