# Spring AI 1.0.3

## release on 20251001
## description
## changes
Spring AI 1.0.3 Release Notes

🎯 Highlights

This release includes 4 new features, 14 bug fixes, 6 documentation improvements, 3 other improvements.

⭐ New Features

* GemFireVectorStore now supports metadata filtering queries, enabling more precise vector search operations. <a href="https://github.com/spring-projects/spring-ai/commit/833a856f51090f0eb98332db2341ce7a107af1fd">833a856</a>
* Enhanced AWS Bedrock integration with new BedrockChatOptions for improved configuration management and chat model options <a href="https://github.com/spring-projects/spring-ai/commit/86604733398e91efeec8d02636b7c85ece4ca80d">8660473</a>
* Initial implementation of ahead-of-time compilation improvements for better GraalVM native image support <a href="https://github.com/spring-projects/spring-ai/commit/a96488716924be6e020a48a45e72279293118ba6">a964887</a>
* OpenAiApi can now be injected as a Spring bean, enabling easier customization and testing <a href="https://github.com/spring-projects/spring-ai/commit/ee51d44675af5aa9d7773bf24d811808739c09ba">ee51d44</a>

🪲 Bug Fixes

* Resolved issues with JSON schema generation for method input parameters in Mistral integration. <a href="https://github.com/spring-projects/spring-ai/pull/4524" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4524/hovercard">#4524</a>
* Improved error handling by providing fallback messages when tool execution errors are blank. <a href="https://github.com/spring-projects/spring-ai/commit/a0a38de0b284fa30ada947dffada9692dad85914">a0a38de</a>
* Enhanced robustness of mergeToolUseEvents method and fixed handling of thinkingBlock.signature() in eventToChatCompletionResponse, improving streaming event reliability. <a href="https://github.com/spring-projects/spring-ai/commit/6ced885e7e036480957b9192d18b511b9d6f6ac5">6ced885</a>
* Resolved inconsistency in PromptTemplate.render(Map) where Resource variables were not handled correctly compared to no-arg render. <a href="https://github.com/spring-projects/spring-ai/commit/36516e0eed6c2f8b9ae2d68014b653c647bca17c">36516e0</a>
* Corrected class loading mechanism for Jackson modules to avoid using Thread Context ClassLoader, improving reliability in certain deployment scenarios. <a href="https://github.com/spring-projects/spring-ai/commit/9d9d539daf0ba74fbf63cc700962175141f90ce4">9d9d539</a>
* Improved type safety and consistency in logger parameter binding. <a href="https://github.com/spring-projects/spring-ai/commit/d075519a3513149580404b64e606a0685151d831">d075519</a>
* Code quality improvement for document handling. <a href="https://github.com/spring-projects/spring-ai/commit/5bac155b45b90fabd6340873f6425588dc119bd5">5bac155</a>
* Corrected usage of BedrockChatOptions in the Bedrock proxy chat model implementation <a href="https://github.com/spring-projects/spring-ai/commit/06079b2723267a56b57eceb6c6836c3f7af62f94">06079b2</a>
* Fixed toolAnnotationWeatherForecastStreaming integration test for Bedrock Nova chat client <a href="https://github.com/spring-projects/spring-ai/commit/a110c8b97cd46650cfdaee2b6a2e188fc54ea3ab">a110c8b</a>
* Resolved issue <a class="issue-link js-issue-link" data-error-text="Failed to load title" data-id="3430076211" data-permission-text="Title is private" data-url="https://github.com/spring-projects/spring-ai/issues/4414" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4414/hovercard" href="https://github.com/spring-projects/spring-ai/issues/4414">GH-4414</a> in OllamaApiHelper implementation <a href="https://github.com/spring-projects/spring-ai/commit/71dee41f061c8b3e0f3ff6e1509d8187372eea01">71dee41</a>
* Enhanced configuration metadata generation for better IDE auto-completion support <a href="https://github.com/spring-projects/spring-ai/commit/76ca66d5ddf433dce49eb981537f7ae5ec75be34">76ca66d</a>
* Resolved index out-of-range exceptions that occurred during tool call merging in OpenAI integration <a href="https://github.com/spring-projects/spring-ai/commit/a12f0ca7e0b30838ccf5ccf0da1598df8acab5fa">a12f0ca</a>
* Updated test annotations to use the current @MockitoSpyBean annotation instead of the expired @SpyBean <a href="https://github.com/spring-projects/spring-ai/commit/65b4eada1f7164710532e93762c7245cd15acbf9">65b4ead</a>
* Enhanced code clarity by improving method parameter names in the ChatClient builder API <a href="https://github.com/spring-projects/spring-ai/pull/3856" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3856/hovercard">#3856</a>

