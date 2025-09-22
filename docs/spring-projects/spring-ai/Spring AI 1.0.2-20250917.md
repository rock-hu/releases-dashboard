# Spring AI 1.0.2

## release on 20250917
## description
## changes
Spring AI 1.0.2 Release Notes

🎯 Highlights

This release includes 9 new features, 31 bug fixes, 13 documentation improvements, 4 dependency upgrades, 4 performance improvements, and 15 build updates.

📢 Noteworthy

* Removed deprecated Mistral AI Codestral Mamba model support as part of code cleanup efforts <a href="https://github.com/spring-projects/spring-ai/pull/4225" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4225/hovercard">#4225</a>
* Changed UserMessage to use <code>metadata</code> property instead of <code>properties</code> for better consistency across the API <a href="https://github.com/spring-projects/spring-ai/pull/3980" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3980/hovercard">#3980</a>

⭐ New Features

* Added 'enable' configuration properties for Amazon Bedrock Cohere chat functionality <a href="https://github.com/spring-projects/spring-ai/commit/779b3042c23c3802743d740eb72927f141efa5c4">779b304</a>
* Improved Unicode property union support for better Chinese character handling in text processing <a href="https://github.com/spring-projects/spring-ai/commit/35df129a47393b9d8a1dfaf040db697d7aee7657">35df129</a>
* Added mutual exclusivity validation between maxTokens and maxCompletionTokens parameters to prevent configuration conflicts <a href="https://github.com/spring-projects/spring-ai/commit/5496a8c07327758a0228caddf98a011f72f3798a">5496a8c</a>
* Added support for GPT-5 models from OpenAI, expanding the available model options for Spring AI applications <a href="https://github.com/spring-projects/spring-ai/commit/977dbf2544997ccf63bded7b33131b215ce5c0ee">977dbf2</a>
* Added comprehensive debugging capabilities to maintenance workflow to improve troubleshooting and monitoring <a href="https://github.com/spring-projects/spring-ai/commit/51086f8a091635fef92f022f47c7c54105afad09">51086f8</a>
* Added GPT-5 model enum support with updated documentation to enable integration with OpenAI's latest model <a href="https://github.com/spring-projects/spring-ai/commit/99080737da6be04d7a64045bf60e3e240a07363c">9908073</a>
* Implemented fast CI build support for maintenance branch cherry-picks to improve development workflow efficiency <a href="https://github.com/spring-projects/spring-ai/commit/22efc030106102ca4e6c22018d121dd393c6bb52">22efc03</a>
* Enables proper JSON schema generation for Kotlin data classes and objects in BeanOutputConverter <a href="https://github.com/spring-projects/spring-ai/pull/3900" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3900/hovercard">#3900</a>
* MariaDB Vector Store similarity searches now provide scores for better result ranking <a href="https://github.com/spring-projects/spring-ai/commit/3d72e93cb3da075356060717e151dd8db6706eb3">3d72e93</a>

🪲 Bug Fixes

