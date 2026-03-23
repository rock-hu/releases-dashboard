# Spring AI 1.1.3 Release

## release on 20260317
## description
## changes
Spring AI 1.1.3 Release Notes

🎯 Highlights

This release includes 19 new features, 31 bug fixes, 23 documentation improvements, 25 other improvements.

📢 Noteworthy

* All deprecated Anthropic model names have been replaced with active model identifiers throughout the codebase and integration tests to maintain compatibility with Anthropic's API. <a href="https://github.com/spring-projects/spring-ai/commit/54f35dcaeceac0d6f88b11866a019f7016c6a0c2">54f35dc</a>

⭐ New Features

* Neo4j vector store now allows customization of the filter expression converter via the builder pattern, providing more flexibility for custom query filtering logic. <a href="https://github.com/spring-projects/spring-ai/commit/82bc777deafdc166148cde5587a7b2ed3f63aa7d">82bc777</a>
* Introduces builder pattern for more flexible and readable construction of OpenAiSdkChatModel instances <a href="https://github.com/spring-projects/spring-ai/commit/982bc1ea1b205383990bbf205425f047e8616d70">982bc1e</a>
* Adds support for custom embedding dimensions via '/embedding/embedding-model-dimensions.properties' configuration file for OpenAiEmbeddingModel <a href="https://github.com/spring-projects/spring-ai/commit/a5359c744a9acc5f78ca574eeecec04433ce1c14">a5359c7</a>
* ToolCallAdvisor now supports streaming responses, enabling real-time function calling interactions <a href="https://github.com/spring-projects/spring-ai/commit/21dac8ddd8a13fbee1d1469da6ce9fbccc6df6da">21dac8d</a>
* SimpleVectorStore now supports filtering when deleting entries, providing more granular control over vector data management <a href="https://github.com/spring-projects/spring-ai/commit/7752ef8c1d2d8949d0f401296186ce511f40b77c">7752ef8</a>
* Added support for Anthropic Claude Skills API with unified API design and helper classes for skill integration <a href="https://github.com/spring-projects/spring-ai/pull/5299" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5299/hovercard">#5299</a>
* Added dimensions parameter support for Ollama embedding models, allowing control over embedding vector size <a href="https://github.com/spring-projects/spring-ai/pull/2713" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/2713/hovercard">#2713</a>
* Enabled customization of JSON schema generation for structured outputs and function calling <a href="https://github.com/spring-projects/spring-ai/commit/4a8bdd73393b7f67022f147d8fa7635abd0dde9d">4a8bdd7</a>
* Mistral AI chat model now supports structured outputs using JSON schema validation, enabling type-safe responses with automatic conversion <a href="https://github.com/spring-projects/spring-ai/commit/76587feba4217cb7ace299704355dc9020b12e1f">76587fe</a>
* New convenience method for easily retrieving system messages from Prompt objects <a href="https://github.com/spring-projects/spring-ai/commit/a78d2e8b5ca445c0bbfd993fe84c6be8ee705980">a78d2e8</a>
* Added Mcp*ServerCustomizer interfaces and fixed MCP auto-configuration to work properly in non-web environments <a href="https://github.com/spring-projects/spring-ai/pull/5261" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5261/hovercard">#5261</a>
* OllamaChatOptions now implements StructuredOutputChatOptions, enabling structured JSON output handling with comprehensive unit and integration tests <a href="https://github.com/spring-projects/spring-ai/commit/a6ce0f604bda489d779a5bcd2889a5629f16db4d">a6ce0f6</a>
* Added support for simple JSON format option in Ollama chat interactions <a href="https://github.com/spring-projects/spring-ai/commit/7b23ee2c94746c11af85da11ff0274df4a6449dd">7b23ee2</a>
* Enhanced model provider detection logic for Microsoft Foundry integration <a href="https://github.com/spring-projects/spring-ai/commit/d4db917644c7927ae03dddce962e40b8988b3146">d4db917</a>
* Chat memory advisors now support ToolResponseMessage, enabling better handling of tool responses in conversation history <a href="https://github.com/spring-projects/spring-ai/commit/f74b04a4f41ca2ab98625fc2eb62f5076a49eaff">f74b04a</a>
* Added support for dynamically augmenting tool schemas at runtime, enabling more flexible tool configuration and customization <a href="https://github.com/spring-projects/spring-ai/commit/6d310cc366a808befd27c964e14305a11cfabb13">6d310cc</a>
* Added conversationHistoryEnabled option to ToolCallAdvisor, allowing users to control whether conversation history is included when making tool calls <a href="https://github.com/spring-projects/spring-ai/commit/4197b811a2a00d4a20a4b053297d4a70f3d48eb8">4197b81</a>
* Added support for configurable field names in Azure Vector Store, allowing users to work with existing Azure AI Search indexes that use custom field names instead of hardcoded defaults (content, embedding, metadata) <a href="https://github.com/spring-projects/spring-ai/commit/706f23e793a6bb1252a2a164824c739ba5d1a76e">706f23e</a>
* Added support for custom punctuation marks in TokenTextSplitter, enabling more flexible text splitting for various languages and use cases <a href="https://github.com/spring-projects/spring-ai/commit/c0e279afd0f617c747c30ebcb782d9e7eac29497">c0e279a</a>

