# Release 5.14.3

## release on 20250513
## description
## changes
<a href="https://github.com/callstack/react-native-paper/compare/v5.14.2...v5.14.3">5.14.3</a> (2025-05-13)

Bug Fixes

* revert transformOrigin use from TextInput (<a href="https://github.com/callstack/react-native-paper/commit/5d0c77929e30d3e0bb3f1460986eb4d7e1d76456">5d0c779</a>) - previously added <code>transformOrigin</code> was breaking both outlined and flat input's label in various cases, so had to remove it completely. I will check what else we can do bring back the support for it.

