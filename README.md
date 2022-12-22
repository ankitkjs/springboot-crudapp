#  Springboot-CRUD-App
springboot-crudapp is demonstrating how to implement simple CRUD operations with a Department entity.

## What's inside 
This project is based on the Spring Boot project and uses these packages :
  - Maven
  - Spring Core
  - Spring Data (Hibernate & MySQL)
  - Spring MVC (Tomcat)
  
## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

## Database configuration 
Create a MySQL database with the name `dcbapp` and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.jpa.show-sql = true
spring.datasource.url = jdbc:mysql://localhost:3306/dcbapp
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=zymr
spring.jpa.hibernate.ddl-auto=update
```

## Usage 
Run the project through the IDE and test each functionality using 'Postman' or 'Insomnia' with below given endpoints:

Create: 

      -> http://localhost:8080/departments 
      
         create the API request for this create funcionality by setting method as 'POST' and give entity data to be saved in JSON format
         
Read: 
    
    a) Read All Departments:
    
    -> http://localhost:8080/departments
      
       create the API request for this read all departments funcionality by setting method as 'GET'
    
    b) Read Departemnt By Id: 
    
    -> http://localhost:8080/departments/{deptId}
    
       create the API request for this read by id funcionality by setting method as 'GET' and use appropriate 'deptId' in the url

Update: 

     -> http://localhost:8080/departments/{deptId}
      
        create the API request for this update funcionality by setting method as 'PUT' and use appropriate 'deptId' in the url

Delete: 
    
     -> http://localhost:8080/departments/delete/{deptId}
      
        create the API request for this delete functionality by setting method as 'GET' and use appropriate 'deptId' in the url

Get Dept By Name: 
    
     -> http://localhost:8080/departments/name/{deptName}
     
        create the API request for this get dept by name functionality by setting method as 'GET' and use appropriate 'deptName' in the url
