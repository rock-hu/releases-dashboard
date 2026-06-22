# Release 6.0.0-alpha.0

## release on 20260615
## description
## changes
<a href="https://github.com/callstack/react-native-paper/compare/v5.15.1...v6.0.0-alpha.0">6.0.0-alpha.0</a> (2026-06-15)

Bug Fixes

* <strong>animated-fab:</strong> correct Android shadow/content stacking (<a href="https://github.com/callstack/react-native-paper/issues/4903" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4903/hovercard">#4903</a>) (<a href="https://github.com/callstack/react-native-paper/commit/db27e5abc632a867150619f4ebbc48c085253118">db27e5a</a>)
* <strong>docs:</strong> resolve docs build and icon issues (<a href="https://github.com/callstack/react-native-paper/commit/490a5022c84a71f8cfcc265ebd0e091a093d0166">490a502</a>)
* dynamic theme broken deep merge when using PlatformColor (<a href="https://github.com/callstack/react-native-paper/commit/8720eac542159b0294a6b39b6a33f4ac21aba41d">8720eac</a>)
* <strong>MD3:</strong> update color schema and tokens (<a href="https://github.com/callstack/react-native-paper/issues/4900" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4900/hovercard">#4900</a>) (<a href="https://github.com/callstack/react-native-paper/commit/709325ea91a17b74a9bcd414a4dca2efffb318ef">709325e</a>)
* resolve RN 0.85 web warnings and upgrade Expo SDK 56 (<a href="https://github.com/callstack/react-native-paper/issues/4958" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4958/hovercard">#4958</a>) (<a href="https://github.com/callstack/react-native-paper/commit/33815155239b8fce9ad7faeab35a8407955f1ce3">3381515</a>)
* ripple not showing (<a href="https://github.com/callstack/react-native-paper/issues/4897" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4897/hovercard">#4897</a>) (<a href="https://github.com/callstack/react-native-paper/commit/f39da669f9d672cc02b9a7fc235ba8727841456b">f39da66</a>)

Features

* add direction prop to PaperProvider and useLocale hook for RTL support (<a href="https://github.com/callstack/react-native-paper/issues/4921" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4921/hovercard">#4921</a>) (<a href="https://github.com/callstack/react-native-paper/commit/01b1982f18278ece6284364784d81e93bd50606b">01b1982</a>)
* add DynamicTheme using PlatformColor (<a href="https://github.com/callstack/react-native-paper/issues/4901" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4901/hovercard">#4901</a>) (<a href="https://github.com/callstack/react-native-paper/commit/ad9f3f00499ffc7b926069c7107909cebac6be31">ad9f3f0</a>)
* add elevation tokens and fix Android dp spec bug (<a href="https://github.com/callstack/react-native-paper/issues/4923" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4923/hovercard">#4923</a>) (<a href="https://github.com/callstack/react-native-paper/commit/2f8b8400517f36949aa07ad17ba7070e5576ac7c">2f8b840</a>)
* add emphasized typescale and fix letter-spacing spec bugs (<a href="https://github.com/callstack/react-native-paper/issues/4920" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4920/hovercard">#4920</a>) (<a href="https://github.com/callstack/react-native-paper/commit/c9f40e24e3b04a71dcefcdbdaffe8e135e84be37">c9f40e2</a>)
* add motion tokens (spring, easing, duration) (<a href="https://github.com/callstack/react-native-paper/commit/57c06e17f0a1ea7cdf9829b46621f22e7cd83427">57c06e1</a>)
* add theme.shapes and cornersToStyle (<a href="https://github.com/callstack/react-native-paper/issues/4919" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4919/hovercard">#4919</a>) (<a href="https://github.com/callstack/react-native-paper/commit/b88ec191cc6b43dfbae10aa3657a5cfb0b6486f0">b88ec19</a>)
* add theme.state opacity tokens and split theme types (<a href="https://github.com/callstack/react-native-paper/issues/4917" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4917/hovercard">#4917</a>) (<a href="https://github.com/callstack/react-native-paper/commit/f998dffe5f8f30a87059a0af03c5d3f822e4329b">f998dff</a>)
* <strong>checkbox:</strong> add error state via MD3 error tokens (<a href="https://github.com/callstack/react-native-paper/commit/e8606051954a109be7ba30fb693fa3e2e550fc11">e860605</a>), closes <a href="https://github.com/callstack/react-native-paper/issues/4937" data-hovercard-type="issue" data-hovercard-url="/callstack/react-native-paper/issues/4937/hovercard">#4937</a> <a href="https://github.com/callstack/react-native-paper/issues/4949" data-hovercard-type="discussion" data-hovercard-url="/callstack/react-native-paper/discussions/4949/hovercard">#4949</a>
* <strong>checkbox:</strong> modernize for md3 spec compliance (<a href="https://github.com/callstack/react-native-paper/commit/64058953989fb4db96f038ec615dec7b397651ef">6405895</a>), closes <a href="https://github.com/callstack/react-native-paper/issues/4952" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4952/hovercard">#4952</a>
* <strong>fab:</strong> modernize FloatingActionButton to MD3 (<a href="https://github.com/callstack/react-native-paper/commit/2f5e55d5a034d7cf6ddb8ef8587960791f461ed1">2f5e55d</a>)
* modernize Switch to MD3 (<a href="https://github.com/callstack/react-native-paper/commit/de574b5d7542b431a352222f6ab63e08532a109c">de574b5</a>)
* react-native-reanimated as peer dependency (<a href="https://github.com/callstack/react-native-paper/issues/4912" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4912/hovercard">#4912</a>) (<a href="https://github.com/callstack/react-native-paper/commit/9ded0ac1490ce17c3cbc0ba151ab027012250357">9ded0ac</a>)
* remove customRippleColor from components (<a href="https://github.com/callstack/react-native-paper/issues/4899" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4899/hovercard">#4899</a>) (<a href="https://github.com/callstack/react-native-paper/commit/1369526813386d1385096f64e2abe198a11596ba">1369526</a>), closes <a href="https://github.com/callstack/react-native-paper/issues/4894" data-hovercard-type="issue" data-hovercard-url="/callstack/react-native-paper/issues/4894/hovercard">#4894</a>
* rework TextInput component (<a href="https://github.com/callstack/react-native-paper/issues/4909" data-hovercard-type="pull_request" data-hovercard-url="/callstack/react-native-paper/pull/4909/hovercard">#4909</a>) (<a href="https://github.com/callstack/react-native-paper/commit/8b2b1eb9d3014a42f49da3cfd2a66c723293976e">8b2b1eb</a>), closes <a href="https://github.com/callstack/react-native-paper/issues/79747">#79747</a> <a href="https://github.com/callstack/react-native-paper/issues/6750A4">#6750A4</a> <a href="https://github.com/callstack/react-native-paper/issues/1C1B1">#1C1B1</a> <a href="https://github.com/callstack/react-native-paper/issues/79747">#79747</a> <a href="https://github.com/callstack/react-native-paper/issues/6750A4">#6750A4</a> <a href="https://github.com/callstack/react-native-paper/issues/1C1B1">#1C1B1</a> <a href="https://github.com/callstack/react-native-paper/issues/6750A4">#6750A4</a> <a href="https://github.com/callstack/react-native-paper/issues/6750A4">#6750A4</a>
* <strong>v6:</strong> remove deprecated public API (<a href="https://github.com/callstack/react-native-paper/commit/3920cf0dc39941c52e510661a3a24faae0f1d01f">3920cf0</a>)

BREAKING CHANGES

* <strong>fab:</strong> The FAB API has been redesigned for MD3 with no  
  deprecation aliases.


* <code>AnimatedFAB</code> and <code>AnimatedFABProps</code> are removed. Use <code>FAB.Extended</code>  
  for the icon + label FAB.
* <code>FAB.Group</code> and <code>FABGroupProps</code> are removed. Use <code>FAB.Menu</code> instead.
* The legacy FAB props (<code>mode</code>, <code>small</code>, <code>color</code>, <code>label</code>, <code>uppercase</code>,  
  <code>customSize</code>, <code>animated</code>) are removed. Use <code>variant</code>, <code>size</code>,  
  <code>containerColor</code>, and <code>contentColor</code> instead; for a labeled FAB switch  
  to <code>FAB.Extended</code>.
* New exported types: <code>FABExtendedProps</code>, <code>FABMenuProps</code>,  
  <code>FABMenuItemProps</code>, <code>FABMenuTriggerProps</code>, <code>FABVariant</code>, <code>FABSize</code>.

<a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="4492451813" data-permission-text="Title is private" data-url="https://github.com/callstack/react-native-paper/issues/4959" data-hovercard-type="issue" data-hovercard-url="/callstack/react-native-paper/issues/4959/hovercard" href="https://github.com/callstack/react-native-paper/issues/4959">#4959</a>

* Lint, typescript, existing and new tests pass
* manual visual inspection on all platforms


* <code>TextInput</code> has been rewritten for Material Design 3. The public API, adornments, variant naming, and styling overrides have changed. See the migration section below for required updates.

Summary

Replaces the Paper 5.x <code>TextInput</code> with a new MD3-aligned implementation. The component name stays <strong><code>TextInput</code></strong>, but most props and composition patterns have changed.

The new <code>TextInput</code> supports <strong><code>filled</code></strong> and <strong><code>outlined</code></strong> variants, floating labels, <strong><code>supportingText</code></strong>, a built-in character <strong><code>counter</code></strong>, <strong><code>prefix</code></strong> / <strong><code>suffix</code></strong>, leading/trailing <strong><code>startAccessory</code></strong> / <strong><code>endAccessory</code></strong> render props, a custom <strong><code>render</code></strong> prop for masked inputs, and improved accessibility. Colors and layout follow the theme; per-prop color overrides for outlines and underlines were removed.

What changed

| Before (v5) | After (v6) |
|----------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| <code>mode="flat"</code> | <code>variant="filled"</code> (default) |
| <code>mode="outlined"</code> | <code>variant="outlined"</code> |
| <code>left</code> / <code>right</code> element props | <code>startAccessory</code> / <code>endAccessory</code> render props |
| <code>TextInput.Affix</code> | <code>prefix</code> / <code>suffix</code> strings, or custom accessories |
| <code>HelperText</code> below the field | <code>supportingText</code> on the field |
| <code>label</code> as <code>string</code> or <code>ReactNode</code> | <code>label</code> as <code>string</code> only |
| <code>dense</code>, <code>contentStyle</code>, <code>outlineStyle</code>, <code>underlineStyle</code> | removed — use <code>style</code> and <code>theme</code> |
| <code>textColor</code>, <code>underlineColor</code>, <code>activeUnderlineColor</code>, <code>outlineColor</code>, <code>activeOutlineColor</code> | removed — use <code>style</code> and <code>theme</code> |
| <code>disabled</code> blocked interaction | <code>disabled</code> blocks interaction; use <code>editable={false}</code> for read-only fields that can still be focused |

Still supported

* <strong><code>TextInput.Icon</code></strong> — use inside <code>startAccessory</code> / <code>endAccessory</code>
* <strong><code>render</code></strong> — swap the native input (e.g. masked inputs)
* <strong><code>selectionColor</code></strong> and <strong><code>cursorColor</code></strong> — inherited from React Native <code>TextInput</code> props
* <strong><code>ref</code></strong> — exposes <code>TextInputHandles</code> (<code>focus</code>, <code>blur</code>, <code>clear</code>, <code>isFocused</code>, <code>setNativeProps</code>, <code>setSelection</code>); <code>clear()</code> also syncs internal state and label animation

What was removed

* <strong><code>TextInput.Affix</code></strong>
* <strong><code>HelperText</code></strong> as the recommended companion for text fields (use <code>supportingText</code> instead)
* <strong><code>mode</code></strong>, <strong><code>left</code></strong>, <strong><code>right</code></strong>
* <strong><code>dense</code></strong>, <strong><code>contentStyle</code></strong>, <strong><code>outlineStyle</code></strong>, <strong><code>underlineStyle</code></strong>
* <strong><code>textColor</code></strong>, <strong><code>underlineColor</code></strong>, <strong><code>activeUnderlineColor</code></strong>, <strong><code>outlineColor</code></strong>, <strong><code>activeOutlineColor</code></strong>

Migration

Import stays the same:

    import { TextInput, type TextInputProps } from 'react-native-paper';

Variant

    // Before (v5)
    <TextInput mode="flat" label="Email" />
    <TextInput mode="outlined" label="Password" />

    // After (v6)
    <TextInput variant="filled" label="Email" />
    <TextInput variant="outlined" label="Password" />

Icons and adornments

<code>left</code> / <code>right</code> element props become <strong><code>startAccessory</code></strong> / <strong><code>endAccessory</code></strong> render functions. Spread the props TextInput passes in — they include layout <code>style</code>, plus <code>error</code>, <code>disabled</code>, and <code>multiline</code>.

    // Before (v5)
    <TextInput
      label="Search"
      value={text}
      onChangeText={setText}
      left={<TextInput.Icon icon="magnify" />}
      right={<TextInput.Affix text={`${text.length}/80`} />}
    />

    // After (v6)
    <TextInput
      label="Search"
      value={text}
      onChangeText={setText}
      startAccessory={(props) => <TextInput.Icon {...props} icon="magnify" />}
      endAccessory={(props) => (
        <TextInput.Icon {...props} icon="close" onPress={() => setText('')} />
      )}
    />

Replace <strong><code>TextInput.Affix</code></strong> with <strong><code>prefix</code></strong> / <strong><code>suffix</code></strong> for inline text, or a custom <strong><code>endAccessory</code></strong>:

    // Before (v5) — affix as trailing adornment
    <TextInput
      right={<TextInput.Affix text="/100" />}
      maxLength={100}
    />

    // After (v6) — prefix/suffix and/or counter
    <TextInput
      prefix="$"
      suffix="/100"
      maxLength={100}
      counter
    />

> <strong>Note:</strong> <code>prefix</code> and <code>suffix</code> are shown only when the label is floated (field focused or has a value).

Supporting text and errors

    // Before (v5)
    <>
      <TextInput label="Email" error={hasError} />
      <HelperText type="error" visible={hasError}>
        Enter a valid email
      </HelperText>
    </>

    // After (v6)
    <TextInput
      label="Email"
      error={hasError}
      supportingText={hasError ? 'Enter a valid email' : 'We will never share your email'}
    />

When <code>error</code> is <code>true</code> and no <code>endAccessory</code> is provided, a default error icon is shown on the trailing side.

Disabled vs read-only

    // Disabled — not editable, not focusable, disabled styling
    <TextInput disabled label="Email" value={email} />

    // Read-only — can focus and select text, but not edit
    <TextInput editable={false} label="Email" value={email} />

Styling and colors

Outline, underline, label, and disabled colors now come from the <strong>theme</strong>. Override input text with the standard <strong><code>style</code></strong> prop; override accent colors via <strong><code>theme</code></strong> or, where applicable, inherited props:

    // Before (v5)
    <TextInput
      dense
      contentStyle={{ paddingHorizontal: 12 }}
      outlineStyle={{ borderRadius: 12 }}
    * Switch props no longer extend native Switch. color, ios_backgroundColor, trackColor, thumbColor etc. are removed. Use the theme prop for color customization.


