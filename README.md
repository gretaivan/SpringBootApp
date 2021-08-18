## Installation and Usage
1. Fork the repo
2. Clone the repo ```git clone git@github.com:gretaivan/SpringBootApp.git```
3. ```mvn clean``` - to clean out the project and prepare for compile
4. ```mvn compile``` - generate the output files to run the app 
5. ```mvn spring-boot:run``` - to start the tomcat server

### Advanced settings
to enable configuration for different systems or other factors
+ to activate application-mac.properties profile `mvn spring-boot:run -Dspring.profiles.active=qa` 