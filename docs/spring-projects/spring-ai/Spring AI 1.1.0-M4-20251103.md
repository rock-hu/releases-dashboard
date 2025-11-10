# Spring AI 1.1.0-M4

## release on 20251103
## description
## changes
Spring AI 1.1.0-M4 Release Notes

🎯 Highlights

This release includes 27 new features, 35 bug fixes, 15 documentation improvements, 41 other improvements.

:warning: Upgrading Notes

* Migrate from the deprecated public constructor to the builder pattern when creating QuestionAnswerAdvisor instances <a href="https://github.com/spring-projects/spring-ai/commit/adf4efe38e9132509100ada62fc9de4c4646e127">adf4efe</a>

📢 Noteworthy

* Two commits related to MCP ObjectMapper factory and JSON schema upgrade were reverted to maintain stability. <a href="https://github.com/spring-projects/spring-ai/commit/132d50b3ecb48e5c1b8ed77da68630803e80b123">132d50b</a>
* Updated OpenAI moderation integration from deprecated text-moderation-latest to the new omni-moderation-latest model, including integration test updates <a href="https://github.com/spring-projects/spring-ai/pull/4722" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4722/hovercard">#4722</a>
* Updated Anthropic integration tests to remove usage of deprecated model versions <a href="https://github.com/spring-projects/spring-ai/commit/9e787960f26ea56a3a5603236dcff40d1faefee9">9e78796</a>
* The public constructor of QuestionAnswerAdvisor is now deprecated in favor of using the builder pattern for improved API design <a href="https://github.com/spring-projects/spring-ai/commit/adf4efe38e9132509100ada62fc9de4c4646e127">adf4efe</a>

⭐ New Features

