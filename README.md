### Spring + MongoDB
Getting set up one MongoDB with MongoTemplate and Spring Data on Spring Boot.
DB authentication is done with basic user/pass.

Spring Boot 2.3.0  
Spring 5.2.7  
OpenJDK 11.0.7  

Dependencies: 
- [Java Mongo Driver 4.0.4](https://mongodb.github.io/mongo-java-driver/4.0/driver/getting-started/installation/)  
- [Spring Data MongoDB 3.0.1](https://mvnrepository.com/artifact/org.springframework.data/spring-data-mongodb/3.0.1.RELEASE)  

#### Setup

Add the following lines to a file `src\main\java\com\example\demo3\mongodb.properties`:
```
db.connection=<...>
db.host=<...>
db.port=<...>
db.username=<...>
db.password=<...>
db.database=<...>
```

#### Resources
- [Spring MongoDB reference](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongo-template.save-update-remove)