🪲 Bug Fixes

* Fixed and improved the FilterExpressionConverter for vector store operations, enhancing query filtering capabilities <a href="https://github.com/spring-projects/spring-ai/commit/5b6723811ba932b2af851355384e07caecdd904f">5b67238</a>
* Replaced disabled Azure OpenAI image model with the latest available version <a href="https://github.com/spring-projects/spring-ai/commit/9578d341b9cfe379973787b01a92c08dc96f5738">9578d34</a>
* Corrected the prefixAssistantMessage implementation in DeepSeekAssistantMessage <a href="https://github.com/spring-projects/spring-ai/commit/321314b39e45d4164062d7607025813c8620eb2f">321314b</a>
* Resolved an issue where token counts were not properly tracked for the first document when starting a new batch, ensuring accurate token usage reporting. <a href="https://github.com/spring-projects/spring-ai/commit/cbc14323c6cc9a4f39d1ba5f3c98b41426509023">cbc1432</a>
* Document names are now properly sanitized to meet AWS Bedrock Converse API naming requirements, preventing API rejection errors. <a href="https://github.com/spring-projects/spring-ai/commit/924478bf42ab851fb03642a972b733150acc4b9b">924478b</a>
* Ensures CosmosDB chat memory auto-configuration is applied first, resolving bean dependency and initialization order issues. <a href="https://github.com/spring-projects/spring-ai/commit/55a819b9c459a6254c381a83ae91d5416785ebdc">55a819b</a>
* Resolved issues with Anthropic integration tests by updating to current model names. <a href="https://github.com/spring-projects/spring-ai/commit/cc47474b1fd3160217575ac51ca4073c077f70af">cc47474</a>
* Adds ambiguity check and improves Google GenAI authentication logic to prevent configuration conflicts <a href="https://github.com/spring-projects/spring-ai/commit/29ca4a656bc6fec5033a22b374b43abf0b81c867">29ca4a6</a>
* Resolves issue where MetadataMode configuration was not being applied correctly when processing embeddings in batch mode <a href="https://github.com/spring-projects/spring-ai/commit/6fa8730c1debdf49543e4323948e388b29aa896e">6fa8730</a>
* Corrects filter expression grouping logic in OpenSearch vector store integration to ensure accurate query results <a href="https://github.com/spring-projects/spring-ai/commit/03be3bb1773c048a80564f7f07b86aa2ea1c9fdb">03be3bb</a>
* Resolves issue where Bedrock cache metrics were not being properly included in the Usage object for monitoring and observability <a href="https://github.com/spring-projects/spring-ai/commit/fc7d55ddd50a4fa792da2eda93b326a37e0db3ad">fc7d55d</a>
* Corrected the filter expression syntax for IN and NOT IN operators in Elasticsearch integration <a href="https://github.com/spring-projects/spring-ai/commit/d287c393670ff249c95b3b333b68b647ce7ddcbc">d287c39</a>
* Fixed message ordering issue in MongoChatMemoryRepository to ensure correct conversation history retrieval <a href="https://github.com/spring-projects/spring-ai/commit/52a5c762e040be707075e52d87ec8df220f90287">52a5c76</a>
* Fixed ToolCallAdvisor to correctly preserve system messages when memory is disabled <a href="https://github.com/spring-projects/spring-ai/commit/de32dd257fe7373ce2e8a5f11497f916154709a2">de32dd2</a>
* Corrected the observation provider usage for Google Generative AI embedding model to ensure proper metrics and tracing <a href="https://github.com/spring-projects/spring-ai/pull/5227" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5227/hovercard">#5227</a>
* Improved error handling in ChromaApi to properly catch and process exceptions <a href="https://github.com/spring-projects/spring-ai/commit/f7ed9d171cdc4b9b002c933acc4f82dc480c4170">f7ed9d1</a>
* Modified tool descriptions to help models provide geographical coordinates correctly and polished integration test classes <a href="https://github.com/spring-projects/spring-ai/commit/cf557147f2599a35d95246805eddcf015d1f29b9">cf55714</a>
* Corrected the chatClientEntityWithStructuredOutput integration test for Mistral AI <a href="https://github.com/spring-projects/spring-ai/commit/43479acb0c1885769b53d2dd72e13f1506328440">43479ac</a>
* Resolved string parsing issue in grammar processing <a href="https://github.com/spring-projects/spring-ai/commit/fe5c3f908d3e01526783a86c7560b034f15f28f0">fe5c3f9</a>
* Fixed missing Redis chat memory repository artifacts in Spring AI BOM <a href="https://github.com/spring-projects/spring-ai/commit/b2cfd5e148fc19822ac72095e64768024023741a">b2cfd5e</a>
* Improved integration test stability by handling token count variations across different Ollama model versions <a href="https://github.com/spring-projects/spring-ai/commit/f4f8d7566366533bf73fe74b60664f35ef3cfba8">f4f8d75</a>
* Switched Anthropic integration tests to use active model for improved test reliability <a href="https://github.com/spring-projects/spring-ai/commit/98e24eb9ab76d59be37a08bc76fed2a266104743">98e24eb</a>
* Fixed issue where Neo4jVectorStore doAdd method was ignoring session configuration <a href="https://github.com/spring-projects/spring-ai/commit/99127f621061026586a6da5f5193910343d6fc21">99127f6</a>
* General improvements and updates to Neo4jVectorStore implementation <a href="https://github.com/spring-projects/spring-ai/commit/3293a20aee52a27dbb977e94276f6924f8261dfe">3293a20</a>
* Resolved issues with Antora documentation build process <a href="https://github.com/spring-projects/spring-ai/commit/820ef7e80707258abcac4b68c43d1c2ac1604920">820ef7e</a>
* Fixed ChromaApi HTTP server/client exception message verification to properly handle error conditions <a href="https://github.com/spring-projects/spring-ai/commit/330a35c57e1ccd9b3be2d1a11c477fa7791ddb5c">330a35c</a>
* Corrected typo in error message for collection existence checks <a href="https://github.com/spring-projects/spring-ai/pull/5080" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5080/hovercard">#5080</a>
* Updated TransformersEmbeddingModel to use raw URL for improved compatibility <a href="https://github.com/spring-projects/spring-ai/commit/0f95508447b47ae48349987e67ce13ace53123c9">0f95508</a>
* Resolved checkstyle execution issues in the build process <a href="https://github.com/spring-projects/spring-ai/commit/5634944842275c6a52bd094623e46a2d9efafbac">5634944</a>
* Addressed multiple build system issues to improve build stability <a href="https://github.com/spring-projects/spring-ai/commit/b75af37d8f294ba6e48b124a18f452ac9a80bbfa">b75af37</a>
* Fixed various errors reported by ErrorProne across the codebase to improve code quality and prevent potential bugs <a href="https://github.com/spring-projects/spring-ai/commit/ad11820468641e8022b92ed1a50ae06a6fdbb134">ad11820</a>

