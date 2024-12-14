# eslint-plugin-react-hooks@5.0.0 (Oct 11, 2024)

## release on 20241014
## description
## changes
This release only contains <code>eslint-plugin-react-hooks</code>. Notably, new violations and support for ESLint v9 were added.

<code>eslint-plugin-react-hooks</code>

* <strong>New Violations:</strong> Component names now need to start with an uppercase letter instead of a non-lowercase letter. This means <code>_Button</code> or <code>_component</code> are no longer valid. (<a href="https://github.com/kassens">@kassens</a>) in <a href="https://github.com/facebook/react/pull/25162" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/25162/hovercard">#25162</a>  
  For example, in

      function _Component() {
        useState()
        ^^^^^^^^ A React Hook "useState" is called in function "_Component" which is neither a Component nor a custom React Hook function.
      }

  <code>_Component</code> should be renamed to <code>Component</code>.


* Add support for ESLint v9. (<a href="https://github.com/eps1lon">@eps1lon</a> in <a href="https://github.com/facebook/react/pull/28773" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/28773/hovercard">#28773</a>)
* Consider dispatch from <code>useActionState</code> stable. (<a href="https://github.com/eps1lon">@eps1lon</a> in <a href="https://github.com/facebook/react/pull/29665" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/29665/hovercard">#29665</a>)
* Accept <code>as</code> expression in callback. (<a href="https://github.com/StyleShit">@StyleShit</a> in <a href="https://github.com/facebook/react/pull/28202" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/28202/hovercard">#28202</a>)
* Accept <code>as</code> expressions in deps array. (<a href="https://github.com/StyleShit">@StyleShit</a> in <a href="https://github.com/facebook/react/pull/28189" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/28189/hovercard">#28189</a>)
* Treat <code>React.use()</code> the same as <code>use()</code>. (<a href="https://github.com/kassens">@kassens</a> in <a href="https://github.com/facebook/react/pull/27769" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/27769/hovercard">#27769</a>)
* Move <code>use()</code> lint to non-experimental. (<a href="https://github.com/kassens">@kassens</a> in <a href="https://github.com/facebook/react/pull/27768" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/27768/hovercard">#27768</a>)
* Support Flow <code>as</code> expressions. (<a href="https://github.com/cpojer">@cpojer</a> in <a href="https://github.com/facebook/react/pull/27590" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/27590/hovercard">#27590</a>)
* Allow <code>useEffect(fn, undefined)</code>. (<a href="https://github.com/kassens">@kassens</a> in <a href="https://github.com/facebook/react/pull/27525" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/27525/hovercard">#27525</a>)
* Disallow hooks in async functions. (<a href="https://github.com/acdlite">@acdlite</a> in <a href="https://github.com/facebook/react/pull/27045" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/27045/hovercard">#27045</a>)
* Rename experimental <code>useEvent</code> to <code>useEffectEvent</code>. (<a href="https://github.com/sebmarkbage">@sebmarkbage</a> in <a href="https://github.com/facebook/react/pull/25881" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/25881/hovercard">#25881</a>)
* Lint for presence of <code>useEvent</code> functions in dependency lists. (<a href="https://github.com/poteto">@poteto</a> in <a href="https://github.com/facebook/react/pull/25512" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/25512/hovercard">#25512</a>)
* Check <code>useEvent</code> references instead. (<a href="https://github.com/poteto">@poteto</a> in <a href="https://github.com/facebook/react/pull/25319" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/25319/hovercard">#25319</a>)
* Update <code>RulesOfHooks</code> with <code>useEvent</code> rules. (<a href="https://github.com/poteto">@poteto</a> in <a href="https://github.com/facebook/react/pull/25285" data-hovercard-type="pull_request" data-hovercard-url="/facebook/react/pull/25285/hovercard">#25285</a>)