* Advisors now support configurable observations, providing better control over observability behavior in AI workflows. <a href="https://github.com/spring-projects/spring-ai/commit/3cf3db16fa9a1c5130d1cf8647dce6623d0e0a01">3cf3db1</a>
* Chat client now logs completion data and makes response text available in the Observation Context for improved monitoring and debugging. <a href="https://github.com/spring-projects/spring-ai/commit/13de2192c3fe42a2af507396c0f4f0d3fcaaee67">13de219</a>
* Added support for Oracle JDBC in ChatMemoryRepository, enabling Oracle database backends for conversation memory storage <a href="https://github.com/spring-projects/spring-ai/commit/30af4e81c127e5919cabbc3c398da1114d6bd846">30af4e8</a>
* Added support for recursive advisor execution, enabling advisors to call other advisors in a chain. Includes two new built-in advisors to facilitate advanced use cases. <a href="https://github.com/spring-projects/spring-ai/commit/323c590cd6646e356bbc810e9b74bd9fcafbf8e4">323c590</a>
* Introduced H2ChatMemoryRepositoryDialect to enable H2 database support for JDBC-based chat memory storage. <a href="https://github.com/spring-projects/spring-ai/commit/0b0024e8ffda98e631d5b704529aeb6eba28c6eb">0b0024e</a>
* Added Oracle and SQLite database dialect support for JDBC chat memory, expanding database compatibility options. <a href="https://github.com/spring-projects/spring-ai/commit/673f48366462515f37ea9645a2061f311e315950">673f483</a>
* Expanded OpenAI integration to support more transcription and text-to-speech (TTS) models, providing greater flexibility for audio processing. <a href="https://github.com/spring-projects/spring-ai/commit/bdb7ea55585013a7c27bf15447f067acd04138f8">bdb7ea5</a>
* Enhanced TextSplitter functionality to preserve document properties and track metadata through text splitting operations, improving RAG pipeline capabilities. <a href="https://github.com/spring-projects/spring-ai/commit/b452e893be77e46e6438e324ed231888c5a8d921">b452e89</a>
* Added support for Anthropic's Citations API, enabling retrieval of source citations in model responses <a href="https://github.com/spring-projects/spring-ai/commit/e91eda9bdfb7f8fa223707d525c5f790319215b3">e91eda9</a>
* Added support for Mistral AI's codestral embedding model for code-focused embedding generation <a href="https://github.com/spring-projects/spring-ai/commit/ea48e177d125e18b323383c20c5b0a026a849db6">ea48e17</a>
* Added usage field to ChatCompletionChunk for ZhipuAI to track token consumption during streaming operations <a href="https://github.com/spring-projects/spring-ai/commit/d619727e15a225474d59a098179ce4994b2a71ff">d619727</a>
* Added additional timeout configuration options for AWS Bedrock to provide more granular control over request timeouts <a href="https://github.com/spring-projects/spring-ai/commit/34fc6911ee4bf286a240960f01f749a85e9c1f79">34fc691</a>
* Added User-Agent header with 'spring-ai' value to OpenAI API client for better request identification and tracking <a href="https://github.com/spring-projects/spring-ai/commit/62fc70f6fd527622e497867652ccc2a4936b9e11">62fc70f</a>
* Enables prompt caching functionality for AWS Bedrock Converse API to improve performance and reduce costs by caching frequently used prompts. <a href="https://github.com/spring-projects/spring-ai/commit/58cf35ea2a3c90cb3187b3c52d79382564514fd9">58cf35e</a>
* Adds approximate k-nearest neighbor search capabilities to the OpenSearch vector store integration for improved query performance on large datasets. <a href="https://github.com/spring-projects/spring-ai/commit/5df83cb74f074a4d3bfcf51bbc497325479a39b2">5df83cb</a>
* Introduces new testing utilities to simplify Spring AI test configuration and improve developer experience when writing tests. <a href="https://github.com/spring-projects/spring-ai/commit/8b9f730f4a1ac67f44dc95e843d789ce5ea2ade5">8b9f730</a>
* Introduced a unified request context API for Model Context Protocol (MCP) integration with enhanced documentation <a href="https://github.com/spring-projects/spring-ai/commit/3e6084c5edb54b4d1327f1320daa742c8e676e0c">3e6084c</a>
* Added Builder class to FactCheckingEvaluator for more convenient and flexible configuration <a href="https://github.com/spring-projects/spring-ai/issues/4652" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4652/hovercard">#4652</a>
* Added tool choice capability for Anthropic chat model allowing better control over function calling behavior <a href="https://github.com/spring-projects/spring-ai/pull/4637" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4637/hovercard">#4637</a>
* Applications can now provide custom RouterFunction implementations for enhanced routing control <a href="https://github.com/spring-projects/spring-ai/commit/b99f26df7c4d31060eda8900f00f5a4f692eab66">b99f26d</a>
* Enhanced MimeTypeDetector to handle URLs with query parameters and added comprehensive edge case validation tests <a href="https://github.com/spring-projects/spring-ai/commit/3f793732bf83bf9fb6527b15a558c1a7007d41ed">3f79373</a>
* Added STErrorListener bridge to SLF4J for improved error logging and diagnostics <a href="https://github.com/spring-projects/spring-ai/commit/940bcf30aa8b7f478b9515f238269681c1a9a9c0">940bcf3</a>
* Enhanced filter expression parsing to support long integer values, expanding query capabilities in vector store operations <a href="https://github.com/spring-projects/spring-ai/commit/107ab68a178d8f4bf795af1de4384b55b9a31637">107ab68</a>
* Introduces builder pattern support for ToolResponseMessage, improving API usability and message construction <a href="https://github.com/spring-projects/spring-ai/commit/2ded9cd4b53433930f6864a756f8cf0e8906c0e7">2ded9cd</a>
* Added builder pattern support for ZhiPuAiAssistantMessage class with corresponding unit tests for improved API usability <a href="https://github.com/spring-projects/spring-ai/commit/01082b8bf1972efdc82cff101fbca5418aba2552">01082b8</a>
* Added builder pattern support for DeepSeekAssistantMessage class with corresponding unit tests for improved API usability <a href="https://github.com/spring-projects/spring-ai/commit/7d0aff063589c47380843e0d8bdeac31bb6a2bc5">7d0aff0</a>
* Added support for OpenAI's File API, enabling file uploads and management capabilities for OpenAI models <a href="https://github.com/spring-projects/spring-ai/commit/087393b15ef4ea85e876d8214b4317966624384e">087393b</a>