📓 Documentation

* Enhanced Javadoc to clarify supported content types for requests (string or list of media content) and responses (string only) <a href="https://github.com/spring-projects/spring-ai/commit/18a661b501e52883f03bd6b72527043ecd8a4914">18a661b</a>
* Adds documentation explaining Java code formatting requirements and setup for contributors <a href="https://github.com/spring-projects/spring-ai/commit/60a8c765e8330e330c84e615c4842226645d4115">60a8c76</a>
* Enhances documentation and test coverage for Bedrock cache metrics feature while ensuring backward compatibility <a href="https://github.com/spring-projects/spring-ai/commit/31918356f55ee3808ae6c39a60d0765080f3cf32">3191835</a>
* Corrected API reference error in user guide documentation <a href="https://github.com/spring-projects/spring-ai/commit/01ca5524568623618ca26092da2f22085e513d7a">01ca552</a>
* Corrected typo in documentation <a href="https://github.com/spring-projects/spring-ai/pull/5327" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5327/hovercard">#5327</a>
* Added documentation for message ordering behavior in MongoChatMemoryRepository <a href="https://github.com/spring-projects/spring-ai/commit/4899e8ff124cc7e6e439cd6fc7ec0be1cb6922c4">4899e8f</a>
* Added dependency information to ETL pipeline documentation for easier integration <a href="https://github.com/spring-projects/spring-ai/commit/77b80f3ce79c112ba50b7b4fcfd44f00ce51181f">77b80f3</a>
* Fixed typos in code comments in commons module <a href="https://github.com/spring-projects/spring-ai/commit/d3e3f6b1a3f5f4b01147a2d588b5f80ecf6dda35">d3e3f6b</a>
* Improved documentation for Prompt functionality <a href="https://github.com/spring-projects/spring-ai/commit/72e59a497bb03754ab542d4cfe19159d7fbc1268">72e59a4</a>
* Added documentation for using native structured output conversion with Mistral AI <a href="https://github.com/spring-projects/spring-ai/commit/cff1cc4f26344bab1acd72f083a0c7c44b90743c">cff1cc4</a>
* Corrected various typos throughout the documentation <a href="https://github.com/spring-projects/spring-ai/commit/d30fc1530660cc3772a927cdb5c7c90ec765b108">d30fc15</a>
* Corrected step numbering in RetrievalAugmentationAdvisor documentation <a href="https://github.com/spring-projects/spring-ai/pull/5160" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5160/hovercard">#5160</a>
* New documentation guide covering LLM as a Judge pattern and implementation strategies <a href="https://github.com/spring-projects/spring-ai/commit/05f44e5fd22648c89bbb9083ca3c7504d3465edb">05f44e5</a>
* New documentation guide explaining dynamic tool discovery capabilities and usage patterns <a href="https://github.com/spring-projects/spring-ai/commit/13a7e4aeebe1b57ff513a4b9788be83b3cf75b57">13a7e4a</a>
* Corrected typos in Gemini model provider documentation <a href="https://github.com/spring-projects/spring-ai/commit/8ee553b0e8a061565abe3526ad7d1c9e3575f5b1">8ee553b</a>
* Removed redundant /v1 suffix from OpenAI base-url examples in documentation for clarity <a href="https://github.com/spring-projects/spring-ai/commit/3f9f53d4bde8b94b2fc4090b3aa651257ab0c47a">3f9f53d</a>
* Added comprehensive reference documentation for Anthropic custom skills integration <a href="https://github.com/spring-projects/spring-ai/commit/23ac6ae7ad86e01ec23c9e20737968943e754d58">23ac6ae</a>
* Fixed syntax error in chat options builder example code <a href="https://github.com/spring-projects/spring-ai/pull/4915" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4915/hovercard">#4915</a>
* Corrected broken documentation link in TokenCountBatchingStrategy Javadoc <a href="https://github.com/spring-projects/spring-ai/pull/5083" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5083/hovercard">#5083</a>
* Updated broken documentation link in MilvusFilterExpressionConverter Javadoc <a href="https://github.com/spring-projects/spring-ai/pull/5028" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5028/hovercard">#5028</a>
* Added Maven Central badge to project README for better visibility <a href="https://github.com/spring-projects/spring-ai/commit/bc06e4d773daef3a8944507faf633666baa63e4d">bc06e4d</a>
* Added documentation for Azure Vector Store custom field names feature <a href="https://github.com/spring-projects/spring-ai/commit/2e7c32782ae1b8d0e1feac55ea3587b75e34532a">2e7c327</a>
* Added documentation for custom punctuation mark support in TokenTextSplitter <a href="https://github.com/spring-projects/spring-ai/commit/7abe9a097ec64eda401c94741e375d46fad1b513">7abe9a0</a>

