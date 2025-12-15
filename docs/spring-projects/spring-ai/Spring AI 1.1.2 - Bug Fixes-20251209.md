# Spring AI 1.1.2 - Bug Fixes

## release on 20251209
## description
## changes
Spring AI 1.1.2 Release Notes

🎯 Highlights

This patch release focuses on bug fixes, security improvements and dependency management. It includes a bug fix to make Spring AI 1.1.x still compatible with Kotlin 1.9.x, a security fix for the Milvus vector store addressing <a title="CVE-2024-7254" data-hovercard-type="advisory" data-hovercard-url="/advisories/GHSA-735f-pc8j-v9w8/hovercard" href="https://github.com/advisories/GHSA-735f-pc8j-v9w8">CVE-2024-7254</a>, updates to MCP (Model Context Protocol) dependencies, and a new hook in the ToolCallAdvisor for enhanced tool calling workflows.

⭐ New Features

* Introduces a new hook method in ToolCallAdvisor that allows customization of the finalization loop in tool call workflows, providing better extensibility for advanced tool calling scenarios <a href="https://github.com/spring-projects/spring-ai/commit/05254e75399f4fef2de2db1decb389d329bb60ae">05254e7</a>

🪲 Bug Fixes

* Cleaned up duplicate dependency declaration for Azure Identity library, improving build consistency <a href="https://github.com/spring-projects/spring-ai/commit/db7d44d123fd98cd6f320865f9e232726068dcfe">db7d44d</a>

🔨 Dependency Upgrades

* Upgraded Model Context Protocol (MCP) JDK and MCP annotations from snapshot versions to stable releases, improving stability and compatibility <a href="https://github.com/spring-projects/spring-ai/commit/4cfe9fabc709a39ad68dae84ed8e3b0a8ae87160">4cfe9fa</a>

🔩 Build Updates

* Updated build configuration to require exact Java 21 version for the 1.1.x release branch, ensuring consistent build environment <a href="https://github.com/spring-projects/spring-ai/commit/d56300784b1a21d4cebe9004d0f7a2888e4e556d">d563007</a>

🔐 Security

* Overrode protobuf-java version in milvus-store dependency to address security vulnerability <a title="CVE-2024-7254" data-hovercard-type="advisory" data-hovercard-url="/advisories/GHSA-735f-pc8j-v9w8/hovercard" href="https://github.com/advisories/GHSA-735f-pc8j-v9w8">CVE-2024-7254</a> <a href="https://github.com/spring-projects/spring-ai/commit/65b6c7d74950b5f1eda1cead3a9ccd38dc3fec0d">65b6c7d</a>

🙏 Contributors

Thanks to all contributors who made this release possible:

* <a href="https://github.com/tzolov">Christian Tzolov (@tzolov)</a>
* <a href="https://github.com/ericbottard">Eric Bottard (@ericbottard)</a>
* <a href="https://github.com/ilayaperumalg">Ilayaperumal Gopinathan (@ilayaperumalg)</a>
* <a href="https://github.com/jdubois">Julien Dubois (@jdubois)</a>
* <a href="https://github.com/roryp">Rory Preddy (@roryp)</a>

