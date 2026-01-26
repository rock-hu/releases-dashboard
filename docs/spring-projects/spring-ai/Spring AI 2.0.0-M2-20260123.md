# Spring AI 2.0.0-M2

## release on 20260123
## description
## changes
Spring AI 2.0.0-M2 Release Notes

🎯 Highlights

This release includes 20 new features, 20 bug fixes, 16 documentation improvements, 38 other improvements.

⏪ Breaking Changes

* The Anthropic Skills API has been unified and helper classes have been renamed, which may require code changes if you're using the Anthropic integration directly <a href="https://github.com/spring-projects/spring-ai/pull/5299" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5299/hovercard">#5299</a>
* The SemanticCache interface has been relocated from the Redis-specific package to a more generic package location, which may require import statement updates for applications directly using this interface. <a href="https://github.com/spring-projects/spring-ai/pull/5284" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5284/hovercard">#5284</a>
* The Couchbase vector store classes have been relocated to a new dedicated package structure. Applications using Couchbase vector store will need to update their import statements. <a href="https://github.com/spring-projects/spring-ai/pull/5233" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5233/hovercard">#5233</a>

:warning: Upgrading Notes

* If you are using the Anthropic Skills API directly, review your code for the renamed helper classes and update accordingly <a href="https://github.com/spring-projects/spring-ai/pull/5299" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5299/hovercard">#5299</a>
* If you are using the Couchbase vector store, update your import statements to reference the new dedicated package location. <a href="https://github.com/spring-projects/spring-ai/pull/5233" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5233/hovercard">#5233</a>

⭐ New Features

* Ollama embedding models now support configuring the dimensions parameter, allowing control over the size of generated embeddings <a href="https://github.com/spring-projects/spring-ai/commit/4bd83ba2316368ca333cda5a6b06d8d27c92bd2f">4bd83ba</a>
* JSON schema can now be customized, providing more flexibility for structured output generation <a href="https://github.com/spring-projects/spring-ai/commit/3119086b3a7d7f63cd5ea6c13cf9caec3ef55476">3119086</a>
* Default API endpoint paths are now configured for OpenAI's content moderation API, simplifying integration setup <a href="https://github.com/spring-projects/spring-ai/pull/5300" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5300/hovercard">#5300</a>
* Default API endpoint paths are now configured for OpenAI's audio API (speech and transcription), making it easier to use audio capabilities <a href="https://github.com/spring-projects/spring-ai/commit/f7eeaf9d02c778b3dccd1682b0f1ec2ad2d49585">f7eeaf9</a>
* Added support for using Amazon S3 as a vector store backend for storing and retrieving embeddings <a href="https://github.com/spring-projects/spring-ai/commit/cd86d3837edaa1cdf215eaa207933aaf6ca2a23b">cd86d38</a>
* Integrated Infinispan as a new vector store option, providing distributed in-memory data grid capabilities for embedding storage <a href="https://github.com/spring-projects/spring-ai/commit/9b105b88e545a075d3c75ecb670c166b697b1771">9b105b8</a>
* Added support for Amazon Bedrock Knowledge Base as a vector store, enabling integration with AWS's managed knowledge base service <a href="https://github.com/spring-projects/spring-ai/commit/21c38342853d2d881c510ab2f9723302dae81ad9">21c3834</a>
* Enhanced the Redis semantic cache module with improved functionality and performance <a href="https://github.com/spring-projects/spring-ai/commit/7233e8d64ab995f814e842ec36774b526c9246ef">7233e8d</a>
* Made the content field name configurable in QdrantVectorStore, allowing customization of the field used to store document content <a href="https://github.com/spring-projects/spring-ai/commit/f65756ee20e16ca49385d4deea75d8ebbc38c283">f65756e</a>
* Added a convenience method to the Prompt class for easily retrieving system messages <a href="https://github.com/spring-projects/spring-ai/commit/8a7939041e12b3f14a32b9d69a86da4527f8ef2c">8a79390</a>
* Added native support for structured outputs using JSON schema validation in the Mistral AI chat model, enabling type-safe responses with automatic schema enforcement. <a href="https://github.com/spring-projects/spring-ai/commit/8757c5bbbdcbe3c605a298e821502ad236013cbe">8757c5b</a>
* OpenAI moderation, audio speech, and audio transcription API paths are now configurable, allowing customization for proxy setups or alternative OpenAI-compatible endpoints. <a href="https://github.com/spring-projects/spring-ai/commit/1d38aec4affa22062ad5c98336c2692f88a1398a">1d38aec</a>
* Migrated to use Spring Boot 4's native MongoDB Atlas container support for improved testing and development experience. <a href="https://github.com/spring-projects/spring-ai/commit/5b39fbb5ee42405254d13b97fb98fc179117b98c">5b39fbb</a>
* Introduced Mcp*ServerCustomizer interfaces to allow customization of MCP server configurations <a href="https://github.com/spring-projects/spring-ai/pull/5261" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5261/hovercard">#5261</a>
* Added new Redis-based semantic cache advisor implementation, enabling intelligent caching of semantically similar queries to improve performance and reduce API calls <a href="https://github.com/spring-projects/spring-ai/commit/391cbbb2d95bbb71c3188c9722a4c83b20b13aca">391cbbb</a>
* OllamaChatOptions now implements StructuredOutputChatOptions with corresponding methods, unit tests, and integration tests. Enhanced JSON format handling for Ollama chat options <a href="https://github.com/spring-projects/spring-ai/commit/163df2e4fe51dfe79e4375aff814fd222f1c569b">163df2e</a>
* Improved model provider detection logic for Microsoft Foundry integration, providing better model identification and configuration support <a href="https://github.com/spring-projects/spring-ai/commit/5c18a40c4258592ee2d4aed7fc626f20dd27b057">5c18a40</a>
* Add support for dynamic tool schema enhancement, allowing runtime modification of tool argument definitions for more flexible function calling <a href="https://github.com/spring-projects/spring-ai/commit/3c4b6dccf0b16cef5646212cecf75fe29c46d682">3c4b6dc</a>
* Add conversationHistoryEnabled option to ToolCallAdvisor, providing finer control over whether conversation history is included in tool call contexts <a href="https://github.com/spring-projects/spring-ai/commit/5ad8485ec981fff59111d4fe777068ea6ec8d4e6">5ad8485</a>
* Add JSpecify annotations to commons module for improved null-safety analysis and compile-time verification <a href="https://github.com/spring-projects/spring-ai/pull/5101" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5101/hovercard">#5101</a>

