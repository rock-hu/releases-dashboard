# Add support for SPM dynamic linking + Fix error when dynamically removing views

## release on 20251220
## description
## changes
Add support for SPM dynamic linking

This allows users to link FlexLayout as a dynamic framework when needed for their specific use cases.

Added by <a href="https://github.com/heoblitz">heoblitz</a> in Pull Request <a href="https://github.com/layoutBox/FlexLayout/pull/284" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/284/hovercard">#284</a>

Fix error when dynamically removing views

Currently, FlexLayout does not guarantee that the UIView hierarchy state matches the Yoga node structure. This is because nodes are only updated during the layout process by following the UIView hierarchy.  

When a child UIView is dynamically removed and markDirty() is called, it causes an error and terminates the program because it doesn't align with Yoga's logic.

In React Native's case, views that become leaves are fixed and used consistently, but FlexLayout allows any UIView to become a leaf. Therefore, we add defensive code to prevent logical errors.

Added by <a href="https://github.com/heoblitz">heoblitz</a> in Pull Request <a href="https://github.com/layoutBox/FlexLayout/pull/281" data-hovercard-type="pull_request" data-hovercard-url="/layoutBox/FlexLayout/pull/281/hovercard">#281</a>