📓 Documentation

* Corrected documentation typo in ollama-embeddings.adoc. <a href="https://github.com/spring-projects/spring-ai/commit/cdf5643fa0cb7d8888da9279bb82dcdbcc8468f0">cdf5643</a>
* Added documentation for metadata filtering capabilities in GemFireVectorStore. <a href="https://github.com/spring-projects/spring-ai/commit/bc5411ac6ea6ffad06ce7218c7eded78b01f9aa9">bc5411a</a>
* Corrected example code in ChatMemory documentation for CassandraChatMemoryRepository <a href="https://github.com/spring-projects/spring-ai/pull/4476" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4476/hovercard">#4476</a>
* Fixed example code errors in multimodality documentation <a href="https://github.com/spring-projects/spring-ai/pull/4475" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4475/hovercard">#4475</a>
* Corrected documentation showing the proper property prefix as spring.ai.oci.genai.cohere.chat <a href="https://github.com/spring-projects/spring-ai/pull/4437" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4437/hovercard">#4437</a>
* Updated DeepSeekChatModel initialization examples to demonstrate proper builder pattern usage <a href="https://github.com/spring-projects/spring-ai/pull/4421" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4421/hovercard">#4421</a>

⚡ Performance

* Improved performance of float list to primitive array conversion in embedding utilities <a href="https://github.com/spring-projects/spring-ai/commit/8e16f9d05181fadec119c03a21c850f0cee38a8f">8e16f9d</a>

🔩 Build Updates

* Simplified initializeContainer method by removing redundant parameters and meaningless reassignments <a href="https://github.com/spring-projects/spring-ai/commit/f4a2aa9ef093f53fdf9428d42789400cae55e44c">f4a2aa9</a>
* Refactored code to use Optional chaining for cleaner assistant message extraction <a href="https://github.com/spring-projects/spring-ai/commit/4a4808d17099670388a1a24fbde80f4e76d6e071">4a4808d</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/albertattard">Albert Attard (@albertattard)</a>
* <a href="https://github.com/kirkster96">Cameron Kirk (@kirkster96)</a>
* <a href="https://github.com/cho">cho-thinkfree-com (@cho)</a>
* <a href="https://github.com/christian.tzolov">Christian Tzolov (@christian.tzolov)</a>
* <a href="https://github.com/bottarde">Eric Bottard (@bottarde)</a>
* <a href="https://github.com/crad_on25">Hyoseop Song (@crad_on25)</a>
* <a href="https://github.com/academey">Hyunjoon Park (@academey)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/jason.huynh">Jason Huynh (@jason.huynh)</a>
* <a href="https://github.com/joshlong">Josh Long (@joshlong)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/bert825_work">Li Huagang-简放视野 (@bert825_work)</a>
* <a href="https://github.com/mark.pollack">Mark Pollack (@mark.pollack)</a>
* <a href="https://github.com/alexanderklmn">Oleksandr Klymenko (@alexanderklmn)</a>
* <a href="https://github.com/ai-afk">SiBo Ai (@ai-afk)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/waldemar.panas">Waldemar Panas (@waldemar.panas)</a>
* <a href="https://github.com/xfl12345">xfl12345 (@xfl12345)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/fatebugs">随缘Bug (@fatebugs)</a>

