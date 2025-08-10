# Spring AI 1.0.1

## release on 20250808
## description
## changes
Spring AI 1.0.1 Release Notes

🎯 Highlights

This release includes 24 new features, 50 bug fixes, 45 documentation improvements, 32 other improvements.

📢 Noteworthy

* Official release of Spring AI version 1.0.1 with consolidated bug fixes and documentation improvements <a href="https://github.com/spring-projects/spring-ai/commit/53ec00733032b09ddc4dcc34a572140429f85e93">53ec007</a>
* Multiple commits were reverted related to tool context validation fixes and OpenAI chat client method invoking function callback integration tests <a href="https://github.com/spring-projects/spring-ai/commit/80ffb4ce99ccad174f8d60ae22a0a0b735d760d1">80ffb4c</a>
* Temporarily reverted the change that resolved OpenAI ApiKey for every request, indicating potential issues that required investigation <a href="https://github.com/spring-projects/spring-ai/commit/8a2706d6246e5b7a868bc2979c6182fa946e14c8">8a2706d</a>

⭐ New Features

* Enhanced KeywordMetadataEnricher with custom template functionality to provide more flexible metadata enrichment capabilities <a href="https://github.com/spring-projects/spring-ai/commit/2082a594a40b6552b57cdbc51cae7c2112efd0f9">2082a59</a>
* Added validation to check documents for text/media content when adding to vector stores <a href="https://github.com/spring-projects/spring-ai/pull/3687" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3687/hovercard">#3687</a>
* Improved <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tool/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tool">@tool</a> annotation functionality to enhance function calling capabilities <a href="https://github.com/spring-projects/spring-ai/commit/62160d330df5e7e5512120e97a1e8e7c7c0d0a74">62160d3</a>
* Added support for streaming tool calls without parameters in the Anthropic chat model <a href="https://github.com/spring-projects/spring-ai/commit/209927830d99fa3bb66ca2fda04bc95025911b0a">2099278</a>
* Updated and improved configuration options for Mistral chat model integration <a href="https://github.com/spring-projects/spring-ai/commit/c18a241c4ad8c4fa844781c0624b8ea5d7d9f53d">c18a241</a>
* Added capability to selectively rethrow exceptions in the default tool execution exception processor <a href="https://github.com/spring-projects/spring-ai/commit/d1baefb4b768e1139f09abf0f3b9036b1adb17a0">d1baefb</a>
* Refactored MessageAggregator to include support for tool calls functionality <a href="https://github.com/spring-projects/spring-ai/commit/1805ca07df968f4f38db06b88f9f36afe9aa6d7f">1805ca0</a>
* The ChatClient#mutate method now creates copies of advisors and advisorParams instead of sharing references, improving isolation between chat client instances <a href="https://github.com/spring-projects/spring-ai/commit/ccfaaf1f4823906e46d64b3bd44122fb9c0e016d">ccfaaf1</a>
* Added equals, hashCode, deep copy functionality and comprehensive tests to MiniMaxChatOptions for better object handling and comparison <a href="https://github.com/spring-projects/spring-ai/commit/dc9ea17fc6760981d4d7d4f84f1ffd5b90a40940">dc9ea17</a>
* Added support for new Mistral AI chat models to expand the available model providers <a href="https://github.com/spring-projects/spring-ai/pull/3523" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3523/hovercard">#3523</a>
* Enhanced OllamaChatModel with retry template integration for improved reliability <a href="https://github.com/spring-projects/spring-ai/commit/f89530c3146db5635280e530b147a2812e481d76">f89530c</a>
* Added streaming thinking events support for Anthropic model provider to enhance real-time interaction capabilities <a href="https://github.com/spring-projects/spring-ai/commit/379901bde105417d3c7c9bc209524a8f51e9252b">379901b</a>
* Enhanced OpenAI integration with updated supported voice enumerations for text-to-speech and chat completion audio features <a href="https://github.com/spring-projects/spring-ai/pull/3411" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3411/hovercard">#3411</a>
* Added support for dynamic API key configuration for Anthropic model provider on a per-request basis <a href="https://github.com/spring-projects/spring-ai/commit/ae9284cb01af2939b568a623e0b635f35da1798c">ae9284c</a>
* Neo4j vector store now automatically determines default embedding dimensions based on the configured model <a href="https://github.com/spring-projects/spring-ai/commit/96c45c7ee9f498f71830d0b485628380d155953f">96c45c7</a>
* Added Spring Framework 7.x compatibility to RetryUtils#ResponseErrorHandler to support upcoming Spring Framework versions <a href="https://github.com/spring-projects/spring-ai/commit/5ecfcce16333d0289ca451e8cfb6171c5edb9feb">5ecfcce</a>
* Enhanced OpenAI client to resolve API key for every request, improving key rotation and configuration flexibility <a href="https://github.com/spring-projects/spring-ai/commit/dd6c0a95309b16a22df810099ba92273ac451a37">dd6c0a9</a>
* Introduced support for Anthropic's latest Claude models including claude-opus-4 and claude-sonnet-4 <a href="https://github.com/spring-projects/spring-ai/pull/3351" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3351/hovercard">#3351</a>
* Extended OpenAI integration to support PDF files as media input <a href="https://github.com/spring-projects/spring-ai/commit/a33045871f3564c5fde7bd7248df45319053d191">a330458</a>
* Provided MySQL database schema for SPRING_AI_CHAT_MEMORY table to support chat memory functionality <a href="https://github.com/spring-projects/spring-ai/commit/148bf3376b2b0794e193ca6b37c0cf4307a0654c">148bf33</a>
* Improved handling and testing of complex metadata values in Chroma vector store integration <a href="https://github.com/spring-projects/spring-ai/commit/aba837a6cc1b0a9f952b292ae348175eb6cade10">aba837a</a>
* Added metadata support for vector store types to enhance data management capabilities <a href="https://github.com/spring-projects/spring-ai/pull/3325" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3325/hovercard">#3325</a>
* Added support for configurable exception handling when executing tools, providing better error management and recovery options <a href="https://github.com/spring-projects/spring-ai/commit/3068c04dca7bb66fe6fa064cd52e3f0aea3cab73">3068c04</a>
* Added comprehensive integration tests for Chat Memory functionality with SQL Server support <a href="https://github.com/spring-projects/spring-ai/commit/a6858cfdc00e7ad4f38cda1f8956b8e5e078e556">a6858cf</a>

