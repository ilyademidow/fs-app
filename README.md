# fs-app (full stack - application)
Test app based on Spring Boot 2 + Angular 6 + H2 DB

## Packaging
Execute Maven task **package** to build the executable **.jar**

## Running non-packaged app
1. Execute Maven task **exec:exec** in *fs-app-frontend* module to build the Front End resources
1. Execute Maven task **spring-boot:run** in *fs-app-backend* module to run the Spring Boot app