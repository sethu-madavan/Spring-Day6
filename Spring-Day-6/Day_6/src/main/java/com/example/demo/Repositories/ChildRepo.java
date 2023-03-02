package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Child;

public interface ChildRepo extends JpaRepository<Child, Integer> {

//	List<Child> findByBabyFirstNameStartingWith(String name);
//
//	List<Child> findByBabyLastNameEndingWith(String name);
	
}