🪲 Bug Fixes

* Resolved an issue where ToolCallAdvisor would not preserve system messages when memory functionality was disabled <a href="https://github.com/spring-projects/spring-ai/commit/1dac9d09b442c45751f0e29736413d16268629df">1dac9d0</a>
* Fixed incorrect observation provider usage in the Google GenAI embedding model implementation <a href="https://github.com/spring-projects/spring-ai/pull/5227" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5227/hovercard">#5227</a>
* Corrected conditional logic in Infinispan AutoConfiguration to ensure proper bean creation <a href="https://github.com/spring-projects/spring-ai/pull/5295" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5295/hovercard">#5295</a>
* Resolved issues in the MistralAiChatModelIT.chatClientEntityWithStructuredOutput integration test to ensure proper validation of structured output functionality. <a href="https://github.com/spring-projects/spring-ai/commit/cf2212b80ff9bd83ba85e2255c86cb9804a66feb">cf2212b</a>
* Corrected code style violations in the spring-ai-redis-semantic-cache module to maintain code quality standards. <a href="https://github.com/spring-projects/spring-ai/commit/0108011ad3c45a65cc01ba244fd51c9b1d687550">0108011</a>
* Fixed MCP auto-configuration to work properly in non-web application contexts <a href="https://github.com/spring-projects/spring-ai/pull/5261" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5261/hovercard">#5261</a>
* Improved exception handling in the ChromaApi for better error reporting <a href="https://github.com/spring-projects/spring-ai/commit/e291712436a70d07a59ea3f8d97eec4e429e029a">e291712</a>
* Fixed failing Ollama integration tests by modifying tool descriptions to better guide the model in providing geographical coordinates <a href="https://github.com/spring-projects/spring-ai/commit/864487f3e4310c5e92637e68ad399c4f1ca45756">864487f</a>
* Enhanced JdbcChatMemoryRepositorySchemaInitializer for improved database schema setup <a href="https://github.com/spring-projects/spring-ai/commit/d202db17ce04da25278ac21384abcdc67c66e43a">d202db1</a>
* Corrected string parsing issues in the grammar implementation <a href="https://github.com/spring-projects/spring-ai/commit/8ecc334b127108fef30486413fd0c9fb6df892ce">8ecc334</a>
* Corrected invalid Filter.Expression constructor usage in documentation examples <a href="https://github.com/spring-projects/spring-ai/pull/5243" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5243/hovercard">#5243</a>
* Resolved checkstyle violations in Redis auto-configuration code to maintain code quality standards <a href="https://github.com/spring-projects/spring-ai/commit/07ccd2c10b0d00a75179b3485dda6ddddda60a84">07ccd2c</a>
* Resolved token count inconsistencies in Ollama integration tests that occurred with varying model versions <a href="https://github.com/spring-projects/spring-ai/commit/c2dfedb42b71a69b4489b6f27c2349ebde3ccb05">c2dfedb</a>
* Updated Anthropic integration tests to use the currently active model for improved test reliability <a href="https://github.com/spring-projects/spring-ai/commit/598217657d4b9c03fcddc778683365af2c096228">5982176</a>
* Added explicit null safety check to prevent potential NullPointerException in Neo4jChatMemory MediaBuilder <a href="https://github.com/spring-projects/spring-ai/commit/e4c2fb406d605b5dd5b76a77fa9ab851a1653ff6">e4c2fb4</a>
* Fixed missing dependency artifacts for Redis chat memory repository in the Bill of Materials, ensuring proper dependency management for projects using Redis-based chat memory. <a href="https://github.com/spring-projects/spring-ai/commit/81427bbd060b9215488186327fac8a338746b910">81427bb</a>
* Fixed an issue where the Neo4jVectorStore's doAdd method was ignoring the sessionConfig parameter, ensuring proper session configuration handling during document addition. <a href="https://github.com/spring-projects/spring-ai/pull/5200" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5200/hovercard">#5200</a> via <a href="https://github.com/spring-projects/spring-ai/issues/5191" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/5191/hovercard">#5191</a>
* Fixed an issue where chat memory advisors could not properly handle ToolResponseMessage types, improving compatibility with tool-based conversations <a href="https://github.com/spring-projects/spring-ai/pull/5174" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5174/hovercard">#5174</a>
* Resolve build issues with Antora documentation generation <a href="https://github.com/spring-projects/spring-ai/commit/95bf79a7914d16c62e1ec62e24cf604453558181">95bf79a</a>
* Corrected exception message validation in ChromaDB HTTP client/server communication <a href="https://github.com/spring-projects/spring-ai/commit/5dcac7b11f04ae5dc75ba1f77e3892aadc550caf">5dcac7b</a>

