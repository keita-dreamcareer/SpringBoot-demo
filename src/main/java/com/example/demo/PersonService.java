package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getPesonList(){
		List<Person> list = personRepository.findAll();
		return list;
	}
	
	public List<Person> filterRisult(String word){
		List<Person> list = personRepository.findByNameContaining(word);
		return list;
	}
}
