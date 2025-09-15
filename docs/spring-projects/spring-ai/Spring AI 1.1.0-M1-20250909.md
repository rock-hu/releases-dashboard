# Spring AI 1.1.0-M1

## release on 20250909
## description
## changes
Spring AI Next Release Release Notes

🎯 Highlights

This release includes 47 new features, 106 bug fixes, 70 documentation improvements, 120 other improvements.

⏪ Breaking Changes

* Auto-configuration classes for Model Context Protocol (MCP) have been renamed with 'Mcp' prefix for consistency <a href="https://github.com/spring-projects/spring-ai/commit/21c4283e341436fecf361ea6ef2d0a17ec17bff0">21c4283</a>
* maxTokens and maxCompletionTokens parameters are now mutually exclusive in OpenAI ChatOptions, requiring users to choose one option <a href="https://github.com/spring-projects/spring-ai/commit/13c39f107f16e864ece9aea20b7d44783512f922">13c39f1</a>
* Changed UserMessage to use <code>metadata</code> instead of <code>properties</code> for better API consistency <a href="https://github.com/spring-projects/spring-ai/pull/3980" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3980/hovercard">#3980</a>
* Extracted VectorStoreRetriever interface from VectorStore which may require code updates for custom implementations <a href="https://github.com/spring-projects/spring-ai/pull/3827" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3827/hovercard">#3827</a> via <a href="https://github.com/spring-projects/spring-ai/issues/1290" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/1290/hovercard">#1290</a>

:warning: Upgrading Notes

* Update imports for MCP auto-configuration classes that have been renamed with 'Mcp' prefix <a href="https://github.com/spring-projects/spring-ai/commit/21c4283e341436fecf361ea6ef2d0a17ec17bff0">21c4283</a>
* When configuring OpenAI ChatOptions, ensure you use either maxTokens or maxCompletionTokens, but not both simultaneously <a href="https://github.com/spring-projects/spring-ai/commit/13c39f107f16e864ece9aea20b7d44783512f922">13c39f1</a>
* Update code to use <code>metadata</code> instead of <code>properties</code> when working with UserMessage objects <a href="https://github.com/spring-projects/spring-ai/pull/3980" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3980/hovercard">#3980</a>
* Custom VectorStore implementations may need to be updated to implement the new VectorStoreRetriever interface <a href="https://github.com/spring-projects/spring-ai/pull/3827" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3827/hovercard">#3827</a>

📢 Noteworthy

* Removed support for the deprecated Mistral AI Codestral Mamba model as part of code cleanup <a href="https://github.com/spring-projects/spring-ai/pull/4225" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4225/hovercard">#4225</a>
* Significantly improved test coverage for MistralAiBindingsPropertiesProcessor to ensure robust MistralAI integration <a href="https://github.com/spring-projects/spring-ai/pull/4165" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4165/hovercard">#4165</a>
* Improved test coverage for EmbeddingModelObservationContext and SyncMcpToolCallback edge cases to ensure better reliability <a href="https://github.com/spring-projects/spring-ai/pull/4157" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4157/hovercard">#4157</a>
* Significantly improved test coverage for QdrantObjectFactory.toObjectMap, SimpleVectorStore filter conditions, and various other components <a href="https://github.com/spring-projects/spring-ai/pull/4095" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4095/hovercard">#4095</a>
* Removed hardcoded topK value in BedrockConverseProxyChatProperties for better configuration flexibility <a href="https://github.com/spring-projects/spring-ai/pull/3621" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3621/hovercard">#3621</a>
* Refactored MessageAggregator to properly handle and include tool calls in message aggregation <a href="https://github.com/spring-projects/spring-ai/commit/df90b9c1b31079c2ee9249689fc0bc05d3e04e18">df90b9c</a>
* Cleaned up QdrantVectorStoreIT by removing unnecessary environment variable validation <a href="https://github.com/spring-projects/spring-ai/pull/3615" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3615/hovercard">#3615</a>
* Temporarily reverted a fix for OpenAI function callback integration test <a href="https://github.com/spring-projects/spring-ai/commit/3bce15a349ce3ad1380dca4aaf220382dcb6e600">3bce15a</a>
* Temporarily reverted a parameter order fix in validateToolContextSupport method <a href="https://github.com/spring-projects/spring-ai/commit/f0c128cb0c599be58dec1d6f46a2b4a2c96be675">f0c128c</a>
* Temporarily reverted changes to resolve OpenAI API key for every request due to compatibility issues <a href="https://github.com/spring-projects/spring-ai/commit/313aae0e8944c202e54e0996fcbb89c643d6dea9">313aae0</a>

⭐ New Features

* Tool callbacks now expose the original tool name in both synchronous and asynchronous operations, providing better visibility into tool execution <a href="https://github.com/spring-projects/spring-ai/commit/66780351a32a75a31212af73ca486efd6096244c">6678035</a>
* Added support for sending labels with chat requests in Google Generative AI integration <a href="https://github.com/spring-projects/spring-ai/commit/1dd686b3e9e767d09da350505af86578ba70de88">1dd686b</a>
* Added comprehensive annotation-based configuration support for Model Context Protocol (MCP) clients and servers <a href="https://github.com/spring-projects/spring-ai/commit/534c6afff5c66c6a1d4c8c4007e719422b803382">534c6af</a>
* Added support for OpenAI service_tier parameter in OpenAiChatOptions to enable control over service quality levels <a href="https://github.com/spring-projects/spring-ai/commit/ad2e1bcda55e7be510eb3a98106217ec59056da8">ad2e1bc</a>
* Refactored MCP (Model Control Protocol) server auto-configuration to use consolidated modules with protocol-based configuration approach <a href="https://github.com/spring-projects/spring-ai/commit/e71da4e1596c9b6e0d6213fb0bafdb92c65e7b26">e71da4e</a>
* Added missing Spring Boot starters for Google GenAI integration, enabling easier autoconfiguration <a href="https://github.com/spring-projects/spring-ai/commit/528155a634240e5a7d0228fbf5e951088ea3f55f">528155a</a>
* Improved Unicode property union handling for robust Chinese character processing <a href="https://github.com/spring-projects/spring-ai/commit/35486e9c22da11e2fd27f1b08508d9891dca8861">35486e9</a>
* Use latest CI scripts when testing old commits for improved testing reliability <a href="https://github.com/spring-projects/spring-ai/commit/a9f93b09af0c69de84abe9048f5681e5ce8f4da0">a9f93b0</a>
* Restructured MCP server auto-configurations and added streamable-http support for improved streaming capabilities <a href="https://github.com/spring-projects/spring-ai/commit/0b96f4cdeb80f828166e7e229deb5b4b075ea156">0b96f4c</a>
* Added support for new GPT-5 models with verbosity parameter configuration <a href="https://github.com/spring-projects/spring-ai/pull/4086" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4086/hovercard">#4086</a>
* Added comprehensive debugging capabilities to improve maintenance branch workflow reliability and troubleshooting <a href="https://github.com/spring-projects/spring-ai/commit/3ce6d38a4ef8add76b7d5bbb02cacfe77d659c8f">3ce6d38</a>
* Added support for fast CI builds when cherry-picking changes to maintenance branches <a href="https://github.com/spring-projects/spring-ai/commit/29ac7d97d42723086b515493210b9337c93a6d22">29ac7d9</a>
* Added autoconfiguration for MCP client with support for async HTTP request customization <a href="https://github.com/spring-projects/spring-ai/commit/7ad7150cba6a01eac97ab3a34099ec01d070fdfb">7ad7150</a>
* Configured McpSyncServer to use immediate execution when running in a servlet context <a href="https://github.com/spring-projects/spring-ai/commit/568ca9678c2b17edd441acc94848310ae1bc9ad1">568ca96</a>
* Added support for GPT-5 model enum with updated documentation <a href="https://github.com/spring-projects/spring-ai/commit/1a3ed95b4d62811a5baa9f7a27d94f5ba9ab8cc2">1a3ed95</a>
* Added KotlinModule support and tests for schema generation in BeanOutputConverter to improve Kotlin integration <a href="https://github.com/spring-projects/spring-ai/pull/3900" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3900/hovercard">#3900</a>
* ChatClient now supports adding metadata to both PromptUserSpec and PromptSystemSpec, enabling richer message context and processing capabilities <a href="https://github.com/spring-projects/spring-ai/pull/3989" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3989/hovercard">#3989</a>
* Added Google GenAI embedding module with unified SDK support for enhanced integration capabilities <a href="https://github.com/spring-projects/spring-ai/commit/085446c95c6e7bde9a91cec7c7bfc6171195e16c">085446c</a>
* Added ability to use custom templates with KeywordMetadataEnricher for enhanced metadata enrichment capabilities <a href="https://github.com/spring-projects/spring-ai/commit/c122fe1d9133b09d4383f073a9fc417623508457">c122fe1</a>
* Added new spring-ai-google-genai module using Google's latest GenAI SDK for improved Google AI model integration <a href="https://github.com/spring-projects/spring-ai/commit/daf12743aa774a1bdb421f9d77469d72c5f604bd">daf1274</a>
* Added log probabilities support for Vertex AI Gemini models <a href="https://github.com/spring-projects/spring-ai/commit/e557081b3e780856ef6849965aa4840aedce887d">e557081</a>
* Added streamable HTTP transport support for Model Context Protocol (MCP) client <a href="https://github.com/spring-projects/spring-ai/commit/656395eef64e5f1aa5bc4d1fa308bf3c740e03ee">656395e</a>
* Added BedrockChatOptions to Bedrock integration for improved configuration <a href="https://github.com/spring-projects/spring-ai/commit/99e59a21d9cc183d359fff49865f40430d5efbe1">99e59a2</a>
* Introduces a standardized interface for audio transcription across different model providers <a href="https://github.com/spring-projects/spring-ai/commit/4cf23773ab01f147c70053e732999d8d85ed9da0">4cf2377</a>
* Enhances ZhiPu AI integration with fluent builder pattern for easier configuration <a href="https://github.com/spring-projects/spring-ai/commit/d865c9ed04784e3605ece72c1df68b758daef5cf">d865c9e</a>
* ZhiPuAI embedding model now supports configurable custom dimensions <a href="https://github.com/spring-projects/spring-ai/pull/3668" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3668/hovercard">#3668</a> via <a href="https://github.com/spring-projects/spring-ai/issues/1857" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/1857/hovercard">#1857</a>
* Added configuration option for meta field prefix in Weaviate vector store properties <a href="https://github.com/spring-projects/spring-ai/pull/3585" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3585/hovercard">#3585</a>
* Improved function capabilities through <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tool/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tool">@tool</a> annotation improvements for better function calling integration <a href="https://github.com/spring-projects/spring-ai/commit/22fc730661a244f97c0bb54f88971b29fadda82c">22fc730</a>
* Enhanced MistralChatOptions with updated configuration capabilities <a href="https://github.com/spring-projects/spring-ai/commit/a2a92bb95cf370d87cddea912bb11283b5cd21ba">a2a92bb</a>
* Added selective exception rethrowing capability to DefaultToolExecutionExceptionProcessor for better error handling control <a href="https://github.com/spring-projects/spring-ai/commit/beb1d05d756f3814d913dc981b09349b541a5a2d">beb1d05</a>
* ChatClient#mutate now creates copies of advisors and advisorParams instead of referencing the originals <a href="https://github.com/spring-projects/spring-ai/commit/f391ff2e98f577e247edbd4f8f0f1a08bfbeab16">f391ff2</a>
* Made the content field configurable in Weaviate vector store properties to provide more flexibility in vector store configuration <a href="https://github.com/spring-projects/spring-ai/commit/24de06ebebb5657e742ea2f52c30e8615b91dd2b">24de06e</a>
* Added integration with ElevenLabs for text-to-speech functionality <a href="https://github.com/spring-projects/spring-ai/commit/9398850c2b54807fb7ba951c61ac559f376005d6">9398850</a>
* Expanded Mistral AI integration with support for additional chat models <a href="https://github.com/spring-projects/spring-ai/pull/3523" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3523/hovercard">#3523</a>
* Enhanced OllamaChatModel with retry template support for improved reliability <a href="https://github.com/spring-projects/spring-ai/commit/cfbefee6a2e7f2cbec57ffdc9e712a46294423f3">cfbefee</a>
* Improved MiniMaxChatOptions with proper equality methods and deep copy functionality <a href="https://github.com/spring-projects/spring-ai/commit/d9e30379843de8ceb987e8257d3be69e526ca16d">d9e3037</a>
* Added support for streaming thinking events in the Anthropic model provider, enabling real-time access to model reasoning processes <a href="https://github.com/spring-projects/spring-ai/commit/12f19dbfe091a3e65690926d5fa08afafc7c2a1e">12f19db</a>
* Enhanced OpenAI integration with updated supported voice enums for text-to-speech and chat completions <a href="https://github.com/spring-projects/spring-ai/pull/3411" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3411/hovercard">#3411</a>
* Neo4j module now automatically determines default embedding dimensions from the model <a href="https://github.com/spring-projects/spring-ai/commit/cb97d9c4e27f7021734ce629786848cc69c42d27">cb97d9c</a>
* Added support for dynamically providing API keys for Anthropic requests on a per-request basis <a href="https://github.com/spring-projects/spring-ai/commit/0a1cf81cfc135b1259e2ef330234e9bb297bdb9e">0a1cf81</a>
* Added support for the latest Claude Opus-4 and Sonnet-4 models in the Anthropic chat model integration <a href="https://github.com/spring-projects/spring-ai/pull/3351" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3351/hovercard">#3351</a>
* Enhanced OpenAI integration to support PDF files as media input for chat models <a href="https://github.com/spring-projects/spring-ai/commit/1f2bd0878a96a5dbc8d212984bd95234451f47c1">1f2bd08</a>
* Added MySQL database schema support for the SPRING_AI_CHAT_MEMORY table <a href="https://github.com/spring-projects/spring-ai/commit/9f58520a12de66b52294da58f5d3534a19323a45">9f58520</a>
* Improved handling and testing of complex metadata values in Chroma vector store integration <a href="https://github.com/spring-projects/spring-ai/commit/7466cb9527e59e77310a12234a80fdf71ecbda3a">7466cb9</a>
* Added comprehensive metadata support for various vector store types to enable richer data storage and retrieval <a href="https://github.com/spring-projects/spring-ai/commit/f78b54939a18296b0fca838a028dfcb8922d83a9">f78b549</a>
* Added configurable exception handling mechanisms for tool execution to improve error management and debugging capabilities <a href="https://github.com/spring-projects/spring-ai/commit/6f61fee774482a81d209dfcc1a74ffe040c19c00">6f61fee</a>
* Added comprehensive integration tests for Chat Memory functionality when using SQL Server as the backend <a href="https://github.com/spring-projects/spring-ai/commit/4cac3ff8edf370d696a4a21b93831cdb1d4cb039">4cac3ff</a>

