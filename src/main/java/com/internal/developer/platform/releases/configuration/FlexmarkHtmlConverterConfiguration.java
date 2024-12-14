package com.internal.developer.platform.releases.configuration;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.html2md.converter.ExtensionConversion;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.html2md.converter.LinkConversion;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.misc.Ref;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlexmarkHtmlConverterConfiguration {

	@Bean
	public FlexmarkHtmlConverter flexmarkHtmlConverter(DataHolder options) {
		FlexmarkHtmlConverter.Builder builder = FlexmarkHtmlConverter.builder(options);
		return builder.build();
	}

	@Bean
	public DataHolder options() {
		DataHolder options = new MutableDataSet().set(FlexmarkHtmlConverter.OUTPUT_ATTRIBUTES_ID, true).set(FlexmarkHtmlConverter.OUTPUT_UNKNOWN_TAGS, true)
				.set(FlexmarkHtmlConverter.NBSP_TEXT, "&nbsp;").set(FlexmarkHtmlConverter.TYPOGRAPHIC_QUOTES, false)
				.set(FlexmarkHtmlConverter.TYPOGRAPHIC_SMARTS, false).set(FlexmarkHtmlConverter.WRAP_AUTO_LINKS, true)
				.set(FlexmarkHtmlConverter.WRAP_AUTO_LINKS, false).set(FlexmarkHtmlConverter.EXTRACT_AUTO_LINKS, false)
				.set(FlexmarkHtmlConverter.LISTS_END_ON_DOUBLE_BLANK, true).set(HtmlRenderer.SOURCE_POSITION_ATTRIBUTE, "md-pos")
				.set(FlexmarkHtmlConverter.PRE_CODE_PRESERVE_EMPHASIS, true).set(FlexmarkHtmlConverter.DIV_AS_PARAGRAPH, true)
				.set(FlexmarkHtmlConverter.SKIP_HEADING_1, true).set(FlexmarkHtmlConverter.SKIP_HEADING_2, true).set(FlexmarkHtmlConverter.SKIP_HEADING_3, true)
				.set(FlexmarkHtmlConverter.SKIP_HEADING_4, true).set(FlexmarkHtmlConverter.SKIP_HEADING_5, true).set(FlexmarkHtmlConverter.SKIP_HEADING_6, true)
				.set(FlexmarkHtmlConverter.SKIP_ATTRIBUTES, true).set(FlexmarkHtmlConverter.SKIP_FENCED_CODE, true)
				.set(FlexmarkHtmlConverter.SKIP_CHAR_ESCAPE, true).set(FlexmarkHtmlConverter.EXT_INLINE_STRONG, ExtensionConversion.TEXT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_EMPHASIS, ExtensionConversion.TEXT).set(FlexmarkHtmlConverter.EXT_INLINE_CODE, ExtensionConversion.TEXT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_DEL, ExtensionConversion.TEXT).set(FlexmarkHtmlConverter.EXT_INLINE_INS, ExtensionConversion.TEXT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_SUB, ExtensionConversion.TEXT).set(FlexmarkHtmlConverter.EXT_INLINE_SUP, ExtensionConversion.TEXT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_STRONG, ExtensionConversion.HTML).set(FlexmarkHtmlConverter.EXT_INLINE_EMPHASIS, ExtensionConversion.HTML)
				.set(FlexmarkHtmlConverter.EXT_INLINE_CODE, ExtensionConversion.HTML).set(FlexmarkHtmlConverter.EXT_INLINE_DEL, ExtensionConversion.HTML)
				.set(FlexmarkHtmlConverter.EXT_INLINE_INS, ExtensionConversion.HTML).set(FlexmarkHtmlConverter.EXT_INLINE_SUB, ExtensionConversion.HTML)
				.set(FlexmarkHtmlConverter.EXT_INLINE_SUP, ExtensionConversion.HTML).set(FlexmarkHtmlConverter.DIV_TABLE_PROCESSING, true)
				.set(FlexmarkHtmlConverter.OUTPUT_ID_ATTRIBUTE_REGEX, "").set(FlexmarkHtmlConverter.EXT_INLINE_LINK, LinkConversion.NONE)
				.set(FlexmarkHtmlConverter.EXT_INLINE_LINK, LinkConversion.MARKDOWN_EXPLICIT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_LINK, LinkConversion.MARKDOWN_REFERENCE)
				.set(FlexmarkHtmlConverter.UNIQUE_LINK_REF_ID_GENERATOR, (refId, index) -> String.format("%s - %d", refId, index))
				.set(FlexmarkHtmlConverter.EXT_INLINE_LINK, LinkConversion.TEXT).set(FlexmarkHtmlConverter.EXT_INLINE_LINK, LinkConversion.HTML)
				.set(FlexmarkHtmlConverter.EXT_INLINE_IMAGE, LinkConversion.NONE).set(FlexmarkHtmlConverter.EXT_INLINE_IMAGE, LinkConversion.MARKDOWN_EXPLICIT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_IMAGE, LinkConversion.MARKDOWN_REFERENCE).set(FlexmarkHtmlConverter.EXT_INLINE_IMAGE, LinkConversion.TEXT)
				.set(FlexmarkHtmlConverter.EXT_INLINE_IMAGE, LinkConversion.HTML).set(FlexmarkHtmlConverter.DOT_ONLY_NUMERIC_LISTS, false)
				.set(FlexmarkHtmlConverter.BR_AS_PARA_BREAKS, false).set(FlexmarkHtmlConverter.BR_AS_EXTRA_BLANK_LINES, false)
				.set(TableFormatOptions.FORMAT_TABLE_APPLY_COLUMN_ALIGNMENT, false).set(TableFormatOptions.FORMAT_TABLE_ADJUST_COLUMN_WIDTH, false)
				.set(FlexmarkHtmlConverter.IGNORE_TABLE_HEADING_AFTER_ROWS, true).set(FlexmarkHtmlConverter.EXT_MATH, ExtensionConversion.NONE)
				.set(FlexmarkHtmlConverter.EXT_MATH, ExtensionConversion.TEXT).set(FlexmarkHtmlConverter.EXT_MATH, ExtensionConversion.MARKDOWN)
				.set(FlexmarkHtmlConverter.TYPOGRAPHIC_REPLACEMENT_MAP, getTypographicReplacement())
				.set(FlexmarkHtmlConverter.FOR_DOCUMENT, new Ref<>(linkDocument()))
				// .set(Parser.EXTENSIONS, Collections.singletonList(HtmlConverterTextExtension.create()))
				.toImmutable();

		return options;
	}

	private Document linkDocument() {
		return Parser.builder().build().parse("" + "[example.com]: http://example.com\n" + "[example image]: http://example.com/image.png 'Title'\n" + "");
	}

	private Map<String, String> getTypographicReplacement() {
		HashMap<String, String> map = new HashMap<>();
		map.put("“", "''");
		map.put("”", "''");
		map.put("&ldquo;", "''");
		map.put("&rdquo;", "''");
		map.put("‘", "'");
		map.put("’", "'");
		map.put("&lsquo;", "'");
		map.put("&rsquo;", "'");
		map.put("&apos;", "'");
		map.put("«", "<<<<");
		map.put("&laquo;", "<<<<");
		map.put("»", ">>>>");
		map.put("&raquo;", ">>>>");
		map.put("…", " etc.");
		map.put("&hellip;", " etc.");
		map.put("–", "--");
		map.put("&endash;", "--");
		map.put("—", "---");
		map.put("&emdash;", "---");
		return map;
	}
}