📓 Documentation

* Updated documentation for Prompt-related functionality <a href="https://github.com/spring-projects/spring-ai/commit/190fe98aefbf1e3fb4585d5c4f5053208be26db3">190fe98</a>
* Added documentation for the configurable content_field_name feature in Qdrant vector store <a href="https://github.com/spring-projects/spring-ai/commit/002a20889c5e63cb4e263483093dbf0a73847036">002a208</a>
* Added documentation for the new configuration properties that allow customization of OpenAI speech, transcription, and moderation API endpoints. <a href="https://github.com/spring-projects/spring-ai/commit/f8ad209eac5ddb2f1b3f2def1d5c744aef1ce5f4">f8ad209</a>
* Updated documentation to cover the native structured output converter functionality for Mistral AI models. <a href="https://github.com/spring-projects/spring-ai/commit/a9f49a08e73939bd7e69b9cea2f2d8f294f010ed">a9f49a0</a>
* Added comprehensive documentation for the new Redis semantic cache feature, including configuration and usage examples <a href="https://github.com/spring-projects/spring-ai/commit/77e115f110e10a464ad223b71250bf0f66fe5f2f">77e115f</a>
* Corrected duplicated step numbering in RetrievalAugmentationAdvisor documentation for improved clarity <a href="https://github.com/spring-projects/spring-ai/pull/5160" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5160/hovercard">#5160</a>
* General typo corrections throughout documentation <a href="https://github.com/spring-projects/spring-ai/commit/64de839391f5ffda473c66bbe7e76af1180ac7ab">64de839</a>
* Corrected typographical errors in the Gemini integration documentation. <a href="https://github.com/spring-projects/spring-ai/commit/5e397b5837ee199e948a5fdf04b9900a0b7e9cd2">5e397b5</a>
* Added comprehensive documentation guide for using LLM as a Judge pattern for evaluating AI model outputs <a href="https://github.com/spring-projects/spring-ai/pull/5145" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5145/hovercard">#5145</a>
* Added documentation guide explaining how to implement dynamic tool discovery for runtime function calling capabilities <a href="https://github.com/spring-projects/spring-ai/pull/5141" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5141/hovercard">#5141</a>
* Add reference documentation for Anthropic Custom Skills integration <a href="https://github.com/spring-projects/spring-ai/commit/ba49f4ec69bb1616b2dd510742240775dbd9d0ec">ba49f4e</a>
* Remove redundant /v1 suffix from OpenAI base-url examples in documentation for clearer configuration guidance <a href="https://github.com/spring-projects/spring-ai/commit/d281da41db8b98431340ce5874ba69a1620a331e">d281da4</a>
* Update incorrect comment in chat client code for accuracy <a href="https://github.com/spring-projects/spring-ai/pull/4891" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4891/hovercard">#4891</a>
* Corrected code syntax in chat options builder documentation example <a href="https://github.com/spring-projects/spring-ai/pull/4915" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4915/hovercard">#4915</a>
* Corrected typo in error message for ChromaDB collection existence validation <a href="https://github.com/spring-projects/spring-ai/pull/5080" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5080/hovercard">#5080</a>
* Updated OpenAI embedding model documentation reference in TokenCountBatchingStrategy Javadoc to point to current documentation <a href="https://github.com/spring-projects/spring-ai/pull/5083" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5083/hovercard">#5083</a>