🪲 Bug Fixes

* Resolved issue with toolAnnotationWeatherForecast test in BedrockNovaChatClientIT <a href="https://github.com/spring-projects/spring-ai/commit/58a527d50fa720843751942be398bc7297e17362">58a527d</a>
* Resolved code style violations to maintain code quality standards <a href="https://github.com/spring-projects/spring-ai/commit/01c4b14c40158735afa78efc0d5e4d388660affb">01c4b14</a>
* Corrected spelling error in STATELESS constant reference <a href="https://github.com/spring-projects/spring-ai/commit/deffe800343f73d59abfbc6376e7f56b060140b5">deffe80</a>
* Cleaned up unnecessary exception handling in JDBC chat memory implementation <a href="https://github.com/spring-projects/spring-ai/pull/4288" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4288/hovercard">#4288</a>
* Resolved issue with FunctionCallWithPromptFunctionIT test for Anthropic provider <a href="https://github.com/spring-projects/spring-ai/commit/c8a75abddaf30c6a74ea3a970ffc84a96a438105">c8a75ab</a>
* Resolved streamFunctionCallUsageTest failure in AzureOpenAiChatModelFunctionCallIT <a href="https://github.com/spring-projects/spring-ai/commit/784013996fda8a3660c7ad02bf4f862e94978a2b">7840139</a>
* Fixed chatCompletionStreamError handling in AnthropicApiIT integration tests <a href="https://github.com/spring-projects/spring-ai/commit/e1228a70d392d34c29d869555c4cc22a86b05953">e1228a7</a>
* Removed unnecessary null checks in template variable validation logic <a href="https://github.com/spring-projects/spring-ai/pull/4104" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4104/hovercard">#4104</a>
* Resolved reordering problems in AzureOpenAi chat model implementation that affected message processing <a href="https://github.com/spring-projects/spring-ai/pull/4156" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4156/hovercard">#4156</a>
* Enhanced error handling in ToolCallingAutoConfiguration to only log class names on ClassNotFoundException for better debugging <a href="https://github.com/spring-projects/spring-ai/commit/befaf87c775d91fea254d2a3974c4ecbd4e79232">befaf87</a>
* Resolved null pointer exception that occurred when converting MCP tools to async tool specifications <a href="https://github.com/spring-projects/spring-ai/commit/36a97d300d66910d6e8213ebb504c224b97e0736">36a97d3</a>
* Fixed issues with calling stateless MCP (Model Control Protocol) tools <a href="https://github.com/spring-projects/spring-ai/commit/1df5f5c4cb140f46d3afc22e8cecc871dd296e2b">1df5f5c</a>
* Cleaned up duplicate code in AzureOpenAiChatOptions class <a href="https://github.com/spring-projects/spring-ai/commit/c9ad1c7d9427792fe5a6ad12a6e3699de9308005">c9ad1c7</a>
* Replaced SimpleDateFormat with thread-safe DateTimeFormatter to prevent concurrency issues <a href="https://github.com/spring-projects/spring-ai/commit/b4348e68b40d4c98836b7cb306dd471420bb30d1">b4348e6</a>
* Resolved issues with MCP client auto-configuration tests and added comprehensive documentation <a href="https://github.com/spring-projects/spring-ai/commit/2c6e44814e0483f02a500ebd5a285b008f400fda">2c6e448</a>
* Fixed test execution to only run tests for affected modules, not their dependencies, improving build efficiency <a href="https://github.com/spring-projects/spring-ai/commit/97eb1c91133073fa7e0a13ec5a9ad55da129e90a">97eb1c9</a>
* Correctly exclude root module from affected modules list and handle empty string cases properly <a href="https://github.com/spring-projects/spring-ai/commit/77a704f22e515a3d077779e1f99e37329f8a2d98">77a704f</a>
* Prevent root module from appearing in affected modules list during build processes <a href="https://github.com/spring-projects/spring-ai/commit/b8eac35ea7249702a11e05afbaea0fead3ac9b1f">b8eac35</a>
* Add -am flag to properly build required dependencies during the build process <a href="https://github.com/spring-projects/spring-ai/commit/8f45ca1042a5c5e3925252c65bfefff9f6d16420">8f45ca1</a>
* Fixed main-push-fast workflow module detection and prevented recursive triggers to ensure stable CI operations <a href="https://github.com/spring-projects/spring-ai/commit/b9cc239fac2a295314512689ecb98001a7c01e8e">b9cc239</a>
* Simplified commit SHA checkout to avoid git fetch issues and added enhanced run context <a href="https://github.com/spring-projects/spring-ai/commit/a8cf2c9c0606de4a0888c52277dd564965aea504">a8cf2c9</a>
* Resolved infinite recursion in MongoDbAtlasLocalContainerConnectionDetails.getSslBundle() method <a href="https://github.com/spring-projects/spring-ai/pull/4149" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4149/hovercard">#4149</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4133" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4133/hovercard">#4133</a>
* Corrected issue where actual model version used for chat was not being returned properly <a href="https://github.com/spring-projects/spring-ai/pull/4152" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4152/hovercard">#4152</a>
* Properly handle merge operations when 'current' parameter is null <a href="https://github.com/spring-projects/spring-ai/pull/4153" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4153/hovercard">#4153</a>
* Resolved NullPointerException when metadata is null in MilvusVectorStore operations <a href="https://github.com/spring-projects/spring-ai/pull/4116" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4116/hovercard">#4116</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4115" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4115/hovercard">#4115</a>
* Fixed metadata immutability issue in Azure AI Search vector store implementation <a href="https://github.com/spring-projects/spring-ai/pull/4131" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4131/hovercard">#4131</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4117" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4117/hovercard">#4117</a>
* Improved bean naming convention for streamable HTTP WebFlux client transports <a href="https://github.com/spring-projects/spring-ai/pull/4146" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4146/hovercard">#4146</a>
* Resolved an issue where empty string finish_reason values in OpenAI streaming responses were not handled correctly <a href="https://github.com/spring-projects/spring-ai/pull/4132" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4132/hovercard">#4132</a> via <a href="https://github.com/spring-projects/spring-ai/issues/1358" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/1358/hovercard">#1358</a>
* Resolved flaky test issues in streaming response aggregation functionality <a href="https://github.com/spring-projects/spring-ai/pull/4135" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4135/hovercard">#4135</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4134" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4134/hovercard">#4134</a>
* Fixed maintenance branch detection to prioritize branch detection over explicit base_ref configuration <a href="https://github.com/spring-projects/spring-ai/commit/f80a71c77114a5d9088da321d34e6ea3cedacd9e">f80a71c</a>
* Streamlined git operations to use 'git show HEAD' approach for better maintenance branch handling <a href="https://github.com/spring-projects/spring-ai/commit/007809b5c3ee61d5b7396aff13f15b9988bf8a4e">007809b</a>
* Fixed excessive CI triggering and git history issues on maintenance branches <a href="https://github.com/spring-projects/spring-ai/commit/c5d2ccd7cf548c103d9bcb393249a7ec04412395">c5d2ccd</a>
* Added fail-fast fallback mechanism and single-commit git diff strategy for improved reliability <a href="https://github.com/spring-projects/spring-ai/commit/cfd909528033181675dd5c0ac1336a959a296057">cfd9095</a>
* Improved retry handling for ResourceAccessException when encountering network connectivity issues <a href="https://github.com/spring-projects/spring-ai/pull/4094" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4094/hovercard">#4094</a>
* Enhanced null checking using Optional to prevent NullPointerException occurrences <a href="https://github.com/spring-projects/spring-ai/pull/4063" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4063/hovercard">#4063</a>
* Enhanced null checking using Optional to avoid NullPointerException <a href="https://github.com/spring-projects/spring-ai/pull/4064" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4064/hovercard">#4064</a>
* Use Map#putAll instead of individual put operations for better performance <a href="https://github.com/spring-projects/spring-ai/pull/4062" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4062/hovercard">#4062</a>
* Added strict option to Azure ChatCompletionsJsonSchemaResponseFormat to fix JSON schema handling <a href="https://github.com/spring-projects/spring-ai/pull/3931" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3931/hovercard">#3931</a>
* Fixed pass check behavior for evaluators and prevented null pointer exceptions <a href="https://github.com/spring-projects/spring-ai/pull/3975" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3975/hovercard">#3975</a>
* Similarity searches with the MariaDBVectorStore now properly provide similarity scores <a href="https://github.com/spring-projects/spring-ai/commit/891ef2aad29e8c4767eeab3a9f1e670949472102">891ef2a</a>
* Eliminates one deserialization step in the majority of scenarios when parsing model responses, improving performance when handling JSON string parameters <a href="https://github.com/spring-projects/spring-ai/pull/4003" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4003/hovercard">#4003</a>
* Properly rethrow ToolExecutionException for non-RuntimeException cases, ensuring consistent exception handling behavior <a href="https://github.com/spring-projects/spring-ai/pull/3915" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3915/hovercard">#3915</a>
* Tool function runtime exceptions are now properly wrapped in ToolExecutionException and re-thrown for better error handling and debugging <a href="https://github.com/spring-projects/spring-ai/pull/3918" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3918/hovercard">#3918</a> via <a href="https://github.com/spring-projects/spring-ai/issues/2857" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/2857/hovercard">#2857</a>
* Corrected documentation and code comments for the Model Context Protocol (MCP) Client and Server components <a href="https://github.com/spring-projects/spring-ai/pull/4011" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4011/hovercard">#4011</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4010" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4010/hovercard">#4010</a>
* Improved null checking in DefaultChatClient using Optional for better safety <a href="https://github.com/spring-projects/spring-ai/pull/3976" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3976/hovercard">#3976</a>
* Enhanced code quality with better empty checks, method references, and pattern matching usage <a href="https://github.com/spring-projects/spring-ai/pull/3977" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3977/hovercard">#3977</a> <a href="https://github.com/spring-projects/spring-ai/pull/3978" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3978/hovercard">#3978</a> <a href="https://github.com/spring-projects/spring-ai/pull/3979" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3979/hovercard">#3979</a>
* Corrected example code in documentation to ensure accuracy for users <a href="https://github.com/spring-projects/spring-ai/pull/3993" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3993/hovercard">#3993</a>
* Resolved issues with Maven Central publication process <a href="https://github.com/spring-projects/spring-ai/commit/8366fa81ab43a8cb8bc8af06bafa4423c52f5799">8366fa8</a>
* Made embedding options builder methods consistent across Bedrock providers for improved developer experience <a href="https://github.com/spring-projects/spring-ai/pull/3906" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3906/hovercard">#3906</a>
* Corrected spelling of frequencyPenalty property in Google builders for proper parameter handling <a href="https://github.com/spring-projects/spring-ai/commit/128c45ae946ba8b7f849c420be880c7cf1a4075b">128c45a</a>
* Fixed continuous integration failures to improve build stability and reliability <a href="https://github.com/spring-projects/spring-ai/pull/3844" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3844/hovercard">#3844</a>
* Fixed issue where method tool calls would throw errors when multiple methods had the same name <a href="https://github.com/spring-projects/spring-ai/pull/2774" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/2774/hovercard">#2774</a>
* Resolves issues in MCP server auto-configuration integration tests <a href="https://github.com/spring-projects/spring-ai/pull/3792" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3792/hovercard">#3792</a>
* Resolves null pointer exception in Anthropic API streaming functionality <a href="https://github.com/spring-projects/spring-ai/pull/3755" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3755/hovercard">#3755</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3740" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3740/hovercard">#3740</a>
* Corrects SystemPromptTemplate builder to return proper SystemPromptTemplate.Builder instead of generic PromptTemplate.Builder <a href="https://github.com/spring-projects/spring-ai/commit/dbaa608be3b8b09b2ebaa1ec2784ce1ecf2b92f2">dbaa608</a>
* Resolves parameter ordering issues in JSON schema generation functionality <a href="https://github.com/spring-projects/spring-ai/pull/3733" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3733/hovercard">#3733</a>
* Corrected annotation package configuration issues <a href="https://github.com/spring-projects/spring-ai/pull/3716" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3716/hovercard">#3716</a>
* Fixed issue where audio filename was lost when requesting OpenAI <code>/transcriptions</code> and <code>/translations</code> interfaces <a href="https://github.com/spring-projects/spring-ai/commit/af07517b579f0c693dab4f3c09d2cfcda290ba60">af07517</a>
* Fixed issue preventing streaming tool calling responses when internal execution is enabled for Anthropic provider <a href="https://github.com/spring-projects/spring-ai/commit/879c5e20fda0a799fa840a29bd3d3d21c15bb8c8">879c5e2</a>
* Added validation for documents text/media check when adding to vector store <a href="https://github.com/spring-projects/spring-ai/pull/3687" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3687/hovercard">#3687</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3609" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3609/hovercard">#3609</a>
* Corrected assert message in SimpleApiKey for better error reporting <a href="https://github.com/spring-projects/spring-ai/pull/3656" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3656/hovercard">#3656</a>
* Fixed various typos throughout the codebase for improved clarity <a href="https://github.com/spring-projects/spring-ai/pull/3695" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3695/hovercard">#3695</a>
* Removed unused configuration options from ZhiPu AI model implementation <a href="https://github.com/spring-projects/spring-ai/pull/3669" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3669/hovercard">#3669</a>
* Removed incorrect <a class="user-mention notranslate" data-hovercard-type="organization" data-hovercard-url="/orgs/nullable/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nullable">@nullable</a> annotation from VectorStore similaritySearch method <a href="https://github.com/spring-projects/spring-ai/pull/3613" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3613/hovercard">#3613</a>
* Fixed incorrect changes in Ollama auto-configuration that were causing issues <a href="https://github.com/spring-projects/spring-ai/pull/3645" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3645/hovercard">#3645</a>
* Fixed getTextBetweenParagraphs method to properly handle invalid page numbers in outline items <a href="https://github.com/spring-projects/spring-ai/commit/d92a2ea35152b56967f7c335a98f005ad2f982d5">d92a2ea</a>
* Corrected naming inconsistencies in the Mistral package for better consistency <a href="https://github.com/spring-projects/spring-ai/pull/3652" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3652/hovercard">#3652</a>
* Removed unnecessary null check in OpenAiApi.Builder#apiKey(String) method <a href="https://github.com/spring-projects/spring-ai/pull/3654" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3654/hovercard">#3654</a>
* Added required license header to FileDocumentWriterTest class <a href="https://github.com/spring-projects/spring-ai/pull/3651" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3651/hovercard">#3651</a>
* Resolved issue with streaming tool calls that have no input parameters in Anthropic integration <a href="https://github.com/spring-projects/spring-ai/commit/f5750517b4e3aa379d43b32489d7d1208f61b8f0">f575051</a>
* Fixed streaming tool calling functionality when no input arguments are provided in Bedrock integration <a href="https://github.com/spring-projects/spring-ai/commit/81076126482aef6815482c08b5be4e4b0c083ded">8107612</a>
* Corrected autoconfiguration class name and added ElevenLabs speech documentation link <a href="https://github.com/spring-projects/spring-ai/pull/3610" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3610/hovercard">#3610</a>
* Prevents incorrect ToolCall merging caused by empty id and name strings in DeepSeek integration <a href="https://github.com/spring-projects/spring-ai/commit/d61192a63598223ca3b8035fe2ab243b3e691345">d61192a</a>
* Resolved exception in OpenAiAudioTranscriptionResponseMetadata.toString method that was causing runtime errors <a href="https://github.com/spring-projects/spring-ai/pull/3575" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3575/hovercard">#3575</a>
* Resolved infinite recursion issue in getMimeType(Path) method that could cause stack overflow errors <a href="https://github.com/spring-projects/spring-ai/commit/ab04e2718f73f36bf179a75a3ff4df92df21ebd2">ab04e27</a>
* Resolved test failure in ChromaVectorStoreAutoConfigurationIT due to updated exception message <a href="https://github.com/spring-projects/spring-ai/pull/3581" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3581/hovercard">#3581</a>
* Corrected logic for determining output modalities when using streaming mode <a href="https://github.com/spring-projects/spring-ai/commit/d9a53378ecccf89352c2750d015b811e8f446bff">d9a5337</a>
* Improved logging for ChromaDB collection creation to provide clearer feedback <a href="https://github.com/spring-projects/spring-ai/commit/0d8eebdf4e10fb3b4b4aa8556b7f410ed07d2a24">0d8eebd</a>
* Enhanced error handling in McpToolCallback to properly handle root exceptions <a href="https://github.com/spring-projects/spring-ai/commit/d6924b668c13ef03e1eb78b02dce8199a59fe25f">d6924b6</a>
* Resolved issue preventing proper generation of configuration metadata for Spring AI tools observations <a href="https://github.com/spring-projects/spring-ai/pull/3539" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3539/hovercard">#3539</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3550" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3550/hovercard">#3550</a>
* Corrected parameter order in ClassUtils.isAssignable call within validateToolContextSupport method <a href="https://github.com/spring-projects/spring-ai/commit/76c70189e2de7b8fb872ea0b01604258a2290e1f">76c7018</a>
* Resolved test configuration issues in Ollama embedding auto-configuration tests <a href="https://github.com/spring-projects/spring-ai/commit/66324a64d100497fc9f21a83a9fd3aaa7510ac18">66324a6</a>
* Corrected similarity option parsing in ElasticsearchVectorStore for proper functionality <a href="https://github.com/spring-projects/spring-ai/commit/f8d0503db8dda0981021915ec4044adb12b346e7">f8d0503</a>
* Corrected version alignment for ElevenLabs starter and autoconfiguration artifacts <a href="https://github.com/spring-projects/spring-ai/commit/15775f15c23c93418baf6b48a95ac42aaf8eaff8">15775f1</a>
* Refactored parameter naming for better code clarity in ChatGenerationMetadata <a href="https://github.com/spring-projects/spring-ai/pull/3507" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3507/hovercard">#3507</a>
* Resolved configuration issue where embeddingFieldName was not properly set when configuring ElasticsearchVectorStore <a href="https://github.com/spring-projects/spring-ai/pull/3501" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3501/hovercard">#3501</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3500" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3500/hovercard">#3500</a>
* Corrected issue where Bedrock Titan embeddings were not returning proper usage statistics <a href="https://github.com/spring-projects/spring-ai/commit/c4e434a5e5787c7df31b127e371af62c6d36cb31">c4e434a</a>
* Corrected parameter order error in validateToolContextSupport method that was causing incorrect validation results <a href="https://github.com/spring-projects/spring-ai/commit/59d26610ef8df5afddcb5aff1476eecd8b967a78">59d2661</a>
* Improved logic for checking functional types in MethodToolCallbackProvider to properly identify function implementations <a href="https://github.com/spring-projects/spring-ai/commit/fe4f0d197ca192450d202bcb90ff972cc2b73cfe">fe4f0d1</a>
* Resolved SQL error in the isTableExists method of MariaDBSchemaValidator that was preventing proper table validation <a href="https://github.com/spring-projects/spring-ai/commit/b925c50f0407af0097ac409baa7e0cc44b4782d0">b925c50</a>
* Resolved issues in OpenAiChatClientMethodInvokingFunctionCallbackIT test to ensure proper integration testing <a href="https://github.com/spring-projects/spring-ai/commit/95b3df7a2b34711867f0de305e7938b315a4ee27">95b3df7</a>
* Fixed Qdrant vector database integration to properly handle Long type values in payload by converting them to String <a href="https://github.com/spring-projects/spring-ai/commit/f0d4cbf03750469bc992bb8329096132bbef5c96">f0d4cbf</a>
* Fixed OpenAiChatOptions to properly support transfer of webSearchOptions <a href="https://github.com/spring-projects/spring-ai/commit/4621c812cc3cad11f0508d0e56a1e7dd70f610c4">4621c81</a>
* Refactored QdrantObjectFactory to properly handle null metadata values <a href="https://github.com/spring-projects/spring-ai/commit/8b45f41139b1afdf2687f143ace75a445e0dedb9">8b45f41</a>
* Fixed missing properties in the ChromaVectorStore AutoConfiguration that were preventing proper initialization <a href="https://github.com/spring-projects/spring-ai/pull/3435" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3435/hovercard">#3435</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3427" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3427/hovercard">#3427</a>
* Added compatibility for Spring Framework 7.x to RetryUtils ResponseErrorHandler <a href="https://github.com/spring-projects/spring-ai/pull/3416" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3416/hovercard">#3416</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3415" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3415/hovercard">#3415</a>
* Resolved issue where an extra system message was incorrectly added when the system message was not the first one in the message list <a href="https://github.com/spring-projects/spring-ai/commit/902fc0963955aec2338018e2925f6d0c72b10d99">902fc09</a>
* Removed unreachable code branch that could cause confusion in chat memory advisor logic <a href="https://github.com/spring-projects/spring-ai/pull/3395" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3395/hovercard">#3395</a>
* Avoided unnecessary looping through all page tree when there is no destination page in PDF document reader <a href="https://github.com/spring-projects/spring-ai/pull/3396" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3396/hovercard">#3396</a>
* Fixed null pointer exception when accessing duration metadata from Ollama chat model responses <a href="https://github.com/spring-projects/spring-ai/commit/72fe3bfd5e12c3fb68013ef2be67558a1b7b493d">72fe3bf</a>
* Corrected the CustomerTools documentation example to reference proper existing methods <a href="https://github.com/spring-projects/spring-ai/pull/3390" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3390/hovercard">#3390</a>
* Added protection against empty unicode strings during PDF document processing <a href="https://github.com/spring-projects/spring-ai/pull/3271" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3271/hovercard">#3271</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3054" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3054/hovercard">#3054</a>
* Fixed issue where already valid JSON strings were being double-serialized in JsonParser.toJson method <a href="https://github.com/spring-projects/spring-ai/commit/18ae16e6ac0256144de2cbcaea08ac1736fc707c">18ae16e</a>
* Corrected typo in ToolCallback class to improve code clarity <a href="https://github.com/spring-projects/spring-ai/pull/3352" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3352/hovercard">#3352</a>
* Resolved critical connection leak issue when using JdbcChatMemoryRepository that could cause resource exhaustion <a href="https://github.com/spring-projects/spring-ai/pull/3283" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3283/hovercard">#3283</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3281" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3281/hovercard">#3281</a>
* Updated useAutoConfiguredJdbcChatMemoryRepository test to work correctly after the connection leak fix <a href="https://github.com/spring-projects/spring-ai/commit/029e8a10afdd86b5c4c2f0e91f933bdd07fe5d2c">029e8a1</a>

