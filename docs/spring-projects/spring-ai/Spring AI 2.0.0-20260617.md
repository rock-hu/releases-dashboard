# Spring AI 2.0.0

## release on 20260617
## description
## changes
For upgrading from 1.1.x to 2.0.0, please refer to the upgrade notes <a href="https://docs.spring.io/spring-ai/reference/upgrade-notes.html" rel="nofollow">here</a>.

For the detailed reference documentation on 2.0.0, please refer <a href="https://docs.spring.io/spring-ai/reference/index.html" rel="nofollow">here</a>

⭐ New Features

* Update Google GenAI models <a href="https://github.com/spring-projects/spring-ai/issues/6406" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6406/hovercard">#6406</a>
* Use only Jackson 2 in <code>OpenAiChatModel</code> <a href="https://github.com/spring-projects/spring-ai/pull/6392" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6392/hovercard">#6392</a>
* Make <code>org.springframework.ai.image.observation</code> null-marked <a href="https://github.com/spring-projects/spring-ai/issues/6388" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6388/hovercard">#6388</a>
* Polish <code>Prompt</code> <a href="https://github.com/spring-projects/spring-ai/issues/6387" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6387/hovercard">#6387</a>
* Preserve OpenAI tool call additional properties <a href="https://github.com/spring-projects/spring-ai/pull/6365" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6365/hovercard">#6365</a>

🐞 Bug Fixes

* Filter unsupported tool messages in <code>CassandraChatMemoryRepository</code> <a href="https://github.com/spring-projects/spring-ai/pull/6400" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6400/hovercard">#6400</a>
* Filter unsupported tool messages in <code>MongoChatMemoryRepository</code> <a href="https://github.com/spring-projects/spring-ai/pull/6399" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6399/hovercard">#6399</a>
* Filter unsupported tool messages in <code>JdbcChatMemoryRepository</code> <a href="https://github.com/spring-projects/spring-ai/pull/6398" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6398/hovercard">#6398</a>
* Remove <code>streamToolCallResponses</code> from advisor builders <a href="https://github.com/spring-projects/spring-ai/pull/6391" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6391/hovercard">#6391</a>
* Add missing <code>promptCacheKey</code> parameter in <code>OpenAiChatOptions</code> <a href="https://github.com/spring-projects/spring-ai/pull/6380" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6380/hovercard">#6380</a>

📔 Documentation

* Update reference docs to reflect 2.0 API changes <a href="https://github.com/spring-projects/spring-ai/pull/6405" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6405/hovercard">#6405</a>
* Add more guides <a href="https://github.com/spring-projects/spring-ai/issues/6401" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6401/hovercard">#6401</a>
* Introduce <code>CLAUDE.md</code> and <code>AGENTS.md</code> <a href="https://github.com/spring-projects/spring-ai/issues/6376" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6376/hovercard">#6376</a>
* Consolidate upgrade notes for 2.0.0 <a href="https://github.com/spring-projects/spring-ai/pull/6333" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6333/hovercard">#6333</a>

🔨 Dependency Upgrades

* Upgrade to MCP SDK 2.0.0 <a href="https://github.com/spring-projects/spring-ai/issues/6385" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6385/hovercard">#6385</a>
* Upgrade to Spring Boot 4.1.0 <a href="https://github.com/spring-projects/spring-ai/issues/6329" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6329/hovercard">#6329</a>

❤️ Contributors

Thank you to all the contributors who worked on this release:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ericbottard/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ericbottard">@ericbottard</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/guanxuc/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/guanxuc">@guanxuc</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ilayaperumalg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ilayaperumalg">@ilayaperumalg</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sdeleuze/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sdeleuze">@sdeleuze</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sdudzin/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sdudzin">@sdudzin</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/tzolov/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/tzolov">@tzolov</a>, and <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ultramancode/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ultramancode">@ultramancode</a>