🪲 Bug Fixes

* Resolved integration test failures in the Elasticsearch module. <a href="https://github.com/spring-projects/spring-ai/commit/a5720099d9dfdf3584b7694a810da7d6722de4cf">a572009</a>
* Corrected broken documentation link in Google GenAI integration guide <a href="https://github.com/spring-projects/spring-ai/commit/bb91c5f29e858a1973f42275b3e2b98e2a098f8a">bb91c5f</a>
* Resolved issues with streaming responses in Azure OpenAI chat model integration <a href="https://github.com/spring-projects/spring-ai/commit/50db344520d844137a567f6bd178dce73a44ba02">50db344</a>
* Corrected message ordering issues affecting MySQL and MariaDB databases in JDBC-based chat memory storage <a href="https://github.com/spring-projects/spring-ai/commit/d2492a6d561b6ff11e279e33ef216625447472f6">d2492a6</a>
* Fixed issue where MCP tool callback providers were incorrectly injected into the tool callback resolver <a href="https://github.com/spring-projects/spring-ai/commit/febf86c08d6c6b8bf318d468deec4f0231fbd9fb">febf86c</a>
* Updated and improved the FactCheckingEvaluator for better accuracy and reliability in fact-checking operations. <a href="https://github.com/spring-projects/spring-ai/commit/e81cd08e90809924d9a424ff592fd2d12f1beb0a">e81cd08</a>
* Corrects the SYSTEM_ONLY cache strategy implementation to properly handle caching behavior without explicit configuration requirements. <a href="https://github.com/spring-projects/spring-ai/commit/38ea4ff0b6e6639ed3ab853ce273575a19c3d4b5">38ea4ff</a>
* Resolves multiple streaming issues including correct finish reason handling when stop reason is not tool_use, proper finish reason population for non-tool_use cases, and ensures multiple tool calls are correctly output in ChatResponse. <a href="https://github.com/spring-projects/spring-ai/commit/a897177f2f5b156024b3d1ae3baaa4407719d0f9">a897177</a>
* Updates the CONVERSATION_HISTORY cache strategy to follow Anthropic's recommended incremental caching pattern for optimal performance. <a href="https://github.com/spring-projects/spring-ai/commit/8327c0f16c743d2ad732e67aed75bd44b2eb48b7">8327c0f</a>
* Fixed auto-configuration to properly scan for @McpToolListChanged and related MCP annotations <a href="https://github.com/spring-projects/spring-ai/commit/0fdb911ea5d2991f7608e34a1d37b738905fbf92">0fdb911</a>
* Fixed exception handling in DeepSeekStreamFunctionCallingHelper when toolCalls() returns an empty list instead of null, correcting a flawed ternary expression <a href="https://github.com/spring-projects/spring-ai/commit/68d176fe226a0625b3048617a5830bb5eaaf6ebb">68d176f</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4586" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4586/hovercard">#4586</a>
* Fixed handling of candidates containing both text and tool calls in VertexAiGeminiChatModel <a href="https://github.com/spring-projects/spring-ai/commit/8e8654eeeb17ea0053397938515227ebadb48ac7">8e8654e</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4596" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4596/hovercard">#4596</a>
* Removed @ImportAutoConfiguration from AzureOpenAiChatAutoConfiguration to fix configuration issues <a href="https://github.com/spring-projects/spring-ai/commit/d9c9d302fd6511d82d042c63e40e1946657bab0e">d9c9d30</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4634" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4634/hovercard">#4634</a>
* Fixed PDF document grouping to properly respect the pagesPerDocument configuration setting <a href="https://github.com/spring-projects/spring-ai/commit/aeb9f8aef28f4978f43dbfb95060a242934e544b">aeb9f8a</a>
* Corrected the keep_alive parameter format for Ollama embedding requests <a href="https://github.com/spring-projects/spring-ai/commit/f32b122c9343381d312a91ba6f2dfd97d729520a">f32b122</a>
* Resolved issue where OllamaApi bean was not properly registered in the Spring context <a href="https://github.com/spring-projects/spring-ai/commit/1b69fd55afe88a50dc4cbb27282059edd5232a33">1b69fd5</a>
* Fixed potential NullPointerException in the getDefaultUsage method of AnthropicChatModel <a href="https://github.com/spring-projects/spring-ai/commit/a7582f024d07ca5dc94accf63078644ec61e1a02">a7582f0</a>
* Cleaned up redundant annotation configuration in auto-configuration classes <a href="https://github.com/spring-projects/spring-ai/commit/369db3c678b860759039a8bba81174f2bd9493f6">369db3c</a>
* Corrects auto-configuration issues in the ElevenLabs model provider integration <a href="https://github.com/spring-projects/spring-ai/commit/133eb407b3a1dd81c5d8f671e000a751faf28ac9">133eb40</a>
* Resolves auto-configuration problems in the ZhiPuAI model provider integration <a href="https://github.com/spring-projects/spring-ai/commit/5bf0e37b1896e419d79ff8392e47752a78959c1c">5bf0e37</a>
* Addresses auto-configuration issues in AWS Bedrock Converse proxy integration <a href="https://github.com/spring-projects/spring-ai/commit/f8c7644ffac55e4659cdcd00c150e04468323fa7">f8c7644</a>
* Corrects visibility scope issues with the ConnectionDetails class to prevent exposure outside its defined scope <a href="https://github.com/spring-projects/spring-ai/commit/b4392c59b44730fd5118dec8d333cee4341d941f">b4392c5</a>
* Resolves issues in the StreamableMcpAnnotationsManualIT integration test <a href="https://github.com/spring-projects/spring-ai/commit/bd51e34bf113bd8faec7e0c81d4063bf8d61ef34">bd51e34</a>
* Corrected Javadoc documentation for the CosmosDBChatMemory class <a href="https://github.com/spring-projects/spring-ai/pull/4572" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4572/hovercard">#4572</a>
* Resolved auto-configuration issues for the DeepSeek model provider <a href="https://github.com/spring-projects/spring-ai/commit/f7d8f0fbabeb46ab3aaea3b26297d3d96bcd880a">f7d8f0f</a>
* Resolved auto-configuration issues for the MiniMax model provider <a href="https://github.com/spring-projects/spring-ai/commit/b26b2c69296cef970509d25d782895f8550d6aa3">b26b2c6</a>
* Resolved auto-configuration issues for the Oracle Cloud Infrastructure (OCI) GenAI model provider <a href="https://github.com/spring-projects/spring-ai/commit/edb036d1385bae1fa6859de1105655e1c81cf8a2">edb036d</a>
* Resolved auto-configuration issues for MistralAI model integration <a href="https://github.com/spring-projects/spring-ai/commit/ad69fd7435cb30c4e7dfdfb0509e6a58710cc40f">ad69fd7</a>
* Corrected integration test failures for Google GenAI model provider <a href="https://github.com/spring-projects/spring-ai/commit/26bab76d7f17a8624f5e8b00aaf7aa65ee3437f0">26bab76</a>
* Resolved auto-configuration issues for Google GenAI model integration <a href="https://github.com/spring-projects/spring-ai/commit/86f013d796c77e7641e366c3f3278b756b9efe23">86f013d</a>
* Resolved auto-configuration issues for OpenAI model integration <a href="https://github.com/spring-projects/spring-ai/commit/0ae56f76f7dd97c17274aebd2747619be8d26503">0ae56f7</a>
* Resolved auto-configuration issues for Anthropic model integration <a href="https://github.com/spring-projects/spring-ai/commit/110605f07a60e7ecf40d85f9ae5df627d3ba68c7">110605f</a>
* Fixed autoconfiguration ordering to ensure MCP Tools are configured before ChatClient, preventing initialization issues <a href="https://github.com/spring-projects/spring-ai/pull/4553" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4553/hovercard">#4553</a>
* Resolved multiple VertexAI autoconfiguration issues including import corrections and configuration setup problems <a href="https://github.com/spring-projects/spring-ai/commit/9e0e3cdf5510f9e0b1cae7f4febdfa4458374fbf">9e0e3cd</a>, <a href="https://github.com/spring-projects/spring-ai/commit/d9f5f09f604846f15bc40800e65801755ef2f0cb">d9f5f09</a>
* Fixed <code>required</code> field handling for proper validation and configuration <a href="https://github.com/spring-projects/spring-ai/pull/4547" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4547/hovercard">#4547</a>