🔨 Dependency Upgrades

* Updated the Model Context Protocol (MCP) SDK dependency to version 0.17.2 <a href="https://github.com/spring-projects/spring-ai/commit/d81e47da4bfa6bdfc2ebb0c5bed805dd9ffbc261">d81e47d</a>
* Updated Spring Boot dependency to version 4.0.1 <a href="https://github.com/spring-projects/spring-ai/commit/5f1e0214534284892a59ff06a63df5225f73c28b">5f1e021</a>
* Updated Mistral AI chat model enumeration to reflect latest available models <a href="https://github.com/spring-projects/spring-ai/commit/b77202c2e3befebfb8696432790073f7d8bea9d0">b77202c</a>
* Updated OpenAI Java SDK dependency to version 4.13.0, bringing latest improvements and compatibility updates <a href="https://github.com/spring-projects/spring-ai/pull/5187" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5187/hovercard">#5187</a>

🔩 Build Updates

* Updated static analysis tools NullAway and Error Prone to their latest versions for improved code quality checks <a href="https://github.com/spring-projects/spring-ai/commit/d232c8243a930df13ba5e9839c5658b0e11759d2">d232c82</a>
* Migrated S3 Vector Store to use JSpecify nullability annotations for improved null safety <a href="https://github.com/spring-projects/spring-ai/commit/24aeed5721539623bb552a90653e7baa1ace9f84">24aeed5</a>
* Made ResponseErrorHandler configurable as an optional bean for more flexible error handling <a href="https://github.com/spring-projects/spring-ai/commit/daa08c8a6f9342736f429feb4d82fa9905e61c7d">daa08c8</a>
* Added JSpecify nullability annotations to document-readers modules to improve null-safety and IDE support. <a href="https://github.com/spring-projects/spring-ai/pull/5287" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5287/hovercard">#5287</a>
* Added JSpecify nullability annotations to the RedisSemanticCache module for better null-safety guarantees. <a href="https://github.com/spring-projects/spring-ai/pull/5284" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5284/hovercard">#5284</a>
* Added JSpecify null-safety annotations to Redis, Weaviate, Typesense, Qdrant, Pinecone, pgvector, Oracle, OpenSearch, Neo4j, and MongoDB Atlas vector store modules to improve type safety and IDE support <a href="https://github.com/spring-projects/spring-ai/pull/5268" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5268/hovercard">#5268</a>
* Added JSpecify null-safety annotations to Milvus and additional vector store modules for improved type safety <a href="https://github.com/spring-projects/spring-ai/pull/5247" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5247/hovercard">#5247</a>, <a href="https://github.com/spring-projects/spring-ai/pull/5268" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5268/hovercard">#5268</a>
* Made RetryTemplate an optional bean for more flexible configuration <a href="https://github.com/spring-projects/spring-ai/commit/4f121c6f76fd934b246def182c960e446f49b0d7">4f121c6</a>
* Updated static analysis suppressions file to reflect current codebase state <a href="https://github.com/spring-projects/spring-ai/commit/1392dda9b7e8539dd49562ed543c987b74eae66a">1392dda</a>
* Enhanced type safety with JSpecify annotations for Cassandra, Cosmos DB, Azure, and Spring Cloud Bindings modules <a href="https://github.com/spring-projects/spring-ai/pull/5226" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5226/hovercard">#5226</a>, <a href="https://github.com/spring-projects/spring-ai/pull/5212" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5212/hovercard">#5212</a>, <a href="https://github.com/spring-projects/spring-ai/pull/5213" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5213/hovercard">#5213</a>, <a href="https://github.com/spring-projects/spring-ai/pull/5207" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5207/hovercard">#5207</a>
* Introduced checkstyle check to ensure all packages include package-info.java documentation <a href="https://github.com/spring-projects/spring-ai/commit/9c734bfc510b358aa441ad826aa64a323f2bc0bd">9c734bf</a>
* Reorganized checkstyle suppressions configuration to enable better progress monitoring <a href="https://github.com/spring-projects/spring-ai/commit/0d1ef718ac84f995f7a291bad69608d0c88d4239">0d1ef71</a>
* Enhanced type safety by adding JSpecify annotations to retry module, MCP annotations module, and MCP common module to improve null-safety guarantees. <a href="https://github.com/spring-projects/spring-ai/pull/5207" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5207/hovercard">#5207</a>
* Improved code quality by adding JSpecify annotations to CosmosDB, MongoDB, Neo4j, and Redis chat memory repository implementations for better null-safety handling. <a href="https://github.com/spring-projects/spring-ai/pull/5203" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5203/hovercard">#5203</a>
* Corrected test classification by moving integration-level test to proper IT test category, improving test organization and build process accuracy. <a href="https://github.com/spring-projects/spring-ai/pull/5208" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5208/hovercard">#5208</a>
* Added test coverage for JSpecify nullable field handling in JSON schema generation to ensure proper null-safety annotation support. <a href="https://github.com/spring-projects/spring-ai/commit/316b420854c2f51a43e2000c724efee9f3fc76e7">316b420</a>
* Resolved issues with the Spring configuration metadata processor. <a href="https://github.com/spring-projects/spring-ai/commit/27a9da045185b4d9a563fcb1bff3a7bd8816a09e">27a9da0</a>
* Added comprehensive JSpecify annotations across multiple modules including Cassandra and JDBC chat memory repositories, vector store advisors, RAG module, test module, and core vector store module to improve null-safety and type checking. <a href="https://github.com/spring-projects/spring-ai/pull/5203" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5203/hovercard">#5203</a>, <a href="https://github.com/spring-projects/spring-ai/pull/5199" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5199/hovercard">#5199</a>, <a href="https://github.com/spring-projects/spring-ai/pull/5183" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5183/hovercard">#5183</a>
* General updates and improvements to the Neo4j vector store implementation. <a href="https://github.com/spring-projects/spring-ai/commit/f3445d1837db6bc79328ce8e36e2ff485731bc66">f3445d1</a>
* Migrated chat-client and vector-store modules to use JSpecify nullability annotations for improved static analysis <a href="https://github.com/spring-projects/spring-ai/pull/5183" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5183/hovercard">#5183</a>
* Switched model module to use JSpecify annotations for better null-safety guarantees <a href="https://github.com/spring-projects/spring-ai/pull/5129" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5129/hovercard">#5129</a>
* Added JSpecify nullability annotations to newly created subpackages <a href="https://github.com/spring-projects/spring-ai/pull/5164" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5164/hovercard">#5164</a>
* Refactored embedding-related files into the model module for better code organization <a href="https://github.com/spring-projects/spring-ai/pull/5159" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5159/hovercard">#5159</a>
* Fixed Checkstyle plugin configuration to ensure proper code style enforcement <a href="https://github.com/spring-projects/spring-ai/commit/647a13f79338f62013f0ba5fb7c24a638f613221">647a13f</a>
* Improved cache update mechanism with a new implementation approach <a href="https://github.com/spring-projects/spring-ai/commit/b10443720ff6f442a1a1e2bd791734dd92816138">b104437</a>
* Update CI workflows to use explicit save/restore cache actions for improved build performance and reliability <a href="https://github.com/spring-projects/spring-ai/commit/bd56e0b59962426e44c43340f05807efb9453cf0">bd56e0b</a>
* Add workflow_dispatch to CI configuration enabling manual workflow execution for testing and troubleshooting <a href="https://github.com/spring-projects/spring-ai/pull/5102" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5102/hovercard">#5102</a>
* Make MongoDB starter optional for Testcontainers and Docker Compose modules, reducing required dependencies for non-MongoDB users <a href="https://github.com/spring-projects/spring-ai/commit/08fadd0614229483e5d047398405822cdd4f247a">08fadd0</a>
* Reworked multiple GitHub Actions workflows into a unified workflow for improved maintainability and consistency <a href="https://github.com/spring-projects/spring-ai/pull/5036" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5036/hovercard">#5036</a>
* Resolved GitHub Actions dispatch authorization issue <a href="https://github.com/spring-projects/spring-ai/commit/bf5ebceaccf56ef96fa414c2d2dbfb681e136881">bf5ebce</a>
* Corrected GitHub Actions workflow to ensure commands run in proper git repository context <a href="https://github.com/spring-projects/spring-ai/commit/c0246afb60894b4940e068460151c0246eaa919c">c0246af</a>
* Cleaned up test suite by removing ambiguous test case from ChatClient tools integration test <a href="https://github.com/spring-projects/spring-ai/commit/89090284f78af569b32f1d928a94ee5ea28cdb25">8909028</a>

