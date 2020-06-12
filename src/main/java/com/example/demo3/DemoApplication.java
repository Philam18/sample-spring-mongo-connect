package com.example.demo3;

import com.example.demo3.dao.DB;
import com.example.demo3.model.Circle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("com/example/demo3/spring.xml")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DB db = (DB) context.getBean("DB");

		// db.createCircle("1", "hello i am a circle!");
		Circle circle = db.getCircle("1");

		if (circle != null) {
			System.out.println(circle.getName());
		} else {
			System.out.println("Not found");
		}

	}

}
