# Spring AI 2.0.0-M1

## release on 20251212
## description
## changes
Spring AI 2.0.0-M1 Release Notes

🎯 Highlights

Spring AI 2.0.0-M1 represents the first milestone of the 2.x series, built on <strong>Spring Boot 4.0 and Spring Framework 7.0</strong>. This major platform upgrade, contributed by Dmitry Bedrin with Paul Bakker from Netflix (<a href="https://github.com/spring-projects/spring-ai/pull/4774" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4774/hovercard">#4774</a>), brings modern Java capabilities and positions Spring AI for the next generation of AI application development.

This release includes 24 new features, 25 bug fixes, 7 documentation improvements, and 32 other improvements across 90 commits.

⏪ Breaking Changes

* The default temperature configuration has been removed from model implementations. Applications relying on default temperature values will need to explicitly configure temperature settings. <a href="https://github.com/spring-projects/spring-ai/commit/ce1a7fc6e9560b6f719efe00f1cb3241e8d2b398">ce1a7fc</a>
* The default chat model for OpenAI has been updated from the previous default to gpt-5-mini. Applications relying on the implicit default may experience different behavior. <a href="https://github.com/spring-projects/spring-ai/commit/8c093f1092cdfa94c9c08ebe4fdd8ddc5d0a97d9">8c093f1</a>

:warning: Upgrading Notes

* With the removal of default temperature options, ensure your application explicitly sets temperature values in model configurations where required. <a href="https://github.com/spring-projects/spring-ai/commit/ce1a7fc6e9560b6f719efe00f1cb3241e8d2b398">ce1a7fc</a>
* If your application depends on the default OpenAI chat model, verify that gpt-5-mini meets your requirements or explicitly configure your preferred model in application properties <a href="https://github.com/spring-projects/spring-ai/commit/8c093f1092cdfa94c9c08ebe4fdd8ddc5d0a97d9">8c093f1</a>

📢 Noteworthy

* If you're building Spring AI from source on the main branch, ensure you have Java 21 or higher installed while Java 17 is still the baseline for consuming the Spring AI 2.x binaries. <a href="https://github.com/spring-projects/spring-ai/commit/8ca583dcfdfdf8befeee42dde0fec43e41b6aedf">8ca583d</a>
* <strong>Spring Boot 4.0 and Spring Framework 7.0 upgrade</strong> - This release marks a major platform upgrade from Spring Boot 3.x to Spring Boot 4.0 GA and Spring Framework 7.0. Thanks to Dmitry Bedrin (<a href="https://github.com/bedrin">@bedrin</a>) with Paul Bakker from Netflix (<a href="https://github.com/paulbakker">@pbakker</a>) for the comprehensive upgrade effort (<a href="https://github.com/spring-projects/spring-ai/pull/4774" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4774/hovercard">#4774</a>). This includes major version upgrades for Kotlin (2.2.21), Rest Assured (5.5.6), swagger-codegen (3.0.75), and Testcontainers (2.0.1). <a href="https://github.com/spring-projects/spring-ai/commit/d5e92be4c6501cfbdb7eabfdaadc186ea49cd47e">d5e92be</a>, <a href="https://github.com/spring-projects/spring-ai/commit/a2a5e1b5f25d184104527267186f1a574de17875">a2a5e1b</a>
* The default chat model for OpenAI integration has been updated to gpt-5-mini, reflecting the latest recommended model from OpenAI <a href="https://github.com/spring-projects/spring-ai/commit/8c093f1092cdfa94c9c08ebe4fdd8ddc5d0a97d9">8c093f1</a>
* <strong>Official OpenAI Java SDK integration</strong> - Added native integration with the official OpenAI Java SDK for improved compatibility and functionality <a href="https://github.com/spring-projects/spring-ai/commit/15df47dc40c836825d7e4883ded16ed3cd7df090">15df47d</a>

⭐ New Features

* Added Redis-based chat memory repository implementation with Spring Boot starter for persistent conversation management across sessions <a href="https://github.com/spring-projects/spring-ai/commit/95f748137b1908ccbbb9b5a334e05e928d95a996">95f7481</a>
* New auto-configuration starter enabling easy setup of Redis-based chat memory with minimal configuration <a href="https://github.com/spring-projects/spring-ai/commit/99b297645ea3c911951b5b7fa2d2f23845bb938a">99b2976</a>
* Added text search capabilities, range query support, and HNSW index parameter tuning for improved vector search performance in Redis <a href="https://github.com/spring-projects/spring-ai/commit/c160b9c53faab162bd3df48215d6dea8b71cb7d2">c160b9c</a>
* TokenTextSplitter now supports custom punctuation marks, allowing more flexible text segmentation for different languages and text formats <a href="https://github.com/spring-projects/spring-ai/commit/9773099277e907044f58cd1802530367b8653958">9773099</a>
* Azure Vector Store now supports custom field names, enabling integration with existing Azure AI Search indexes that use non-default field naming conventions instead of hardcoded <code>content</code>, <code>embedding</code>, and <code>metadata</code> fields <a href="https://github.com/spring-projects/spring-ai/commit/798ab1739132c902e477cd1d9c3eda8ac052d7e0">798ab17</a>
* New finalization hook in ToolCallAdvisor enables custom logic execution after tool call loops complete, enhancing function calling workflow control <a href="https://github.com/spring-projects/spring-ai/pull/5064" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5064/hovercard">#5064</a>
* Added comprehensive Claude Skills integration including support for the Files API, enabling advanced file handling capabilities with Anthropic's Claude models. <a href="https://github.com/spring-projects/spring-ai/commit/bd906255bbd6bdc8bee0d526e0265728cd149c61">bd90625</a>
* Added support for ISNULL and ISNOTNULL filter expressions in vector store queries, enabling better null value handling in metadata filtering. <a href="https://github.com/spring-projects/spring-ai/commit/0b87c78acddbed07edea805327e54062af0c3bc8">0b87c78</a>
* Added ThinkingLevel configuration option to control extended thinking capabilities in supported models, allowing fine-grained control over reasoning depth. <a href="https://github.com/spring-projects/spring-ai/commit/740a61cec4334aafbb9d2d3cc835558d16df3800">740a61c</a>
* Added safety ratings to response metadata for Vertex AI Gemini models, providing visibility into content safety assessments. <a href="https://github.com/spring-projects/spring-ai/commit/2710cab12ef613ff433f4aeaabcc9f5aa5ef0ee8">2710cab</a>
* Made ToolCallAdvisor extensible by introducing hook methods, allowing developers to customize tool calling behavior and implement custom logic around function execution. <a href="https://github.com/spring-projects/spring-ai/pull/5004" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5004/hovercard">#5004</a>
* Added support for the latest Claude 4.5 models including Opus and Haiku variants with updated model enums and documentation <a href="https://github.com/spring-projects/spring-ai/commit/01ace16e5cd366f88014dd64b14facac1b21f684">01ace16</a>
* Google GenAI integration now supports thought signatures when using Gemini 3 Pro for function calling, enabling more advanced reasoning capabilities <a href="https://github.com/spring-projects/spring-ai/commit/3cb0879beef2d7a5d864e5d7dde3d0d6b0ebe90d">3cb0879</a>
* GemFire Vector Store now supports authentication via username and password credentials <a href="https://github.com/spring-projects/spring-ai/commit/839e6ed729aa9cb4ec3c42547eab52bf9d66498a">839e6ed</a>
* Enhanced OpenSearch vector store to omit explicit IDs when manageDocumentIds=false, improving compatibility with AWS OpenSearch Serverless deployments. Includes additional unit and integration tests. <a href="https://github.com/spring-projects/spring-ai/commit/d82eec3880ac5e8fde17502be85f4c8130225204">d82eec3</a>
* Added native integration with the official OpenAI Java SDK for improved compatibility and functionality <a href="https://github.com/spring-projects/spring-ai/commit/15df47dc40c836825d7e4883ded16ed3cd7df090">15df47d</a>
* ChatClient now supports native structured output, enabling direct conversion of chat responses to typed objects <a href="https://github.com/spring-projects/spring-ai/commit/195c4fde50e36e38e1f78f5dff59d17f93cab8a0">195c4fd</a>
* Added prompt_tokens_details tracking for ZhipuAI model and updated default chat options for tests <a href="https://github.com/spring-projects/spring-ai/commit/89a3b32e5ee53238c86cb422db04edeadc9af882">89a3b32</a>
* Exposed seed parameter in Vertex AI configuration for reproducible results <a href="https://github.com/spring-projects/spring-ai/commit/4f1ab6a9e41673be0c8da4b01ff10bae50abb234">4f1ab6a</a>
* Added Spring Boot web and REST client dependencies explicitly to model starters for better compatibility <a href="https://github.com/spring-projects/spring-ai/pull/4949" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4949/hovercard">#4949</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4948" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4948/hovercard">#4948</a>
* Introduced auto-configuration support for AWS Bedrock profiles and replaced deprecated functionality <a href="https://github.com/spring-projects/spring-ai/commit/552263d0710ae29dfb89099edda0bf3b3fb0284f">552263d</a>
* McpClientAutoConfiguration now supports optional handlers registry, improving flexibility in MCP client configuration <a href="https://github.com/spring-projects/spring-ai/pull/4920" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4920/hovercard">#4920</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4917" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4917/hovercard">#4917</a>
* ClientMcp handlers registries now support beans with unresolvable types, enhancing compatibility with various Spring configurations <a href="https://github.com/spring-projects/spring-ai/pull/4918" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4918/hovercard">#4918</a> via <a href="https://github.com/spring-projects/spring-ai/issues/4917" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/4917/hovercard">#4917</a>
* New Spring Boot starter added for Azure Cosmos DB chat memory repository, enabling easier integration of chat conversation history with Cosmos DB. <a href="https://github.com/spring-projects/spring-ai/commit/ef8f413a55bcd666229d886d33978efd0cb5c460">ef8f413</a>

🪲 Bug Fixes

* Updated outdated Milvus JSON fields documentation link in MilvusFilterExpressionConverter Javadoc <a href="https://github.com/spring-projects/spring-ai/pull/5028" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5028/hovercard">#5028</a>
* Resolved test issues with ChatClient tools using generic argument types <a href="https://github.com/spring-projects/spring-ai/commit/9e857ec91aaf2f7edfef1e258ad2085fc9f11eff">9e857ec</a>
* Updated runtime hints for AWS Bedrock integration <a href="https://github.com/spring-projects/spring-ai/commit/042765028e0a79986c79232c58a6ec3a8ea2e17e">0427650</a>
* Enhanced error handling for JSON parsing in the MethodToolCallback class to provide better error messages and handle malformed JSON in tool/function calling scenarios. <a href="https://github.com/spring-projects/spring-ai/pull/5032" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5032/hovercard">#5032</a> via <a href="https://github.com/spring-projects/spring-ai/issues/3924" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/3924/hovercard">#3924</a>
* Corrected handling of punctuation marks in the TokenTextSplitter to ensure proper text splitting behavior. <a href="https://github.com/spring-projects/spring-ai/commit/e065965ef7c222739a1181bde0feeb286c8af275">e065965</a>
* Resolved issue where the extraBody parameter was not being properly included in OpenAI API requests, ensuring all custom parameters are now correctly transmitted. <a href="https://github.com/spring-projects/spring-ai/commit/264fc3bbe890801ccf912adcb109c805e195e717">264fc3b</a>
* Corrected MariaDB schema validator to properly handle escaped spaces, eliminating false positive validation errors. <a href="https://github.com/spring-projects/spring-ai/commit/9acc2d7189f0c3c2d9de7220b4ad0edadaa1e0bd">9acc2d7</a>
* Resolved native compilation problems when using GraalVM with Java 22, ensuring proper native image generation for Spring AI applications. <a href="https://github.com/spring-projects/spring-ai/commit/a49e159ee55f539527349475dc965e10c1659b1c">a49e159</a>
* Addressed issue-4999 by removing the use of DEFAULT_TEMPERATURE to resolve configuration issues <a href="https://github.com/spring-projects/spring-ai/commit/fe9e78105fcc79f259513ad88a9c36384f626413">fe9e781</a>
* Resolved issue where OpenAI GPT models running on Amazon Bedrock were returning null responses. <a href="https://github.com/spring-projects/spring-ai/commit/050b9f11dc703e688b016fa45a8482172decd5bf">050b9f1</a>
* Added missing OCIGenAiInferenceClientAutoConfiguration to Spring Boot autoconfiguration imports, ensuring proper auto-configuration for Oracle Cloud Infrastructure GenAI integration. <a href="https://github.com/spring-projects/spring-ai/commit/3e0040ff16c35e888d4810adac9c31af02c2ee13">3e0040f</a>
* Added several missing auto-configuration classes to autoconfiguration import, improving Spring Boot integration. <a href="https://github.com/spring-projects/spring-ai/commit/258b6bc7a9842aead2e198f71ca3b546aefdcdfb">258b6bc</a>
* Resolved issues in OpenSearchVectorStoreIT to ensure reliable integration testing. <a href="https://github.com/spring-projects/spring-ai/commit/d4b6cf25c847ea898dda52ef27e336a49db204ae">d4b6cf2</a>
* Corrected documentation typo in DefaultChatClientUtils. <a href="https://github.com/spring-projects/spring-ai/commit/7af259356ece047077752bc5225f5c193a0ddf82">7af2593</a>
* Corrected vector indexing algorithm acronym from HSNW to HNSW (Hierarchical Navigable Small World). <a href="https://github.com/spring-projects/spring-ai/commit/186808ddfebeac788d9a9100849c9db98ba9b575">186808d</a>
* Improved retry logic for Oracle Vector Store integration test container startup to reduce flaky tests <a href="https://github.com/spring-projects/spring-ai/commit/8a6e39d02b8ebd4dc571fb38fb8ba0dad78d5dfe">8a6e39d</a>
* Resolved issues with ElasticSearch vector store integration tests <a href="https://github.com/spring-projects/spring-ai/commit/7f309872f58b0d7a66595f07134fef8af79c82df">7f30987</a>
* Resolved issues with MongoDB Atlas vector store integration tests <a href="https://github.com/spring-projects/spring-ai/commit/ad07a81cb10aaf57d3bb2882a81dc07572a5ee02">ad07a81</a>
* Resolved issues with RedisVectorStoreObservationIT and RedisVectorStoreIT integration tests <a href="https://github.com/spring-projects/spring-ai/commit/a7b837a71dca01b4d548b30d8c48ce97e5172d06">a7b837a</a>
* Restored ResourceAccessException to the retry policy to ensure proper retry handling for resource access failures. <a href="https://github.com/spring-projects/spring-ai/commit/f3eb84218a6506ba9fa61ad89c414fe3677f6515">f3eb842</a>
* Resolved issues in MongoDB chat memory auto-configuration integration tests. <a href="https://github.com/spring-projects/spring-ai/commit/ce7381c631c68650f621eb7e507c08cd4222303e">ce7381c</a>
* Fixed issues in Docker Compose integration tests to improve test stability. <a href="https://github.com/spring-projects/spring-ai/commit/d7a64352aebde95c87a6bbc0da49d14868d9cd9c">d7a6435</a>
* Resolved compatibility issues with MongoDB index creation across different Spring Data MongoDB versions. <a href="https://github.com/spring-projects/spring-ai/commit/e87b2ba2d3e791d4505df8adefd8a1a0eac7aa2b">e87b2ba</a>
* Corrected issues in Typesense vector store integration tests. <a href="https://github.com/spring-projects/spring-ai/commit/106778d4f6d4faa45e526960a339d52e8786a3c0">106778d</a>
* Refactored retry logic to centralize exception handling, improving consistency and maintainability across all AI model implementations. <a href="https://github.com/spring-projects/spring-ai/pull/4905" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4905/hovercard">#4905</a>

📓 Documentation

* Added comprehensive documentation for the new Redis-based chat memory repository implementation <a href="https://github.com/spring-projects/spring-ai/commit/aa743313bd48b5427a533cca369775a50a49e279">aa74331</a>
* Enhanced ChatClient documentation to include complete coverage of all available ChatMemoryRepository implementations <a href="https://github.com/spring-projects/spring-ai/commit/046399787c08c549fcc6b44af3ec9d97fc99362c">0463997</a>
* Added Maven Central badge for easier discovery of latest release versions <a href="https://github.com/spring-projects/spring-ai/commit/bc50b960244311195e18c829a621696c57ff3ab2">bc50b96</a>
* New documentation covering the custom punctuation marks feature in TokenTextSplitter <a href="https://github.com/spring-projects/spring-ai/commit/e59be78e72580ac4dd72d48d5406ea740332c588">e59be78</a>
* Documentation added for configuring custom field names when working with Azure AI Search indexes <a href="https://github.com/spring-projects/spring-ai/commit/757ed9ee9b78630eb919f48a4147a928e846aaa4">757ed9e</a>
* Updated documentation and workflow files following the removal of the Maven toolchains plugin. <a href="https://github.com/spring-projects/spring-ai/commit/d890ede6597e2a12fede0dfcea2fac3fc83b582d">d890ede</a>
* Updated Redis vector store documentation to point to the correct search query documentation <a href="https://github.com/spring-projects/spring-ai/commit/5ce998e255c51d1cd21bcf889a69adef609eea42">5ce998e</a>

🔨 Dependency Upgrades

* Upgraded Google Generative AI SDK from previous version to 1.30.0 <a href="https://github.com/spring-projects/spring-ai/commit/abd5082a9d71a1d86f777a57f839e7eedc347c6d">abd5082</a>
* Updated Model Context Protocol (MCP) support with latest JDK and annotation versions to improve MCP integration capabilities. <a href="https://github.com/spring-projects/spring-ai/commit/28891ab0efba2d03d8aa59c9c4eee457fe9e6ca8">28891ab</a>, <a href="https://github.com/spring-projects/spring-ai/commit/e15d318c16b17b678f2bc98d1d40eab65fa43f5a">e15d318</a>
* Cleaned up duplicate dependency entry for Azure Identity in the build configuration. <a href="https://github.com/spring-projects/spring-ai/commit/0eaf938244f7907387fd41945d6785ea6a8694c5">0eaf938</a>
* Updated io.swagger.core.v3:swagger-annotations from version 2.2.30 to 2.2.38. <a href="https://github.com/spring-projects/spring-ai/commit/e16d75afe698d1b0c0a1e29dc1ba8b6e1538ca9b">e16d75a</a>
* Upgraded to Spring Boot 4.0.0 GA release <a href="https://github.com/spring-projects/spring-ai/commit/a2a5e1b5f25d184104527267186f1a574de17875">a2a5e1b</a>
* Updated MCP and MCP annotations to latest versions <a href="https://github.com/spring-projects/spring-ai/commit/0bb7e5c78aebe3f944fcac55953fc4b84cb46780">0bb7e5c</a>
* Upgraded spring-javaformat-maven-plugin to version 0.0.47 <a href="https://github.com/spring-projects/spring-ai/commit/920e6f45fd532cd2ad1d3b26343079f00859b8ef">920e6f4</a>
* Updated to use Testcontainers dependencies from Spring Boot BOM and latest OpenSearch Testcontainers version compatible with Java 17 <a href="https://github.com/spring-projects/spring-ai/commit/fbd8b7fc9219a4b5cfd2d34418ea127357572d41">fbd8b7f</a>
* Updated to Spring Boot 4.0.0-RC2, bringing in the latest features and improvements from the Spring Boot 4.x line. <a href="https://github.com/spring-projects/spring-ai/commit/d5e92be4c6501cfbdb7eabfdaadc186ea49cd47e">d5e92be</a>

🔩 Build Updates

* Fixed checkstyle execution in build process <a href="https://github.com/spring-projects/spring-ai/commit/738c033c6f10b6da751844a3af600d7695e7b9e1">738c033</a>
* Resolved checkstyle formatting issues across codebase <a href="https://github.com/spring-projects/spring-ai/commit/c5a704224b5aa93a6d38bbdbf22657c4282bedf4">c5a7042</a>
* Improved CI/CD efficiency by generalizing the PR check workflow and enabling build caching <a href="https://github.com/spring-projects/spring-ai/commit/5ef630504ad1c45763d28545cb801240f2a76f73">5ef6305</a>
* Optimized build cache settings for improved build performance <a href="https://github.com/spring-projects/spring-ai/commit/cd76cf9239d7f5aed103c3b223a8b57cbab7ae0b">cd76cf9</a>
* Updated build configuration to require Java 21 or higher for the main development branch. <a href="https://github.com/spring-projects/spring-ai/commit/8ca583dcfdfdf8befeee42dde0fec43e41b6aedf">8ca583d</a>
* Removed Maven toolchains plugin from the build configuration with corresponding documentation updates. <a href="https://github.com/spring-projects/spring-ai/commit/d890ede6597e2a12fede0dfcea2fac3fc83b582d">d890ede</a>
* Modified visibility of toolCallingManager field to protected to allow better extensibility for custom implementations. <a href="https://github.com/spring-projects/spring-ai/commit/ea5477e2035e7322814c5a8dbd95c6779e8bd2d4">ea5477e</a>
* Updated copyright year and author information in SpringAiCoreRuntimeHintsTests to reflect current maintenance. <a href="https://github.com/spring-projects/spring-ai/commit/4969dbc39804e4be2f55fd4bf01cdaaf5190cc29">4969dbc</a>
* Integrated Maven Build Cache plugin to improve build performance <a href="https://github.com/spring-projects/spring-ai/commit/147f85a4166bad3bef86355c43d1b7f6d95fedf1">147f85a</a>
* Updated Maven compiler configuration to avoid forking processes during compilation <a href="https://github.com/spring-projects/spring-ai/commit/bd7d4cd08e0e8abdf23ba2552dcc827d2210ea2a">bd7d4cd</a>
* Disabled ErrorProne standard checks in the build configuration to address build compatibility issues. <a href="https://github.com/spring-projects/spring-ai/pull/4976" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4976/hovercard">#4976</a>
* Resolved multiple build system issues to improve build reliability and consistency. <a href="https://github.com/spring-projects/spring-ai/commit/3b14b4af7e6e6a6bffad1e320f7f953561781676">3b14b4a</a>
* Updated fast-continuous integration workflow configuration for the 1.1.x branch <a href="https://github.com/spring-projects/spring-ai/commit/dc4b6adba5bbc208fced12fad7890aead71c3524">dc4b6ad</a>
* Integrated ErrorProne static analysis tool with Nullaway for enhanced null safety checking during builds <a href="https://github.com/spring-projects/spring-ai/pull/4903" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4903/hovercard">#4903</a>
* Added Maven toolchains support for improved build consistency across different development environments <a href="https://github.com/spring-projects/spring-ai/commit/d26637b3368774d8cc6ba928e769d17e31098ac3">d26637b</a>
* Incremented version to 2.0.0-SNAPSHOT for next development cycle. <a href="https://github.com/spring-projects/spring-ai/commit/10bc0a7ea241a0851f115830e2a20425d1f33d4e">10bc0a7</a>
* Incremented version to 1.1.1-SNAPSHOT for next development cycle. <a href="https://github.com/spring-projects/spring-ai/commit/99704327bb849e82ee2bde696e84e6c075429012">9970432</a>

🔐 Security

* Overrode protobuf-java version in milvus-store module to address <a title="CVE-2024-7254" data-hovercard-type="advisory" data-hovercard-url="/advisories/GHSA-735f-pc8j-v9w8/hovercard" href="https://github.com/advisories/GHSA-735f-pc8j-v9w8">CVE-2024-7254</a> security vulnerability. <a href="https://github.com/spring-projects/spring-ai/commit/24795ddf3a32d43383171109cba567804e5e52c9">24795dd</a>

🙏 Contributors

Thanks to all the community contributors who made this release possible:

* <a href="https://github.com/academey">academey (@academey)</a>
* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/andy1199">Andy (@andy1199)</a>
* <a href="https://github.com/jiangbaojun">Baojun Jiang (@jiangbaojun)</a>
* <a href="https://github.com/CorgiBoyG">CorgiBoyG (@CorgiBoyG)</a>
* <a href="https://github.com/Kehrlann">Daniel Garnier-Moiroux (@Kehrlann)</a>
* <a href="https://github.com/dafriz">David Frizelle (@dafriz)</a>
* <a href="https://github.com/ddobrin">ddobrin (@ddobrin)</a>
* <a href="https://github.com/bedrin">Dmitry Bedrin (@bedrin)</a>
* <a href="https://github.com/jhuynh1">Jason Huynh (@jhuynh1)</a>
* <a href="https://github.com/dev-jonghoonpark">jonghoon park (@dev-jonghoonpark)</a>
* <a href="https://github.com/jdubois">Julien Dubois (@jdubois)</a>
* <a href="https://github.com/leehaut">lance (@leehaut)</a>
* <a href="https://github.com/parazit-IR">MohammadAli Jalalkamali (@parazit-IR)</a>
* <a href="https://github.com/q-nathangrand">NathanGrand (@q-nathangrand)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/nbreunese">Nils Breunese (@nbreunese)</a>
* <a href="https://github.com/onebywang">oneby-wang (@onebywang)</a>
* <a href="https://github.com/paulbakker">Paul Bakker, Netflix (@paulbakker)</a>
* <a href="https://github.com/roryp">Rory Preddy (@roryp)</a>
* <a href="https://github.com/lsh1215">sanghun (@lsh1215)</a>
* <a href="https://github.com/JGoP-L">shaojie (@JGoP-L)</a>
* <a href="https://github.com/YunKuiLu">YunKui Lu (@YunKuiLu)</a>
* <a href="https://github.com/ybezsonov">Yuriy Bezsonov (@ybezsonov)</a>

