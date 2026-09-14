# Release 1.5.4

## release on 20260909
## description
## changes
Highlights

Node and arrow shapes

* Added the node shapes and aliases <code>rectangle</code>, <code>oval</code>, <code>none</code>, <code>square</code>, <code>polygon</code>, <code>house</code>, <code>invhouse</code>, <code>doublecircle</code>, <code>doubleoctagon</code>, <code>tripleoctagon</code>, <code>Mdiamond</code>, <code>Msquare</code>, <code>Mcircle</code>, <code>tab</code>, <code>folder</code>, <code>box3d</code>, and <code>component</code>.
* Added <code>sides=3..20</code> for <code>polygon</code>, so triangles and other regular polygons no longer require a workaround.
* Added the arrow shapes <code>diamond</code>, <code>inv</code>, <code>tee</code>, <code>crow</code>, <code>icurve</code>, <code>onormal</code>, <code>oinv</code>, <code>obox</code>, <code>odot</code>, and <code>odiamond</code>, plus the DOT aliases <code>empty</code>, <code>invempty</code>, and <code>open</code>.
* Added <code>samehead</code> and <code>sametail</code> for shared edge endpoints, <code>regular</code> node sizing, and <code>constraint=false</code> for edges that should not affect ranking.
* Added <code>PORT</code> support for HTML table cells and owner-local cell identity, so repeated cell IDs in different labels no longer collide.
* <code>component</code> uses a simplified inset-terminal outline rather than Graphviz's protruding terminals.

Layout quality

* Fixed same-rank flat edge crossing accounting, including single-rank and last-rank graphs, explicit <code>rank=same</code> edges, cross-cluster ordering, and <code>rankdir=LR</code>/<code>RL</code> direction preferences.
* Added cluster-aware edge routing that detours around unrelated clusters on a best-effort basis, without moving nodes or routing through them.
* Fixed cubic Bezier evaluation, which previously returned an incorrect point for every curve.
* Improved endpoint label placement and reduced label collisions.
* Removed an ineffective ordering pass that dominated layout time on large graphs.

Image and conversion security

* Added <code>SecurityPolicy</code> to control image access. Bounded embedded data images work by default; filesystem and remote images require explicit opt-in.
* Remote image fetching validates every resolved address, connects only to a validated address, keeps TLS hostname verification, rejects redirects, and enforces byte, pixel, and time budgets.
* Raw SVG conversion accepts a restricted static subset with structural and image budgets. Scripts, event handlers, and reference instancing are rejected, and conversion fails closed when Batik security hints are unavailable.
* Added <code>--allow-image-host</code> and <code>--image-dir</code> to the CLI, with the same configuration available in the desktop editor.

Portability and build

* Kept graph construction, layout, and SVG output free of optional platform APIs, so a missing AWT, ImageIO, TLS, or filesystem API disables only the affected feature.
* Non-interactive CLI commands now default to headless mode; the <code>ui</code> command keeps the environment's graphics mode.
* Maven <code>validate</code> enforces a Google Java Style subset and the core dependency boundary.

Compatibility

* Java 8+ remains supported. No native Graphviz installation is required.
* TIFF export requires an ImageIO TIFF writer, which default Java 8 runtimes do not provide. Other formats are unaffected.
* Batik 1.19 and FOP 2.11 replace 1.9 and 2.4. Applications supplying their own rendering dependencies should check these versions, including the FontBox 3.x change.
* External images now require an explicit <code>SecurityPolicy</code>. A rejected reference is omitted with a warning, and its reserved space can remain blank.
* Layout output can change where ordering and routing improved. Compare important diagrams before upgrading.

Maven Central

    <dependency>
      <groupId>org.graphper</groupId>
      <artifactId>graph-support-core</artifactId>
      <version>1.5.4</version>
    </dependency>

Also available: <code>graph-support-dot</code>, <code>graph-support-ui</code>, and <code>graph-support-cli</code>.

* Maven Central: <a href="https://central.sonatype.com/artifact/org.graphper/graph-support-core/1.5.4" rel="nofollow">https://central.sonatype.com/artifact/org.graphper/graph-support-core/1.5.4</a>
* Documentation: <a href="https://github.com/jamisonjiang/graph-support/tree/v1.5.4/docs">https://github.com/jamisonjiang/graph-support/tree/v1.5.4/docs</a>

Validation

* Core: 729 tests passed
* DOT: 83 tests passed
* UI: 47 tests passed
* Integration/visual: 597 tests passed
* CLI: 13 tests passed
* Full reactor: <code>BUILD SUCCESS</code>, tests run headless by default