📓 Documentation

* Comprehensive documentation for the new Spring AI Google GenAI integration modules <a href="https://github.com/spring-projects/spring-ai/commit/e26120a45c0923cb9fc27e759733513ca9c47d91">e26120a</a>
* Corrected git log command syntax in project documentation <a href="https://github.com/spring-projects/spring-ai/pull/4272" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4272/hovercard">#4272</a>
* Updated tools.adoc documentation with latest information <a href="https://github.com/spring-projects/spring-ai/pull/4278" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4278/hovercard">#4278</a>
* Improved documentation for Docker services setup and configuration <a href="https://github.com/spring-projects/spring-ai/pull/4253" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4253/hovercard">#4253</a>
* Updated project README with latest information and improvements <a href="https://github.com/spring-projects/spring-ai/pull/4161" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4161/hovercard">#4161</a>
* Fixed typo from 'are' to 'and' in advisors.adoc documentation <a href="https://github.com/spring-projects/spring-ai/pull/4219" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4219/hovercard">#4219</a>
* Added more detailed explanation in observability documentation about metrics configuration and usage <a href="https://github.com/spring-projects/spring-ai/commit/a0ad921bb452a2079bbd135a3531188bfb2c22d3">a0ad921</a>
* Various small improvements to documentation content and formatting <a href="https://github.com/spring-projects/spring-ai/commit/ad93613531e3d20e1c13fba9b266f5c998ad8908">ad93613</a>
* Added extensive validation and functionality tests for the Document class to improve test coverage <a href="https://github.com/spring-projects/spring-ai/commit/2bca047d105f43fb33666c7d7e7cda02f05e7f16">2bca047</a>
* Added new model names in Anthropic documentation <a href="https://github.com/spring-projects/spring-ai/pull/4077" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4077/hovercard">#4077</a>
* Added reference documentation for MariaDBVectorStore similarity score functionality <a href="https://github.com/spring-projects/spring-ai/commit/9d19181e2f03830c9f7138426df77eaaf049866d">9d19181</a>
* Added comprehensive documentation for the new metadata support feature in ChatClient <a href="https://github.com/spring-projects/spring-ai/commit/c328ef62c42715f80677f603ac810485747bd4e7">c328ef6</a>
* Enhanced readability by formatting documentation with one sentence per line <a href="https://github.com/spring-projects/spring-ai/commit/54a2dc3c364b315981664b5fe2cf004faa107a32">54a2dc3</a>
* Updated getting-started.adoc documentation to reflect 1.0.0 release changes and improvements <a href="https://github.com/spring-projects/spring-ai/pull/3920" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3920/hovercard">#3920</a>
* Improved chat-memory.adoc documentation with updated information and examples <a href="https://github.com/spring-projects/spring-ai/pull/3917" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3917/hovercard">#3917</a>
* Fixed various typos in comments and improved overall documentation quality <a href="https://github.com/spring-projects/spring-ai/pull/3936" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3936/hovercard">#3936</a>
* Updated outdated information in project documentation to reflect current state <a href="https://github.com/spring-projects/spring-ai/commit/056c2612ee3bd1b96a6bced6e8b02b130d7d80ec">056c261</a>
* Updated ChromaDB configuration details to include comprehensive support for Chroma Cloud deployment <a href="https://github.com/spring-projects/spring-ai/pull/4008" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4008/hovercard">#4008</a>
* Enhanced documentation for the call() method in ChatClient with clearer examples and usage guidelines <a href="https://github.com/spring-projects/spring-ai/pull/3963" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3963/hovercard">#3963</a>
* Fixed bug in example code to provide accurate documentation for users <a href="https://github.com/spring-projects/spring-ai/pull/3993" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3993/hovercard">#3993</a>
* Applied consistent AsciiDoc styling to CONTRIBUTING.adoc for improved documentation formatting <a href="https://github.com/spring-projects/spring-ai/pull/3883" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3883/hovercard">#3883</a>
* Optimized Bedrock documentation to keep it synchronized with current code implementation <a href="https://github.com/spring-projects/spring-ai/pull/3843" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3843/hovercard">#3843</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3842" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3842/hovercard">#3842</a>
* Fixed typo in PropmptTemplate reference within structured-output-api.jpg documentation <a href="https://github.com/spring-projects/spring-ai/pull/3304" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3304/hovercard">#3304</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3295" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3295/hovercard">#3295</a>
* Added example demonstrating dynamic Model Context Protocol client selection <a href="https://github.com/spring-projects/spring-ai/pull/3751" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3751/hovercard">#3751</a>
* Updated Model Context Protocol specification documentation link <a href="https://github.com/spring-projects/spring-ai/pull/3810" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3810/hovercard">#3810</a>
* Fixed example code in streaming responses documentation <a href="https://github.com/spring-projects/spring-ai/pull/3802" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3802/hovercard">#3802</a>
* Improves documentation for ChatClient advisor configuration and usage <a href="https://github.com/spring-projects/spring-ai/commit/965b1d26c3e2ce8c2262d5280d2cf328bd4dcfaa">965b1d2</a>
* Updates Model Context Protocol documentation to reference current implementation patterns <a href="https://github.com/spring-projects/spring-ai/pull/3760" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3760/hovercard">#3760</a>
* Updated documentation for Anthropic chat integration <a href="https://github.com/spring-projects/spring-ai/pull/2723" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/2723/hovercard">#2723</a>
* Updated contributing guidelines to use Developer Certificate of Origin instead of Contributor License Agreement <a href="https://github.com/spring-projects/spring-ai/pull/3228" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3228/hovercard">#3228</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3094" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3094/hovercard">#3094</a>
* Corrected typographical errors in token configuration documentation <a href="https://github.com/spring-projects/spring-ai/pull/3677" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3677/hovercard">#3677</a>
* Updated documentation with current code examples and removed deprecated references <a href="https://github.com/spring-projects/spring-ai/pull/3717" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3717/hovercard">#3717</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3713" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3713/hovercard">#3713</a>
* Fixed property name from <code>is-auto-id</code> to <code>auto-id</code> in Milvus vector store documentation <a href="https://github.com/spring-projects/spring-ai/pull/3704" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3704/hovercard">#3704</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3702" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3702/hovercard">#3702</a>
* Cleaned up duplicated dependency instructions in opensearch.adoc documentation <a href="https://github.com/spring-projects/spring-ai/pull/3712" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3712/hovercard">#3712</a>
* Corrected incorrect default embedding model reference in ollama-embeddings.adoc <a href="https://github.com/spring-projects/spring-ai/pull/3686" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3686/hovercard">#3686</a>
* Enhanced README with Elasticsearch vector store documentation and integration details <a href="https://github.com/spring-projects/spring-ai/pull/3688" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3688/hovercard">#3688</a>
* Fixed broken link in javadoc to Message source in Content class <a href="https://github.com/spring-projects/spring-ai/pull/3672" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3672/hovercard">#3672</a>
* Fixed various spelling errors and typos in documentation and code comments <a href="https://github.com/spring-projects/spring-ai/pull/3678" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3678/hovercard">#3678</a>
* Fixed documentation for SimpleLoggerAdvisor to provide accurate usage information <a href="https://github.com/spring-projects/spring-ai/pull/3638" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3638/hovercard">#3638</a>
* Updated tools documentation to provide correct usage examples and guidance <a href="https://github.com/spring-projects/spring-ai/commit/585f554f31eba45d9578e08faf5c99fad277907a">585f554</a>
* Updated tools.adoc with improved documentation <a href="https://github.com/spring-projects/spring-ai/pull/3624" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3624/hovercard">#3624</a>
* Corrected toolDefinition parameter transfer error in documentation <a href="https://github.com/spring-projects/spring-ai/pull/3468" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3468/hovercard">#3468</a>
* Corrected broken link to ChatModel in documentation <a href="https://github.com/spring-projects/spring-ai/pull/3583" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3583/hovercard">#3583</a>
* Improved clarity and formatting in Weaviate vector store documentation <a href="https://github.com/spring-projects/spring-ai/commit/12c725dcd10da1556d42e5cb79999f6d3b1067ba">12c725d</a>
* Improved documentation for Spring AI advisors functionality <a href="https://github.com/spring-projects/spring-ai/pull/3552" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3552/hovercard">#3552</a>
* Enhanced documentation for MCP Server Boot Starter selection and configuration guidance <a href="https://github.com/spring-projects/spring-ai/pull/3511" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3511/hovercard">#3511</a>
* Updated ZhipuAI chat integration documentation <a href="https://github.com/spring-projects/spring-ai/pull/3531" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3531/hovercard">#3531</a>
* Corrected documentation examples showing proper usage of tools and defaultTools configuration <a href="https://github.com/spring-projects/spring-ai/pull/3533" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3533/hovercard">#3533</a>
* Repaired broken links to ChatOptions and ChatOptions#builder() in web documentation <a href="https://github.com/spring-projects/spring-ai/pull/3447" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3447/hovercard">#3447</a>
* Corrected code examples in the openai-chat.adoc documentation to ensure accuracy and proper implementation guidance <a href="https://github.com/spring-projects/spring-ai/pull/3493" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3493/hovercard">#3493</a>
* Updated Hugging Face integration documentation with improvements and clarifications <a href="https://github.com/spring-projects/spring-ai/pull/3445" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3445/hovercard">#3445</a>
* Fixed documentation typos in cloud bindings configuration <a href="https://github.com/spring-projects/spring-ai/pull/3436" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3436/hovercard">#3436</a>
* Corrected ToolDefinition.builder() usage examples in documentation <a href="https://github.com/spring-projects/spring-ai/pull/3431" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3431/hovercard">#3431</a>
* Updated Azure OpenAI chat documentation to reflect response format changes <a href="https://github.com/spring-projects/spring-ai/pull/3434" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3434/hovercard">#3434</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3354" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3354/hovercard">#3354</a>
* Revised and improved documentation for DeepSeek and Minimax chat model integrations <a href="https://github.com/spring-projects/spring-ai/pull/3408" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3408/hovercard">#3408</a>
* Corrected video MIME type specifications and standardized formatting in Bedrock Converse documentation <a href="https://github.com/spring-projects/spring-ai/pull/3413" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3413/hovercard">#3413</a>
* Cleaned up duplicate reference to NoOpTemplateRenderer in ChatClient documentation <a href="https://github.com/spring-projects/spring-ai/pull/3414" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3414/hovercard">#3414</a>
* Enhanced Elasticsearch documentation with detailed description of the embedding-field-name configuration property <a href="https://github.com/spring-projects/spring-ai/pull/3399" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3399/hovercard">#3399</a> via <a href="https://github.com/spring-projects/spring-ai/issues/2082" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/2082/hovercard">#2082</a>
* Corrected spelling error in the contribution guidelines documentation <a href="https://github.com/spring-projects/spring-ai/pull/3378" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3378/hovercard">#3378</a>
* Enhanced documentation with checkstyle configuration and usage instructions <a href="https://github.com/spring-projects/spring-ai/pull/3277" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3277/hovercard">#3277</a>
* Updated advisor documentation to reference correct dependencies <a href="https://github.com/spring-projects/spring-ai/commit/a0d187d14d9c3970c3ddd788ae83a7312534d707">a0d187d</a>
* Improved documentation for Mistral AI embeddings integration <a href="https://github.com/spring-projects/spring-ai/pull/3362" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3362/hovercard">#3362</a>
* Corrected broken links in documentation pointing to Media.java class <a href="https://github.com/spring-projects/spring-ai/pull/3322" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3322/hovercard">#3322</a>
* Updated link to point to official awesome-spring-ai repository <a href="https://github.com/spring-projects/spring-ai/pull/3328" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3328/hovercard">#3328</a>
* Updated documentation with improved example using OpenAiChatModel.builder() for custom API key configuration <a href="https://github.com/spring-projects/spring-ai/pull/3335" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3335/hovercard">#3335</a>
* Fixed and improved documentation for function calling and tool integration <a href="https://github.com/spring-projects/spring-ai/pull/3292" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3292/hovercard">#3292</a>
* Improved documentation for the MCP Server Boot Starter configuration and usage <a href="https://github.com/spring-projects/spring-ai/pull/3279" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3279/hovercard">#3279</a>
* Corrected incorrect external link formatting in the effective agents documentation <a href="https://github.com/spring-projects/spring-ai/pull/3275" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3275/hovercard">#3275</a>
* Corrected various typos throughout the documentation to improve readability <a href="https://github.com/spring-projects/spring-ai/pull/3263" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3263/hovercard">#3263</a>
* Added proper title to documentation that was missing title metadata <a href="https://github.com/spring-projects/spring-ai/commit/09dd973150571341f86a553cf687ae0e02c19480">09dd973</a>

