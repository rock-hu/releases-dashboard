# Spring AI 1.1.0-M2

## release on 20250922
## description
## changes
Spring AI 1.1.0-M2 Release Notes

🎯 Highlights

This release includes 16 new features, 12 bug fixes, 6 documentation improvements, 22 other improvements.

⭐ New Features

* Added support for response schema validation in VertexAI Gemini Chat Model for structured output generation <a href="https://github.com/spring-projects/spring-ai/commit/31423e91553a6ff20bf091086671dd10acd5b7c5">31423e9</a>
* New integration with Mistral AI's OCR (Optical Character Recognition) API for document and image text extraction <a href="https://github.com/spring-projects/spring-ai/commit/0c1a089624244f3143f6cbcc45ccf85759139b9d">0c1a089</a>
* Added comprehensive hardware, memory, performance and execution options for Ollama embedding models <a href="https://github.com/spring-projects/spring-ai/commit/eba2cecca0ac9a93337d51614a340c0bf4eda8a8">eba2cec</a>
* Added Testcontainers service connection support for docker/mcp-gateway to improve testing capabilities <a href="https://github.com/spring-projects/spring-ai/commit/4d0206bd896347c058dd048bf3206640a6b7cbb6">4d0206b</a>
* Added Google GenAI artifact entries to Spring AI Bill of Materials for improved dependency management <a href="https://github.com/spring-projects/spring-ai/commit/ae599539a7eddcb7244155456c05dcca4ca86a64">ae59953</a>
* Added support for thinking and response_format parameters to the ZhipuAI chat model integration, enhancing the model's capabilities and output formatting options <a href="https://github.com/spring-projects/spring-ai/commit/cae63644439a273d0d09a603f5bf90ca7b61b2ba">cae6364</a>
* Added Docker Compose service connection support for MCP Gateway, improving containerized deployment capabilities <a href="https://github.com/spring-projects/spring-ai/commit/60a27a8b7a5181253dc097319baa095e97c41d3d">60a27a8</a>
* Added support for new ZhiPu models GLM-4.5 and GLM-Z1 <a href="https://github.com/spring-projects/spring-ai/commit/5f984fbceca2be91bb449124774cf6a2b54bfbf6">5f984fb</a>
* Added 'enable' property for Bedrock Cohere chat configuration <a href="https://github.com/spring-projects/spring-ai/commit/9442c35efa56a6ce6a3716bfaae986a92442f688">9442c35</a>
* Added requestMetadata support to Bedrock converse requests for enhanced request tracking <a href="https://github.com/spring-projects/spring-ai/commit/45baa39f7583dcfe013fdc394ac2f6f04b073280">45baa39</a>
* Aligned EmbeddingOptions builder pattern with ChatOptions for consistent API experience <a href="https://github.com/spring-projects/spring-ai/commit/14d6f589595dcf53767d3812fc41dc7c9a66bb1e">14d6f58</a>
* Added builder pattern support for AssistantMessage creation <a href="https://github.com/spring-projects/spring-ai/commit/f4a1c96bd787e6b20e8788d754b5b89312249be9">f4a1c96</a>
* Added support for the new glm-4.1v-thinking-flash model in the ZhipuAI integration <a href="https://github.com/spring-projects/spring-ai/commit/49506de04a4129719b02b56575bd159b01d1acdc">49506de</a>
* Made OpenAI API available as a bean for injection, enabling easier integration and customization <a href="https://github.com/spring-projects/spring-ai/commit/f41c27d67d4e88fd1f67895e8d8c3cb1e2f4c6c9">f41c27d</a>
* Implemented cache management for Anthropic API with eligibility tracking for improved performance and resource optimization <a href="https://github.com/spring-projects/spring-ai/commit/1d5ab9b67558790ba914eb3ecfefd47581631956">1d5ab9b</a>
* Added extended token usage metadata and Cached Content API support to Google GenAI (Gemini) for enhanced performance monitoring and content caching capabilities <a href="https://github.com/spring-projects/spring-ai/commit/6cf3b4b34ff652d358751c85c1b161c8539d63c2">6cf3b4b</a>

🪲 Bug Fixes

