package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;

@SpringBootTest
class Day5ApplicationTests {
	
	@Autowired
	private ChildRepo repo;
	

	@Test
	void contextLoads() {
		
		Child obj = new Child();
		obj.setBabyFirstName("jane");
		obj.setBabyLastName("pqek");
		obj.setFatherName("bla");
		obj.setMotherName("bla");
		obj.setAddress("tew");
		
		repo.save(obj);
	}

}
