# react-native-builder-bob@0.43.0

## release on 20260616
## description
## changes
<a href="https://github.com/callstack/react-native-builder-bob/compare/react-native-builder-bob@0.42.1...react-native-builder-bob@0.43.0">0.43.0</a> (2026-06-16)

Features

* use a unique name for the exports condition for source (<a href="https://github.com/callstack/react-native-builder-bob/issues/948" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-builder-bob/pull/948/hovercard">#948</a>) (<a href="https://github.com/callstack/react-native-builder-bob/commit/95bd4a22553426908e560ef014a8bc9b43f7cb1d">95bd4a2</a>) - by <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/satya164/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/satya164">@satya164</a>

This is a breaking change for libraries that use <code>react-native-builder-bob/vite-config</code>

They now must add the custom condition to their vite config. To preserve existing behavior, add <code>conditions: ['source']</code> under <code>resolve</code>:

      export default defineConfig((env) =>
        mergeConfig(config(env), {
          resolve: {
            alias: {
              [pack.name]: new URL('..', import.meta.url),
            },
    +       conditions: ['source'],
            dedupe: Object.keys(pack.peerDependencies),
          },
        })
      );

This also drops <code>react-native-builder-bob/metro-config</code>. Migrate to <a href="https://github.com/satya164/react-native-monorepo-config"><code>react-native-monorepo-config)</code></a> instead.

