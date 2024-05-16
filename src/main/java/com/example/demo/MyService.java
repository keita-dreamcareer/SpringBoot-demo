package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public ArrayList<Person> getPersonList(){
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("織田信長", 18, "安土城"));
		list.add(new Person("豊臣秀吉", 15, "大阪城"));
		list.add(new Person("徳川家康", 10, "江戸城"));

		return list;
	}
}