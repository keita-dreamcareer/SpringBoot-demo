package com.example.demo;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="persons")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	
	@NotBlank(message = "Name cannot be empty")
	private String name;
	
	@Min(value= 0, message="Age must be positive")
	private int age;
	
	@NotBlank(message = "Address cannot be empty")
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	
	
}
