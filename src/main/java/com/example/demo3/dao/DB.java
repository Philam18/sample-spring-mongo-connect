package com.example.demo3.dao;

import com.example.demo3.model.Circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Component
public class DB {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Circle getCircle(String circleId) {
        return this.mongoTemplate.query(Circle.class)
            .matching(query(where("id").is(circleId)))
            .first()
            .orElse(null);
    }

    public Circle createCircle(String id, String name) {
        Circle circle = new Circle(id, name);
        return this.mongoTemplate.insert(circle);
    }

}