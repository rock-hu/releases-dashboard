# Spring AI 1.1.0-M3

## release on 20251015
## description
## changes
Spring AI 1.1.0-M3 Release Notes

🎯 Highlights

<strong>Model Context Protocol (MCP) Java SDK 0.14.0 Upgrade</strong>

This release primarily focuses on upgrading to the Model Context Protocol (MCP) Java SDK version 0.14.0, bringing significant improvements to Spring AI's MCP integration capabilities. Key enhancements include:

* <strong>Enhanced Resource Template Management</strong>: Improved resource template API consistency and management capabilities
* <strong>Robust Error Handling</strong>: Better resilience for MCP server interactions with proper handling of non-compliant responses and edge cases
* <strong>Spec Compliance Improvements</strong>: Proper resource not found handling and fixes for Content-Length: 0 responses
* <strong>Client-Side Validation</strong>: New tool output schema validation and caching for improved client reliability
* <strong>API Refinements</strong>: Better JSON type handling, consistent naming conventions, and optional lastModified field support in Annotations

These foundational improvements strengthen Spring AI's MCP implementation, providing a more reliable and feature-rich Model Context Protocol experience.

<strong>Additional Updates</strong>

This release also includes 7 new features, 11 bug fixes, 9 documentation improvements, and 16 other improvements across the Spring AI ecosystem.

⭐ New Features

* MarkdownDocumentReader now supports processing multiple documents in a single operation <a href="https://github.com/spring-projects/spring-ai/commit/499ab3ee75df3a395fb0b2c1216fb9bce924bc82">499ab3e</a>
* Added Azure Cosmos DB integration for chat memory persistence <a href="https://github.com/spring-projects/spring-ai/commit/1a35e8a65b56e01e209c1f167095f8a7ed083216">1a35e8a</a>
* Improved error handling with fallback messages when tool execution encounters blank errors <a href="https://github.com/spring-projects/spring-ai/commit/f2d57cc3fd0bca467d47ae8b68113e4eef32815d">f2d57cc</a>
* Added support for the latest Claude models with improved naming conventions in the Anthropic integration <a href="https://github.com/spring-projects/spring-ai/pull/4516" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4516/hovercard">#4516</a>
* Added metadata filtering capabilities to GemFireVectorStore for more precise vector search queries <a href="https://github.com/spring-projects/spring-ai/commit/78c5e001d39e40f0da1f5b7b2b78a38f2047c01f">78c5e00</a>
* Added MCP resource template support to server auto-configurations, enabling enhanced Model Context Protocol capabilities <a href="https://github.com/spring-projects/spring-ai/commit/97ac810821173bdc998cf00d1e57912f18b013f3">97ac810</a>
* Introduced builder pattern support across the Mistral module for improved API usability <a href="https://github.com/spring-projects/spring-ai/commit/b8dfc090b0af53dcdaa52a9d8bf8f50fe25441a2">b8dfc09</a>

🪲 Bug Fixes

* Improved tool/function calling reliability by adding a special warning when LLMs change tool names during execution <a href="https://github.com/spring-projects/spring-ai/pull/4349" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4349/hovercard">#4349</a>
* Resolved issues with JsonSchemaGenerator when processing method input parameters, particularly for Mistral AI integration <a href="https://github.com/spring-projects/spring-ai/pull/4524" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4524/hovercard">#4524</a>
* Corrected property access syntax in StTemplateRender for proper template rendering <a href="https://github.com/spring-projects/spring-ai/commit/0cea262258b31a335f97505a69a5ac5a47baf5bd">0cea262</a>
* Corrected test configuration issues for MistralAI integration <a href="https://github.com/spring-projects/spring-ai/commit/4408c4620e622ede10bedac9c36703fa8a838d97">4408c46</a>
* Fixed inconsistency where parameterized render(Map) failed to handle Resource in variables compared to no-arg render <a href="https://github.com/spring-projects/spring-ai/commit/0fd9fd59107569047c4d3fa17a6183ee3c4e3d95">0fd9fd5</a>
* Resolved issues with Jackson module loading by not using the Thread Context ClassLoader <a href="https://github.com/spring-projects/spring-ai/pull/4515" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4515/hovercard">#4515</a> via <a href="https://github.com/spring-projects/spring-ai/issues/2921" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/2921/hovercard">#2921</a>
* Enhanced robustness of mergeToolUseEvents in StreamHelper and fixed handling of thinkingBlock.signature in event-to-response conversion <a href="https://github.com/spring-projects/spring-ai/commit/9907b2c1f9efff8ddec684c1888c40442126513e">9907b2c</a>
* Removed unused member variables to improve code maintainability <a href="https://github.com/spring-projects/spring-ai/pull/4489" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4489/hovercard">#4489</a>
* Fixed Ollama auto-configuration issues to ensure proper initialization <a href="https://github.com/spring-projects/spring-ai/commit/b915413b3caf189221f5ed28740ee72da00f992c">b915413</a>
* Resolved an issue in the OllamaApiHelper component <a href="https://github.com/spring-projects/spring-ai/commit/5d8907f3cfc7a66f37de7dd6bd7ec2a511e7a238">5d8907f</a>
* Cleaned up the initializeContainer method by removing redundant parameters and assignments <a href="https://github.com/spring-projects/spring-ai/commit/84efb6a63628e80a1bb848524d3b8c43a9fbcd3c">84efb6a</a>

