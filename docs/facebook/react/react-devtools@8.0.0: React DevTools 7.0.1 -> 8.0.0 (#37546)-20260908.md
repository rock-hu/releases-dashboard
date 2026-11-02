# react-devtools@8.0.0: React DevTools 7.0.1 -> 8.0.0 (#37546)

## release on 20260908
## description
## changes
Summary

* Bump React DevTools from 7.0.1 to 8.0.0 (packages + extension  
  manifests only; no publish).
* <code>scripts/devtools/prepare-release.js</code> only supports minor/patch, so  
  this major bump is manual.
* Changelog is curated from DevTools commits since 7.0.1 (features vs  
  bugfixes; internal/test-only changes omitted).

Test plan

* [ ] Confirm published package versions would be 8.0.0 for  
  <code>react-devtools</code>, <code>react-devtools-core</code>, and <code>react-devtools-inline</code>
* [ ] Confirm Chrome/Edge/Firefox extension manifests show 8.0.0
* [ ] Review <code>packages/react-devtools/CHANGELOG.md</code> 8.0.0 section for  
  accuracy before undrafting

