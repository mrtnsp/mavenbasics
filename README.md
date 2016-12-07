# mavenbasics

basic maven pom with dependencies for TDD: junit, mockito, hamcrest
Additional the plugin settings for a jacoco coverage and sonar analysis are given.
The Maven site will include the jacoco coverage report.

# usage:
##  clean build with jacoco reporting and trigger for a (local) SonarQube server

mvn clean verify jacoco:report sonar:sonar 

use this line in a jenkins or whatever CI server configuration. The SonarQube server url should be configured in the CI Server but mybe set in the properties section of the pom.xml (sonar.host.url). 
If you do so I would suggest to use a profile (example provided in pom.xml):

mvn clean verify jacoco:report sonar:sonar -Psonar