🙏 Contributors

Thanks to all the community contributors who made this release possible:

* <a href="https://github.com/poutsma">Arjen Poutsma (@poutsma)</a>
* <a href="https://github.com/chabinhwang">chabinhwang (@chabinhwang)</a>
* <a href="https://github.com/Kehrlann">Daniel Garnier-Moiroux (@Kehrlann)</a>
* <a href="https://github.com/eddumelendez">Eddú Meléndez (@eddumelendez)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/guanxuc">guanxu (@guanxuc)</a>
* <a href="https://github.com/han-gyeong">han-gyeong (@han-gyeong)</a>
* <a href="https://github.com/HarrisonC118">Harrison (@HarrisonC118)</a>
* <a href="https://github.com/Hart-Li">HartLi (@Hart-Li)</a>
* <a href="https://github.com/destiny3912">jiho lee (@destiny3912)</a>
* <a href="https://github.com/jsurls">Joey Surls (@jsurls)</a>
* <a href="https://github.com/jdubois">Julien Dubois (@jdubois)</a>
* <a href="https://github.com/LoperLee">JunSeop (@LoperLee)</a>
* <a href="https://github.com/karesti">Katia Aresti (@karesti)</a>
* <a href="https://github.com/KyleKreuter">Kyle Kreuter (@KyleKreuter)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/Manideepok">Manideepok (@Manideepok)</a>
* <a href="https://github.com/MatejNedic">matejnedic (@MatejNedic)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/thisishwan2">Pilhwan Choi (@thisishwan2)</a>
* <a href="https://github.com/sebin1213">sebin1213 (@sebin1213)</a>
* <a href="https://github.com/ThomasVitale">Thomas Vitale (@ThomasVitale)</a>
* <a href="https://github.com/viacheslav-dobrynin">Viacheslav Dobrynin (@viacheslav-dobrynin)</a>
* <a href="https://github.com/jamespud">Wenli Tian (@jamespud)</a>
* <a href="https://github.com/quaff">Yanming Zhou (@quaff)</a>
* <a href="https://github.com/Yokior">Yokior (@Yokior)</a>
* <a href="https://github.com/ybezsonov">Yuriy Bezsonov (@ybezsonov)</a>

