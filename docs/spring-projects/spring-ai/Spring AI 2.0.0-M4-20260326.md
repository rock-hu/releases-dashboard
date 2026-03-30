# Spring AI 2.0.0-M4

## release on 20260326
## description
## changes
Spring AI 2.0.0-M4 Release Notes

🎯 Highlights

This release includes 2 new features, 10 bug fixes, 13 other improvements.

:warning: Upgrading Notes

* If you are using Vertex AI, OCI GenAI, or ZhiPu AI integrations, begin planning migration to alternative model providers such as OpenAI, Azure OpenAI, Anthropic, or other supported providers. These deprecated integrations will be removed in a future major release. <a href="https://github.com/spring-projects/spring-ai/pull/5676" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5676/hovercard">#5676</a>

📢 Noteworthy

* The Vertex AI model integration classes have been deprecated and will be removed in a future release. Users should plan to migrate to alternative model providers. <a href="https://github.com/spring-projects/spring-ai/pull/5676" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5676/hovercard">#5676</a>
* The ZhiPu AI model integration classes have been deprecated and will be removed in a future release. Users should plan to migrate to alternative model providers. <a href="https://github.com/spring-projects/spring-ai/pull/5676" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5676/hovercard">#5676</a>
* The OCI GenAI model integration classes have been deprecated and will be removed in a future release. Users should plan to migrate to alternative model providers. <a href="https://github.com/spring-projects/spring-ai/pull/5676" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5676/hovercard">#5676</a>

⭐ New Features

* Added capability to use Google Search alongside custom tools in Gemini 3.x models, enhancing the search and tool integration capabilities. <a href="https://github.com/spring-projects/spring-ai/pull/5669" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5669/hovercard">#5669</a>
* Added support for dynamically disabling native structured output functionality, providing more flexibility in output handling. <a href="https://github.com/spring-projects/spring-ai/commit/019267f6d68a5a2b1affffbf4f7caad126e35e30">019267f</a>

🪲 Bug Fixes

* Resolved issue where extraBody configuration was being lost when toolDefinitions were specified in API requests. <a href="https://github.com/spring-projects/spring-ai/commit/e65d5de1be135c431e8b8b5ca4913b973063118a">e65d5de</a>
* Corrected regression in AzureOpenAiChatOptions where the stop field initializer was not working properly. <a href="https://github.com/spring-projects/spring-ai/commit/6e8e5fe90db5e53cfe3ff43ab621153eafe1ed91">6e8e5fe</a>
* Corrected handling of string values for TAG and TEXT filter values in Redis vector store filter expression converter. <a href="https://github.com/spring-projects/spring-ai/commit/32c79b078adcbc69dd6ac946a77054492fe9bbf1">32c79b0</a>
* Resolved key handling issues in Neo4j vector store filter expression converter. <a href="https://github.com/spring-projects/spring-ai/commit/d97da302653e43d6f474d05b1594a3c09e4a8c37">d97da30</a>
* Corrected identifier parsing logic in the filter expression text parser to handle edge cases properly. <a href="https://github.com/spring-projects/spring-ai/commit/ccc29d1086005f9a05bc137329acdf7f6f51ef4d">ccc29d1</a>
* Enhanced the reliability of media fetching operations in the Bedrock proxy chat model implementation. <a href="https://github.com/spring-projects/spring-ai/commit/75e2bd703967e2d64ac92add58371f2b21d18ab3">75e2bd7</a>
* Updated and fixed prompt caching tests to work correctly with the Claude Haiku 4.5 model on Bedrock. <a href="https://github.com/spring-projects/spring-ai/pull/5648" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5648/hovercard">#5648</a>
* Corrected the API key header configuration when using the OpenAI SDK with Azure OpenAI deployments. <a href="https://github.com/spring-projects/spring-ai/commit/0b142aad1559f5eb4da84a003e7218f76ed2972f">0b142aa</a>
* Fixed collection field initialization in super-builders to use null defaults instead of empty collections, preventing unintended behavior <a href="https://github.com/spring-projects/spring-ai/pull/5619" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5619/hovercard">#5619</a>
* Improved type safety in HeaderUtils by adding explicit type parameters to collection operations <a href="https://github.com/spring-projects/spring-ai/commit/a20203abc05da6a423b7e909fa77ec6046f59e2a">a20203a</a>

🔨 Dependency Upgrades

* Updated Google Generative AI SDK dependency to version 1.44.0, bringing latest features and improvements. <a href="https://github.com/spring-projects/spring-ai/pull/5669" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5669/hovercard">#5669</a>
* Upgraded OpenAI SDK dependency to version 4.28.0 for latest OpenAI API features and fixes. <a href="https://github.com/spring-projects/spring-ai/commit/0ad60decf02dab62cf4a09003ac07aefd9064e90">0ad60de</a>
* Upgraded the Anthropic SDK dependency to version 2.17.0 for latest features and improvements <a href="https://github.com/spring-projects/spring-ai/pull/5621" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5621/hovercard">#5621</a>

🔩 Build Updates

* Improved stability and reliability of Oracle and PgVector vector store integration tests. <a href="https://github.com/spring-projects/spring-ai/commit/490a369c36d2e9d1027dac3c5bd89d72a6070b9a">490a369</a>
* Resolved flakiness in Bedrock converse integration test assertions for more reliable test execution. <a href="https://github.com/spring-projects/spring-ai/commit/3c38bb496850d11a93405873f4fd3d0e2898de66">3c38bb4</a>
* Corrected issues in Google GenAI auto-configuration test suite. <a href="https://github.com/spring-projects/spring-ai/commit/1560afcc36053d81b2296bcdb678ebb7ef3fc9bf">1560afc</a>
* Resolved issues in Mistral AI integration test suite for improved test reliability. <a href="https://github.com/spring-projects/spring-ai/commit/aac56ee4d0dd1104020ec729e8294b5a1d98408d">aac56ee</a>
* Improved internal implementation of filter evaluation logic in SimpleVectorStore for better maintainability. <a href="https://github.com/spring-projects/spring-ai/commit/ba9220b22383e430d5f801ce8e4fa01cf9e75f29">ba9220b</a>
* Improved Maven dependency management by adding missing test scope for json-unit-assertj and leveraging Maven transitivity for test dependencies. <a href="https://github.com/spring-projects/spring-ai/commit/86911c45808a6bf33946a531070db49cc2df799e">86911c4</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/andresdiegolanda">Andres (@andresdiegolanda)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/ddobrin">ddobrin (@ddobrin)</a>
* <a href="https://github.com/dylanwe">Dylan Weijgertze (@dylanwe)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/filiphr">Filip Hrisafov (@filiphr)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/jdubois">Julien Dubois (@jdubois)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>
* <a href="https://github.com/ZhangDT-sky">ZhangDT-sky (@ZhangDT-sky)</a>