* Fixed tokenizer to properly use Base64 encoding for binary data token estimation <a href="https://github.com/spring-projects/spring-ai/commit/c60d9425c798cd06bcf6056bd7cccc7e0c1d3802">c60d942</a>
* Corrected function name in VertexAI Gemini streaming test to resolve test failures <a href="https://github.com/spring-projects/spring-ai/commit/407e4cbdf8e522f021550eaf3a4dbc2ce1ed91be">407e4cb</a>
* Resolved issues with default implementation of ToolCallback#call(String,ToolContext) method <a href="https://github.com/spring-projects/spring-ai/commit/76708a16d8db9c9ab9480cc227bebbc88455ab1f">76708a1</a>
* Properly handle null or empty tool call arguments during streaming operations <a href="https://github.com/spring-projects/spring-ai/commit/8d0caf4f72cc013d6c8d71ff48eeecc0d129ec56">8d0caf4</a>
* Cleaned up incorrect BedrockChatOptions configuration that was causing issues <a href="https://github.com/spring-projects/spring-ai/commit/5ecbfabc8c84c9746f63dd4fe316eeb8f463ee1c">5ecbfab</a>
* Fixed issue with merging tool calling chat options in AWS Bedrock converse chat model <a href="https://github.com/spring-projects/spring-ai/pull/4314" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4314/hovercard">#4314</a>
* Resolved message reordering issues in Azure OpenAI chat model implementation <a href="https://github.com/spring-projects/spring-ai/commit/618c45186b6ced520c19373ac3041bb030f603b7">618c451</a>
* Fixed various integration test failures for Anthropic function calling functionality <a href="https://github.com/spring-projects/spring-ai/commit/3f97d9e2af1479ff50ddd2bec54dae6d89bb7506">3f97d9e</a>
* Corrected stream function call usage test failures in Azure OpenAI integration <a href="https://github.com/spring-projects/spring-ai/commit/ec84f2a2105f2e84e9edad5c684eb111d2cb79cd">ec84f2a</a>
* Fixed chat completion stream error handling in Anthropic API integration tests <a href="https://github.com/spring-projects/spring-ai/commit/38afc123115cfb6c055d1f1b34a3207391dbef6b">38afc12</a>
* Replaced SimpleDateFormat with thread-safe DateTimeFormatter to prevent potential concurrency issues <a href="https://github.com/spring-projects/spring-ai/commit/370efa7663e280439443bab7dd43beb26b1b2d5e">370efa7</a>
* Removed duplicate lines in AzureOpenAiChatOptions configuration class <a href="https://github.com/spring-projects/spring-ai/commit/5477f47c122594b21ee5492e6f0fec1c6836b92a">5477f47</a>
* Resolved a StackOverflowError that was introduced by the MongoDbAtlasLocalContainerConnectionDetails.getSslBundle() method <a href="https://github.com/spring-projects/spring-ai/commit/03d475e03fe8fd9850547877ae88e745c2891679">03d475e</a>
* Corrected NPE that occurred when metadata is null in MilvusVectorStore operations <a href="https://github.com/spring-projects/spring-ai/commit/7437192a66b1d5550105a0186d8ce7ea886810cd">7437192</a>
* Fixed incorrect handling of merge operations when the 'current' value is null <a href="https://github.com/spring-projects/spring-ai/commit/4daffa328a536ef34e45d6bdce6c0f83a77b4b67">4daffa3</a>
* Fixed metadata handling in Azure Vector Store to allow proper mutation of metadata objects <a href="https://github.com/spring-projects/spring-ai/commit/2a7321fb0b76f585d9eea22a697c461be3829e08">2a7321f</a>
* Resolved flaky test that was causing intermittent failures in streaming response aggregation <a href="https://github.com/spring-projects/spring-ai/commit/f71f9de7e62d54d1d9dffea2eb0fefa451a1a864">f71f9de</a>
* Corrected handling of empty string values in OpenAI streaming finish_reason field <a href="https://github.com/spring-projects/spring-ai/commit/90a88ec276e30299f0977ca24bb22a7af53abeed">90a88ec</a>
* Resolved git state detection problems that were triggering full project builds when they weren't needed <a href="https://github.com/spring-projects/spring-ai/commit/779e2f914fbf7442f8451d8029a3ecc9cc2d46a6">779e2f9</a>
* Updated logging output to accurately reflect the actual git strategy being used <a href="https://github.com/spring-projects/spring-ai/commit/e8c75e41f6a2941127e2ca99cbf86d56a59833d6">e8c75e4</a>
* Fixed branch detection to prioritize maintenance branch identification over explicit base_ref <a href="https://github.com/spring-projects/spring-ai/commit/7ad9a165e48165c790fc51a5534a04e11261d791">7ad9a16</a>
* Fixed retry mechanism for ResourceAccessException when encountering network connectivity errors to improve application resilience <a href="https://github.com/spring-projects/spring-ai/pull/4094" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4094/hovercard">#4094</a>
* Enhanced null safety by using Optional to check null values and prevent NPE occurrences across multiple components <a href="https://github.com/spring-projects/spring-ai/pull/4063" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4063/hovercard">#4063</a> and <a href="https://github.com/spring-projects/spring-ai/pull/4064" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4064/hovercard">#4064</a>
* Implemented fail-fast fallback and single-commit git diff strategy to improve error handling and performance <a href="https://github.com/spring-projects/spring-ai/commit/118c0aba08dd2b4263a34af9c6b65518cf3562fc">118c0ab</a>
* Maintains consistent pass check behavior for FactCheckingEvaluator and RelevancyEvaluator while preventing null pointer exceptions <a href="https://github.com/spring-projects/spring-ai/pull/3975" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3975/hovercard">#3975</a>
* Fixes Azure chat completions by adding support for the strict option in JSON schema response format <a href="https://github.com/spring-projects/spring-ai/pull/3931" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3931/hovercard">#3931</a>
* Eliminates unnecessary deserialization step when parsing model responses that are already JSON strings <a href="https://github.com/spring-projects/spring-ai/pull/4003" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4003/hovercard">#4003</a>
* Properly rethrows ToolExecutionException for non-RuntimeException cases to maintain correct error propagation <a href="https://github.com/spring-projects/spring-ai/pull/3915" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3915/hovercard">#3915</a>
* Tool function exceptions are now wrapped in ToolExecutionException and properly rethrown for better error handling and debugging <a href="https://github.com/spring-projects/spring-ai/commit/cc11b01364a59ed92dd806f927a3a6af25420431">cc11b01</a>
* Corrected bug in example code that was causing confusion for developers following the documentation <a href="https://github.com/spring-projects/spring-ai/pull/3993" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3993/hovercard">#3993</a>
* Fixed issues preventing proper publication of artifacts to Maven Central repository <a href="https://github.com/spring-projects/spring-ai/commit/808f7da8cfdd8348abc6b098fb363d08e849628b">808f7da</a>