📓 Documentation

* Enhanced documentation and examples for configuring MCP Server-Sent Events (SSE) URLs. <a href="https://github.com/spring-projects/spring-ai/commit/357190da8cd3c28537ca5a9d7a1624c35b721d5f">357190d</a>
* Removed misleading documentation about activation order for MCP clients <a href="https://github.com/spring-projects/spring-ai/pull/4665" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4665/hovercard">#4665</a>
* Corrected documentation that had reversed descriptions for retrieval query and document concepts <a href="https://github.com/spring-projects/spring-ai/commit/0ee96f1e18f2415fe02302cdadbc15fe0744408f">0ee96f1</a>
* Updated documentation to clarify that PgVector schema initialization requires explicit opt-in configuration. <a href="https://github.com/spring-projects/spring-ai/commit/6854e3e149d1771a1cf14966243231ce426bb204">6854e3e</a>
* Documented that Spring Boot Actuator is required for observability features to function properly <a href="https://github.com/spring-projects/spring-ai/commit/abb0b89deb67a0c022764c76b05af3eead3cfb96">abb0b89</a>
* Replaced README.md with package-info.java in converter package for better JavaDoc integration <a href="https://github.com/spring-projects/spring-ai/commit/cb4af07269fdfa518445852348b160420e913b02">cb4af07</a>
* Corrects typographical errors in project documentation. <a href="https://github.com/spring-projects/spring-ai/commit/8620c20d3faf4002126abbb49004dc3be9ca4b8e">8620c20</a>
* Converted documentation format to AsciiDoc for improved documentation tooling <a href="https://github.com/spring-projects/spring-ai/commit/d7977aa5b8b437b9a5696b43cd8a27b08a40c1de">d7977aa</a>
* Added documentation for the toolChoice property in Anthropic model configuration <a href="https://github.com/spring-projects/spring-ai/commit/ffe11b4be06aa5703d7dc5f0243718c079e80434">ffe11b4</a>
* Corrected typo in documentation <a href="https://github.com/spring-projects/spring-ai/commit/935ef804c5f47a9e4159abc8c3e1a16f55ffbdf7">935ef80</a>
* Removed obsolete semicolon from documentation <a href="https://github.com/spring-projects/spring-ai/commit/b2dd1c9663087f38c81dcb5bc7ae9174082081fb">b2dd1c9</a>
* Fixed incorrect configuration property key in ZhipuAI documentation <a href="https://github.com/spring-projects/spring-ai/commit/1780e88fe7cc6aa2a9dda84223e2f564092bb6c0">1780e88</a>
* Added comprehensive documentation for the OpenAI File API integration <a href="https://github.com/spring-projects/spring-ai/commit/3b98b94630afdbd4281de0d8ef6bb8fb5e33467a">3b98b94</a>
* Corrected the <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/SInCE/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/SInCE">@SInCE</a> version annotation in Mistral AI OCR documentation <a href="https://github.com/spring-projects/spring-ai/commit/0e1885f4dce0400a4f2a1b029569cfc159945162">0e1885f</a>
* Updated documentation to reflect deprecation of legacy function-related configuration options in chat models <a href="https://github.com/spring-projects/spring-ai/pull/4541" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4541/hovercard">#4541</a>

