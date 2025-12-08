# Spring AI 1.1.1

## release on 20251205
## description
## changes
Spring AI 1.1.1 Release Notes

🎯 Highlights

This release includes 13 new features, 16 bug fixes, 3 documentation improvements, 11 other improvements.

⭐ New Features

* Added native integration with the official OpenAI Java SDK, providing improved type safety and API coverage for OpenAI model interactions. <a href="https://github.com/spring-projects/spring-ai/commit/e56b344461cb96902357b125e8cfcc18444db841">e56b344</a>
* ChatClient now supports native structured output, enabling more reliable and type-safe extraction of structured data from model responses. <a href="https://github.com/spring-projects/spring-ai/commit/3c3c3eb34481646e6dc0527af6e8766a129262fe">3c3c3eb</a>
* Integrated Claude Skills API with support for the Files API, enabling file-based interactions and enhanced Claude model capabilities. <a href="https://github.com/spring-projects/spring-ai/commit/b7a36bb62af7b690b0f7f8f822189421b8e6e7c2">b7a36bb</a>
* Backported Skills API support fixes to the 1.1.x maintenance branch for improved stability and consistency across versions. <a href="https://github.com/spring-projects/spring-ai/commit/a1f32d1692f7b005ef970ccfe8e0a73849ddee0c">a1f32d1</a>
* Added support for ISNULL and ISNOTNULL filter expressions in vector store queries, enabling null value checks in filter operations. <a href="https://github.com/spring-projects/spring-ai/commit/8e9ad36abc3d2083b34e297d2f93bde6a4abed44">8e9ad36</a>
* Introduced ThinkingLevel configuration support in ThinkingConfig to provide more control over reasoning and thinking processes. <a href="https://github.com/spring-projects/spring-ai/commit/7e6da6ec5d48b759e4727e889aea2c08ce72f28a">7e6da6e</a>
* Enhanced Vertex Gemini integration to include safety ratings in response metadata, providing visibility into content safety assessments. <a href="https://github.com/spring-projects/spring-ai/commit/f4eb3750482d70a6f666509f5a3db5cdabe55a0e">f4eb375</a>
* The ToolCallAdvisor now supports extensibility through hook methods, allowing developers to customize tool call behavior in their applications <a href="https://github.com/spring-projects/spring-ai/commit/2c8c4e7adcf0e98ee6bb158b1fe4b7a02865a516">2c8c4e7</a>
* GemFire Vector Store now supports username and password authentication for secure connections <a href="https://github.com/spring-projects/spring-ai/commit/21db782b3a65943964886dd6af0a0eabfdae87dd">21db782</a>
* Added support for thought signatures in Google GenAI's Gemini 3 Pro model when using function calling capabilities <a href="https://github.com/spring-projects/spring-ai/commit/9bdf182c298ed140a931cc989c10d4ec7adb2138">9bdf182</a>
* Added support for the latest Claude 4.5 models including Opus and Haiku variants with updated documentation <a href="https://github.com/spring-projects/spring-ai/commit/2c7b10e35b7b2ee28b76fd2244ee51d1c72af8d1">2c7b10e</a>
* Added prompt_tokens_details support and updated default chat options for ZhipuAI integration tests <a href="https://github.com/spring-projects/spring-ai/commit/a66e243d44d83d1fa18c368b8891e0771ae10c45">a66e243</a>
* Introduces a new Spring Boot starter that provides auto-configuration for using Azure Cosmos DB as a chat memory repository, simplifying the setup for persisting conversation history in Spring AI applications. <a href="https://github.com/spring-projects/spring-ai/commit/ef8f413a55bcd666229d886d33978efd0cb5c460">ef8f413</a>

🪲 Bug Fixes

