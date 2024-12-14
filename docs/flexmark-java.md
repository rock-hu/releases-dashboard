# flexmark-java

## flexmark-html2md-converter

Converts HTML to Markdown, assumes all non-application specific extensions are going to be used:

- abbreviations
- aside
- block quotes
- bold, italic, inline code
- bullet and numbered lists
- definition
- fenced code
- strike through
- subscript
- superscript
- tables
- Gfm Task list item
- will also handle conversion for multi-line URL images

`FlexmarkHtmlConverter.builder(options).build().convert(htmlString)`

## 

```java
public class FlexmarkHtmlConverter {
    public String convert(@NotNull String html, int maxTrailingBlankLines) {
        Document document = Jsoup.parse(html);

        if (DUMP_HTML_TREE.get(getOptions())) {
            LineAppendableImpl trace = new LineAppendableImpl(LineAppendable.F_TRIM_LEADING_EOL);
            trace.setIndentPrefix("  ");
            dumpHtmlTree(trace, document.body());
            System.out.println(trace.toString(0, 0));
        }

        MainHtmlConverter converter = new MainHtmlConverter(options, new HtmlMarkdownWriter(htmlConverterOptions.formatFlags), document, null);
        converter.render(document);

        return converter.getMarkdown().toString(htmlConverterOptions.maxBlankLines, maxTrailingBlankLines);
    }

    public void convert(Node node, Appendable output, int maxTrailingBlankLines) {
        MainHtmlConverter renderer = new MainHtmlConverter(options, new HtmlMarkdownWriter(htmlConverterOptions.formatFlags), node.ownerDocument(), null);
        renderer.render(node);
        renderer.flushTo(output, htmlConverterOptions.maxBlankLines, maxTrailingBlankLines);
    }
}
```