🔨 Dependency Upgrades

* Upgraded Model Context Protocol SDK to version 0.15.0 and annotations library to version 0.6.0. <a href="https://github.com/spring-projects/spring-ai/commit/a2d00d1b9a16c4df96697f1ebafb21b34aeea28f">a2d00d1</a>
* Updated JSON schema dependency versions for better consistency across modules. <a href="https://github.com/spring-projects/spring-ai/commit/53064d9e18b47dcb5a78a7166550b238e159996d">53064d9</a>
* Updated jsonschema dependency to version 4.38.0 and qualified ObjectMapper in MCP module <a href="https://github.com/spring-projects/spring-ai/commit/a9b0763e89e8ff2a067592b6c25781b90bee1400">a9b0763</a>
* Updated Spring Boot dependency to version 3.5.7, bringing the latest bug fixes and improvements from the Spring Boot framework. <a href="https://github.com/spring-projects/spring-ai/commit/db9ac2fda48247e38aac2e18b3bde44b9d729b92">db9ac2f</a>
* Updated Cassandra integration to leverage native QueryBuilder vector support instead of custom implementation <a href="https://github.com/spring-projects/spring-ai/commit/3fc1ed6750d9521a50abe56a537319681d785d6b">3fc1ed6</a>
* Updated MCP (Model Context Protocol) dependency to version 0.15.0-SN <a href="https://github.com/spring-projects/spring-ai/pull/4564" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4564/hovercard">#4564</a>
* Updated mcp-annotations dependency to latest snapshot version <a href="https://github.com/spring-projects/spring-ai/pull/4555" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4555/hovercard">#4555</a>

