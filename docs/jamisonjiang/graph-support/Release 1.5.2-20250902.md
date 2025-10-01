# Release 1.5.2

## release on 20250902
## description
## changes
<strong>Release 1.5.2</strong>

*** ** * ** ***

�� <strong>New Features</strong>

<strong>DOTQ Layout Engine</strong>

* <strong>New optimized layout algorithm</strong> specifically designed for large graphs
* Improved performance and layout quality for hierarchical graph structures
* More straighter long edges in large graph

*** ** * ** ***

⚡ <strong>Performance Improvements</strong>

<strong>Min-Crossing Algorithm Enhancements</strong>

* <strong>Median heuristic implementation</strong> for crossing calculations
* <strong>Crossing calculation caching</strong> for iterative improvements
* <strong>~10× faster iterations</strong> with significantly fewer final edge crossings
* Optimized memory usage during layout computation

*** ** * ** ***

��️ <strong>Stability &amp; Bug Fixes</strong>

<strong>Node-Cluster Overlap Resolution</strong>

* Resolved <strong>boundary interaction issues</strong> between nodes and clusters
* Enhanced <strong>overlap detection</strong> and resolution mechanisms

*** ** * ** ***

🏗️ <strong>Architecture &amp; Refactoring</strong>

<strong>Core Graph Data Layer Rebuild</strong>

* <strong>Complete reconstruction</strong> of the foundational graph data structure
* <strong>General-purpose design</strong> for broader component reuse
* <strong>Improved memory efficiency</strong> and data access patterns

*** ** * ** ***

�� <strong>Breaking Changes</strong> :warning: <strong>Note:</strong> This release maintains compatibility with 1.5.1. No breaking changes were introduced.

*** ** * ** ***

�� <strong>Migration from 1.5.1</strong>

<strong>Dependencies</strong>

Your existing Maven dependencies will continue to work:

    <dependency>
        <groupId>org.graphper</groupId>
        <artifactId>graph-support-core</artifactId>
        <version>1.5.2</version>
    </dependency>

<strong>API Compatibility</strong>

* All public APIs remain unchanged
* Existing code will work without modifications
* Performance improvements are automatic

*** ** * ** ***

🧪 <strong>Testing &amp; Validation</strong>

* <strong>Comprehensive test suite</strong> covering new DOTQ layout engine
* <strong>Performance benchmarks</strong> validating 10× speed improvement at mincross process
* <strong>Edge case testing</strong> for node-cluster interactions
* <strong>Regression testing</strong> ensuring 1.5.2 compatibility

*** ** * ** ***

�� <strong>Download</strong>

* <strong>Maven Central:</strong> Available immediately
* <strong>Source Code:</strong> <a href="https://github.com/jamisonjiang/graph-support/releases/tag/1.5.2">GitHub Release</a>
* <strong>Documentation:</strong> <a href="/jamisonjiang/graph-support/blob/v1.5.2/docs">Updated Documentation</a>

<strong>We recommend upgrading to 1.5.2 for the best performance and stability experience.</strong> 🎉

