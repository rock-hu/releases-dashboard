# 🔮 Fable Full-Codebase Audit

## release on 20260707
## description
## changes
Breaking changes

* <strong><code>tsconfig</code> target <code>es5</code> → <code>es2017</code>.</strong> <code>functools-kit@4</code> ships native ES2015 classes; ES5-transpiled <code>extends</code> (Model/Collection, RouteManager) crashed at runtime with <em>"Class constructor cannot be invoked without 'new'"</em>.
* Date utilities migrated to the pure-UTC <code>get-moment-stamp</code>. <code>addUtcOffset</code>/<code>removeUtcOffset</code> were <strong>removed</strong> (replaced in the public API by <code>isCurrentDate</code>, <code>isCurrentTime</code>, <code>fromTimeStampWithMoment</code>); <code>getMomentStamp</code>/<code>fromMomentStamp</code> lost their <code>dimension</code> parameter; <code>getGenesisStamp(stamp)</code> now takes a number (moment stamp) instead of a dayjs object. Stamps are now machine-timezone-independent, and an off-by-one for western timezones in <code>Date.toStamp</code> is fixed.

Re-export shims

<strong>64 modules</strong> became thin re-export shims (files kept for import-path stability): all of <code>src/utils/hof</code> (18), <code>src/utils/math</code> (9), <code>src/utils/rx</code> (Subject/Observer/Source/…, with the <code>lib</code>/<code>source</code>/<code>helpers</code> subfolders removed), 21 top-level utils, and all of <code>src/api</code> (10).

Notable fixes

* <strong><code>promiseState</code>/<code>promiseValue</code></strong> always returned <code>'async'</code>/<code>null</code> (the <code>.then</code> callback is a microtask that runs after <code>return</code>), so <code>&lt;If /&gt;</code> always started with <code>pass=false</code> even for synchronous conditions — now a synchronous <code>instanceof Promise</code> check.
* <strong><code>useApiPaginator</code> / <code>useApiHandler</code></strong> captured <code>abortManager.signal</code> once on mount; after any unrelated <code>abort()</code> the component was stuck with an already-aborted signal and every request silently returned empty — the signal is now read per-request.
* <strong><code>ArraySet</code></strong> — three bugs (the species constructor made <code>.filter()</code>/<code>.map()</code>/<code>.slice()</code> throw; single-element numeric arrays produced sparse arrays) rewritten via <code>super() + super.push(...)</code>.
* <strong><code>useOutletModal</code> / <code>useWizardModal</code> / <code>useTabsModal</code> / <code>useSearchModal</code></strong> leaked <code>window.open</code> (always truthy) as their documented <code>open</code> boolean — now derived from the backing subject.
* <strong><code>ChatView</code></strong> — a mis-indexed <code>removeOnMessagesChanged</code> disabled a random action handler; missing effect cleanups and singleton <code>MediaRecorder</code> listeners caused duplicated audio chunks.
* <strong><code>CalendarView</code></strong> — <code>useMemo([])</code> froze props/context and header stamp ranges at mount, so paging months or changing handlers after mount was ignored; the selected day is now visually marked.
* Plus fixes across <code>Countdown</code>, <code>ErrorBoundary</code>, <code>useSearchState</code>, <code>useSearchParams</code>, <code>useSelection</code>, <code>useIntersection</code>, <code>useMediaStreamBuilder</code>, <code>useArrayPaginator</code>, <code>Grid</code> offset pagination, MVVM <code>Entity</code>/<code>Collection</code> identity, <code>routeManager</code>, <code>Switch</code> route sorting, <code>InfiniteView</code>/<code>VirtualView</code> vertical scroll, <code>wordForm</code>, <code>normalizeText</code>, <code>formatAmount</code>, <code>toRouteUrl</code>, and <code>cacheSrc</code>/<code>downloadBlank</code> resource leaks.

