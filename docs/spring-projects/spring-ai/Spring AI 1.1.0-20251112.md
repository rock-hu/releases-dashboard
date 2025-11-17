# Spring AI 1.1.0

## release on 20251112
## description
## changes
Spring AI 1.1.0 GA Release Notes

🎯 Highlights

This release includes 1 new features, 10 bug fixes, 3 documentation improvements, 3 other improvements.

⭐ New Features

* Enhanced ChatCompletionRequest to support dynamic field deserialization using @JsonAnySetter annotation for extraBody properties <a href="https://github.com/spring-projects/spring-ai/commit/3fc939a8c2dd8af8e79a0d28ebd169eced2bc61f">3fc939a</a>

🪲 Bug Fixes

* Resolved an issue where MongoChatMemoryIndexCreator component was not being properly scanned during Spring application context initialization <a href="https://github.com/spring-projects/spring-ai/commit/faf38081b4004ca2538658aebac3d309d2a81ceb">faf3808</a>
* Added validation for inputSchema in Model Context Protocol (MCP) tool definitions to ensure proper tool configuration <a href="https://github.com/spring-projects/spring-ai/pull/4855" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4855/hovercard">#4855</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4776" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4776/hovercard">#4776</a>
* Improved error handling for malformed responses from the OpenAI API to prevent unexpected failures <a href="https://github.com/spring-projects/spring-ai/commit/c0cc32cfd55d943e87c86c56b0b44804e9a7b69b">c0cc32c</a>
* Changed PgVectorSchemaValidator class visibility to package-private to properly encapsulate internal implementation details <a href="https://github.com/spring-projects/spring-ai/pull/4857" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4857/hovercard">#4857</a>
* Refactored StatelessToolCallbackConverterAutoConfiguration and ToolCallbackConverterAutoConfiguration for better code organization <a href="https://github.com/spring-projects/spring-ai/pull/4858" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4858/hovercard">#4858</a>
* Corrected Maven dependency configuration for the MongoDB chat memory repository integration <a href="https://github.com/spring-projects/spring-ai/commit/374c09ef531899970e3949a640ba7d14a723f06a">374c09e</a>
* Fixed inconsistent conditional property configuration for ElevenLabs auto-configuration to follow Spring AI standards <a href="https://github.com/spring-projects/spring-ai/commit/d71869e0e1e93a6624de77eca02ddbe9127a446b">d71869e</a>
* Resolved Java bytecode access issue related to invokespecial instruction <a href="https://github.com/spring-projects/spring-ai/commit/9cec4d73ab67cea8c3abad79ac580b96d5960bd4">9cec4d7</a>
* Refactored ToolCallbackProvider dependency injection to use Spring's ObjectProvider for better flexibility and optional dependency handling <a href="https://github.com/spring-projects/spring-ai/commit/e4926e52fc6b2b903ff3425be8a00174a8c4e682">e4926e5</a>
* Cleaned up excessive debug logging statements in AnthropicChatModel implementation <a href="https://github.com/spring-projects/spring-ai/pull/4847" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4847/hovercard">#4847</a>

📓 Documentation

* Improved documentation for the audio transcription API with clearer examples and usage guidance <a href="https://github.com/spring-projects/spring-ai/commit/f167df86af5d2c2e951ed4a288027bf0f8956e7a">f167df8</a>
* Corrected broken hyperlink in the Model Context Protocol (MCP) overview documentation page <a href="https://github.com/spring-projects/spring-ai/commit/b6ccb03ec6fb8bbe5970a53bfb051ef57cf6873c">b6ccb03</a>
* Updated UserMessage code examples in documentation to properly demonstrate builder pattern usage <a href="https://github.com/spring-projects/spring-ai/commit/68adc264c20ecd99c25e5aaeb4173b153bf6dcf1">68adc26</a>

🔨 Dependency Upgrades

* Updated Model Context Protocol (MCP) integration to version 0.16.0 <a href="https://github.com/spring-projects/spring-ai/pull/4860" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4860/hovercard">#4860</a>

🔩 Build Updates

* Disabled parallel Maven builds in the fast CI pipeline to resolve intermittent Kotlin compiler errors and improve build stability <a href="https://github.com/spring-projects/spring-ai/commit/f6fa47c772dbf067aa036d2e313174218dada574">f6fa47c</a>
* Updated fast CI workflow to properly run unit tests and generate documentation after tests pass <a href="https://github.com/spring-projects/spring-ai/commit/eb0e1010f00719924995412bfa933ccad8a690c7">eb0e101</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/garethjevans">Gareth Evans (@garethjevans)</a>
* <a href="https://github.com/guanxuc">guanxu (@guanxuc)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/markpollack">Mark Pollack (@markpollack)</a>
* <a href="https://github.com/Mo-Greene">MoGreene (@Mo-Greene)</a>
* <a href="https://github.com/Simulant87">Simulant87 (@Simulant87)</a>
* <a href="https://github.com/quaff">Yanming Zhou (@quaff)</a>
* <a href="https://github.com/deejay1">Łukasz Jernaś (@deejay1)</a>

