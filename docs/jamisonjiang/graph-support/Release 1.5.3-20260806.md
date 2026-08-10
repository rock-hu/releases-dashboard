# Release 1.5.3

## release on 20260806
## description
## changes
Highlights

Rich labels and record nodes

* Added the structured <code>RecordTag</code> Java API for nested record cells, rich text, and stable port IDs.
* Added rich HTML-like record labels in DOT with bold, italic, underline, color, font, subscript, superscript, multiline text, and nested cells.
* Kept quoted record labels compatible while unifying their geometry with the structured implementation.
* Added Graphviz-compatible <code>\l</code>, <code>\r</code>, and <code>\n</code> line alignment for node, record, graph, cluster, edge, and floating labels.

Desktop DOT Studio

* Added an optional Swing desktop editor with live SVG preview.
* Includes DOT syntax highlighting, completion, snippets, bracket pairing, smart indentation, inline syntax-error squiggles, open/save, SVG/PNG export, pan, zoom, Fit, and live zoom percentage.
* Launch from the CLI JAR with <code>java -jar graph-support-cli.jar ui</code>.

SVG and Graphviz compatibility

* Added transparent SVG/PNG backgrounds through <code>bgcolor="transparent"</code>, <code>style="transparent"</code>, or <code>Color.TRANSPARENT</code>.
* Added readable, indented SVG output and semantic CSS classes for graphs, clusters, nodes, edges, shapes, labels, paths, curves, arrowheads, and backgrounds.
* Tightened SVG canvases for explicit <code>margin="0,0"</code> while preserving a small antialiasing safety edge.

Stability

* Fixed <code>NetworkSimplex</code> rank balancing failures for <code>minlen=0</code> edges.
* Fixed a min-cross transpose oscillation that could loop indefinitely.
* Added deterministic geometry, round-trip, fuzz, rendering, and regression coverage.

Compatibility

* Java 8+ remains supported.
* Existing Java and quoted DOT record labels remain compatible.
* No native Graphviz installation is required.

Maven Central

    <dependency>
      <groupId>org.graphper</groupId>
      <artifactId>graph-support-core</artifactId>
      <version>1.5.3</version>
    </dependency>

Also available: <code>graph-support-dot</code>, <code>graph-support-ui</code>, and <code>graph-support-cli</code>.

* Maven Central: <a href="https://central.sonatype.com/artifact/org.graphper/graph-support-core/1.5.3" rel="nofollow">https://central.sonatype.com/artifact/org.graphper/graph-support-core/1.5.3</a>
* Documentation: <a href="https://github.com/jamisonjiang/graph-support/tree/v1.5.3/docs">https://github.com/jamisonjiang/graph-support/tree/v1.5.3/docs</a>

Validation

* Core: 245 tests passed
* DOT: 23 tests passed
* UI: 31 tests passed
* Integration/visual: 556 tests passed
* CLI: 2 tests passed
* Full reactor: <code>BUILD SUCCESS</code>

