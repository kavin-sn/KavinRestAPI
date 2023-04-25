package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Demo4Application.class, args);
		Person p=new Person(8,"name",18);
		ObjectMapper o=new ObjectMapper();
		String p1=o.writeValueAsString(p);
		System.out.println(p1);
	}

}
