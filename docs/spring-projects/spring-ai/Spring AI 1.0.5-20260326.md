# Spring AI 1.0.5

## release on 20260326
## description
## changes
Spring AI 1.0.5 Release Notes

🎯 Highlights

This release includes 8 bug fixes, 1 other improvement.

🪲 Bug Fixes

* Resolved an issue where the finishReason was not being properly propagated during streaming operations with AWS Bedrock Converse API <a href="https://github.com/spring-projects/spring-ai/commit/9a56ae0c5c3445ffaf8d1b0ca993ba6766aa703e">9a56ae0</a>
* Corrected integration test failures for Oracle and PostgreSQL vector store implementations <a href="https://github.com/spring-projects/spring-ai/commit/d7a0eddbe95112dd14ed1bb37f135a60a2b39578">d7a0edd</a>
* Resolved integration test issues for Ollama model provider <a href="https://github.com/spring-projects/spring-ai/commit/6afaac75b1feb1df766264e5341c7c312b641325">6afaac7</a>
* Corrected string value handling for TAG/TEXT filter values in Redis vector store filter expression converter <a href="https://github.com/spring-projects/spring-ai/commit/6c99d545ef6a8c50def6d193a351723eff021f5c">6c99d54</a>
* Resolved key handling issues in Neo4j vector store filter expression converter <a href="https://github.com/spring-projects/spring-ai/commit/c4297444f060c9b68e82cb3843e0f48d6fac4863">c429744</a>
* Corrected identifier parsing logic in the filter expression text parser for improved query handling <a href="https://github.com/spring-projects/spring-ai/commit/535b7f8fcded9be2d39eb08a9df65104e03012e6">535b7f8</a>
* Enhanced error handling and reliability when fetching media content in AWS Bedrock proxy chat model <a href="https://github.com/spring-projects/spring-ai/commit/9561b4c2a50ebaeee1284ea0faceab92ee5dd251">9561b4c</a>
* Improved filter evaluation logic in SimpleVectorStore for better performance and maintainability <a href="https://github.com/spring-projects/spring-ai/commit/92c5024720187a9934bae7d7e9eae20a48b41033">92c5024</a>

🔩 Build Updates

* Added automated workflow for publishing releases to Maven Central via GitHub Actions <a href="https://github.com/spring-projects/spring-ai/commit/aed79b0b0e7892cfc2b27242ce2ce108df5547e3">aed79b0</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>