📓 Documentation

* Enhanced Mistral AI javadoc and updated documentation links for better developer experience <a href="https://github.com/spring-projects/spring-ai/pull/4327" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4327/hovercard">#4327</a>
* Updated tools.adoc documentation with improved examples and clarifications <a href="https://github.com/spring-projects/spring-ai/pull/4278" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4278/hovercard">#4278</a>
* Enhanced docker services documentation with better setup instructions and examples <a href="https://github.com/spring-projects/spring-ai/commit/0649db5feb1417c093682f321693f4dc46bfe707">0649db5</a>
* Added more detailed explanations and examples in observability documentation for better understanding of metrics configuration <a href="https://github.com/spring-projects/spring-ai/commit/6f615629199fcf62300633f0cce83e1ef218fbb2">6f61562</a>
* Added thorough validation and functionality tests for the Document class to improve code reliability <a href="https://github.com/spring-projects/spring-ai/commit/5c2ab36012fa24f4c5536803995b948efe5b720b">5c2ab36</a>
* Synchronized documentation improvements for deploy docs dispatcher naming to the 1.0.x branch <a href="https://github.com/spring-projects/spring-ai/commit/f11a516367744ca1469bd10d304837cc6b421e07">f11a516</a>
* Added new Anthropic model names to documentation to reflect latest available models and improve developer guidance <a href="https://github.com/spring-projects/spring-ai/pull/4077" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4077/hovercard">#4077</a>
* Improved documentation for chat memory functionality with updated examples and usage patterns <a href="https://github.com/spring-projects/spring-ai/pull/3917" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3917/hovercard">#3917</a>
* Corrected and updated various outdated information across documentation <a href="https://github.com/spring-projects/spring-ai/commit/9252d4e0501af64ae950c353f771ea5b198a9c93">9252d4e</a>
* Added reference documentation for the new similarity score feature in MariaDBVectorStore <a href="https://github.com/spring-projects/spring-ai/commit/e832061c9b05b689c09468a21a61f87e7f7b207f">e832061</a>
* Improved clarity and accuracy of MCP Client section documentation and inline comments <a href="https://github.com/spring-projects/spring-ai/commit/5019d4f12e5aa517ec73cfd45b83957e1348b7e3">5019d4f</a>
* Enhanced documentation detailing ChromaDB configuration options for Chroma Cloud integration <a href="https://github.com/spring-projects/spring-ai/pull/4008" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4008/hovercard">#4008</a>
* Enhanced documentation for the call() method in chatclient.adoc with clearer examples and explanations <a href="https://github.com/spring-projects/spring-ai/pull/3963" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3963/hovercard">#3963</a>

🔨 Dependency Upgrades

