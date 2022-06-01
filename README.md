# Project songr

A Java Lab project that will be useful during week 3.

Demonstrates learned skills in:

- Java
- Spring Initializr, Boot DevTools, and Thymeleaf
- Gradle  
- HTML and CSS/Bootstrap
- PostgreSQL 14.3
- JPA persistence API
- JDBC database connection wrapper
- 

## Features

[ ] Update Album model so that it can be used with / saved in a database.  
[ ] Album Class should have title, artist, songCount, length (seconds) and imageUrl.  
[ ] User should be able to see information about all the albums on the site.  
[ ] User should be able to add albums to the site.  
[X] Ensure the SpringApp runs *verified with `gradlew build` and `gradle bootRun`  
[X] Create a 'hello world' route at '/hello'. Verify functionality by loading the route in the browser.  
[X] Create a route that will UPPER CASE any input words => '/hello' should return a static webpage with 'HELLO' on it.  
[X] Build-out the uppercase route so that it will upper case *entire sentences*.  
[X] Create a basic splash page for the app that includes CSS styling (don't go overboard).  
[X] Create an Album class as a model in the app. See details below.  
[X] Create a route '/albums' that returns three Album instances with hardcoded data on a static template page.  
[X] Test constructors, getters, and setters of the Album class.  

## How to Run

To run this app you can either:

- Use gradle bootRun which will deploy a JAR file and run it along with an Apache server at port 8080: `./gradle bootRun`
- Open the project in IntelliJ IDEA (or your favorite IDE with Java support) and click the Run button.

The project includes Spring frameworks that includes a running Apache web server, default port: 8080.

## How to Test

To run tests you can either:

- Use gradle: `./gradlew test`
- Use your IDE that supports Java and JUnit Jupiter testing e.g. IntelliJ IDEA

## Album Class

A basic class used for containing data that will be displayed on a template web page using Spring.  

Properties:

- title
- artist
- songCount
- length (in seconds)
- imageUrl (album art)

Constructors:

1. Empty constructor
2. Constructor with ALL properties: String title, String artist, int songCount, float length, String albumArt

Methods:

- None for today's lab.

## Build Customizations

### Enable hot-reload in dev

gradle-wrapper.properties is located in `project_root/gradle/`  
Updated gradle-wrapper.properties with the following line: `spring.devtools.restart.enabled=true`  

See [using devtools](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#using.devtools) for details.  

...if only it would work...

### Other Setup Dependencies

application.properties

The following dependencies are necessary to wire-up the database to this project:

```text
dependencies {
	implementation('org.springframework.boot:spring-boot-starter-data-jpa')
	implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
	implementation('org.springframework.boot:spring-boot-starter-web')
	runtimeOnly('org.postgresql:postgresql')
	testImplementation('org.springframework.boot:spring-boot-starter-test')
}
```

## References and Resources

During the development of this project the following resources (people, websites, documentation, etc) were used:

Thanks to Ben Mills for pointing me in the right direction with displaying Images and using TH: attributes!  

[Help.md in this repo](./HELP.md)  

Album Art developed on [Canva](https://www.canva.com)  

ThymeLeaf [documentation on attributes](https://www.thymeleaf.org/doc/tutorials/2.1/usingthymeleaf.html#variables)  