⚡ Performance

* Optimized Jackson annotation detection to return early, improving overall performance <a href="https://github.com/spring-projects/spring-ai/commit/6a34458c2a472c6e9ce54b9096dc8f3d18e98020">6a34458</a>
* Added factory for standardized ObjectMapper configuration in MCP server implementations, improving consistency and performance <a href="https://github.com/spring-projects/spring-ai/commit/42733284c3eb35481cd79c388b2efbb7d0f1fd2a">4273328</a>
* Optimized vector operations by eliminating unnecessary validation checks on each operation <a href="https://github.com/spring-projects/spring-ai/commit/177cd6966e9fee138f58db3528abee8c724d5769">177cd69</a>
* Improves logging performance by eliminating unnecessary string concatenation in log statements <a href="https://github.com/spring-projects/spring-ai/commit/7e563d08c99ba9a0e48b9429ed03b4198fca0036">7e563d0</a>

🔩 Build Updates

* Removed concurrency configuration from GitHub CI workflow to improve build efficiency. <a href="https://github.com/spring-projects/spring-ai/commit/0f404ffc6359b8dfa46b41c1ed23d03d53914153">0f404ff</a>
* Adjusted the frequency of scheduled CI runs for optimized resource usage. <a href="https://github.com/spring-projects/spring-ai/commit/c319792eb02cd909eb00047cedae445cef3070e4">c319792</a>
* Refactored and cleaned up the parent pom.xml file <a href="https://github.com/spring-projects/spring-ai/commit/f616cd9b2e111e5117e04fe3ea8ec6e01d412db3">f616cd9</a>
* Expanded test coverage for JsonSchemaConverter to ensure proper property handling <a href="https://github.com/spring-projects/spring-ai/commit/659376238e68221e5d68f1caa1b6f53e20508975">6593762</a>
* Added test to verify that ToolCallbackResolver doesn't inadvertently use MCP ToolCallbackProviders <a href="https://github.com/spring-projects/spring-ai/commit/68e5324de7551d9a586e1ebb44953cbff3529bf3">68e5324</a>
* Cleaned up codebase by removing unused internal specifications, reducing maintenance burden. <a href="https://github.com/spring-projects/spring-ai/commit/e0a7d746e554257113650ed3644c8fd65400a34a">e0a7d74</a>
* Added comprehensive tests to ensure OpenAI API builder maintains proper immutability and configuration isolation. <a href="https://github.com/spring-projects/spring-ai/commit/062e494630e68d292dea1a11c1edaaae9d6ae8b3">062e494</a>
* Stopped using arrays as annotation attribute values where feasible in auto-configurations for cleaner code <a href="https://github.com/spring-projects/spring-ai/commit/77473d6d5a37bfddf1a69f5427074f7430d6d62f">77473d6</a>
* Refactored User-Agent header implementation in OpenAiApi with constants and additional test coverage <a href="https://github.com/spring-projects/spring-ai/commit/f6ff20ad3e26468d4da0ca2a7327dc0b6257e5ce">f6ff20a</a>
* Added test coverage for OpenAiModerationProperties to improve code quality <a href="https://github.com/spring-projects/spring-ai/commit/cc9c2cdfdebb7d1a3fe7672be7f135637c104ca6">cc9c2cd</a>
* Expands test coverage for AnnotatedMethodDiscovery class to ensure reliability and maintainability. <a href="https://github.com/spring-projects/spring-ai/commit/967d00c4497c6784ebde61f866389d89b041f690">967d00c</a>
* Improves test coverage for PostgresML embedding options to ensure proper validation and configuration handling. <a href="https://github.com/spring-projects/spring-ai/commit/838801fc8ee4b23d57824f85738b6f2f22ad051f">838801f</a>
* Modernizes test assertions by using AssertJ's assertThatException for improved test readability and consistency. <a href="https://github.com/spring-projects/spring-ai/commit/4e0457ee546eae9100324fcf8d898c6594a65bea">4e0457e</a>
* Added comprehensive null parameter validation test coverage <a href="https://github.com/spring-projects/spring-ai/commit/c03a5ca000b7828ead1a390bb12485569f2f77dd">c03a5ca</a>
* Renamed classes for improved naming consistency across the codebase <a href="https://github.com/spring-projects/spring-ai/commit/2a916db227dcc0227f64fbc7e30a5b2d5db6ea4b">2a916db</a>
* Enhanced test code quality and addressed Sonar suggestions for better maintainability <a href="https://github.com/spring-projects/spring-ai/commit/fa68d1e835ee86c843ff452b1b86920f6a50ca2c">fa68d1e</a>
* Modernizes codebase by adopting contemporary Java language features and idioms <a href="https://github.com/spring-projects/spring-ai/commit/d3c9de1454b9de3d34dc10e8076d44093109f52a">d3c9de1</a>
* Enhances builder class design by marking builder classes as final, preventing unintended inheritance <a href="https://github.com/spring-projects/spring-ai/commit/0403a2a8c12b141452bece5a9e6f57a697189b92">0403a2a</a>
* Expands test coverage with comprehensive validation tests for the MultiQueryExpander component <a href="https://github.com/spring-projects/spring-ai/commit/26c803e118a0fb1ea8ce3682eb526b3ee1e9d45e">26c803e</a>
* Reverted Kotlin version upgrade from 2.2.20 back to 1.9.25 after Java 25 testing <a href="https://github.com/spring-projects/spring-ai/commit/37b1fd0c9ec7577376bbdee084a8dea80961e357">37b1fd0</a>
* Added additional test coverage for edge cases in the PDF TextLine class <a href="https://github.com/spring-projects/spring-ai/commit/e90f1a0598cd4e288a14951e23f8feead22a1b77">e90f1a0</a>
* Improved and refined integration tests for the MistralAI model provider <a href="https://github.com/spring-projects/spring-ai/commit/8883689aaceb4133ead3218c8c3de200efba0917">8883689</a>
* Added extensive test suite for DefaultToolCallingManager to improve code quality and reliability <a href="https://github.com/spring-projects/spring-ai/commit/d148ca2751cb702b350f74d6abd95dc541cd2fce">d148ca2</a>
* Refactored MCP tests to leverage autoconfiguration and added ChatClient integration examples <a href="https://github.com/spring-projects/spring-ai/commit/5ab9365ed7fd5bdf2997829a8af635a7f02627f6">5ab9365</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/austin">Austin Dase (@austin)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/twitch">Christopher Miles (@twitch)</a>
* <a href="https://github.com/git">Daniel Garnier-Moiroux (@git)</a>
* <a href="https://github.com/dariusz.jedrzejczyk">Dariusz Jędrzejczyk (@dariusz.jedrzejczyk)</a>
* <a href="https://github.com/david.frizelle">David Frizelle (@david.frizelle)</a>
* <a href="https://github.com/devbulchandani8">Dev Bulchandani (@devbulchandani8)</a>
* <a href="https://github.com/eric.bottard">Eric Bottard (@eric.bottard)</a>
* <a href="https://github.com/3515228784">fanxt0218 (@3515228784)</a>
* <a href="https://github.com/ForteScarlet">Forte Scarlet (@ForteScarlet)</a>
* <a href="https://github.com/1510424541">guanxu (@1510424541)</a>
* <a href="https://github.com/haerizian10">Hyeri1ee (@haerizian10)</a>
* <a href="https://github.com/crad_on25">Hyoseop Song (@crad_on25)</a>
* <a href="https://github.com/gustkd3">Hyunsang Han (@gustkd3)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/issam.elatif">Issam El-atif (@issam.elatif)</a>
* <a href="https://github.com/jacquicollier2">jacquicollier2-eng (@jacquicollier2)</a>
* <a href="https://github.com/jrufer">Jared Rufer (@jrufer)</a>
* <a href="https://github.com/hjm1980">Jemin Huh (@hjm1980)</a>
* <a href="https://github.com/fujian1115">Jian (@fujian1115)</a>
* <a href="https://github.com/jonatan.ivanov">Jonatan Ivanov (@jonatan.ivanov)</a>
* <a href="https://github.com/kuntal.1461">kuntal1461 (@kuntal.1461)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/leehaut">leelance (@leehaut)</a>
* <a href="https://github.com/liugddx">liugddx (@liugddx)</a>
* <a href="https://github.com/mark.pollack">Mark Pollack (@mark.pollack)</a>
* <a href="https://github.com/matpat17">Mattia Pasetto (@matpat17)</a>
* <a href="https://github.com/13blueboy13">MoGreene (@13blueboy13)</a>
* <a href="https://github.com/nathangrand">NathanGrand (@nathangrand)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/alexanderklmn">Oleksandr Klymenko (@alexanderklmn)</a>
* <a href="https://github.com/centrumek">Pawel Potaczala (@centrumek)</a>
* <a href="https://github.com/sandra.kriemann">Sandra Ahlgrimm (@sandra.kriemann)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/fujian1115">stroller (@fujian1115)</a>
* <a href="https://github.com/sugan.mercy">Suganthi Thomas (@sugan.mercy)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/ThomasVitale">Thomas Vitale (@ThomasVitale)</a>
* <a href="https://github.com/ngocnhan.tran1996">Tran Ngoc Nhan (@ngocnhan.tran1996)</a>
* <a href="https://github.com/viacheslav-dobrynin">Viacheslav Dobrynin (@viacheslav-dobrynin)</a>
* <a href="https://github.com/williamekene700">Willams (@williamekene700)</a>
* <a href="https://github.com/yaner-here">Yaner (@yaner-here)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>
* <a href="https://github.com/lukasz.jernas">Łukasz Jernaś (@lukasz.jernas)</a>

