# Spring AI 1.1.4

## release on 20260326
## description
## changes
Spring AI 1.1.4 Release Notes

🎯 Highlights

This release includes 1 new feature, 11 bug fixes, 1 other improvement.

⭐ New Features

* Added capability to dynamically disable Structured Output Native functionality at runtime, providing more flexibility in configuration and usage scenarios. <a href="https://github.com/spring-projects/spring-ai/commit/45a1607f61b7918bafce2a2b488ed26bcde29866">45a1607</a>

🪲 Bug Fixes

* Resolved issues with Oracle and PgVector vector store integration tests to improve test reliability <a href="https://github.com/spring-projects/spring-ai/commit/56fa3ee3eb16920faa5e3f2fe5bd66751ab0a44c">56fa3ee</a>
* Corrected issue where extraBody parameter was being lost when toolDefinitions were provided in chat requests <a href="https://github.com/spring-projects/spring-ai/commit/d8869611dbcf25d998ec2231516cd668561df2a6">d886961</a>
* Improved stability of Bedrock converse integration tests by addressing flaky test scenarios <a href="https://github.com/spring-projects/spring-ai/commit/fac5647fa67223c693f69f4eebe4419b2fc8147e">fac5647</a>
* Updated Google GenAI embedding model to use current API and fixed flaky function call tests <a href="https://github.com/spring-projects/spring-ai/commit/6c82800779088ed6055d6cdf22f716660e59e401">6c82800</a>
* Resolved issues in Google GenAI text embedding model observation integration tests <a href="https://github.com/spring-projects/spring-ai/commit/650a3435c41e0948a9c93d0990d77fff033f42d1">650a343</a>
* Enhanced error handling and reliability when fetching media resources in Bedrock proxy chat model <a href="https://github.com/spring-projects/spring-ai/commit/a7d3223bc11a010b93fbc40a17fa9b68c52a8118">a7d3223</a>
* Improved filter evaluation logic in SimpleVectorStore for better performance and maintainability <a href="https://github.com/spring-projects/spring-ai/commit/04742fb8914ea963a2a623c6483c6e520aec81c1">04742fb</a>
* Resolved issue where multi-block system messages were not being properly cached in Anthropic prompt caching implementation <a href="https://github.com/spring-projects/spring-ai/commit/11bd45ebd41eb7f427b5e227b538870524db9fbb">11bd45e</a>
* Corrected handling of string values for TAG and TEXT filter types in Redis filter expression converter <a href="https://github.com/spring-projects/spring-ai/commit/707e990c9152aabb9c9226053725efa2ada72223">707e990</a>
* Improved key handling in Neo4j vector store filter expression converter for more accurate filtering <a href="https://github.com/spring-projects/spring-ai/commit/3a46c7dd00e4adc17a132b9438149bde94da244f">3a46c7d</a>
* Resolved issues with identifier parsing logic in FilterExpressionTextParser to ensure correct filter expression handling. <a href="https://github.com/spring-projects/spring-ai/commit/7275cbab28d525cfadd9c6180e20d7a530877bc0">7275cba</a>

🔩 Build Updates

* Corrected issues in the documentation upload GitHub Actions workflow to ensure proper documentation deployment. <a href="https://github.com/spring-projects/spring-ai/commit/f4984b5449f7c15153c75903b76f7d408d47757b">f4984b5</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/andresdiegolanda">Andres (@andresdiegolanda)</a>
* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/filiphr">Filip Hrisafov (@filiphr)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>

