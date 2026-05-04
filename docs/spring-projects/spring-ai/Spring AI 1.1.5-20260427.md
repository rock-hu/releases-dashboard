# Spring AI 1.1.5

## release on 20260427
## description
## changes
Spring AI 1.1.5 Release Notes

🎯 Highlights

This release includes 9 bug fixes, 3 documentation improvements, 11 other improvements.

:warning: Upgrading Notes

* The Pixtral 12B model has been removed and Pixtral Large is deprecated. Update your model configuration to use the currently recommended Pixtral models to avoid issues in future releases. <a href="https://github.com/spring-projects/spring-ai/commit/447d2a4e177f86b41c82a135136c1a26d4cf650e">447d2a4</a>

📢 Noteworthy

* The Pixtral 12B model has been removed and the Pixtral Large model is now deprecated. Integration tests have been updated to use the recommended replacement models. Users relying on these models should migrate to the recommended alternatives. <a href="https://github.com/spring-projects/spring-ai/commit/447d2a4e177f86b41c82a135136c1a26d4cf650e">447d2a4</a>

🪲 Bug Fixes

* Fixed the CosmosDB vector store's doDelete method to properly parameterize queries, preventing potential SQL injection vulnerabilities and improving correctness. <a href="https://github.com/spring-projects/spring-ai/commit/6039e5752f393f451934e7953f3735c2ecdbd04d">6039e57</a>
* Fixed an issue where conversationId was not correctly applied in the VectorStoreChatMemoryAdvisor filter, which could cause incorrect memory retrieval across conversations. <a href="https://github.com/spring-projects/spring-ai/commit/3cccfdf13b556eab2f1f1b543eb0c12ba3ffa299">3cccfdf</a>
* Corrected key handling in the vector store filter expression converter to ensure filter expressions are properly evaluated. <a href="https://github.com/spring-projects/spring-ai/commit/01386e22f6c3c8f417be996984ad7dce1212fe19">01386e2</a>
* Resolved test non-determinism in the BedrockConverse streaming token usage tests, improving test reliability. <a href="https://github.com/spring-projects/spring-ai/commit/4747a3cc5f17253d95b62ff98007472e3e54adea">4747a3c</a>
* Corrected the test class naming to properly apply the integration test suffix, ensuring proper test categorization and execution. <a href="https://github.com/spring-projects/spring-ai/pull/5853" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5853/hovercard">#5853</a>
* Corrected string parsing logic for the toolChoice field in OpenAiSdkChatModel to ensure proper handling of tool choice configurations. <a href="https://github.com/spring-projects/spring-ai/commit/aeb33b01028effb7427e3cae5d0bf126694fd314">aeb33b0</a> via <a href="https://github.com/spring-projects/spring-ai/issues/5735" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5735/hovercard">#5735</a>
* Fixed an issue where the extra_body parameter was incorrectly included in outgoing OpenAI API requests, which could cause unexpected behavior. <a href="https://github.com/spring-projects/spring-ai/commit/4c0120cf40ecd1d3ae77e7543b0b1014a1bffae1">4c0120c</a>
* Resolved issues with Javadoc generation and configuration to ensure API documentation is correctly produced. <a href="https://github.com/spring-projects/spring-ai/commit/0a718048feea427f1db7e1b41d4b74f9ea23530b">0a71804</a>
* Corrected the test bypass condition so integration tests are properly skipped when required API keys are not configured in the environment. <a href="https://github.com/spring-projects/spring-ai/commit/bc26dc189a62d780d24c193d4c3e71826d27595e">bc26dc1</a>

📓 Documentation

* Updated the README to include a note about CPU architecture requirements or compatibility information. <a href="https://github.com/spring-projects/spring-ai/commit/a21e988f2b90c02f51c027f10e0670a0df205aa0">a21e988</a>
* Added documentation explaining how MCP servers can re-publish tools from MCP clients, clarifying the tool propagation model in multi-server setups. <a href="https://github.com/spring-projects/spring-ai/pull/5778" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5778/hovercard">#5778</a>
* Improved documentation to clarify the intended usage and behavior of the extra_body parameter in OpenAI API requests. <a href="https://github.com/spring-projects/spring-ai/commit/3d4d75b67ee8511e2950d60ec140a7c560d565a9">3d4d75b</a>

🔨 Dependency Upgrades

* Updated the Spring Boot dependency to version 3.5.14, incorporating the latest bug fixes and improvements from the Spring Boot team. <a href="https://github.com/spring-projects/spring-ai/commit/eb4c9a5305bc35613e07bcfab46295492e1571e9">eb4c9a5</a>
* Updated the Spring Boot dependency to version 3.5.13 as an intermediate upgrade. <a href="https://github.com/spring-projects/spring-ai/commit/9b902f82fe32ec501bb437235100d959070bfdc4">9b902f8</a>
* Updated document parsing dependencies: Apache Tika upgraded to 3.3.0, jsoup to 1.22.1, and Apache PDFBox to 3.0.7 for improved document processing capabilities and bug fixes. <a href="https://github.com/spring-projects/spring-ai/commit/f25fc52b0981133dfa47dc13263f34c2cace9842">f25fc52</a>

🔩 Build Updates

* Updated GitHub Actions workflow dependencies to their latest versions to improve CI/CD reliability and security. <a href="https://github.com/spring-projects/spring-ai/commit/9b70b38472508e8a7dd4166f0c0620232d777893">9b70b38</a>
* Changed the PR check workflow to use mvn package instead of mvn test for more efficient pull request validation. <a href="https://github.com/spring-projects/spring-ai/commit/7d2e455230de95df272d9fd5dae2d9e0856dbb06">7d2e455</a>
* Integration tests are now skipped in the CI pipeline to improve build performance, and the release notes generation workflow has been removed. <a href="https://github.com/spring-projects/spring-ai/pull/5688" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5688/hovercard">#5688</a>
* The project has been bumped to the next development version 1.1.5-SNAPSHOT following the release. <a href="https://github.com/spring-projects/spring-ai/commit/400dc42dd5a9159cb1721e1197bf3ff0b3bf09f3">400dc42</a>

🔐 Security

* Hardened the default cache directory used for transformer models to prevent unauthorized access or tampering with cached model files. <a href="https://github.com/spring-projects/spring-ai/commit/aac6b80346c6214f64d107410331aefdab26253b">aac6b80</a>
* Fixed a potential denial-of-service vulnerability where a malformed PDF could cause excessive memory allocation during document parsing. <a href="https://github.com/spring-projects/spring-ai/commit/b61ac6a12edc52bc7946dfa1fb8d748ec42685bf">b61ac6a</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/Kehrlann">Daniel Garnier-Moiroux (@Kehrlann)</a>
* <a href="https://github.com/dafriz">David Frizelle (@dafriz)</a>
* <a href="https://github.com/essien">Emmanuel Essien-nta (@essien)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/mminella">Michael Minella (@mminella)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>