📓 Documentation

* Added comprehensive security reference documentation for Model Context Protocol integration <a href="https://github.com/spring-projects/spring-ai/pull/4532" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4532/hovercard">#4532</a>
* Updated documentation to include Z.ai international site information and GLM-4.6 model support <a href="https://github.com/spring-projects/spring-ai/pull/4539" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4539/hovercard">#4539</a>
* Updated documentation to reflect Spring Boot 3.5 release availability <a href="https://github.com/spring-projects/spring-ai/pull/4530" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4530/hovercard">#4530</a>
* Improved documentation formatting by using inline literals <a href="https://github.com/spring-projects/spring-ai/commit/54f51271dcd0c766e103efaadf8e78a458d542cb">54f5127</a>
* Added documentation for metadata filtering capabilities in GemFireVectorStore <a href="https://github.com/spring-projects/spring-ai/commit/d83c82650cd20298436b837ec4f939756d173303">d83c826</a>
* Corrected typo in ollama-embeddings.adoc documentation <a href="https://github.com/spring-projects/spring-ai/commit/9555a61c2eda0daf47da0816692d2d487251ae92">9555a61</a>
* Corrected example code error in ChatMemory documentation for CassandraChatMemoryRepository <a href="https://github.com/spring-projects/spring-ai/pull/4476" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4476/hovercard">#4476</a>
* Fixed example code errors in multimodality documentation <a href="https://github.com/spring-projects/spring-ai/pull/4475" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4475/hovercard">#4475</a>
* Fixed incorrect class reference in MCP-related documentation <a href="https://github.com/spring-projects/spring-ai/pull/4466" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4466/hovercard">#4466</a>

🔨 Dependency Upgrades

Model Context Protocol (MCP) Java SDK 0.14.0

<strong>Primary motivation for this release</strong> - Upgraded to MCP Java SDK 0.14.0 and mcp-annotations to 0.5.1 <a href="https://github.com/spring-projects/spring-ai/pull/4531" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4531/hovercard">#4531</a>

This major upgrade brings critical improvements to Spring AI's MCP integration:

* <strong>Resource Template Management</strong>: Refactored resource template API for better consistency and usability
* <strong>Error Resilience</strong>: Enhanced server error handling with proper management of non-compliant notification responses and Content-Length: 0 scenarios
* <strong>Spec Compliance</strong>: Proper resource not found handling according to MCP specification
* <strong>Client Validation</strong>: Added tool output schema validation and caching capabilities
* <strong>JSON Handling</strong>: Fixed JsonTypeInfo.DEDUCTION to avoid unnecessary includes
* <strong>API Consistency</strong>: Corrected MCP_SESSION_ID naming convention for consistent identifier style
* <strong>Annotations Enhancement</strong>: Added optional lastModified field to Annotations record

For complete details, see the <a href="https://github.com/modelcontextprotocol/java-sdk/releases/tag/v0.14.0">MCP Java SDK 0.14.0 release notes</a>.

Other Dependency Updates

* Upgraded Apache Tika to 3.2.3 from 3.2.1 and jsoup to 1.21.2 from 1.21.1, resolving <a title="CVE-2025-54988" data-hovercard-type="advisory" data-hovercard-url="/advisories/GHSA-p72g-pv48-7w9x/hovercard" href="https://github.com/advisories/GHSA-p72g-pv48-7w9x">CVE-2025-54988</a> <a href="https://github.com/spring-projects/spring-ai/pull/4504" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4504/hovercard">#4504</a>
* Upgraded the Couchbase client SDK to a newer version <a href="https://github.com/spring-projects/spring-ai/commit/351fbbbae134e4c5f626398cc7005a9a9ee191d5">351fbbb</a>

