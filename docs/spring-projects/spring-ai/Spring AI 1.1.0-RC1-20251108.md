# Spring AI 1.1.0-RC1

## release on 20251108
## description
## changes
Spring AI 1.1.0-RC1 Release Notes

🎯 Highlights

This release includes 10 new features, 8 bug fixes, 10 documentation improvements, 12 other improvements.

⏪ Breaking Changes

* OpenAI TTS implementation migrated to shared TextToSpeechModel interface with standardized Double type for speed parameter instead of String <a href="https://github.com/spring-projects/spring-ai/commit/2b195b34d337cd8f890c9d0fb1ca85c02c1c9afe">2b195b3</a>
* Removed deprecated APIs in preparation for the 1.1.0 release. Applications using deprecated methods will need to migrate to the newer alternatives. <a href="https://github.com/spring-projects/spring-ai/commit/c63134072deb81b3ac458ac28a6a6debe16f2222">c631340</a>

:warning: Upgrading Notes

* OpenAI TTS users should update to use the new shared TextToSpeechModel interface. Speed parameter now uses Double type instead of String. See TTS migration guide for detailed instructions. <a href="https://github.com/spring-projects/spring-ai/commit/a8d22087d091e4c3eff1d145f0b912599b882694">a8d2208</a>
* Applications using deprecated APIs removed in 1.1.0 must migrate to the newer replacement APIs. Review your codebase for deprecation warnings from 1.0.x releases and update accordingly. <a href="https://github.com/spring-projects/spring-ai/commit/c63134072deb81b3ac458ac28a6a6debe16f2222">c631340</a>

⭐ New Features

* Added support for extraBody and reasoningContent in OpenAI API, enabling advanced model configuration and reasoning chain access <a href="https://github.com/spring-projects/spring-ai/commit/ec717c152d479b966fcf2db6679317f09b5ec6ea">ec717c1</a>
* Added promptCacheKey and safetyIdentifier support for improved caching and safety management <a href="https://github.com/spring-projects/spring-ai/commit/347378aca0cdda5c29d973b11c5db45b53a42d52">347378a</a>
* Automatic retry configuration for network exceptions to improve resilience in distributed environments <a href="https://github.com/spring-projects/spring-ai/commit/c03a4852f28e49952432c9d954b0a0c4b6db3fde">c03a485</a>
* Event-driven tool callback caching for Model Context Protocol integration improves performance and reduces redundant operations <a href="https://github.com/spring-projects/spring-ai/commit/57831042ffa45f43e4dbb2dda3d2494796e6d0e1">5783104</a>
* Refactored Model Context Protocol client annotation handling with unified handler registries for improved maintainability <a href="https://github.com/spring-projects/spring-ai/commit/2a2f1551769b7d56a3cec01ca7e092c345da6dce">2a2f155</a>
* Added MongoDB repository implementation for chat memory persistence, enabling conversation history storage in MongoDB databases. <a href="https://github.com/spring-projects/spring-ai/commit/80527b26fe4a0dab65fc9aed369040114963c1fd">80527b2</a>
* Added thinking mode support for Ollama reasoning models, enabling enhanced reasoning capabilities for compatible models. <a href="https://github.com/spring-projects/spring-ai/commit/0b8293ec969b87e049b806203af25d200d16c044">0b8293e</a>
* Added and updated tests for OpenAI reasoning_effort parameter, enhancing control over reasoning model behavior. <a href="https://github.com/spring-projects/spring-ai/commit/e1577751d7d5284a5115f2f034ef22a59f76644c">e157775</a>
* Enhanced BeanOutputConverter to support removing thinking tags from input text, improving structured output parsing <a href="https://github.com/spring-projects/spring-ai/commit/d1aa8d46c9bb5abc45b7db197719e35e24c12390">d1aa8d4</a>

🪲 Bug Fixes