🪲 Bug Fixes

* Resolved issue where method tool calls would throw errors when methods had the same name <a href="https://github.com/spring-projects/spring-ai/pull/2774" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/2774/hovercard">#2774</a>
* Fixed typo in frequencyPenalty property name for Google model builders <a href="https://github.com/spring-projects/spring-ai/commit/2e579b1e38080d38a786e7878b2e1d14805f7aa7">2e579b1</a>
* Corrected spelling of PromptTemplate in structured output API documentation image <a href="https://github.com/spring-projects/spring-ai/pull/3304" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3304/hovercard">#3304</a>
* Resolved null pointer exception in Anthropic API streaming functionality <a href="https://github.com/spring-projects/spring-ai/pull/3755" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3755/hovercard">#3755</a>
* Fixed issue where SystemPromptTemplate.builder() incorrectly returned PromptTemplate builder <a href="https://github.com/spring-projects/spring-ai/commit/2f91adb595513ee2b0781d118296a43cf4152491">2f91adb</a>
* Corrected parameter sequence in JSON schema generation functionality <a href="https://github.com/spring-projects/spring-ai/commit/f20eeeaea00bc99740aec9522129bf14b45c2754">f20eeea</a>
* Resolved annotation packaging issues <a href="https://github.com/spring-projects/spring-ai/pull/3716" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3716/hovercard">#3716</a>
* Resolved issue where audio filenames were lost when requesting OpenAI <code>/transcriptions</code> and <code>/translations</code> interfaces <a href="https://github.com/spring-projects/spring-ai/commit/c0c7f3a7e8289e569644bae4d9ce8350637b6035">c0c7f3a</a>
* Enhanced schema initialization logic and updated deprecated code for Milvus vector store <a href="https://github.com/spring-projects/spring-ai/pull/3705" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3705/hovercard">#3705</a>
* Added null checks, optimized string joining, and improved JavaDocs <a href="https://github.com/spring-projects/spring-ai/pull/3663" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3663/hovercard">#3663</a>
* Corrected assertion message in SimpleApiKey implementation for better debugging <a href="https://github.com/spring-projects/spring-ai/pull/3656" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3656/hovercard">#3656</a>
* Prevented streaming tool calling responses when internal execution is enabled for Anthropic models <a href="https://github.com/spring-projects/spring-ai/commit/5d8a9303167df0b33b6a87e637ced1aea2c604bb">5d8a930</a>
* Cleaned up unused configuration options from ZhiPu AI model implementation <a href="https://github.com/spring-projects/spring-ai/pull/3669" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3669/hovercard">#3669</a>
* Added support for custom dimensions in ZhiPu AI embedding models <a href="https://github.com/spring-projects/spring-ai/pull/3668" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3668/hovercard">#3668</a>
* Removed incorrect <a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/nullable/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nullable">@nullable</a> annotation from VectorStore similaritySearch methods <a href="https://github.com/spring-projects/spring-ai/pull/3613" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3613/hovercard">#3613</a>
* Added validation for invalid page numbers in outline items for getTextBetweenParagraphs method <a href="https://github.com/spring-projects/spring-ai/commit/50e8615720d2fb344510637b1989f6ea449fa1c6">50e8615</a>
* Corrected issues with Ollama autoconfiguration that were preventing proper setup <a href="https://github.com/spring-projects/spring-ai/pull/3645" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3645/hovercard">#3645</a>
* Fixed naming inconsistencies throughout the Mistral integration package <a href="https://github.com/spring-projects/spring-ai/pull/3652" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3652/hovercard">#3652</a>
* Resolved issue where streaming tool calls without input arguments would fail in Bedrock integration <a href="https://github.com/spring-projects/spring-ai/commit/d1dac6c32a13cfd2daa4c3a2e6a01950bca10dd7">d1dac6c</a>
* Fixed hardcoded configuration parameter to allow proper customization of topK values in Bedrock Converse Proxy <a href="https://github.com/spring-projects/spring-ai/pull/3621" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3621/hovercard">#3621</a>
* Prevents incorrect ToolCall merging in DeepSeek model provider when tool calls have empty id and name strings <a href="https://github.com/spring-projects/spring-ai/commit/ff5855d4896b30a31f39776744a4c9e8c471e571">ff5855d</a>
* Resolves test failure in ChromaVectorStoreAutoConfigurationIT due to updated exception message handling <a href="https://github.com/spring-projects/spring-ai/commit/7200580ec16d063fa228baec19ebcadd984e9922">7200580</a>
* Resolved exception occurring in OpenAiAudioTranscriptionResponseMetadata.toString method <a href="https://github.com/spring-projects/spring-ai/pull/3575" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3575/hovercard">#3575</a>
* Corrected infinite recursion issue in getMimeType(Path) method <a href="https://github.com/spring-projects/spring-ai/commit/b6b069cc35fdde86480713fbbd0dabcc4df2f4a9">b6b069c</a>
* Improved root exception handling in McpToolCallback to prevent unhandled errors <a href="https://github.com/spring-projects/spring-ai/commit/fb1746b6bd745b9750e4422629faa24f285211b9">fb1746b</a>
* Corrected logging behavior when creating ChromaDB collections <a href="https://github.com/spring-projects/spring-ai/commit/e0d3703f7321ea18f22d03658e574cbae6475b05">e0d3703</a>
* Resolved incorrect outputModalities evaluation when using streaming responses <a href="https://github.com/spring-projects/spring-ai/commit/3f9f34df7992119449e64870f341ea5457aaad91">3f9f34d</a>
* Resolved issue preventing generation of spring.ai.tools.observations configuration metadata for Spring Boot auto-completion <a href="https://github.com/spring-projects/spring-ai/pull/3539" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3539/hovercard">#3539</a>
* Corrected the parameter order in ClassUtils.isAssignable within the validateToolContextSupport method <a href="https://github.com/spring-projects/spring-ai/commit/61c8044bbad576bfe3260a940ae63a603aff5a42">61c8044</a>
* Resolved test failures in Ollama embedding auto-configuration tests <a href="https://github.com/spring-projects/spring-ai/commit/330986998a31b5221bdd2de16a3bcdcb21f16a31">3309869</a>
* Corrected parsing of similarity options in ElasticsearchVectorStore for proper configuration handling <a href="https://github.com/spring-projects/spring-ai/commit/c9ec39e370702ba077ec268e3973cb672f2c5fc7">c9ec39e</a>
* Resolved issue where Bedrock Titan embeddings were not properly returning usage information <a href="https://github.com/spring-projects/spring-ai/commit/0a1d326aca2812ba196565973cca228869ac408d">0a1d326</a>
* Corrected logic error in validateToolContextSupport method caused by incorrect parameter order <a href="https://github.com/spring-projects/spring-ai/commit/2ca1be2b838e87b9c0674b4b8b76f1010eb45951">2ca1be2</a>
* Improved logic in MethodToolCallbackProvider to correctly check function types <a href="https://github.com/spring-projects/spring-ai/commit/fcbdac96142327f46b63a9d4992fab5b0f470d7f">fcbdac9</a>
* Resolved issues in OpenAI chat client function callback integration test <a href="https://github.com/spring-projects/spring-ai/commit/bb52db5e7029bacced252711df5868dbca1ad93b">bb52db5</a>
* Resolved configuration issue where the embedding field name was not properly set when configuring ElasticsearchVectorStore <a href="https://github.com/spring-projects/spring-ai/pull/3501" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3501/hovercard">#3501</a>
* Corrected SQL syntax error in the isTableExists method of MariaDBSchemaValidator that was preventing proper table validation <a href="https://github.com/spring-projects/spring-ai/commit/95ea7f22229db778360a54e1e864f03b86aa590e">95ea7f2</a>
* Improved Qdrant vector store to properly handle Long type values in payload by converting them to String format <a href="https://github.com/spring-projects/spring-ai/commit/963b9dbded4ab244bc982b97057b36574ec49cff">963b9db</a>
* Enhanced QdrantObjectFactory to properly handle null metadata values without throwing errors <a href="https://github.com/spring-projects/spring-ai/commit/8053ae39c5fdf469c25fa317682655194faedd3c">8053ae3</a>
* Fixed OpenAiChatOptions to properly support transferring web search options between configurations <a href="https://github.com/spring-projects/spring-ai/commit/c790d6c14732452d7c3d9dcbccd3ec68ac0ca4d5">c790d6c</a>
* Fixed missing properties in the Spring Boot auto-configuration for ChromaVectorStore <a href="https://github.com/spring-projects/spring-ai/commit/3fe052fd83183d9eee1a30bedbfd239da9638916">3fe052f</a>
* Fixed a bug in the augmentSystemMessage method where an extra system message was incorrectly added when the system message was not the first one in the message list <a href="https://github.com/spring-projects/spring-ai/commit/623e7053366480ab64a0be47c7c8c14a27b2fe94">623e705</a>
* Avoid looping through all the page tree if there is no destination page, improving PDF processing performance <a href="https://github.com/spring-projects/spring-ai/pull/3396" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3396/hovercard">#3396</a>
* Fixed unreachable code in PromptChatMemoryAdvisor to improve code quality and maintainability <a href="https://github.com/spring-projects/spring-ai/pull/3395" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3395/hovercard">#3395</a>
* Added null safety check for duration metadata in Ollama chat model responses to prevent potential null pointer exceptions <a href="https://github.com/spring-projects/spring-ai/commit/1eecd17529fbfc3c25d95a4324adb6fe2c302a65">1eecd17</a>
* Corrected CustomerTools example code to reference proper existing methods <a href="https://github.com/spring-projects/spring-ai/pull/3390" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3390/hovercard">#3390</a>
* Prevented double-serialization of already valid JSON strings in JsonParser.toJson method <a href="https://github.com/spring-projects/spring-ai/commit/cfa4128d58238be53eb6fc96df42854865fbcf92">cfa4128</a>
* Fixed typo in ToolCallback implementation for better code clarity <a href="https://github.com/spring-projects/spring-ai/pull/3352" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3352/hovercard">#3352</a>
* Resolved connection leak issue when using JdbcChatMemoryRepository, improving resource management and stability <a href="https://github.com/spring-projects/spring-ai/commit/fb106ab4e016069eb03eeab030859f0f729608d7">fb106ab</a>
* Updated useAutoConfiguredJdbcChatMemoryRepository test to work properly after connection leak fix <a href="https://github.com/spring-projects/spring-ai/commit/fd9fe798a127cbc5baaf58f2db71b108a6da0fb4">fd9fe79</a>