* Fixed issues with stateless Model Context Protocol (MCP) server registration to ensure proper connection handling <a href="https://github.com/spring-projects/spring-ai/commit/1b3705f4cac9a23d744339a15205fd6c9d349cef">1b3705f</a>
* Replaced expired @SpyBean annotation with @MockitoSpyBean for improved testing compatibility <a href="https://github.com/spring-projects/spring-ai/pull/3446" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3446/hovercard">#3446</a>
* Prevented out-of-range errors when merging tool calls in the OpenAI integration <a href="https://github.com/spring-projects/spring-ai/commit/6697589dcfa1e5215808419c2b9d89a1e614bd43">6697589</a>
* Optimized EmbeddingUtils.toPrimitive(List) method for better performance <a href="https://github.com/spring-projects/spring-ai/commit/d1133dc866c83f28deb4ac20634d8d0e76209fa6">d1133dc</a>
* Improved method parameter naming in ChatClient.Builder.defaultAdvisors() for better developer experience <a href="https://github.com/spring-projects/spring-ai/pull/3856" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3856/hovercard">#3856</a>
* Fixed handling of default implementation for ToolCallback#call(String,ToolContext) method to improve tool integration reliability <a href="https://github.com/spring-projects/spring-ai/commit/3e17e1684b933568871c85bd700df5016d3e5532">3e17e16</a>
* Fixed Ollama to properly use system role for system messages instead of user role <a href="https://github.com/spring-projects/spring-ai/pull/4364" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4364/hovercard">#4364</a>
* Corrected wrong checkstyle automated changes that were improperly applied <a href="https://github.com/spring-projects/spring-ai/commit/f3aab2f97ac3d8d6d428191c3e46072587ef85cc">f3aab2f</a>
* Refactored OllamaChatModel to support custom AbstractMessage implementations and align with other ChatModel implementations <a href="https://github.com/spring-projects/spring-ai/commit/8968df7a77bd67ea05112e831f7c088e4ddf7e1f">8968df7</a>
* Fixed DeepSeekChatModel initialization to use builder pattern for consistent API design <a href="https://github.com/spring-projects/spring-ai/commit/cb4f356e5b62e94cbaddbad7f1b7ebc99b8abd38">cb4f356</a>
* Improved configuration metadata generation for IDE auto-completion support <a href="https://github.com/spring-projects/spring-ai/commit/b5a37b6a1c88b46ff5afd4adc47654b27bb8a8a7">b5a37b6</a>
* Fixed VertexAI Gemini chat model tool calling integration test for inferred OpenAPI schema streaming <a href="https://github.com/spring-projects/spring-ai/commit/3c570273e8cf4a68564a5e8bc6d93b1fadef1422">3c57027</a>

📓 Documentation

* Fixed documentation for ChatClient responseEntity() method to provide accurate usage examples and guidance <a href="https://github.com/spring-projects/spring-ai/pull/4386" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4386/hovercard">#4386</a>
* Fixed and improved ZhipuAI chat model documentation in zhipuai-chat.adoc <a href="https://github.com/spring-projects/spring-ai/pull/4387" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4387/hovercard">#4387</a>
* Updated tests and documentation to use DockerModelRunnerContainer for improved container-based testing guidance <a href="https://github.com/spring-projects/spring-ai/commit/c7b7d691e409ebdbbd4407451fbcbc6125ee5a8a">c7b7d69</a>
* Improved MCP (Model Context Protocol) documentation and added comprehensive getting started guide <a href="https://github.com/spring-projects/spring-ai/commit/07688d58fc9f5e48c8e2cbcd38d623b7b8bb6a6e">07688d5</a>
* Updated MCP reference documentation with minor improvements and clarifications <a href="https://github.com/spring-projects/spring-ai/commit/e77612929e05c5be9e11be61e4a6b3e5c0b4a8ae">e776129</a>
* Fixed OCI Cohere documentation property prefix to spring.ai.oci.genai.cohere.chat <a href="https://github.com/spring-projects/spring-ai/commit/ce09cb51d4d23ddbf93a4f3e07ab63eb1e8b5ddb">ce09cb5</a>

🔨 Dependency Upgrades

* Updated Model Context Protocol (MCP) related dependencies to latest versions <a href="https://github.com/spring-projects/spring-ai/pull/4415" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4415/hovercard">#4415</a>
* Upgraded Spring Boot framework dependency to version 3.5.6 for latest features and security updates <a href="https://github.com/spring-projects/spring-ai/commit/820cc79309d20b77675177269ce2c4b83406b44f">820cc79</a>
* Updated to Spring Boot 3.5.5 for latest features and security improvements <a href="https://github.com/spring-projects/spring-ai/pull/4408" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4408/hovercard">#4408</a>
* Updated Google GenAI dependencies to their latest versions for improved functionality <a href="https://github.com/spring-projects/spring-ai/pull/4398" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4398/hovercard">#4398</a>
* Updated MCP from version 0.12.1 to 0.13.0-SNAPSHOT <a href="https://github.com/spring-projects/spring-ai/pull/4403" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4403/hovercard">#4403</a>
* Changed HSQLDB dependency scope from runtime to test for chat memory JDBC autoconfiguration <a href="https://github.com/spring-projects/spring-ai/pull/4366" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4366/hovercard">#4366</a>
* Updated MCP SDK to version 0.13.1 and mcp-annotations to 0.4.1 for latest features and improvements <a href="https://github.com/spring-projects/spring-ai/commit/0c8b6dc46c9d4d8c09f8e2e8a7a2d6da5f04ce5d">0c8b6dc</a>

⚡ Performance

