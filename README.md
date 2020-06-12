# sample-spring-mongo-connect
Sample code to get MongoDB set up on Spring Boot with basic user/pass authentication. MongoTemplate is set up too.

Spring Boot 2.3.0  
Spring 5.2.7  
OpenJDK 11.0.7  

Dependencies: 
- [Java Mongo Driver 4.0.4](https://mongodb.github.io/mongo-java-driver/4.0/driver/getting-started/installation/)  
- [Spring Data MongoDB 3.0.1](https://mvnrepository.com/artifact/org.springframework.data/spring-data-mongodb/3.0.1.RELEASE)  

#### Setup

Add lines to `src\main\java\com\example\demo3\mongodb.properties`:

```
db.connection=<...>
db.host=<...>
db.port=<...>
db.username=<...>
db.password=<...>
db.database=<...>
```

#### Resources
- [spring mongo ref](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongo-template.save-update-remove)
