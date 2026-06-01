# Spring AI 2.0.0-M8

## release on 20260527
## description
## changes
⭐ New Features

* Use dash-separated convention for Spring Boot properties <a href="https://github.com/spring-projects/spring-ai/pull/6186" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/6186/hovercard">#6186</a>
* Make <code>ChatOptions#mutate</code> overrides return type specific <a href="https://github.com/spring-projects/spring-ai/issues/6127" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6127/hovercard">#6127</a>
* Exclude <code>jackson-dataformat-yaml</code> from <code>json-schema-validator</code> <a href="https://github.com/spring-projects/spring-ai/issues/6090" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6090/hovercard">#6090</a>
* Improve MistralAiApi Jackson mapping for message content <a href="https://github.com/spring-projects/spring-ai/pull/5585" data-hovercard-type="pull_request" data-hovercard-url="/spring-projects/spring-ai/pull/5585/hovercard">#5585</a>

🐞 Bug Fixes

* <code>spring-ai-starter-model-google-genai</code> incorrectly declares dependency on <code>spring-ai-google-genai-embedding</code> <a href="https://github.com/spring-projects/spring-ai/issues/6171" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6171/hovercard">#6171</a>
* spring-ai-starter-vector-store-pgvector doesn't work without spring-boot-starter-jdbc <a href="https://github.com/spring-projects/spring-ai/issues/6164" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6164/hovercard">#6164</a>
* 2.0.0-M7 forces API key requirement, breaking cookie/session-based authentication <a href="https://github.com/spring-projects/spring-ai/issues/6150" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6150/hovercard">#6150</a>
* Fix regression on transitive auto-configuration dependencies <a href="https://github.com/spring-projects/spring-ai/issues/6138" data-hovercard-type="issue" data-hovercard-url="/spring-projects/spring-ai/issues/6138/hovercard">#6138</a>

❤️ Contributors

Thank you to all the contributors who worked on this release:

<a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/ilayaperumalg/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/ilayaperumalg">@ilayaperumalg</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/nicolaskrier/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/nicolaskrier">@nicolaskrier</a>, <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sdeleuze/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sdeleuze">@sdeleuze</a>, and <a class="user-mention notranslate" data-hovercard-type="user" data-hovercard-url="/users/sobychacko/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/sobychacko">@sobychacko</a>

