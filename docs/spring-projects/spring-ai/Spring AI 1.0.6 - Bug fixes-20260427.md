# Spring AI 1.0.6 - Bug fixes

## release on 20260427
## description
## changes
Spring AI 1.0.6 Release Notes

🎯 Highlights

This release focuses on stability and security improvements. Key fixes include securing the transformer model cache directory, preventing a potential DoS vulnerability via malformed PDF files, and correcting conversation memory and vector store filter handling. Dependencies are upgraded to Spring Boot 3.5.14.

🪲 Bug Fixes

* The default cache directory for transformer models is now secured with appropriate permissions to prevent unauthorized access to downloaded model files. <a href="https://github.com/spring-projects/spring-ai/commit/4881e0cba76d8c9025dfa88c5ab2c788ee06f8f8">4881e0c</a>
* The CosmosDB vector store's delete method now uses parameterized queries, fixing a potential issue with query construction and improving safety. <a href="https://github.com/spring-projects/spring-ai/commit/b32096e6b25072b1abe1ed542fdd247c987f299f">b32096e</a>
* Fixed a vulnerability where a specially crafted malformed PDF could cause excessive memory allocation, improving resilience against malicious or corrupted documents. <a href="https://github.com/spring-projects/spring-ai/commit/6a12b6fe7ed08581ca1ee7e395b007c4e0f1db04">6a12b6f</a>
* Properly handles the conversationId filter in VectorStoreChatMemoryAdvisor, ensuring chat memory retrieval is correctly scoped to the intended conversation. <a href="https://github.com/spring-projects/spring-ai/commit/1e8135a49a2610e9955569c4eba298d0e47cec0e">1e8135a</a>
* Corrects key handling in the vector store filter expression converter, ensuring filter expressions are properly translated across vector store implementations. <a href="https://github.com/spring-projects/spring-ai/commit/eb763fd1c32b60662b8e79f080d6d1b25b231cee">eb763fd</a>

🔨 Dependency Upgrades

* Updated the Spring Boot dependency to version 3.5.14, incorporating the latest bug fixes and security patches from the Spring Boot project. <a href="https://github.com/spring-projects/spring-ai/commit/aed3b27fef928e00c7631b9905ed9f6b87d70fe8">aed3b27</a>
* Updated Spring Boot dependency to version 3.5.13 as an intermediate upgrade step. <a href="https://github.com/spring-projects/spring-ai/commit/a1d3deea2c626e3bd9dfd15d2c6bf19adbfee7ab">a1d3dee</a>

🔩 Build Updates

* Renamed JdbcChatMemoryRepositorySchemaInitializerPostgresqlTests to follow the standard integration test naming convention, ensuring correct test classification and execution. <a href="https://github.com/spring-projects/spring-ai/pull/5853" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5853/hovercard">#5853</a>

🔐 Security

* A malformed PDF could trigger excessive heap allocation during parsing. This fix adds safeguards to limit character buffer allocation, mitigating potential denial-of-service from crafted documents. <a href="https://github.com/spring-projects/spring-ai/commit/6a12b6fe7ed08581ca1ee7e395b007c4e0f1db04">6a12b6f</a>
* The default cache directory used for storing downloaded transformer models is now created with restricted permissions, reducing the risk of unauthorized access to cached model artifacts. <a href="https://github.com/spring-projects/spring-ai/commit/4881e0cba76d8c9025dfa88c5ab2c788ee06f8f8">4881e0c</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/nicolaskrier">Nicolas Krier (@nicolaskrier)</a>
* <a href="https://github.com/sobychacko">Soby Chacko (@sobychacko)</a>
* <a href="https://github.com/sdeleuze">Sébastien Deleuze (@sdeleuze)</a>

