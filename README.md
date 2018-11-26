# mavenbasics

Basic maven pom with dependencies for TDD: junit 5, mockito, assertj
Additional the plugin settings for a jacoco coverage and sonar analysis are given.
The Maven site will include the jacoco coverage report.

~~The jacoco check for a minimum coverage was disabled -  it wont work with junit jupiter at the moment.~~

## usage:
### create a report

    mvn site

the report index page is located at './target/site/index.html'


###  clean build with jacoco reporting and trigger for a (local) SonarQube server

    mvn clean verify jacoco:report sonar:sonar 

Use this line in a jenkins or whatever CI server configuration. The SonarQube server url should be configured in the CI Server but may be set in the properties section of the pom.xml (sonar.host.url). 
If you do so I would suggest to use a profile (example provided in pom.xml):

    mvn clean verify jacoco:report sonar:sonar -Psonar