* Fixed OllamaApiIT#streamingChat integration test <a href="https://github.com/spring-projects/spring-ai/commit/47e4232568a1fccb730335c340cac7279d3827a6">47e4232</a>
* Resolved configuration injection issue where VertexAiEmbeddingConnectionDetails was not properly injected when using the Vertex AI embedding starter <a href="https://github.com/spring-projects/spring-ai/commit/9de35929ce91944fa794c905edc4bde0eee45ff4">9de3592</a>
* Improved embedding dimension handling by implementing lazy loading for unknown dimensions and caching results for better performance <a href="https://github.com/spring-projects/spring-ai/commit/a8b3982ef66474f3f86fbf7a6475b5d99e54b025">a8b3982</a>
* Corrected the configuration property prefix in OpenAI Text-to-Speech documentation <a href="https://github.com/spring-projects/spring-ai/commit/992a02fab6d3d27dbc320bee9a97ff2e65570fb8">992a02f</a>
* Resolved authentication issues with the Chroma vector database API <a href="https://github.com/spring-projects/spring-ai/commit/0abfedf09742564d884e16aa25fc5282efda2a77">0abfedf</a>
* Enhanced error logging to include exception details when tool execution fails, improving debugging capabilities <a href="https://github.com/spring-projects/spring-ai/commit/c5ce4bed3558b71388fd1733537aa2531ddf1303">c5ce4be</a>
* Updated MCP integration tests to properly include McpServerObjectMapperAutoConfiguration <a href="https://github.com/spring-projects/spring-ai/commit/7529a214e8bde035315d581e74a7df374cb171d9">7529a21</a>
* Improved MCP server configuration by simplifying ObjectMapper dependency injection <a href="https://github.com/spring-projects/spring-ai/commit/6d9b8e65ac3786ed7f4df0f303806fc38550bdd9">6d9b8e6</a>

📓 Documentation

* Documented reasoning content support for Ollama via OpenAI compatibility mode <a href="https://github.com/spring-projects/spring-ai/commit/e6739359d9d1c5adfcec9d6aa17cbae390ac4d2b">e673935</a>
* Added documentation for extraBody, reasoningContent, promptCacheKey, and safetyIdentifier features <a href="https://github.com/spring-projects/spring-ai/commit/347378aca0cdda5c29d973b11c5db45b53a42d52">347378a</a>
* Added Text-to-Speech migration guide for 1.1.0-RC1 release <a href="https://github.com/spring-projects/spring-ai/commit/a8d22087d091e4c3eff1d145f0b912599b882694">a8d2208</a>
* Added documentation for configuring Model Context Protocol (MCP) with STDIO on Windows systems <a href="https://github.com/spring-projects/spring-ai/commit/e4642663c87dd90f338359d01d96b79543147efc">e464266</a>
* Corrected Javadoc documentation for ZhiPuAiImageApi <a href="https://github.com/spring-projects/spring-ai/commit/cb6afde129c7ab54074082699d5bad5bc6149a1a">cb6afde</a>
* Improved advisor documentation and type usage for better clarity and consistency <a href="https://github.com/spring-projects/spring-ai/commit/266401ece29e44c97b15ed3eaa3b86aaabc0750f">266401e</a>
* Corrected formatting issues in Pinecone vector database documentation <a href="https://github.com/spring-projects/spring-ai/commit/690f400842b9e605f34b1be1f82646928987c4ee">690f400</a>
* Corrected the MCP Java SDK URL in documentation <a href="https://github.com/spring-projects/spring-ai/pull/4795" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4795/hovercard">#4795</a>
* Corrected example configuration for MCP server properties <a href="https://github.com/spring-projects/spring-ai/commit/fb66626251175bee8b8e1c4a06fd1b1b834a7f78">fb66626</a>
* Corrected various typos throughout the documentation <a href="https://github.com/spring-projects/spring-ai/commit/6e74b00b53ab60fb623dd749ec17d5fe48c40b68">6e74b00</a>

🔨 Dependency Upgrades

