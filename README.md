# releases-dashboard


[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=bugs)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)    
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)     
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=coverage)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)      
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)    
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)        
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)       
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)       
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)      
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)        
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=rock-hu_releases-dashboard&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=rock-hu_releases-dashboard)       

| on push                                                                                                | on schedule                                                                                                   |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------- |
| ![](https://github.com/rock-hu/releases-dashboard/actions/workflows/releases-dashboard.yaml/badge.svg) | ![](https://github.com/rock-hu/releases-dashboard/actions/workflows/releases-dashboard-weekly.yaml/badge.svg) |

```mermaid
sequenceDiagram
　　　Application ->> ReleasePartitionService: releases(atomProperties.getRepositories(), 10)
     ReleasePartitionService ->> ReleasePartitionServiceImpl : releases(atomProperties.getRepositories(), 10)
　　　loop repositories
　　　　　ReleasePartitionServiceImpl ->> ReleaseWorker : new ReleaseWorker(releaseService, repository)
        ReleaseWorker -->> ReleasePartitionServiceImpl : ReleaseWorker
        ReleaseWorker ->> ReleaseService : releases(atom)
        ReleaseService ->> ReleaseServiceImpl : releases(atom)
        ReleaseServiceImpl ->> RssService : releases(atom)
        RssService ->> RssServiceImpl : releases(atom)
        RssServiceImpl -->> RssService : releases
        ReleasePartitionServiceImpl ->> ScheduledExecutorService : schedule(worker, delay, TimeUnit.SECONDS) 
        ScheduledExecutorService -->> ReleasePartitionServiceImpl : ScheduledFuture<Integer>
　　　end
     ReleasePartitionServiceImpl -->> Application : releases
```

```bash
releases-dashboard/docs$ find . -name 'README.md' > README.csv
```

## maven

```bash

mvn spotless:apply
mvn clean package -s settings.xml -Dspotless.check.skip=true -Dmaven.test.skip=true -Dmaven.test.failure.ignore=true
```

## docs

```bash
npm install -g markdownlint-cli
markdownlint 'docs/**/*.md' --ignore node_modules  --fix
```

## /orgs/{{organization}}/repos

`GET https://api.github.com/orgs/{{organization}}/repos?per_page=100&sort=full_name`

```groovy
// pm.environment.set("organization","spring-projects");
// pm.environment.set("organization","zalando");
// pm.environment.set("organization","square");
pm.environment.set("organization","openrewrite");
```

```groovy
const organizations = pm.response.json();
for (let i = 0; i < organizations.length; i++) {
    const repository = organizations[i];
    console.log('    - '+repository.html_url + '/releases.atom');
}
```

## openrewire

```bash
mvn rewrite:run
```

```bash
mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.exportDatatables=true -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-java-dependencies:RELEASE -Drewrite.activeRecipes=org.openrewrite.java.dependencies.DependencyVulnerabilityCheck
```