* Enhanced error handling for JSON parsing failures in MethodToolCallback, providing better diagnostics and recovery. <a href="https://github.com/spring-projects/spring-ai/commit/d4f22cec9f49253ef4f0e0e91c51e67fe0a85365">d4f22ce</a>
* Fixed tool execution exception handling in MethodToolCallback for improved error reporting and stability. <a href="https://github.com/spring-projects/spring-ai/commit/b0a97c767f88e76cbd5ff01df3e4d4ab9533d675">b0a97c7</a>
* Changed toolCallingManager visibility to protected, enabling proper extensibility for custom implementations. <a href="https://github.com/spring-projects/spring-ai/commit/4585acd058dad1a724186ee7f7a4c3d44c64d757">4585acd</a>
* Corrected TokenTextSplitter behavior when handling punctuation marks to ensure proper text segmentation. <a href="https://github.com/spring-projects/spring-ai/commit/8cc4ea4d15cbb3476c075f4170ac985ea24e1f2c">8cc4ea4</a>
* Resolved issue where the extraBody parameter was not being properly included in OpenAI API requests, ensuring custom request bodies are sent correctly. <a href="https://github.com/spring-projects/spring-ai/commit/0646d1e060e28cc659e39ad862283b53ff941b77">0646d1e</a>
* Fixed MariaDBSchemaValidator to correctly handle escaped spaces and eliminate misleading error messages during schema validation. <a href="https://github.com/spring-projects/spring-ai/commit/f0268c0407655226b41f3672d41427f944c859df">f0268c0</a>
* Resolved GraalVM native image compilation issues when using Java 22, improving compatibility and build success. <a href="https://github.com/spring-projects/spring-ai/commit/2cb1daa30b00f423848f7ea89a1ae8834f2ed04a">2cb1daa</a>
* Fixed missing auto-configuration for OCI GenAI Inference client to ensure proper initialization <a href="https://github.com/spring-projects/spring-ai/commit/808dd7ef47708d6193fdd4c80aa4edce7428954f">808dd7e</a>
* Resolved missing auto-configuration classes to ensure all components are properly registered <a href="https://github.com/spring-projects/spring-ai/commit/3cc3a79a8ca5473be496692ec53df1530bb53158">3cc3a79</a>
* Corrected issue where OpenAI gpt-oss models running on Amazon Bedrock returned null responses <a href="https://github.com/spring-projects/spring-ai/commit/88e03cd18d3d276ac41315839bceb1bffbe6d07f">88e03cd</a>
* OpenSearch vector store now omits explicit IDs when manageDocumentIds=false, improving AWS Serverless compatibility with additional unit and integration tests <a href="https://github.com/spring-projects/spring-ai/commit/3618524d1a2b811edefab5a443f5d67786ce788b">3618524</a>
* Resolved issues in OpenSearch vector store integration tests <a href="https://github.com/spring-projects/spring-ai/commit/0f0f33ea9eb35e53cfb4bf394885d645372ef5e8">0f0f33e</a>
* MCP client auto-configuration now supports optional handlers registry configuration <a href="https://github.com/spring-projects/spring-ai/pull/4920" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4920/hovercard">#4920</a>
* ClientMcp handlers registry now properly handles beans with unresolvable types <a href="https://github.com/spring-projects/spring-ai/pull/4918" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4918/hovercard">#4918</a>
* Fixed MongoDB vector store index creation to work across different Spring Data MongoDB versions <a href="https://github.com/spring-projects/spring-ai/commit/0821f48721f8d3eafc46762e3b0536793c37f27a">0821f48</a>
* Enhanced retry logic for Oracle Vector Store integration test container startup <a href="https://github.com/spring-projects/spring-ai/commit/9950cf782c24d470d99f91b0ffa343c26cb4bd92">9950cf7</a>

📓 Documentation

* Updated broken documentation link for Redis search queries to point to current documentation <a href="https://github.com/spring-projects/spring-ai/commit/1fa0e07e27bb316925b77f087ea1efa6c30dd960">1fa0e07</a>
* Corrected typo in code comments for DefaultChatClientUtils <a href="https://github.com/spring-projects/spring-ai/commit/a56380b19df08a26d46d38d150f80fb3b05638c5">a56380b</a>
* Corrected documentation typo for HNSW (Hierarchical Navigable Small World) algorithm <a href="https://github.com/spring-projects/spring-ai/commit/f476626c7576fe8ead64a73fec54e838d3abc304">f476626</a>

🔨 Dependency Upgrades

