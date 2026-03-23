# Spring AI 1.0.4

## release on 20260317
## description
## changes
Spring AI 1.0.4 Release Notes

🎯 Highlights

This release includes 1 new features, 9 bug fixes, 1 documentation improvements, 11 other improvements.

📢 Noteworthy

* The default model for Anthropic chat has been updated to claude-haiku-4-5 as part of the Claude 4.6 model additions and deprecation cleanup. <a href="https://github.com/spring-projects/spring-ai/commit/86ad1f550070b22eb4cd8d2a7b2846a8960501c5">86ad1f5</a>

⏪ Breaking Changes

* Deprecated Claude 3.x and 3.7 model variants have been removed from AnthropicApi.ChatModel enum. The default model has been changed to claude-haiku-4-5. <a href="https://github.com/spring-projects/spring-ai/commit/86ad1f550070b22eb4cd8d2a7b2846a8960501c5">86ad1f5</a>

:warning: Upgrading Notes

* If you are using deprecated Claude 3.x or 3.7 model variants, update your code to use Claude 4.x models (claude-haiku-4-5, claude-opus-4-6, or claude-sonnet-4-6). The default model is now claude-haiku-4-5. <a href="https://github.com/spring-projects/spring-ai/commit/86ad1f550070b22eb4cd8d2a7b2846a8960501c5">86ad1f5</a>

⭐ New Features

* Added CLAUDE_OPUS_4_6 and CLAUDE_SONNET_4_6 to AnthropicApi.ChatModel enum, providing access to the latest Claude 4.6 models from Anthropic. <a href="https://github.com/spring-projects/spring-ai/commit/86ad1f550070b22eb4cd8d2a7b2846a8960501c5">86ad1f5</a>

🪲 Bug Fixes

* Fixed and enhanced FilterExpressionConverter for vector stores to improve filter expression handling. <a href="https://github.com/spring-projects/spring-ai/commit/a2f6f4cb1496ccfd085ac9dcdd4321082fc0c6a0">a2f6f4c</a>
* Corrected string parsing logic in FilterExpressionTextParser to properly handle filter expressions. <a href="https://github.com/spring-projects/spring-ai/commit/f6204b5952bd236ec311864184673d46d6d0300d">f6204b5</a>
* Updated AzureOpenAiImage tests to use the latest image model, replacing the disabled model variant. <a href="https://github.com/spring-projects/spring-ai/commit/ccd79fbb0bc74d2edb280bdfcbaa96d5a6d3b795">ccd79fb</a>
* Fixed AnthropicChatModelObservationIT and updated integration tests to handle tool call parameters for latest models and replace deprecated model references. <a href="https://github.com/spring-projects/spring-ai/commit/43797b62e8e2888ff2fed59bade9af36b262a9e3">43797b6</a>
* Resolved issues with streaming responses in Azure OpenAI chat model integration <a href="https://github.com/spring-projects/spring-ai/commit/356ae8feb078bed3e39a9aec16d7f1ae78cbbb94">356ae8f</a>
* Corrected message ordering issues when using MySQL or MariaDB as the backend for JDBC-based chat memory storage <a href="https://github.com/spring-projects/spring-ai/commit/393d9fa5689efa826047102cae571437519363f6">393d9fa</a>
* Fixed handling of responses that contain both text content and tool calls in Vertex AI Gemini chat model <a href="https://github.com/spring-projects/spring-ai/commit/9cbc1920ca89a37068d695e38a5a0b9ca1eae148">9cbc192</a>
* Corrected PDF document reader to properly respect the pagesPerDocument configuration when splitting documents <a href="https://github.com/spring-projects/spring-ai/commit/4c87187da9ce3fe85d180bf97c09a631fe7b18ab">4c87187</a>
* Resolved property access syntax issues in StringTemplate rendering <a href="https://github.com/spring-projects/spring-ai/commit/4b2ab39a9efa7eec874e81f8a66e736e2dd424ac">4b2ab39</a>

📓 Documentation

* Updated documentation to reflect that Spring Boot 3.5 has been released and is now available <a href="https://github.com/spring-projects/spring-ai/commit/18bf28c411e12b36b67a2e458507f519b7740f0b">18bf28c</a>

🔨 Dependency Upgrades

* Updated Spring Boot dependency to version 3.5.11. <a href="https://github.com/spring-projects/spring-ai/commit/11716e7334b2a951054323e9298d43fcaece0dd2">11716e7</a>
* Updated dependencies for vector store integrations to latest versions. <a href="https://github.com/spring-projects/spring-ai/commit/2708445af0858e57d6ade35c93b95ea961da0a5f">2708445</a>
* Updated GemFire vectorstore Docker image used in integration tests. <a href="https://github.com/spring-projects/spring-ai/commit/3722b9fc72d3e301feaf3da9b14581e91a4ab36f">3722b9f</a>
* Migrated from deprecated Claude Sonnet 3.5 models (retired October 28th, 2025) to Claude Sonnet 3.7 for integration tests <a href="https://github.com/spring-projects/spring-ai/commit/be4aa538f27893a148fabed41805526816d5f1d2">be4aa53</a>
* Updated Spring Boot dependency to version 3.5.6 <a href="https://github.com/spring-projects/spring-ai/commit/adbdd72eec1303dd4880bb849d18ad95bbe29172">adbdd72</a>

🔩 Build Updates

* Improved Ollama integration test stability to handle token count variations across different model versions <a href="https://github.com/spring-projects/spring-ai/commit/c8dad8a3b8d6ece049ff5303e81ca9accddf8223">c8dad8a</a>
* Updated Anthropic integration tests to use currently active model versions <a href="https://github.com/spring-projects/spring-ai/commit/65402b0ec4b160dfa15737733ec8ba0da953fb27">65402b0</a>
* Enhanced test container startup reliability for Oracle Vector Store integration tests <a href="https://github.com/spring-projects/spring-ai/commit/425ee841dbd1df9c487874c754f3bc0e46d58008">425ee84</a>
* Cleaned up unused internal classes to reduce codebase complexity <a href="https://github.com/spring-projects/spring-ai/commit/9d3d7e137ebf232d773ad75218f94420496f086b">9d3d7e1</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/eric.bottard">Eric Bottard (@eric.bottard)</a>
* <a href="https://github.com/ilayaperumal.gopinathan">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/mark.pollack">Mark Pollack (@mark.pollack)</a>
* <a href="https://github.com/nathangrand">NathanGrand (@nathangrand)</a>
* <a href="https://github.com/nils">Nils Breunese (@nils)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/fujian1115">stroller (@fujian1115)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>