* Changed hsqldb dependency scope from runtime to test in chat memory repository JDBC autoconfiguration <a href="https://github.com/spring-projects/spring-ai/pull/4366" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4366/hovercard">#4366</a>
* Updated io.swagger.core.v3:swagger-annotations from version 2.2.25 to 2.2.30 <a href="https://github.com/spring-projects/spring-ai/commit/3c81b42261c6c7589a3bb22dd0c880ace7d3e4da">3c81b42</a>
* Upgraded Ollama API integration to the latest version for improved compatibility and features <a href="https://github.com/spring-projects/spring-ai/commit/ad689b15e869464366a2fcd7818e034fc59a54ca">ad689b1</a>
* Upgraded PostgreSQL JDBC driver from version 42.7.5 to 42.7.7 for improved stability and security <a href="https://github.com/spring-projects/spring-ai/pull/3934" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/3934/hovercard">#3934</a>

⚡ Performance

* Optimized JdbcChatMemoryRepositoryDialect#from method for better performance and removed redundant try-catch blocks <a href="https://github.com/spring-projects/spring-ai/pull/4288" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4288/hovercard">#4288</a>
* Further optimizations to JdbcChatMemoryRepositoryDialect#from method implementation <a href="https://github.com/spring-projects/spring-ai/commit/7b6ac15ee0e67aa258d23a08f5c0a3ba46bac284">7b6ac15</a>
* Reduced build scope and suppressed unnecessary Docker and Maven logging output for cleaner builds <a href="https://github.com/spring-projects/spring-ai/commit/55e23e67c8d9c9c6290b2dc9a7a5af0d6cf968fb">55e23e6</a>
* Eliminates one deserialization step in the majority of scenarios when parsing model responses, improving performance <a href="https://github.com/spring-projects/spring-ai/pull/4003" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/4003/hovercard">#4003</a>

🔩 Build Updates