* Updated Apache Commons Lang to 3.18.0 to address CVE (Uncontrolled Recursion vulnerability). <a href="https://github.com/spring-projects/spring-ai/commit/af6496acdf28883550e5c7197376d5d567da0bb6">af6496a</a>
* Updated Apache Commons Compress to 1.28.0 to fix CVEs (Infinite Loop and Resource Allocation vulnerabilities). <a href="https://github.com/spring-projects/spring-ai/commit/82424f8ac33fb5f6132871b3295c9aa7edd1d97a">82424f8</a>
* Updated Spring Boot dependency to version 3.5.8, bringing latest bug fixes and improvements from the Spring Boot framework. <a href="https://github.com/spring-projects/spring-ai/commit/2c854d32fc9c555d6a1e4df98535b2b52b8b43a9">2c854d3</a>
* Updated io.swagger.core.v3:swagger-annotations from 2.2.30 to 2.2.38 <a href="https://github.com/spring-projects/spring-ai/commit/11192933e0229ebd86ddefe3d45996cfed22d3e1">1119293</a>
* Updated MCP library dependencies to latest versions <a href="https://github.com/spring-projects/spring-ai/commit/5fcc55753c3c4b3e684a918b0dc475f26cd2f696">5fcc557</a>

🔩 Build Updates

* Cleaned up obsolete CI workflow configuration to streamline build and deployment processes. <a href="https://github.com/spring-projects/spring-ai/commit/e08a6147a84e72ebc3c88f9bebcebc42814df41d">e08a614</a>
* Updated Kotlin compiler version to ensure compatibility with JDK 25, enabling builds on the latest Java development kit. <a href="https://github.com/spring-projects/spring-ai/commit/62b32902bb742561287a3112a6a396e012626c92">62b3290</a>
* Updated copyright information in test files to reflect current year and authorship. <a href="https://github.com/spring-projects/spring-ai/commit/a7e375212cdfec91d822cd14d3f1fe1a7f2fafcb">a7e3752</a>
* Updated CI workflow configuration for the 1.1.x branch <a href="https://github.com/spring-projects/spring-ai/commit/0d89fb90510e4cfa9ae02480380b6185fbcef8f7">0d89fb9</a>
* Updated project version to 1.1.1-SNAPSHOT for ongoing development. <a href="https://github.com/spring-projects/spring-ai/commit/99704327bb849e82ee2bde696e84e6c075429012">9970432</a>

🔐 Security

* Applied security patches by upgrading commons-lang3 to 3.18.0 (CVE: Uncontrolled Recursion) and commons-compress to 1.28.0 (CVEs: Infinite Loop, Resource Allocation). <a href="https://github.com/spring-projects/spring-ai/commit/af6496acdf28883550e5c7197376d5d567da0bb6">af6496a</a>

🙏 Contributors

Thanks to all the community contributors who made this release possible:

* <a href="https://github.com/academey">academey (@academey)</a>
* <a href="https://github.com/andy1199">Andy (@andy1199)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/CorgiBoyG">CorgiBoyG (@CorgiBoyG)</a>
* <a href="https://github.com/Kehrlann">Daniel Garnier-Moiroux (@Kehrlann)</a>
* <a href="https://github.com/dafriz">David Frizelle (@dafriz)</a>
* <a href="https://github.com/ddobrin">ddobrin (@ddobrin)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/jhuynh1">Jason Huynh (@jhuynh1)</a>
* <a href="https://github.com/dev-jonghoonpark">jonghoon park (@dev-jonghoonpark)</a>
* <a href="https://github.com/jdubois">Julien Dubois (@jdubois)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/markpollack">Mark Pollack (@markpollack)</a>
* <a href="https://github.com/parazit-IR">MohammadAli Jalalkamali (@parazit-IR)</a>
* <a href="https://github.com/nbreunese">Nils Breunese (@nbreunese)</a>
* <a href="https://github.com/SandraAhlgrimm">Sandra Ahlgrimm (@SandraAhlgrimm)</a>
* <a href="https://github.com/lsh1215">sanghun (@lsh1215)</a>
* <a href="https://github.com/JGoP-L">shaojie (@JGoP-L)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/YunKuiLu">YunKui Lu (@YunKuiLu)</a>
* <a href="https://github.com/ybezsonov">Yuriy Bezsonov (@ybezsonov)</a>
* <a href="https://github.com/wilocu">wilocu (@wilocu)</a>