🔨 Dependency Upgrades

* Added spring-ai-mcp-annotations dependency to MCP auto-configurations <a href="https://github.com/spring-projects/spring-ai/commit/ef71e4e1620455f43bbc977ce0d3cf0a90bd74ae">ef71e4e</a>
* Updated MCP SDK to version 0.11.3 for improved functionality and compatibility <a href="https://github.com/spring-projects/spring-ai/commit/09d2a91f5a31be2d7bbc7bc9d3545f6781362ae9">09d2a91</a>
* Updated io.swagger.core.v3:swagger-annotations from version 2.2.25 to 2.2.30 <a href="https://github.com/spring-projects/spring-ai/pull/4187" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4187/hovercard">#4187</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4185" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4185/hovercard">#4185</a>
* Upgraded MCP SDK version to 0.11.1 <a href="https://github.com/spring-projects/spring-ai/pull/4048" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4048/hovercard">#4048</a>
* Updated Tika, pdfbox and jsoup to latest versions for improved document reading capabilities <a href="https://github.com/spring-projects/spring-ai/pull/3912" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3912/hovercard">#3912</a>
* Updated Ollama integration to use the latest API version for improved compatibility and features <a href="https://github.com/spring-projects/spring-ai/commit/3ee33c184d0bc0984e67dfb90f1946b368adb3dd">3ee33c1</a>
* Updated PostgreSQL JDBC driver from version 42.7.5 to 42.7.7 <a href="https://github.com/spring-projects/spring-ai/pull/3934" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3934/hovercard">#3934</a>
* Updated io.modelcontextprotocol from 0.11.0-SNAPSHOT to stable 0.11.0 release <a href="https://github.com/spring-projects/spring-ai/pull/3990" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3990/hovercard">#3990</a>
* Updates Model Context Protocol library to latest snapshot version <a href="https://github.com/spring-projects/spring-ai/pull/3781" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3781/hovercard">#3781</a>
* Enhanced schema initialization logic and updated deprecated code for Milvus vector database integration <a href="https://github.com/spring-projects/spring-ai/pull/3705" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3705/hovercard">#3705</a>
* Updated JdbcChatMemoryRepositoryHsqldbAutoConfigIT from JUnit 4 to JUnit 5 <a href="https://github.com/spring-projects/spring-ai/pull/3633" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3633/hovercard">#3633</a>
* Replaced swagger-annotations with swagger-annotations-jakarta for Jakarta EE compatibility <a href="https://github.com/spring-projects/spring-ai/commit/3e02edc2dbcf8846a09b0457f37cdb8e8067caa2">3e02edc</a>
* Updated Spring Boot dependency to version 3.5.0 for latest features and improvements <a href="https://github.com/spring-projects/spring-ai/commit/2be1e42505307a7b71ed2bcc0fa1758d933d295b">2be1e42</a>
* Updated org.apache.pdfbox dependency to version 3.0.4 for improved PDF processing <a href="https://github.com/spring-projects/spring-ai/pull/3271" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3271/hovercard">#3271</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3265" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3265/hovercard">#3265</a>