* Temporarily disabled skip-build logic to restore continuous integration and deployment functionality <a href="https://github.com/spring-projects/spring-ai/commit/fa4d6d62d640aa108fc2b77e59bab96dd5e8b969">fa4d6d6</a>
* Updated tests and documentation to use DockerModelRunnerContainer for improved test reliability <a href="https://github.com/spring-projects/spring-ai/commit/846eb4d74dc6f2ad4496269497b2da7868098119">846eb4d</a>
* Enhanced build efficiency by skipping builds when no new commits exist, reducing unnecessary resource usage <a href="https://github.com/spring-projects/spring-ai/commit/0b8ddfc82281b7649995941289576f9111f74aa7">0b8ddfc</a>
* Fixed test discovery logic to never return root module in fast builds, improving build reliability <a href="https://github.com/spring-projects/spring-ai/commit/b9309d64b07bc9caf91d412e030b0f7169474405">b9309d6</a>
* Fixed GitHub Actions run names to properly display commit information instead of invalid function calls <a href="https://github.com/spring-projects/spring-ai/commit/b2ec97dcdb84196a16cbdf982e287fe1505a42a4">b2ec97d</a>
* Updated maintenance-fast.yml to test only affected modules, improving CI efficiency <a href="https://github.com/spring-projects/spring-ai/commit/dada526e4f237a254df47e0c41058b9d06464796">dada526</a>
* Synchronized continuous-integration.yml with main branch improvements for better CI consistency <a href="https://github.com/spring-projects/spring-ai/commit/c22e9d32901e265921cd661db8fb74fb5927fbfc">c22e9d3</a>
* Backported fast build improvements from main branch and completed missing improvements to maintenance-fast.yml <a href="https://github.com/spring-projects/spring-ai/commit/995efef334b87fe618e9dbe2ce82a351e20c4c99">995efef</a>
* Removed duplicate CI/CD workflows triggered by cherry-pick commits to improve efficiency <a href="https://github.com/spring-projects/spring-ai/commit/7de2d5a97baea719bf442058efe90a711074ada6">7de2d5a</a>
* Added path exclusions to maintenance branch builds to prevent unnecessary CI/CD runs <a href="https://github.com/spring-projects/spring-ai/commit/67cebeac4b9a8bb136badf36b7b1b8c0f2e14863">67cebea</a>
* Reduced CI/CD redundancy by implementing more restrictive build triggers <a href="https://github.com/spring-projects/spring-ai/commit/6e3eedb840558377f1d139d4d85f22a4fbc07d83">6e3eedb</a>
* Completed testing and validation of the optimized maintenance workflow system <a href="https://github.com/spring-projects/spring-ai/commit/f81a2f6897d718fc7951ef73bc0ae76fdebdebe1">f81a2f6</a>
* Updated .gitignore to exclude <strong>pycache</strong> directories from version control <a href="https://github.com/spring-projects/spring-ai/commit/2a9654a714663a69a7795f4b2edb00ef26751eaa">2a9654a</a>
* Removed debug System.out.println statements from QuestionAnswerAdvisorTests for cleaner test output <a href="https://github.com/spring-projects/spring-ai/commit/abd07b92c43f9cfc7c4355229d81804234c41795">abd07b9</a>
* Updated development version to 1.0.2-SNAPSHOT for next development cycle <a href="https://github.com/spring-projects/spring-ai/commit/469ca5447f2538c7cd88beca40193e6d5daf4b1c">469ca54</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/apappascs">Alexandros Pappas (@apappascs)</a>
* <a href="https://github.com/alan.wang">asw12 (@alan.wang)</a>
* <a href="https://github.com/Claudio-code">Claudio Silva Junior (@Claudio-code)</a>
* <a href="https://github.com/dafriz">David Frizelle (@dafriz)</a>
* <a href="https://github.com/dmitry.sulman">Dmitry Sulman (@dmitry.sulman)</a>
* <a href="https://github.com/eddu.melendez">Eddú Meléndez (@eddu.melendez)</a>
* <a href="https://github.com/FlorainB">Florian Beek (@FlorainB)</a>
* <a href="https://github.com/garethjevans">Gareth Evans (@garethjevans)</a>
* <a href="https://github.com/ahc70032">heechann (@ahc70032)</a>
* <a href="https://github.com/huidong.yin247203">huidong.yin (@huidong.yin247203)</a>
* <a href="https://github.com/haerizian10">Hyeri1ee (@haerizian10)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/jinlee1703">Jinwoo Lee (@jinlee1703)</a>
* <a href="https://github.com/joshlong">Josh Long (@joshlong)</a>
* <a href="https://github.com/l-trotta">Laura Trotta (@l-trotta)</a>
* <a href="https://github.com/lawrencepbr">Lawrence Peng (@lawrencepbr)</a>
* <a href="https://github.com/lpy569">Lilt (@lpy569)</a>
* <a href="https://github.com/eeaters">Link (@eeaters)</a>
* <a href="https://github.com/little-huang">little_huang (@little-huang)</a>
* <a href="https://github.com/markpollack">Mark Pollack (@markpollack)</a>
* <a href="https://github.com/2663479778">Mengqi Xu (@2663479778)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/alexanderklmn">Oleksandr Klymenko (@alexanderklmn)</a>
* <a href="https://github.com/Hiosdra">Oskar Drozda (@Hiosdra)</a>
* <a href="https://github.com/mail">Philip I. Thomas (@mail)</a>
* <a href="https://github.com/robinmayerhofer">robinmayerhofer (@robinmayerhofer)</a>
* <a href="https://github.com/0411tjdals34">seongm1n (@0411tjdals34)</a>
* <a href="https://github.com/soby.chacko">Soby Chacko (@soby.chacko)</a>
* <a href="https://github.com/sunyuhan1998">Sun Yuhan (@sunyuhan1998)</a>
* <a href="https://github.com/ThomasVitale">Thomas Vitale (@ThomasVitale)</a>
* <a href="https://github.com/tilman">Tilman Holube (@tilman)</a>
* <a href="https://github.com/1414714930">tongda (@1414714930)</a>
* <a href="https://github.com/quachhengtony">Tony Quach (@quachhengtony)</a>
* <a href="https://github.com/makingx">Toshiaki Maki (@makingx)</a>
* <a href="https://github.com/matpat17">wilocu (@matpat17)</a>
* <a href="https://github.com/2571425925">Yang Li (@2571425925)</a>
* <a href="https://github.com/zhouyanming">Yanming Zhou (@zhouyanming)</a>
* <a href="https://github.com/luyunkui95">YunKui Lu (@luyunkui95)</a>