* Updated AWS Bedrock Runtime and AWS SDK dependencies to version 2.36.3 <a href="https://github.com/spring-projects/spring-ai/pull/4806" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4806/hovercard">#4806</a>

⚡ Performance

* Event-driven caching mechanism for MCP tool callbacks reduces redundant operations and improves response times <a href="https://github.com/spring-projects/spring-ai/commit/57831042ffa45f43e4dbb2dda3d2494796e6d0e1">5783104</a>

🔩 Build Updates

* Introduced new fast-continuous-integration workflow with parallel build execution, replacing the legacy continuous-integration workflow for faster PR validation. <a href="https://github.com/spring-projects/spring-ai/commit/7112eeb1747089819589507dd72c1d7dd9756e1a">7112eeb</a>
* Multiple improvements to the fast-continuous-integration workflow including YAML syntax fixes, scheduled trigger enablement, and parallel execution support for rapid PR merges. <a href="https://github.com/spring-projects/spring-ai/commit/e928ca9a93a88be08670ada3f116bb208ebbdbbf">e928ca9</a>
* Updated Maven build configuration to run format:apply during local development and format:check in CI pipelines <a href="https://github.com/spring-projects/spring-ai/commit/fb523c8fd1713551682e2e71ddd6b09fd66043d4">fb523c8</a>
* Enhanced test coverage for MCP server ObjectMapper auto-configuration <a href="https://github.com/spring-projects/spring-ai/commit/9b0eaf261f22a3798dd683491c6cf0325e5d53be">9b0eaf2</a>
* Improved test structure by consolidating AutoConfiguration tests to use a centralized SpringAiTestAutoConfigurations approach <a href="https://github.com/spring-projects/spring-ai/commit/4532f64868792869eb2158968102e7add5c40eda">4532f64</a>
* Temporarily disabled unstable integration test for OpenAI chat model stream web search annotations <a href="https://github.com/spring-projects/spring-ai/commit/355b88367c63909313a3061d479dd45e8c4d68c0">355b883</a>
* Corrected the description in the GitHub Actions workflow for Maven publishing <a href="https://github.com/spring-projects/spring-ai/commit/bd1834d57319f6396e61839370154ad51abb0387">bd1834d</a>
* Prevented the spring-ai-integration-tests artifact from being published to Maven Central <a href="https://github.com/spring-projects/spring-ai/commit/531a695bb4a20542e46e4cba437a71f6b0e5a6fe">531a695</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/Kehrlann">Daniel Garnier-Moiroux (@Kehrlann)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/guanxuc">guanxu (@guanxuc)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/ielatif">Issam El-atif (@ielatif)</a>
* <a href="https://github.com/jamesward">James Ward (@jamesward)</a>
* <a href="https://github.com/liugddx">liugddx (@liugddx)</a>
* <a href="https://github.com/markpollack">Mark Pollack (@markpollack)</a>
* <a href="https://github.com/mkjensen">Martin Kamp Jensen (@mkjensen)</a>
* <a href="https://github.com/nguyen.trantrung">Nguyen Tran (Mark) (@nguyen.trantrung)</a>
* <a href="https://github.com/philipithomas">Philip I. Thomas (@philipithomas)</a>
* <a href="https://github.com/SenreySong">Senrey_Song (@SenreySong)</a>
* <a href="https://github.com/thjanssen">Thorben Janssen (@thjanssen)</a>
* <a href="https://github.com/ngocnhan-tran1996">Tran Ngoc Nhan (@ngocnhan-tran1996)</a>
* <a href="https://github.com/vdm24">vdm24 (@vdm24)</a>
* <a href="https://github.com/viacheslav-dobrynin">Viacheslav Dobrynin (@viacheslav-dobrynin)</a>
* <a href="https://github.com/jamespud">Wenli Tian (@jamespud)</a>
* <a href="https://github.com/quaff">Yanming Zhou (@quaff)</a>
* <a href="https://github.com/deejay1">Łukasz Jernaś (@deejay1)</a>