⚡ Performance

* Improved performance of the from method in JdbcChatMemoryRepositoryDialect <a href="https://github.com/spring-projects/spring-ai/commit/1607eb87364560706141c0bba672b7edbb2bffec">1607eb8</a>
* Improved fast workflow performance with better logging and optimization for true no-op builds <a href="https://github.com/spring-projects/spring-ai/commit/b339f56cb914484c111140e8fc255499a5507378">b339f56</a>
* Eliminates unnecessary deserialization step when parsing JSON string parameters in model responses <a href="https://github.com/spring-projects/spring-ai/pull/4003" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4003/hovercard">#4003</a>
* Reuse DocumentRowMapper instance to reduce redundant object creation and improve performance <a href="https://github.com/spring-projects/spring-ai/commit/af1ce67c8697f4f3ee2d8c80cb9e82cd2cf161bb">af1ce67</a>
* Improved performance by optimizing debug logging operations in the chat memory advisor <a href="https://github.com/spring-projects/spring-ai/pull/3448" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3448/hovercard">#3448</a>

🔩 Build Updates

* Enhanced test coverage for HTTP client transport auto-configuration with MCP support <a href="https://github.com/spring-projects/spring-ai/pull/4147" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4147/hovercard">#4147</a>
* Updated VS Code formatting configurations for improved developer experience <a href="https://github.com/spring-projects/spring-ai/commit/80228af3e9fdffcfcbe82faae4cfecca633919e9">80228af</a>
* Improved test coverage for tool execution components <a href="https://github.com/spring-projects/spring-ai/pull/4268" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4268/hovercard">#4268</a>
* Applied code style fixes and formatting improvements to maintain code quality standards <a href="https://github.com/spring-projects/spring-ai/commit/6880753dd607532c9f542d5ce6fa0c1dbd0ff68e">6880753</a>
* Added extensive test coverage for tool calling observation components to improve code reliability <a href="https://github.com/spring-projects/spring-ai/pull/4259" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4259/hovercard">#4259</a>
* Restored Groq API integration tests to ensure proper testing coverage for Groq provider functionality <a href="https://github.com/spring-projects/spring-ai/commit/39c5c38edbe1dfc21ce09a9017f6bf3fb944347c">39c5c38</a>
* Restored Maven settings.xml configuration file required for continuous integration builds <a href="https://github.com/spring-projects/spring-ai/commit/72f7c6365e5c3f1c6c3460fc14bdbab50d9e7bf9">72f7c63</a>
* Improved test coverage for ChatClient response handling and builder functionality <a href="https://github.com/spring-projects/spring-ai/pull/4216" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4216/hovercard">#4216</a>
* Code formatting improvements in test files <a href="https://github.com/spring-projects/spring-ai/commit/e119eb7af05f501342654c5c799e1de0f8fe9caa">e119eb7</a>
* Restructured MCP server auto-configuration modules for improved modularity and maintainability <a href="https://github.com/spring-projects/spring-ai/commit/a38aad8dfd08b2d711e36efe9a74b9bdc67c5f49">a38aad8</a>
* Comprehensive test coverage improvements across Spring AI modules with additional edge case testing <a href="https://github.com/spring-projects/spring-ai/commit/d67a3cd74bbf7999e4191b9e8a5c65e37d00780f">d67a3cd</a>
* Enabled manual triggering for maintenance workflows and optimized builds by skipping when no new commits exist <a href="https://github.com/spring-projects/spring-ai/commit/23242ca7a2531d1322055a971b774ece70722014">23242ca</a>
* Added missing run-name configuration to maintenance-fast.yml workflow <a href="https://github.com/spring-projects/spring-ai/commit/ab826e4531b3afe03e36d403a26b79ea6a161484">ab826e4</a>
* Enhanced continuous integration workflow with better concurrency control, run naming improvements, and duplicate schedule removal <a href="https://github.com/spring-projects/spring-ai/commit/349a9e53ed85b0ee02f9685d0691289696384666">349a9e5</a>
* Updated main-push-fast.yml to test only affected modules, improving build efficiency <a href="https://github.com/spring-projects/spring-ai/commit/77d00580795816f876da78e3481c95cea5d768c1">77d0058</a>
* Optimized deployment process by skipping tests during the deploy phase to improve build performance <a href="https://github.com/spring-projects/spring-ai/commit/da0f92af2b34894ce6bb5d2ca7fc54eeff3a37f9">da0f92a</a>
* Enhanced build visibility with progress indicators for different build phases <a href="https://github.com/spring-projects/spring-ai/commit/d4d95b91139f7986caa59cda1d9fcb7d5ef44c18">d4d95b9</a>
* Exclude Python cache files from CI script copying to prevent build contamination <a href="https://github.com/spring-projects/spring-ai/commit/6998de97d8da6d42f69d706fcf3bbaf734031558">6998de9</a>
* Enable verbose output to better trace and debug root module issues during builds <a href="https://github.com/spring-projects/spring-ai/commit/feb5bf3c7c456292d611015b351639ce0aeb884b">feb5bf3</a>
* Ignore all .github changes in main push fast workflow to reduce unnecessary build triggers <a href="https://github.com/spring-projects/spring-ai/commit/6c8ecd9f472190ff991d2b3dbed3e3ed3660f618">6c8ecd9</a>
* Optimized CI/CD pipeline to provide faster feedback on pull request merges and improved build performance <a href="https://github.com/spring-projects/spring-ai/commit/de5cd3584567fc66aa2b81190e446d2d49f015b9">de5cd35</a>
* Always exclude root pom.xml from fast workflow module detection to improve build accuracy <a href="https://github.com/spring-projects/spring-ai/commit/b767954dcf6b156731a33d49796940e3fe772c3e">b767954</a>
* Added workflow_dispatch capability to test specific commits in the fast workflow for better debugging <a href="https://github.com/spring-projects/spring-ai/commit/5204e04c2d23fd2b7b3c5f5c4bc7f7a0dbc24277">5204e04</a>
* Resolved issues with artifactory build and release automation pipeline <a href="https://github.com/spring-projects/spring-ai/commit/90f636e4f0b580e700557ec542923a3bbfeac776">90f636e</a>
* Enhanced test coverage for chat client observation functionality <a href="https://github.com/spring-projects/spring-ai/pull/4124" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4124/hovercard">#4124</a>
* Implemented intelligent path-based build triggering to optimize CI/CD pipeline efficiency <a href="https://github.com/spring-projects/spring-ai/commit/4df281c79d9d91bffaa8bf87353192fa10045a88">4df281c</a>
* Added clearer naming conventions for documentation deployment workflows <a href="https://github.com/spring-projects/spring-ai/commit/ecc33171dea01511052d2ef9ed13f9a683c93e3e">ecc3317</a>
* Fixed git state problems that were triggering unnecessary full project builds <a href="https://github.com/spring-projects/spring-ai/commit/4ea7c5c4352d7a9399e114ace4aa82fd8e8e3274">4ea7c5c</a>
* Synchronized build workflows with the streamlined 1.0.x branch configuration <a href="https://github.com/spring-projects/spring-ai/commit/26e09837b0c4ed7c8b6bf0c366887e941467ed87">26e0983</a>
* Updated .gitignore to exclude <strong>pycache</strong> directories from version control <a href="https://github.com/spring-projects/spring-ai/commit/b6cda1c82ab61e309d2d30f5756051dbd27066d4">b6cda1c</a>
* Corrected CI workflow to use ../mvnw for assembly generation in spring-ai-docs <a href="https://github.com/spring-projects/spring-ai/pull/4072" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4072/hovercard">#4072</a>
* Improved test coverage in Anthropic provider with comprehensive validation and edge cases <a href="https://github.com/spring-projects/spring-ai/commit/dffec8dbe486948488ca6e8f58959518f3d4e889">dffec8d</a>
* Improved test coverage across various classes <a href="https://github.com/spring-projects/spring-ai/commit/8748a8d4ca2e0edc76eb86f879966b8d3c1b4c2e">8748a8d</a>
* Enabled manual workflow dispatch for CI/CD build processes <a href="https://github.com/spring-projects/spring-ai/commit/f17dfa108e4b43476ac5aa95c55f55b8087389b7">f17dfa1</a>
* Improved CI/CD by using Maven wrapper and batch-mode in GitHub Actions <a href="https://github.com/spring-projects/spring-ai/pull/3841" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3841/hovercard">#3841</a>
* Added comprehensive edge case tests for tool result conversion and Redis filter expressions <a href="https://github.com/spring-projects/spring-ai/pull/4043" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4043/hovercard">#4043</a>
* Updated test class naming to follow Spring framework conventions <a href="https://github.com/spring-projects/spring-ai/commit/9bbde2aca8f1af1e43418479a606f01c4b235f8e">9bbde2a</a>
* Enhanced test coverage with comprehensive tests for AzureOpenAiChatOptions and PostgresMlEmbeddingOptions <a href="https://github.com/spring-projects/spring-ai/pull/4042" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4042/hovercard">#4042</a>
* Added extensive test coverage for OCICohereChatOptions, AzureEmbeddingsOptions, and WeaviateVectorStoreOptions classes <a href="https://github.com/spring-projects/spring-ai/pull/4041" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4041/hovercard">#4041</a>
* Improved test coverage for output conversion and streaming utilities <a href="https://github.com/spring-projects/spring-ai/pull/4039" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4039/hovercard">#4039</a>
* Enhanced test coverage for OllamaChatModel and OllamaEmbeddingModel implementations <a href="https://github.com/spring-projects/spring-ai/pull/4038" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4038/hovercard">#4038</a>
* Added extensive unit tests for Query class validation and equality behavior, Spring AI builders, runtime hints registration, and PgVector embedding dimensions <a href="https://github.com/spring-projects/spring-ai/pull/4036" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4036/hovercard">#4036</a>
* Added extensive test coverage for Spring AI core runtime hints registration to ensure proper native compilation support <a href="https://github.com/spring-projects/spring-ai/pull/4024" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4024/hovercard">#4024</a>
* Added comprehensive tests for ChatClientRequest mutation and context handling functionality <a href="https://github.com/spring-projects/spring-ai/pull/4022" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4022/hovercard">#4022</a>
* Added edge case tests for VertexAI Gemini runtime hints registration to improve native image compatibility <a href="https://github.com/spring-projects/spring-ai/pull/4013" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4013/hovercard">#4013</a>
* Added comprehensive test coverage for Ollama runtime hints registration to ensure proper GraalVM native image support <a href="https://github.com/spring-projects/spring-ai/pull/4014" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4014/hovercard">#4014</a>
* Enhanced test coverage for VectorStore runtime hints registration to validate native compilation compatibility <a href="https://github.com/spring-projects/spring-ai/pull/4015" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4015/hovercard">#4015</a>
* Added comprehensive test coverage for PDF Reader runtime hints to ensure proper native image support <a href="https://github.com/spring-projects/spring-ai/pull/4016" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4016/hovercard">#4016</a>
* Added comprehensive test coverage for multiple vector database filter expression converters including PgVector, MongoDB Atlas, Milvus, Pinecone, MariaDB, Neo4j, and OpenSearch AI Search <a href="https://github.com/spring-projects/spring-ai/pull/3916" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3916/hovercard">#3916</a>, <a href="https://github.com/spring-projects/spring-ai/pull/3919" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3919/hovercard">#3919</a>, <a href="https://github.com/spring-projects/spring-ai/pull/3922" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3922/hovercard">#3922</a>, <a href="https://github.com/spring-projects/spring-ai/pull/3932" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3932/hovercard">#3932</a>, <a href="https://github.com/spring-projects/spring-ai/pull/3943" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3943/hovercard">#3943</a>, <a href="https://github.com/spring-projects/spring-ai/pull/3957" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3957/hovercard">#3957</a>, <a href="https://github.com/spring-projects/spring-ai/pull/3950" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3950/hovercard">#3950</a>
* Enhanced test coverage for OpenAI Chat Options component <a href="https://github.com/spring-projects/spring-ai/pull/3959" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3959/hovercard">#3959</a>
* Removed unused import statements to improve code quality <a href="https://github.com/spring-projects/spring-ai/pull/3921" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3921/hovercard">#3921</a>
* Comprehensive test coverage improvements for MistralAi, Anthropic chat options, VectorStoreChatMemoryAdvisor, and QdrantVectorStore builders <a href="https://github.com/spring-projects/spring-ai/pull/3968" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3968/hovercard">#3968</a> <a href="https://github.com/spring-projects/spring-ai/pull/3973" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3973/hovercard">#3973</a> <a href="https://github.com/spring-projects/spring-ai/pull/3985" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3985/hovercard">#3985</a> <a href="https://github.com/spring-projects/spring-ai/pull/3986" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3986/hovercard">#3986</a>
* Added comprehensive test coverage for MistralAi, Anthropic, AzureOpenAi, OpenAi, and MCP client runtime hints configurations <a href="https://github.com/spring-projects/spring-ai/pull/3987" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3987/hovercard">#3987</a>
* Updated MCP server auto-configuration settings for improved functionality <a href="https://github.com/spring-projects/spring-ai/commit/1256eafbc20d7777364676e8ca62fdfe7f8a88fe">1256eaf</a>
* Refactored builder pattern in VertexAiGeminiSafetySetting for improved code structure and maintainability <a href="https://github.com/spring-projects/spring-ai/commit/49e5c632fb555473199ce0aa13557c069afc5293">49e5c63</a>
* Updated .gitignore file to improve version control handling and exclude unnecessary files <a href="https://github.com/spring-projects/spring-ai/commit/44816fb46a618eaee0fc991ce7b0bb99bcdda9af">44816fb</a>
* Refactored MethodToolCallbackProviderTests and updated OpenAI audio tests due to safety settings changes <a href="https://github.com/spring-projects/spring-ai/commit/a216bf1f6f0b1f724c3d9015da971bb461356d0e">a216bf1</a>
* Clean up unnecessary files from the codebase <a href="https://github.com/spring-projects/spring-ai/commit/8a5635d3f59a7b122a3fa8049534b979ae8e15d0">8a5635d</a>
* Applied diamond operator usage, null checks, string joining optimizations, and added JavaDocs across the codebase <a href="https://github.com/spring-projects/spring-ai/pull/3458" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3458/hovercard">#3458</a> and <a href="https://github.com/spring-projects/spring-ai/pull/3663" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3663/hovercard">#3663</a> and <a href="https://github.com/spring-projects/spring-ai/pull/3013" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3013/hovercard">#3013</a>
* Converted Qdrant vector store integration tests to use OpenAI embedding model <a href="https://github.com/spring-projects/spring-ai/pull/3671" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3671/hovercard">#3671</a>
* Improved reactive Context propagation to AsyncMcpToolCallback for better async handling <a href="https://github.com/spring-projects/spring-ai/commit/9a521827277f509803b19628696ef550b8b277df">9a52182</a>
* Updated AzureOpenAiAudioTranscriptionModelIT to use OkHttpClient for improved testing <a href="https://github.com/spring-projects/spring-ai/pull/3665" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3665/hovercard">#3665</a>
* Removed redundant SOURCE_METADATA assignments and simplified conditional checks in TextReader <a href="https://github.com/spring-projects/spring-ai/pull/3627" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3627/hovercard">#3627</a>
* Cleaned up useless properties tags in configuration files <a href="https://github.com/spring-projects/spring-ai/pull/3634" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3634/hovercard">#3634</a>
* Updated backport-issue.yml to use main branch for reusable workflows <a href="https://github.com/spring-projects/spring-ai/commit/5aa89408d4409454dfabe0429a8169d1bd218e7c">5aa8940</a>
* Added comprehensive test coverage for FileDocumentWriter default constructor and various configuration options <a href="https://github.com/spring-projects/spring-ai/commit/089c3eb6afb08f00039c380d49fee0ae63310db0">089c3eb</a>
* Improved logging consistency by replacing System.err.println calls with proper log output <a href="https://github.com/spring-projects/spring-ai/pull/3600" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3600/hovercard">#3600</a>
* Removed unused import statements to improve code cleanliness <a href="https://github.com/spring-projects/spring-ai/pull/3599" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3599/hovercard">#3599</a>
* Cleaned up unused messageHistory implementation <a href="https://github.com/spring-projects/spring-ai/pull/3574" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3574/hovercard">#3574</a>
* Standardized the order of getter and setter methods in WeaviateVectorStoreProperties <a href="https://github.com/spring-projects/spring-ai/pull/3582" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3582/hovercard">#3582</a>
* Cleaned up test dependency management by removing explicit version declaration for jackson-dataformat-xml <a href="https://github.com/spring-projects/spring-ai/commit/d8c728e574afdad0366a93b7d3d00586b2d8d31a">d8c728e</a>
* Added comprehensive unit testing for multiple method tool callbacks functionality with tool context support <a href="https://github.com/spring-projects/spring-ai/commit/b9a683460d17a381be2e67cd9ac2b4589d728c19">b9a6834</a>
* Corrected <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Formatter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Formatter">@Formatter</a>:onn to <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/Formatter/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Formatter">@Formatter</a>:on to ensure proper code formatting in test files <a href="https://github.com/spring-projects/spring-ai/pull/3477" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3477/hovercard">#3477</a>
* Added comprehensive test coverage for embeddingFieldName configuration in ElasticsearchVectorStore <a href="https://github.com/spring-projects/spring-ai/commit/6451fef547b110f171cfe4ba9c392316d2d252eb">6451fef</a>
* Made auto-configuration dependencies optional in the docker compose module for better modularity <a href="https://github.com/spring-projects/spring-ai/pull/3502" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3502/hovercard">#3502</a>
* Made auto-configuration dependencies optional in the testcontainers module for improved flexibility <a href="https://github.com/spring-projects/spring-ai/pull/3465" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3465/hovercard">#3465</a>
* Replaced spring-webflux with spring-web dependency in the spring-ai-retry module <a href="https://github.com/spring-projects/spring-ai/commit/cecc046c26ebc265a1355b43cc6b4bfbcd290ee4">cecc046</a>
* Fixed GitHub Actions CI/CD pipeline to properly trigger for the 1.0.x branch <a href="https://github.com/spring-projects/spring-ai/commit/5f23dcade38d8f4e9f394eb53f4b25a92f06d2bf">5f23dca</a>
* Enhanced CI build configuration to support non-main branches <a href="https://github.com/spring-projects/spring-ai/commit/a385ed4bd4a44e726898238be16811f0408db9a6">a385ed4</a>
* Moved speech1.mp3 test file to proper src/test/resources location <a href="https://github.com/spring-projects/spring-ai/commit/ab88fea83e662c09904f42f2bf3096069c8f8852">ab88fea</a>
* Updated gitignore to exclude Qodana static analysis configuration file <a href="https://github.com/spring-projects/spring-ai/commit/5b49036d46662751c46a77e7250aee576a3432a8">5b49036</a>
* Enhanced test coverage for OpenAI streaming function calling helper functionality <a href="https://github.com/spring-projects/spring-ai/pull/3312" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3312/hovercard">#3312</a>
* Added automated workflows for cherry-picking commits and handling backport issues <a href="https://github.com/spring-projects/spring-ai/commit/bfaa6be4eb78fefd7ca1d887233fb991115ce1a6">bfaa6be</a>
* Improved OpenAI API key resolution to handle dynamic key retrieval per request <a href="https://github.com/spring-projects/spring-ai/commit/3a527eeb987c18a9c57f27d5ef89fa81adca14b6">3a527ee</a>
* Applied checkstyle fixes to improve code formatting and consistency <a href="https://github.com/spring-projects/spring-ai/commit/b6f29a493f2363dd78a47147d12908590905d729">b6f29a4</a>
* Updated project version for next development iteration <a href="https://github.com/spring-projects/spring-ai/commit/d93ab77d7055642714a4b0b82e086e0b05f45c8c">d93ab77</a>