* Optimized performance by using AssistantMessage#builder() pattern instead of direct instantiation, reducing object creation overhead <a href="https://github.com/spring-projects/spring-ai/commit/1decd348f2ec79106bef7dcb552bbb14790307cf">1decd34</a>
* Refactored request creation logic for Mistral AI chat model to improve efficiency and maintainability <a href="https://github.com/spring-projects/spring-ai/commit/f9d87fd49c380f9c31b68e1f636ae7cb43de3830">f9d87fd</a>
* Simplified assistant message extraction using Optional chaining for cleaner code <a href="https://github.com/spring-projects/spring-ai/commit/356fced9c6b05be8a7aac4fb1bb7d7be067ac9e5">356fced</a>
* Optimized ZhiPu Embedding to support batch embedding operations for improved performance <a href="https://github.com/spring-projects/spring-ai/commit/b7f231ac4bb0d0b45f50a83b7f3e8ebc16ac7815">b7f231a</a>

🔩 Build Updates

* Separated OllamaOptions into distinct Chat and Embedding Options classes for better modularity <a href="https://github.com/spring-projects/spring-ai/commit/f908aa1380e9822e7cadfe46b519faa1ae91af15">f908aa1</a>
* Added comprehensive edge case and boundary testing for Google Generative AI components to improve reliability <a href="https://github.com/spring-projects/spring-ai/commit/63ba02afa884faaaf3215cc95ce54fd4ce185aaa">63ba02a</a>
* Enhanced MCP tool name prefix generation with automatic duplicate handling for better tool management <a href="https://github.com/spring-projects/spring-ai/commit/31db86d56fff02a4fe9e2f0dcfcf5fe4b6a3a88b">31db86d</a>
* Defined explicit version for maven-gpg-plugin to improve build reproducibility <a href="https://github.com/spring-projects/spring-ai/pull/4320" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4320/hovercard">#4320</a>
* Added comprehensive test coverage for runtime hints and bindings processors <a href="https://github.com/spring-projects/spring-ai/pull/4402" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4402/hovercard">#4402</a>
* Added comprehensive edge case tests for ChatModel, ListOutputConverter, and ToolExecutionResult components to improve code reliability <a href="https://github.com/spring-projects/spring-ai/pull/4389" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4389/hovercard">#4389</a>
* Added comprehensive tests for OpenAI API builder, mutation, and streaming functionality to ensure robust integration <a href="https://github.com/spring-projects/spring-ai/commit/0b1a52faa8fe85f7d67927e87b01f363e8168bd9">0b1a52f</a>
* Polished MCP (Model Context Protocol) related configuration properties bean implementation <a href="https://github.com/spring-projects/spring-ai/commit/48891314e76c105e212d81b0aa00ddcc71dd04d2">4889131</a>
* General code cleanup and maintenance improvements <a href="https://github.com/spring-projects/spring-ai/commit/0b3e902fe87803b23648856704a07bbcbe5b9d8d">0b3e902</a>
* Added comprehensive test coverage for PromptMetadata functionality and VertexAI embedding retry mechanisms <a href="https://github.com/spring-projects/spring-ai/commit/ae0c4189e44cba3dec91747fa1f41e028ce51902">ae0c418</a>
* Corrected Maven command configuration in the documentation upload GitHub action <a href="https://github.com/spring-projects/spring-ai/commit/c2103b0e6c5030abf28c3a9b088d408bf9af8347">c2103b0</a>
* Added comprehensive runtime hints validation for Ollama GraalVM native image support <a href="https://github.com/spring-projects/spring-ai/commit/17b921136e5d4f9e4dc3d24d7af7c3fb38b9e1b3">17b9211</a>
* Added AOT (Ahead-of-Time) compilation support for MCP annotations to improve native image compatibility <a href="https://github.com/spring-projects/spring-ai/commit/5be4330bf8db25c7cdbbba3fd84b6b2a4d8e9c56">5be4330</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/andrei.sumin">Andrei Sumin (@andrei.sumin)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/ddobrin">Dan Dobrin (@ddobrin)</a>
* <a href="https://github.com/git">Daniel Garnier-Moiroux (@git)</a>
* <a href="https://github.com/eddu.melendez">Eddú Meléndez (@eddu.melendez)</a>
* <a href="https://github.com/gareth">Gareth Evans (@gareth)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/joshlong">Josh Long (@joshlong)</a>
* <a href="https://github.com/bytesgo">leeyazhou (@bytesgo)</a>
* <a href="https://github.com/bert825_work">Li Huagang-简放视野 (@bert825_work)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/alexanderklmn">Oleksandr Klymenko (@alexanderklmn)</a>
* <a href="https://github.com/ai-afk">SiBo Ai (@ai-afk)</a>
* <a href="https://github.com/stuart.loxton">Stuart Loxton (@stuart.loxton)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/ThomasVitale">Thomas Vitale (@ThomasVitale)</a>
* <a href="https://github.com/makingx">Toshiaki Maki (@makingx)</a>
* <a href="https://github.com/waldemar.panas">Waldemar Panas (@waldemar.panas)</a>
* <a href="https://github.com/xfl12345">xfl12345 (@xfl12345)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/eeaters">YuJie Wan (@eeaters)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>

