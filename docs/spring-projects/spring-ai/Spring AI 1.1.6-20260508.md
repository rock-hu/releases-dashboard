# Spring AI 1.1.6

## release on 20260508
## description
## changes
Spring AI 1.1.6 Release Notes

🎯 Highlights

This release includes 1 new features, 5 bug fixes, 2 documentation improvements, 5 other improvements.

⏪ Breaking Changes

* Chat memory advisors now require an explicit conversation ID to be supplied. This is a behavioral change that affects how chat memory is scoped and managed. Applications relying on implicit conversation IDs must be updated to supply an explicit ID. <a href="https://github.com/spring-projects/spring-ai/commit/13cde419e30042c663706f130dd65b80d92d4667">13cde41</a>

:warning: Upgrading Notes

* PromptChatMemoryAdvisor is now deprecated and chat memory advisors require an explicit conversation ID. Update your code to: (1) replace PromptChatMemoryAdvisor with the recommended alternative, and (2) ensure an explicit conversation ID is supplied when using any chat memory advisor. <a href="https://github.com/spring-projects/spring-ai/commit/917f62ebec13cf01027c094dd36d4106b1c8dc47">917f62e</a>

⭐ New Features

* MCP auto-configuration now includes the missing @ConditionalOnMissingBean check, allowing users to provide their own bean definitions and override the auto-configured MCP beans as expected in Spring Boot auto-configuration patterns. <a href="https://github.com/spring-projects/spring-ai/commit/d4025e5d8ede18158cbd9b53b1cc4a0ad107af3a">d4025e5</a>

🪲 Bug Fixes

* Fixed an issue where the MilvusVectorStore's doDelete method incorrectly escaped strings in the ID list, which could cause deletion operations to fail or behave unexpectedly. <a href="https://github.com/spring-projects/spring-ai/commit/20206a46408ef8a9609f54afc7c82a0b5fd2e357">20206a4</a>
* Fixed the ChatClientAdvisorTests test suite to supply an explicit conversation ID, aligning tests with the new requirement for explicit conversation IDs in chat memory advisors. <a href="https://github.com/spring-projects/spring-ai/commit/704e5c6519c150662c7338782639fa84ffe8c9ed">704e5c6</a>
* Fixed the MistralAiChatModelObservationIT integration test to ensure observation functionality works correctly with the MistralAI chat model provider. <a href="https://github.com/spring-projects/spring-ai/commit/a89145db26831f2f8bf22e0f76155ecebd8d7c5c">a89145d</a>
* Corrects an issue where configured options were not being properly included in MistralAI API requests, ensuring all user-defined settings are correctly passed through. <a href="https://github.com/spring-projects/spring-ai/commit/7bcf32aa134b3954ba70bed625de4adcbfe8fab4">7bcf32a</a>
* Resolves a regression in how AssistantMessage.ToolCall.id is handled when using the Ollama integration, restoring correct tool call identification behavior. <a href="https://github.com/spring-projects/spring-ai/commit/bb9d65ea96d3d57cf3c7467fb82e86bc25c9f238">bb9d65e</a>

📓 Documentation

* Corrected typographical errors in the MCP (Model Context Protocol) documentation for improved readability and accuracy. <a href="https://github.com/spring-projects/spring-ai/commit/a1ad7f2a4a784432dde61520723fb80119008320">a1ad7f2</a>
* Fixed broken xref anchors in the documentation to restore proper cross-reference navigation between documentation sections. <a href="https://github.com/spring-projects/spring-ai/commit/f03c104234de47a9e91d0a7f312f458ebeb5cbe9">f03c104</a>

🔨 Dependency Upgrades

* Updated MCP SDK from version 0.17.0 to 0.18.2 and MCP annotations from 0.8.0 to 0.9.0, bringing in the latest MCP protocol improvements and bug fixes. <a href="https://github.com/spring-projects/spring-ai/pull/5961" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5961/hovercard">#5961</a>

🔩 Build Updates

* Updated the project build to use JDK 17.0.19, ensuring compatibility and incorporating the latest Java 17 patch release for the build environment. <a href="https://github.com/spring-projects/spring-ai/commit/27281e62dec4fd0857ab3d0da79cd3b83105b260">27281e6</a>
* Reorganizes the project structure by relocating Spring AI starter modules to a dedicated starters/ directory for better maintainability and clarity. <a href="https://github.com/spring-projects/spring-ai/commit/22f867673c0d59a4607022d0a5992b5f0c59f6ef">22f8676</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/emileplas">Emile Plas (@emileplas)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>