📓 Documentation

* Added comprehensive example demonstrating how to dynamically select and use MCP clients in Spring AI applications <a href="https://github.com/spring-projects/spring-ai/pull/3751" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3751/hovercard">#3751</a>
* Updated reference links to the latest MCP specification documentation <a href="https://github.com/spring-projects/spring-ai/pull/3810" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3810/hovercard">#3810</a>
* Corrected code examples in the streaming responses documentation to ensure accuracy and functionality <a href="https://github.com/spring-projects/spring-ai/pull/3802" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3802/hovercard">#3802</a>
* Improved documentation for ChatClient Advisor functionality <a href="https://github.com/spring-projects/spring-ai/commit/8c88a6430b4ee075f289924a3dbdd416e4f2ed3a">8c88a64</a>
* Updated MCP documentation to remove outdated DefaultMcpSession references <a href="https://github.com/spring-projects/spring-ai/pull/3760" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3760/hovercard">#3760</a>
* Enhanced Anthropic chat integration documentation <a href="https://github.com/spring-projects/spring-ai/pull/2723" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/2723/hovercard">#2723</a>
* Corrected documentation and code typos in chat client module <a href="https://github.com/spring-projects/spring-ai/pull/3013" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3013/hovercard">#3013</a>
* Corrected typo in token configuration documentation <a href="https://github.com/spring-projects/spring-ai/pull/3677" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3677/hovercard">#3677</a>
* Fixed outdated code examples in the documentation <a href="https://github.com/spring-projects/spring-ai/pull/3717" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3717/hovercard">#3717</a>
* Fixed property name from <code>is-auto-id</code> to <code>auto-id</code> in milvus.adoc <a href="https://github.com/spring-projects/spring-ai/pull/3704" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3704/hovercard">#3704</a>
* Cleaned up duplicated dependency instructions in opensearch.adoc <a href="https://github.com/spring-projects/spring-ai/pull/3712" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3712/hovercard">#3712</a>
* Corrected default embedding model reference in ollama-embeddings.adoc <a href="https://github.com/spring-projects/spring-ai/pull/3686" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3686/hovercard">#3686</a>
* Updated README documentation to include Elasticsearch vector store integration <a href="https://github.com/spring-projects/spring-ai/pull/3688" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3688/hovercard">#3688</a>
* Corrected broken link in Content class javadoc documentation <a href="https://github.com/spring-projects/spring-ai/pull/3672" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3672/hovercard">#3672</a>
* Corrected various typos and spelling errors in documentation and code comments <a href="https://github.com/spring-projects/spring-ai/pull/3678" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3678/hovercard">#3678</a>
* Fixed documentation errors in SimpleLoggerAdvisor class <a href="https://github.com/spring-projects/spring-ai/pull/3638" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3638/hovercard">#3638</a>
* Corrected documentation examples and instructions for proper tool usage patterns <a href="https://github.com/spring-projects/spring-ai/commit/406c6f11ce086b647dfde9e83ca8aa58cf78085f">406c6f1</a>
* Improved and updated the tools documentation with better examples and explanations <a href="https://github.com/spring-projects/spring-ai/pull/3624" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3624/hovercard">#3624</a>
* Corrected broken documentation link reference to ChatModel interface <a href="https://github.com/spring-projects/spring-ai/pull/3583" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3583/hovercard">#3583</a>
* Improved documentation for Spring AI advisors functionality <a href="https://github.com/spring-projects/spring-ai/commit/a5fa66642006be58bb32971b40acbec44f4ec402">a5fa666</a>
* Enhanced documentation for MCP Server Boot Starter selection process <a href="https://github.com/spring-projects/spring-ai/commit/530ef30caf3f0f50ec506d70bc1cc703bac3e172">530ef30</a>
* Updated OpenAI integration page with improved Vision section documentation <a href="https://github.com/spring-projects/spring-ai/commit/fe002adcbba884730f02961ef85b8e1efd94e6d2">fe002ad</a>
* Improved ZhipuAI chat documentation with corrections and enhancements <a href="https://github.com/spring-projects/spring-ai/pull/3531" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3531/hovercard">#3531</a>
* Corrected documentation examples showing proper usage of tools and defaultTools configuration <a href="https://github.com/spring-projects/spring-ai/pull/3533" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3533/hovercard">#3533</a>
* Repaired broken links to ChatOptions and ChatOptions#builder() in web documentation <a href="https://github.com/spring-projects/spring-ai/pull/3447" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3447/hovercard">#3447</a>
* Corrected code snippets and examples in the openai-chat.adoc documentation file <a href="https://github.com/spring-projects/spring-ai/commit/95e9808f55ebc2c5690b6e6c4a87d4604200a6df">95e9808</a>
* Corrected spelling and formatting errors in cloud bindings documentation <a href="https://github.com/spring-projects/spring-ai/pull/3436" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3436/hovercard">#3436</a>
* Updated and improved Hugging Face integration documentation <a href="https://github.com/spring-projects/spring-ai/pull/3445" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3445/hovercard">#3445</a>
* Fixed incorrect ToolDefinition.builder() usage examples in documentation <a href="https://github.com/spring-projects/spring-ai/pull/3431" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3431/hovercard">#3431</a>
* Added documentation changes related to response format updates for Azure OpenAI chat integration <a href="https://github.com/spring-projects/spring-ai/pull/3434" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3434/hovercard">#3434</a>
* Revised and improved documentation for DeepSeek and Minimax chat providers <a href="https://github.com/spring-projects/spring-ai/pull/3408" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3408/hovercard">#3408</a>
* Fixed MIME types and standardized formatting in Bedrock Converse video modalities documentation <a href="https://github.com/spring-projects/spring-ai/pull/3413" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3413/hovercard">#3413</a>
* Removed duplicate NoOpTemplateRenderer mention in ChatClient documentation <a href="https://github.com/spring-projects/spring-ai/pull/3414" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3414/hovercard">#3414</a>
* Added description of embedding-field-name property in Elasticsearch documentation <a href="https://github.com/spring-projects/spring-ai/pull/3399" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3399/hovercard">#3399</a>
* Corrected typo from 'synch' to 'sync' in contribution documentation <a href="https://github.com/spring-projects/spring-ai/pull/3378" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3378/hovercard">#3378</a>
* Fixed advisor documentation to reference the correct dependencies <a href="https://github.com/spring-projects/spring-ai/commit/a0c76a02735950fce277a171cc9f61fef544a222">a0c76a0</a>
* Updated Mistral AI embeddings documentation for better clarity <a href="https://github.com/spring-projects/spring-ai/pull/3362" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3362/hovercard">#3362</a>
* Corrected broken links in documentation pointing to Media.java <a href="https://github.com/spring-projects/spring-ai/pull/3322" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3322/hovercard">#3322</a>
* Updated link to point to the official awesome-spring-ai repository <a href="https://github.com/spring-projects/spring-ai/pull/3328" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3328/hovercard">#3328</a>
* Updated custom API key example to use OpenAiChatModel.builder() pattern <a href="https://github.com/spring-projects/spring-ai/pull/3335" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3335/hovercard">#3335</a>
* Fixed and improved tools-related documentation <a href="https://github.com/spring-projects/spring-ai/pull/3292" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3292/hovercard">#3292</a>
* Improved documentation for the MCP (Model Context Protocol) Server Boot Starter <a href="https://github.com/spring-projects/spring-ai/pull/3279" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3279/hovercard">#3279</a>
* Corrected formatting issues with external links in the effective agents documentation <a href="https://github.com/spring-projects/spring-ai/pull/3275" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3275/hovercard">#3275</a>
* General typo corrections across various documentation files <a href="https://github.com/spring-projects/spring-ai/pull/3263" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3263/hovercard">#3263</a>
* Added proper title to documentation that was missing heading information <a href="https://github.com/spring-projects/spring-ai/commit/4d716d5cd6d42ddbc3c45d181c38b405643b5a64">4d716d5</a>

