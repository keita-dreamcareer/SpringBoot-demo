package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	List<Person> findByAgeLessThan(int age);
	List<Person> findByAgeGreaterThan(int age);
	List<Person> findByAge(int age);
	List<Person> findByAgeBetween(int age1, int age2);
	
	List<Person> findByName(String name);
	List<Person> findByNameLike(String name);
	List<Person> findByNameContaining(String name);
}