🔨 Dependency Upgrades

* Updated dependencies for vector store components to latest versions <a href="https://github.com/spring-projects/spring-ai/commit/6f12ac9a32e32d97b5332d866ec6f1544e7c6c32">6f12ac9</a>
* Updated GemFire vector store Docker image version used in integration tests <a href="https://github.com/spring-projects/spring-ai/commit/a802b72a0144fcbaf1104d93bfcff8a6496902cd">a802b72</a>
* Upgraded Spring Boot dependency to version 3.5.11, bringing the latest bug fixes and improvements from the Spring Boot ecosystem. <a href="https://github.com/spring-projects/spring-ai/commit/fceafa70e0945f93659ce6bde62cc4801796ff2f">fceafa7</a>
* Updates the OpenAI Java SDK dependency to version 4.17.0 for latest features and fixes <a href="https://github.com/spring-projects/spring-ai/commit/f331633589051cd9b8514cb900ac37726ed5233b">f331633</a>
* Updated Azure SDK dependencies to latest versions for improved security and stability <a href="https://github.com/spring-projects/spring-ai/commit/db3a997d477c819754d3bdc9334c70c1f56c1b76">db3a997</a>
* Updated Google GenAI SDK with support for thinking levels specific to Gemini 3 Pro and Flash models <a href="https://github.com/spring-projects/spring-ai/commit/0c07a6df804efb935aa8e6a4fd0604bdc5370115">0c07a6d</a>
* Updated the list of available Mistral AI chat models to include latest model offerings <a href="https://github.com/spring-projects/spring-ai/commit/2c6be5904141232b1f5517a635ac7806ac611c7f">2c6be59</a>
* Updated OpenAI Java SDK dependency to version 4.13.0 <a href="https://github.com/spring-projects/spring-ai/commit/bd62378d1ecee139f21a9990510d7b60a7168c89">bd62378</a>
* Upgraded Google Generative AI SDK dependency to version 1.30.0 <a href="https://github.com/spring-projects/spring-ai/commit/cf34a257a5d2592805b04bd7c241fc31df34adcf">cf34a25</a>