🔨 Dependency Upgrades

* Updated from swagger-annotations to swagger-annotations-jakarta for Jakarta EE compatibility <a href="https://github.com/spring-projects/spring-ai/commit/5a66d4967b1b5c5899330eac2819ca33cd694f13">5a66d49</a>
* Cleaned up explicit version specification for jackson-dataformat-xml in test dependencies <a href="https://github.com/spring-projects/spring-ai/commit/b84d123cd41fd4a4495c218002f9b2a48bc60b4f">b84d123</a>
* Updated Spring Boot dependency to version 3.5.0 for latest features and improvements <a href="https://github.com/spring-projects/spring-ai/commit/8b9d93f852651d177de4c93488dc468a7635c33f">8b9d93f</a>

⚡ Performance

* Improved performance by reusing DocumentRowMapper instances to reduce redundant object creation <a href="https://github.com/spring-projects/spring-ai/commit/65f4f8ccff4c140be506fe825bf1ea49d370679f">65f4f8c</a>
* Improved logging performance by optimizing debug level logging calls in chat memory advisor components <a href="https://github.com/spring-projects/spring-ai/pull/3448" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3448/hovercard">#3448</a>

🔩 Build Updates

* Improved test structure and maintainability for method tool callback provider tests <a href="https://github.com/spring-projects/spring-ai/commit/9068789a565594911f9d9b5b27836d38f23d9826">9068789</a>
* Enhanced builder pattern implementation for better code organization and usability in Vertex AI Gemini safety settings <a href="https://github.com/spring-projects/spring-ai/commit/1eb50556742c6a0fd77d679fd406a1983d2c1e4c">1eb5055</a>
* Applied diamond operator syntax improvements for better code clarity <a href="https://github.com/spring-projects/spring-ai/pull/3458" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3458/hovercard">#3458</a>
* Updated OpenAI audio tests to accommodate changes in OpenAI safety settings <a href="https://github.com/spring-projects/spring-ai/commit/6a19c2e9e0a8de7ed87b7d8a31cb28b1c92d328d">6a19c2e</a>
* Converted Qdrant vector store integration test to use OpenAI embedding model <a href="https://github.com/spring-projects/spring-ai/pull/3671" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3671/hovercard">#3671</a>
* Migrated AzureOpenAiAudioTranscriptionModelIT to use OkHttpClient for improved testing reliability <a href="https://github.com/spring-projects/spring-ai/pull/3665" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3665/hovercard">#3665</a>
* Updated JdbcChatMemoryRepositoryHsqldbAutoConfigIT to use JUnit 5 <a href="https://github.com/spring-projects/spring-ai/pull/3633" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3633/hovercard">#3633</a>
* Multiple cleanup activities including removing redundant null checks in OpenAI API Builder, cleaning up TextReader assignments, removing useless properties tags, and adding missing license headers <a href="https://github.com/spring-projects/spring-ai/pull/3654" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3654/hovercard">#3654</a>
* Added test coverage for FileDocumentWriter default constructor and various configuration options <a href="https://github.com/spring-projects/spring-ai/commit/3bcdb9d8127225d81d12d0523e94c40735d0e7fb">3bcdb9d</a>
* Cleaned up integration test by removing redundant environment variable checks for better test maintainability <a href="https://github.com/spring-projects/spring-ai/pull/3615" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3615/hovercard">#3615</a>
* Improved code quality by replacing direct error output with structured logging throughout the codebase <a href="https://github.com/spring-projects/spring-ai/pull/3600" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3600/hovercard">#3600</a>
* Cleaned up codebase by removing unused messageHistory implementation that was no longer needed <a href="https://github.com/spring-projects/spring-ai/pull/3574" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3574/hovercard">#3574</a>
* Enhanced test coverage with unit test to verify multiple method tool callbacks functionality with tool context <a href="https://github.com/spring-projects/spring-ai/commit/0ce919238336fe6f2bea8d7aeda93f7994067e22">0ce9192</a>
* Added test coverage for embeddingFieldName configuration in Elasticsearch VectorStore <a href="https://github.com/spring-projects/spring-ai/commit/25662fc15bdb1d579174e9cbfd1b68df91b6740c">25662fc</a>
* Improved module design by making auto-configuration dependencies optional, reducing unnecessary coupling in docker compose integration <a href="https://github.com/spring-projects/spring-ai/pull/3502" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3502/hovercard">#3502</a>
* Enhanced module architecture by making auto-configuration dependencies optional in testcontainers integration <a href="https://github.com/spring-projects/spring-ai/pull/3465" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3465/hovercard">#3465</a>
* Optimized dependencies by using spring-web instead of spring-webflux in the spring-ai-retry module <a href="https://github.com/spring-projects/spring-ai/commit/7ba7727585df389333dfc9bbb449ab94cc61c3d5">7ba7727</a>
* Updated continuous integration workflow to run against valid non-main branches <a href="https://github.com/spring-projects/spring-ai/commit/c1a6a62320064672ba921afe1c655d7f11a904ff">c1a6a62</a>
* Moved speech1.mp3 audio test file to proper src/test/resources location <a href="https://github.com/spring-projects/spring-ai/commit/d03654b2e72750dfb76eb78aa9f505daf75bf429">d03654b</a>
* Added new GitHub Action workflows for auto-cherry-pick and backport-issue automation <a href="https://github.com/spring-projects/spring-ai/commit/3c900b9ec7bd39eaa8d77ab9e48fa713b7322f70">3c900b9</a>
* Added comprehensive unit tests for OpenAiStreamFunctionCallingHelper to improve code coverage and reliability <a href="https://github.com/spring-projects/spring-ai/pull/3312" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3312/hovercard">#3312</a>
* Updated gitignore to exclude qodana.yaml configuration file <a href="https://github.com/spring-projects/spring-ai/commit/7f93f03e5226b529bd0535b5811cf9192cf9bfcf">7f93f03</a>
* Applied checkstyle fixes to improve code consistency and formatting across the project <a href="https://github.com/spring-projects/spring-ai/commit/0c9d0e49fa8de99eada7224982be580d8e1bbf2a">0c9d0e4</a>
* Updated project version for next development iteration on 1.0.x branch <a href="https://github.com/spring-projects/spring-ai/commit/98a8dd4d4671cd777b04ba2224c89e90c7633e72">98a8dd4</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/ohMaruf">Ahmed Maruf (@ohMaruf)</a>
* <a href="https://github.com/ahoowang">Ahoo Wang (@ahoowang)</a>
* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/andrea.vacondio">Andrea Vacondio (@andrea.vacondio)</a>
* <a href="https://github.com/aliqingdong">azurelee (@aliqingdong)</a>
* <a href="https://github.com/chainhou">chainHo (@chainhou)</a>
* <a href="https://github.com/huihaoweishui">chen.xue (@huihaoweishui)</a>
* <a href="https://github.com/Cho-Hyun-Seung">Cho-Hyun-Seung (@Cho-Hyun-Seung)</a>
* <a href="https://github.com/christian.tzolov">Christian Tzolov (@christian.tzolov)</a>
* <a href="https://github.com/dsarlo-viso">Dan Sarlo (@dsarlo-viso)</a>
* <a href="https://github.com/git">Daniel Garnier-Moiroux (@git)</a>
* <a href="https://github.com/eddu.melendez">Eddú Meléndez (@eddu.melendez)</a>
* <a href="https://github.com/eddu.melendez">Eddú Meléndez Gonzales (@eddu.melendez)</a>
* <a href="https://github.com/colourfulemmanuel">Emmanuel Essien-nta (@colourfulemmanuel)</a>
* <a href="https://github.com/filip.hrisafov">Filip Hrisafov (@filip.hrisafov)</a>
* <a href="https://github.com/finyuq">finyuq (@finyuq)</a>
* <a href="https://github.com/gareth">Gareth Evans (@gareth)</a>
* <a href="https://github.com/meistermeier">Gerrit Meier (@meistermeier)</a>
* <a href="https://github.com/gaganis">Giorgos Gaganis (@gaganis)</a>
* <a href="https://github.com/9uanhuo">Guan Huo (@9uanhuo)</a>
* <a href="https://github.com/ggndnn">Guo (@ggndnn)</a>
* <a href="https://github.com/TheEterna">han (@TheEterna)</a>
* <a href="https://github.com/hpoettker">Henning Pöttker (@hpoettker)</a>
* <a href="https://github.com/hudson.schumaker">Hudson Luiz Sales Schumaker (@hudson.schumaker)</a>
* <a href="https://github.com/aeomhs">Hyunsik Aeom (@aeomhs)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/zwk">ingbyr (@zwk)</a>
* <a href="https://github.com/janericharnack">Jan-Eric Harnack (@janericharnack)</a>
* <a href="https://github.com/rlaakswo0687">jay (@rlaakswo0687)</a>
* <a href="https://github.com/hjm1980">Jemin Huh (@hjm1980)</a>
* <a href="https://github.com/dev">jonghoonpark (@dev)</a>
* <a href="https://github.com/lambochen">lambochen (@lambochen)</a>
* <a href="https://github.com/garen.mao">loong-coder (@garen.mao)</a>
* <a href="https://github.com/846179345">Lpepsi (@846179345)</a>
* <a href="https://github.com/mark.pollack">Mark Pollack (@mark.pollack)</a>
* <a href="https://github.com/my.wu">Mingyuan Wu (@my.wu)</a>
* <a href="https://github.com/KoreaNirsa">Nirsa (@KoreaNirsa)</a>
* <a href="https://github.com/enimiste">NOUNI El bachir (@enimiste)</a>
* <a href="https://github.com/punnapavankumar9">pavan kumar punna (@punnapavankumar9)</a>
* <a href="https://github.com/xeraa">Philipp Krenn (@xeraa)</a>
* <a href="https://github.com/piotr.kubowicz">Piotr Kubowicz (@piotr.kubowicz)</a>
* <a href="https://github.com/RobinElysia">qwp_p (@RobinElysia)</a>
* <a href="https://github.com/seblsebastian">Sebastian Espei (@seblsebastian)</a>
* <a href="https://github.com/seok9211">Seokjae Lee (@seok9211)</a>
* <a href="https://github.com/SexyProgrammer">SexyProgrammer (@SexyProgrammer)</a>
* <a href="https://github.com/yuluo08290126">shown (@yuluo08290126)</a>
* <a href="https://github.com/ai-afk">SiBo Ai (@ai-afk)</a>
* <a href="https://github.com/paoxiaomooo">Sizhe Fan (@paoxiaomooo)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/solnone">Solomon Hsu (@solnone)</a>
* <a href="https://github.com/jamespud">spud (@jamespud)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/ngocnhan.tran1996">Tran Ngoc Nhan (@ngocnhan.tran1996)</a>
* <a href="https://github.com/kepull2918">WOONBE (@kepull2918)</a>
* <a href="https://github.com/yangbuyiya">Yang Buyi (@yangbuyiya)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/yangjm-41">yiangjm (@yangjm-41)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>
* <a href="https://github.com/XuGongming">徐功明 (@XuGongming)</a>
* <a href="https://github.com/494509580">老虎是条大狼狗 (@494509580)</a>
* <a href="https://github.com/nankisu0301">난기수 (@nankisu0301)</a>