🔐 Security

* Updated Protobuf Java from 3.25.2 to 3.25.8 to address security vulnerability <a title="CVE-2024-7254" data-hovercard-type="advisory" data-hovercard-url="/advisories/GHSA-735f-pc8j-v9w8/hovercard" href="https://github.com/advisories/GHSA-735f-pc8j-v9w8">CVE-2024-7254</a> <a href="https://github.com/spring-projects/spring-ai/pull/3996" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3996/hovercard">#3996</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/ohMaruf">Ahmed Maruf (@ohMaruf)</a>
* <a href="https://github.com/ahoowang">Ahoo Wang (@ahoowang)</a>
* <a href="https://github.com/alexanderklmn">Alex Klimenko (@alexanderklmn)</a>
* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/andrea.vacondio">Andrea Vacondio (@andrea.vacondio)</a>
* <a href="https://github.com/alan.wang">asw12 (@alan.wang)</a>
* <a href="https://github.com/aliqingdong">azurelee (@aliqingdong)</a>
* <a href="https://github.com/chainhou">chainHo (@chainhou)</a>
* <a href="https://github.com/csbiy">chani (@csbiy)</a>
* <a href="https://github.com/huihaoweishui">chen.xue (@huihaoweishui)</a>
* <a href="https://github.com/Cho-Hyun-Seung">Cho-Hyun-Seung (@Cho-Hyun-Seung)</a>
* <a href="https://github.com/christian.tzolov">Christian Tzolov (@christian.tzolov)</a>
* <a href="https://github.com/Claudio-code">Claudio Silva Junior (@Claudio-code)</a>
* <a href="https://github.com/dsarlo-viso">Dan Sarlo (@dsarlo-viso)</a>
* <a href="https://github.com/git">Daniel Garnier-Moiroux (@git)</a>
* <a href="https://github.com/dafriz">David Frizelle (@dafriz)</a>
* <a href="https://github.com/ddobrin">ddobrin (@ddobrin)</a>
* <a href="https://github.com/dmitry.sulman">Dmitry Sulman (@dmitry.sulman)</a>
* <a href="https://github.com/eddu.melendez">Eddú Meléndez (@eddu.melendez)</a>
* <a href="https://github.com/eddu.melendez">Eddú Meléndez Gonzales (@eddu.melendez)</a>
* <a href="https://github.com/colourfulemmanuel">Emmanuel Essien-nta (@colourfulemmanuel)</a>
* <a href="https://github.com/filip.hrisafov">Filip Hrisafov (@filip.hrisafov)</a>
* <a href="https://github.com/finyuq">finyuq (@finyuq)</a>
* <a href="https://github.com/FlorainB">Florian Beek (@FlorainB)</a>
* <a href="https://github.com/garethjevans">Gareth Evans (@garethjevans)</a>
* <a href="https://github.com/meistermeier">Gerrit Meier (@meistermeier)</a>
* <a href="https://github.com/gaganis">Giorgos Gaganis (@gaganis)</a>
* <a href="https://github.com/9uanhuo">Guan Huo (@9uanhuo)</a>
* <a href="https://github.com/ggndnn">Guo (@ggndnn)</a>
* <a href="https://github.com/TheEterna">han (@TheEterna)</a>
* <a href="https://github.com/ahc70032">heechann (@ahc70032)</a>
* <a href="https://github.com/hpoettker">Henning Pöttker (@hpoettker)</a>
* <a href="https://github.com/hudson.schumaker">Hudson Luiz Sales Schumaker (@hudson.schumaker)</a>
* <a href="https://github.com/huidong.yin247203">huidong.yin (@huidong.yin247203)</a>
* <a href="https://github.com/haerizian10">Hyeri1ee (@haerizian10)</a>
* <a href="https://github.com/aeomhs">Hyunsik Aeom (@aeomhs)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/zwk">ingbyr (@zwk)</a>
* <a href="https://github.com/janericharnack">Jan-Eric Harnack (@janericharnack)</a>
* <a href="https://github.com/jasonparallel">jasonparallel (@jasonparallel)</a>
* <a href="https://github.com/rlaakswo0687">jay (@rlaakswo0687)</a>
* <a href="https://github.com/hjm1980">Jemin Huh (@hjm1980)</a>
* <a href="https://github.com/jinlee1703">Jinwoo Lee (@jinlee1703)</a>
* <a href="https://github.com/dev">jonghoonpark (@dev)</a>
* <a href="https://github.com/lambochen">lambochen (@lambochen)</a>
* <a href="https://github.com/l-trotta">Laura Trotta (@l-trotta)</a>
* <a href="https://github.com/lawrencepbr">Lawrence Peng (@lawrencepbr)</a>
* <a href="https://github.com/lpy569">Lilt (@lpy569)</a>
* <a href="https://github.com/eeaters">Link (@eeaters)</a>
* <a href="https://github.com/little-huang">little_huang (@little-huang)</a>
* <a href="https://github.com/garen.mao">loong-coder (@garen.mao)</a>
* <a href="https://github.com/846179345">Lpepsi (@846179345)</a>
* <a href="https://github.com/markpollack">Mark Pollack (@markpollack)</a>
* <a href="https://github.com/xiaomingys">MartinDai (@xiaomingys)</a>
* <a href="https://github.com/2663479778">Mengqi Xu (@2663479778)</a>
* <a href="https://github.com/my.wu">Mingyuan Wu (@my.wu)</a>
* <a href="https://github.com/mudabirburfat97">Mudabir Hussain (@mudabirburfat97)</a>
* <a href="https://github.com/knahyuk">Nahyun Kim (@knahyuk)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/kim-nini">niniDev (@kim-nini)</a>
* <a href="https://github.com/KoreaNirsa">Nirsa (@KoreaNirsa)</a>
* <a href="https://github.com/enimiste">NOUNI El bachir (@enimiste)</a>
* <a href="https://github.com/alexanderklmn">Oleksandr Klymenko (@alexanderklmn)</a>
* <a href="https://github.com/punnapavankumar9">pavan kumar punna (@punnapavankumar9)</a>
* <a href="https://github.com/mail">Philip I. Thomas (@mail)</a>
* <a href="https://github.com/xeraa">Philipp Krenn (@xeraa)</a>
* <a href="https://github.com/piotr.kubowicz">Piotr Kubowicz (@piotr.kubowicz)</a>
* <a href="https://github.com/RobinElysia">qwp_p (@RobinElysia)</a>
* <a href="https://github.com/rafaelrddc">Rafael Cunha (@rafaelrddc)</a>
* <a href="https://github.com/robinmayerhofer">robinmayerhofer (@robinmayerhofer)</a>
* <a href="https://github.com/rodrigomalara">Rodrigo Malara (@rodrigomalara)</a>
* <a href="https://github.com/seblsebastian">Sebastian Espei (@seblsebastian)</a>
* <a href="https://github.com/seok9211">Seokjae Lee (@seok9211)</a>
* <a href="https://github.com/0411tjdals34">seongm1n (@0411tjdals34)</a>
* <a href="https://github.com/SexyProgrammer">SexyProgrammer (@SexyProgrammer)</a>
* <a href="https://github.com/shahbaz07dbit">Shahbaz Aamir (@shahbaz07dbit)</a>
* <a href="https://github.com/shishuiwuhen2009">shishuiwuhen2009 (@shishuiwuhen2009)</a>
* <a href="https://github.com/yuluo08290126">shown (@yuluo08290126)</a>
* <a href="https://github.com/ai-afk">SiBo Ai (@ai-afk)</a>
* <a href="https://github.com/paoxiaomooo">Sizhe Fan (@paoxiaomooo)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/solnone">Solomon Hsu (@solnone)</a>
* <a href="https://github.com/jamespud">spud (@jamespud)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/ThomasVitale">Thomas Vitale (@ThomasVitale)</a>
* <a href="https://github.com/tilman">Tilman Holube (@tilman)</a>
* <a href="https://github.com/1414714930">tongda (@1414714930)</a>
* <a href="https://github.com/quachhengtony">Tony Quach (@quachhengtony)</a>
* <a href="https://github.com/ngocnhan.tran1996">Tran Ngoc Nhan (@ngocnhan.tran1996)</a>
* <a href="https://github.com/matpat17">wilocu (@matpat17)</a>
* <a href="https://github.com/kepull2918">WOONBE (@kepull2918)</a>
* <a href="https://github.com/yangbuyiya">Yang Buyi (@yangbuyiya)</a>
* <a href="https://github.com/2571425925">Yang Li (@2571425925)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/yangjm-41">yiangjm (@yangjm-41)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>
* <a href="https://github.com/XuGongming">徐功明 (@XuGongming)</a>
* <a href="https://github.com/494509580">老虎是条大狼狗 (@494509580)</a>
* <a href="https://github.com/jbj338033">전민오 (@jbj338033)</a>

