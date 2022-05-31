# Project songr

A Java Lab project that will be useful during week 3.

Demonstrates learned skills in:

- Java
- Spring Initializr, Boot, and Thymeleaf
- Gradle  
- HTML and CSS/Bootstrap

## How to Run and Test

To run this app you can either:

- Use gradle and generate a JAR file `./gradlew build` and then execute `java ${jarfile.JAR}`.
- Open the project in IntelliJ IDEA (or your favorite IDE with Java support) and click the Run button.

The project includes Spring frameworks that includes a running Apache web server, default port: 8080.  

## Features

[ ] Create a 'hello world' route at '/hello'. Verify functionality by loading the route in the browser.  
[ ] Create a route that will UPPER CASE any input words => '/hello' should return a static webpage with 'HELLO' somewhere on it.  
[ ] Build-out the uppercase route so that it will upper case *entire sentences*.  
[ ] Create a basic splash page for the app that includes CSS styling (don't go overboard).  
[ ] Create an Album class as a model in the app. See details below.  
[ ] Create a route '/albums' that returns three Album instances with hardcoded data on a static template page.  
[ ] Test constructors, getters, and setters of the Album class.  

## Testing

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

## References and Resources

During the development of this project the following resources (people, websites, documentation, etc) were used:

[Thymeleaf docs](https://www.thymeleaf.org/doc/articles/standardurlsyntax.html)  
