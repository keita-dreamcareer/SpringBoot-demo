package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("コマンドラインランナー実行開始");
		
		List<Person> persons = readPersonsFromCSV("historical_figures.csv");
        personRepository.saveAll(persons);
		
//		Person person1 = new Person("坂本龍馬", 33, "土佐藩");
//		Person person2 = new Person("源義経", 53, "平安京");
//		Person person3 = new Person("明智光秀", 47, "尾張国");
//		
//		personRepository.save(person1);
//		personRepository.save(person2);
//		personRepository.save(person3);
		
//		// 全検索
//		List<Person> list = personRepository.findByNameContaining("坂");
//		
//		for(Person person : list) {
//			System.out.println(person.toString());
//			
//		}
		
//		for(Person person : list) {
//			
//			if(person.getName().equals("徳川家康")) {
//				person.setName("竹千代");
//				personRepository.save(person);
//			}
//			
//		}
		
		System.out.println("コマンドラインランナー実行終了");
	}
	
	private List<Person> readPersonsFromCSV(String fileName) {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // ヘッダーをスキップ
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int age = Integer.parseInt(fields[1]);
                String address = fields[2];
                persons.add(new Person(name, age, address));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
	
}