🔩 Build Updates

* Removed AnthropicApiLegacyToolIT integration test that is no longer needed <a href="https://github.com/spring-projects/spring-ai/commit/d79336487f4690c8b8b3c126b1a32b2878425024">d793364</a>
* Updated checkstyle rules to accommodate new copyright header pattern <a href="https://github.com/spring-projects/spring-ai/commit/dbcf55dda6b79018944fa861d76aad070ea9f0cc">dbcf55d</a>
* Updated copyright headers across non-Java files to maintain licensing consistency <a href="https://github.com/spring-projects/spring-ai/commit/5a56c7e2d66ae1727181e728e9ddec5280ab86ed">5a56c7e</a>
* Standardized copyright headers across the codebase to use '2023-present' format for better maintenance. <a href="https://github.com/spring-projects/spring-ai/commit/5d778f0475d2776c1b1f27f05a05343f4bc0731d">5d778f0</a>
* Updates integration tests for Google GenAI chat auto-configuration <a href="https://github.com/spring-projects/spring-ai/commit/73fe1ded7217e608340430cc2e49c7dc86a1c1ba">73fe1de</a>
* Simplified backport automation by using the official spring-io backport bot action <a href="https://github.com/spring-projects/spring-ai/pull/5389" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5389/hovercard">#5389</a>
* Reorganized build structure by moving antlr4 grammar and swagger files out of resources directory <a href="https://github.com/spring-projects/spring-ai/commit/08a4c28e742272003f64d62f5fd976d22cdfe925">08a4c28</a>
* Requalified OllamaEmbeddingOptionsTests as integration test for proper test categorization <a href="https://github.com/spring-projects/spring-ai/commit/47dd6a8afb22c2a3cff1f5fa0550970a0b6a66f8">47dd6a8</a>
* Moved test to IT test classification for proper test categorization <a href="https://github.com/spring-projects/spring-ai/pull/5208" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5208/hovercard">#5208</a>
* Corrected Checkstyle plugin configuration for code quality checks <a href="https://github.com/spring-projects/spring-ai/commit/2338b256de99be01cb385db442f26a3ba9313520">2338b25</a>
* Consolidated multiple CI workflows into a single unified workflow for improved maintainability <a href="https://github.com/spring-projects/spring-ai/commit/d31dc3e3c2167d195947890175e14c0421e2ae28">d31dc3e</a>
* Integrated Maven Build Cache plugin to improve build performance <a href="https://github.com/spring-projects/spring-ai/commit/36d9d7f2592169771f7dc2f55e22fdf4c220739d">36d9d7f</a>
* Optimized Maven Build Cache configuration for better caching efficiency <a href="https://github.com/spring-projects/spring-ai/commit/0edeaef1ec27ad9f203453f9adb4e7df820ac58e">0edeaef</a>
* Cleaned up ambiguous test from ChatClientToolsWithGenericArgumentTypesIT <a href="https://github.com/spring-projects/spring-ai/commit/5cbc3c6985ca57834d94363cc6b9204e0895e08d">5cbc3c6</a>
* Updated BedrockRuntimeHints and OpenAIRuntimeHints for improved GraalVM native image compatibility <a href="https://github.com/spring-projects/spring-ai/commit/9c0c0531afbb7388982cff12a61ad0f8e83e953a">9c0c053</a>, <a href="https://github.com/spring-projects/spring-ai/commit/612da9545f8638a3f26c273c2f27fc171ede18e8">612da95</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/poutsma">Arjen Poutsma (@poutsma)</a>
* <a href="https://github.com/artembilan">Artem Bilan (@artembilan)</a>
* <a href="https://github.com/a-sekka">asekka (@a-sekka)</a>
* <a href="https://github.com/buvidk1234">buvidk (@buvidk1234)</a>
* <a href="https://github.com/chabinhwang">chabinhwang (@chabinhwang)</a>
* <a href="https://github.com/chanani">CHANHAN (@chanani)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/Kehrlann">Daniel Garnier-Moiroux (@Kehrlann)</a>
* <a href="https://github.com/weiyuc">David Yu (@weiyuc)</a>
* <a href="https://github.com/ddobrin">ddobrin (@ddobrin)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/guanxuc">guanxu (@guanxuc)</a>
* <a href="https://github.com/han-gyeong">han-gyeong (@han-gyeong)</a>
* <a href="https://github.com/HarrisonC118">Harrison (@HarrisonC118)</a>
* <a href="https://github.com/Hart-Li">HartLi (@Hart-Li)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/jdubois">Julien Dubois (@jdubois)</a>
* <a href="https://github.com/Khyojae">Khyojae (@Khyojae)</a>
* <a href="https://github.com/KyleKreuter">Kyle Kreuter (@KyleKreuter)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/lx1229">lx1229 (@lx1229)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/thisishwan2">Pilhwan Choi (@thisishwan2)</a>
* <a href="https://github.com/snosrati200">Sasan Nosrati (@snosrati200)</a>
* <a href="https://github.com/sebin1213">sebin1213 (@sebin1213)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>
* <a href="https://github.com/viacheslav-dobrynin">Viacheslav Dobrynin (@viacheslav-dobrynin)</a>
* <a href="https://github.com/weiguangli-io">weiguang li (@weiguangli-io)</a>
* <a href="https://github.com/yaner-here">yaner-here (@yaner-here)</a>
* <a href="https://github.com/Yokior">Yokior (@Yokior)</a>

