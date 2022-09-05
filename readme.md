# Task - Names
In this task you will practice building a Spring Boot app that contains a RESTful API which can accept requests to multiple routes.

## MVP

- Create a controller which accepts requests made to `http://localhost:8080/greeting`. 
- Create a method which accepts a `GET` request and returns a string saying "Good afternoon <yourname>!", eg. `"Good afternoon Colin!"`
- Create a POJO to represent a greeting. It should have the following properties:
  - `name`
  - `timeOfDay`
- Refactor your controller to use your POJO instead of a string
  
## Extension
  
- Use a `@RequestParam` to get the value for `timeOfDay` from the url
- Add a `Celebration` DTO with a single `message` property
- Add a second method to the controller to accept a `GET` request to `http://localhost:8080/greeting/christmas`. **HINT**: research adding a `value` argument to the `@GetMapping` annotation.
- Have the route return a `Celebration` object with the message "Merry Christmas!"


### How to get started
​
First things first, we can use the [Spring Boot Initializr](https://start.spring.io/) to boot up a project quickly.
​
> Click the link above and select the following options:
> 
> - Project: Maven
> - Language: Java
> - Spring Boot Version: 2.7.3
> - Update "artifact" in the meta-data to "task_01". Add a description if you wish.
> - Packaging: Jar
> - Java: 17
> 
> Add the dependencies:
> 
> - Spring Web
> - Spring Boot DevTools
>

Once the details above are correct, click *GENERATE*. It should download a file named `task_01.zip`. Extract the folder and open it in IntelliJ.