🔩 Build Updates

* Improved test coverage for KnuddelsRuntimeHints <a href="https://github.com/spring-projects/spring-ai/commit/d0c9e863e4eb2ddb49ecb79d90adf31f601ed7ea">d0c9e86</a>
* Migrated to AssertJ's assertThatExceptionOfType for better test readability <a href="https://github.com/spring-projects/spring-ai/pull/4544" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4544/hovercard">#4544</a>
* Fixed indentation for environment variables and added tracing to git checkout operations <a href="https://github.com/spring-projects/spring-ai/commit/0f436b4cbf44b63b45b17970550a0b7923139a44">0f436b4</a>
* Improved logging consistency with type-assured parameter binding <a href="https://github.com/spring-projects/spring-ai/commit/17c8e9e0cfd2d6a291911d2f24246130d4207596">17c8e9e</a>
* Expanded test coverage for Milvus vector database integration <a href="https://github.com/spring-projects/spring-ai/commit/d016b1010df30303692c295db45ff58180437fb1">d016b10</a>
* Improved test coverage for MCP tool callback builder functionality <a href="https://github.com/spring-projects/spring-ai/commit/46b917070d4396ab0ee4296021c9016c6c9a1237">46b9170</a>
* Improved test coverage for Mistral AI bindings properties processor <a href="https://github.com/spring-projects/spring-ai/pull/4483" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4483/hovercard">#4483</a>
* Added autoconfigure-mcp-server-common to Bill of Materials for improved dependency management <a href="https://github.com/spring-projects/spring-ai/commit/f9071963c34dbdf836c9aeb2dfc7912281b6b083">f907196</a>
* Refactored McpToolUtils to use builder pattern instead of deprecated constructors <a href="https://github.com/spring-projects/spring-ai/commit/8a2d86b3abd93efe141476c59079a94068ba1109">8a2d86b</a>
* Improved test coverage for MultiQueryExpander, StreamHelper, and Query classes <a href="https://github.com/spring-projects/spring-ai/pull/4473" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4473/hovercard">#4473</a>
* Added missing operator and edge case tests for AzureAiSearchFilterExpressionConverter <a href="https://github.com/spring-projects/spring-ai/pull/4467" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4467/hovercard">#4467</a>
* Added comprehensive null safety and configuration tests for Azure OpenAI embeddings and Google GenAI runtime hints <a href="https://github.com/spring-projects/spring-ai/pull/4456" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4456/hovercard">#4456</a>

🔐 Security

* Resolved security vulnerability <a title="CVE-2025-54988" data-hovercard-type="advisory" data-hovercard-url="/advisories/GHSA-p72g-pv48-7w9x/hovercard" href="https://github.com/advisories/GHSA-p72g-pv48-7w9x">CVE-2025-54988</a> through dependency upgrades of Tika and jsoup <a href="https://github.com/spring-projects/spring-ai/pull/4504" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4504/hovercard">#4504</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/andrei.shakirin">ashakirin (@andrei.shakirin)</a>
* <a href="https://github.com/kirkster96">Cameron Kirk (@kirkster96)</a>
* <a href="https://github.com/cho">cho-thinkfree-com (@cho)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/imzhouchen">codeboyzhou (@imzhouchen)</a>
* <a href="https://github.com/git">Daniel Garnier-Moiroux (@git)</a>
* <a href="https://github.com/dafriz">David Frizelle (@dafriz)</a>
* <a href="https://github.com/dmitrii.chechetkin">Dmitrii Chechetkin (@dmitrii.chechetkin)</a>
* <a href="https://github.com/bottarde">Eric Bottard (@bottarde)</a>
* <a href="https://github.com/crad_on25">Hyoseop Song (@crad_on25)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/james">James Ward (@james)</a>
* <a href="https://github.com/jason.huynh">Jason Huynh (@jason.huynh)</a>
* <a href="https://github.com/jasonparallel">Jason Smith (@jasonparallel)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/markpollack">Mark Pollack (@markpollack)</a>
* <a href="https://github.com/nathangrand">NathanGrand (@nathangrand)</a>
* <a href="https://github.com/nils">Nils Breunese (@nils)</a>
* <a href="https://github.com/alexanderklmn">Oleksandr Klymenko (@alexanderklmn)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/theo.van">Theo van Kraay (@theo.van)</a>
* <a href="https://github.com/ngocnhan.tran1996">Tran Ngoc Nhan (@ngocnhan.tran1996)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/eeaters">YuJie Wan (@eeaters)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>

