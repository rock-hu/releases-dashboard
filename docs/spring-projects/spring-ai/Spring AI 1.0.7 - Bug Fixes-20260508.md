# Spring AI 1.0.7 - Bug Fixes

## release on 20260508
## description
## changes
Spring AI 1.0.7 Release Notes

🎯 Highlights

This release includes 5 bug fixes, 6 other improvements.

⏪ Breaking Changes

* Chat memory advisors now require an explicit conversation ID to be supplied. Previously, a default or implicit ID may have been used, which could cause incorrect memory scoping across conversations. Callers must now provide a conversation ID explicitly. <a href="https://github.com/spring-projects/spring-ai/commit/be48f068ae18d1429bcf711de5280e9d1d28d551">be48f06</a>

:warning: Upgrading Notes

* If you are using <code>PromptChatMemoryAdvisor</code>, migrate to the replacement advisor. All chat memory advisors now require an explicit <code>conversationId</code> to be provided — update your code to pass a conversation ID when creating or invoking chat memory advisors. <a href="https://github.com/spring-projects/spring-ai/commit/be48f068ae18d1429bcf711de5280e9d1d28d551">be48f06</a>

🪲 Bug Fixes

* Corrected string escaping in the Milvus vector store's <code>doDelete</code> method when handling ID lists, preventing potential query errors during deletion operations. <a href="https://github.com/spring-projects/spring-ai/commit/864ef8129da758ff8b139ab16a0f4f3029f5d3e0">864ef81</a>
* Resolved a misconfiguration of the <code>ObjectMapper</code> in the MCP server, ensuring proper JSON serialization and deserialization behavior. <a href="https://github.com/spring-projects/spring-ai/commit/436c765905b0fa987ceba3e991e388fe5b7ef0e6">436c765</a>
* Corrected auto-configuration issues affecting MCP server and Spring WebMvc server setup. A prior incorrect fix was reverted and replaced with the proper resolution. <a href="https://github.com/spring-projects/spring-ai/commit/4b21612c6116b26a1def842a269ac95fb7ff4f40">4b21612</a>
* Updated integration tests for <code>ChatClientAdvisor</code> to supply an explicit conversation ID, aligning with the new requirement for explicit IDs in chat memory advisors. <a href="https://github.com/spring-projects/spring-ai/commit/a5fb3976f3edee3d6afc908cdda68800a8369aa7">a5fb397</a>
* Resolved a test failure in the Anthropic chat client integration test for method-invoking function callbacks. <a href="https://github.com/spring-projects/spring-ai/commit/daa1b6804b071fcdd3554171c8b45400897abd19">daa1b68</a>

🔨 Dependency Upgrades

* Updated the Model Context Protocol (MCP) SDK by a significant version jump (0.10.0 → 0.18.2), incorporating many upstream improvements, new capabilities, and compatibility updates. <a href="https://github.com/spring-projects/spring-ai/pull/5958" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5958/hovercard">#5958</a>

🔩 Build Updates

* The project build now uses JDK 17.0.19, ensuring alignment with the latest LTS patch release for improved security and stability in the build environment. <a href="https://github.com/spring-projects/spring-ai/commit/1badb6f6e976a864f8d139787343104fd367c4f5">1badb6f</a>
* Spring AI starter modules have been relocated to a dedicated starters/ directory, improving the project's directory structure and organization. <a href="https://github.com/spring-projects/spring-ai/commit/36df6b96b06f20d7c15c87486c134efcf3a78a99">36df6b9</a>
* Project version advanced to 1.0.7-SNAPSHOT to begin the next development cycle following the 1.0.6 release. <a href="https://github.com/spring-projects/spring-ai/commit/82848f27a6c7bde37a998b6b29dbb89c3409a8b2">82848f2</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>

