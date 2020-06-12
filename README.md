# sample-spring-mongo-connect


Sample code to get set up for a MongoDB connection on Spring Boot  

Spring Boot 2.3.0  
Spring 5.2.7  
OpenJDK 11.0.7  
[Java Mongo Driver](https://mongodb.github.io/mongo-java-driver/4.0/driver/getting-started/installation/)  
[Spring Data MongoDB 3.0.1](https://mvnrepository.com/artifact/org.springframework.data/spring-data-mongodb/3.0.1.RELEASE)  

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
