package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	@Autowired
	MyService service;
	@Autowired
	PersonService personService;
	
//	@GetMapping("/home")
//	public String getHome(Model model) {
//		model.addAttribute("name", "やゆよ");
//		model.addAttribute("greet", "こんにちは");
//		model.addAttribute("task", "Springboot");
//		
//		Person p = new Person();
//		p.setName("北条義時");
//		p.setAge(38);
//		
//		model.addAttribute("person", p);
//		return "home";
//	}
//	
//	@GetMapping("/test")
//	public String getNight() {
//		return "test";
//	}
//	
//	@GetMapping("/users/{name}")
//	public String getUsers(@PathVariable String name, Model model) {
//		System.out.println("name = " + name);
//		model.addAttribute("message", name + "さん、こんにちは！");
//		return "hello";
//	}
//	
//	@GetMapping("/form1_input")
//	public String sample1_Input(Model model) {
//		model.addAttribute("title", "入力画面1です。");
//		return "form1_input";
//	}
//	
//	@GetMapping("/form1_result")
//	public String sample1_result(@RequestParam String paramA, @RequestParam String paramB, @RequestParam String paramC, Model model) {
//	    model.addAttribute("paramA", paramA);
//	    model.addAttribute("paramB", paramB);
//	    model.addAttribute("paramC", paramC);
//	    return "form1_result";
//	}
//	
//	
//	@GetMapping("/form2_input")
//	public String sample2_input(Model model) {
//		model.addAttribute("title", "入力画面2です。");
//		return "form2_input";
//	}
//
//	@PostMapping("/form2_result")
//	public String sample2_result(ThreeTextForm form, Model model) {
//		System.out.println("paramA : " + form.getParamA());
//		System.out.println("paramB : " + form.getParamB());
//		System.out.println("paramC : " + form.getParamC());
//	    model.addAttribute("form", form);
//	    return "form2_result";
//	}
//	
//	@GetMapping("/form3_input")
//	public String sample3_input(Model model) {
//		model.addAttribute("title", "入力画面3です");
//		model.addAttribute("form", new TextFormValidate());
//		return "form3_input";
//	}
//	
//	@PostMapping("/form3_result")
//	public String sample3_result(@Validated @ModelAttribute("form") TextFormValidate form, BindingResult bindingResult, Model model) {
//		if(bindingResult.hasErrors()) {
//			model.addAttribute("title", "入力画面3の再入力です");
//			model.addAttribute("form", form);
//			return "form3_input";
//		}
//		
//		model.addAttribute("form", form);
//		
//		return "form3_result";
//	}
//	
//	@GetMapping("/personList")
//	public String showPerson(Model model) {
//		Person person1 = new Person("藤原道長", 30, "都");
//		Person person2 = new Person("源頼朝", 28, "鎌倉");
//		Person person3 = new Person("北条義時", 40, "鎌倉");
//		Person person4 = new Person("徳川家康", 18, "江戸");
//		Person person5 = new Person("真田幸村", 45, "大阪城");
//		List<Person> personList = new ArrayList<>();
//		
//		personList.add(person1);
//		personList.add(person2);
//		personList.add(person3);
//		personList.add(person4);
//		personList.add(person5);
//		
//		model.addAttribute(personList);
//		return "person_table";
//	}
//	
//	@GetMapping("/myservice")
//	public String myService(Model model) {
//		model.addAttribute("personList", service.getPersonList());
//		return "person_table";
//	}

//	// 氏名検索ページ
//	@GetMapping("searchPerson")
//	public String searchPerson(Model model) {
//		model.addAttribute("person", new Person());
//		return "search_person";
//	}
//	
//	//　氏名検索結果表示
//	@PostMapping("resultPerson")
//	public String resultPerson(@RequestParam String name, Model model) {
//		List<Person> list = personService.getPerson(name);
//		model.addAttribute("personList", list);
//		return "person_list";
//	}
	
	// データベースのpersonsテーブルをすべて表示する
	@GetMapping("/")
	public String personList(Model model) {
		List<Person> list = personService.getPesonList();
		model.addAttribute("personList", list);
		return "person_list";
	}
	
	@PostMapping("/result")
	public String filterResults(@RequestParam String word, Model model) {
		List<Person> list = personService.filterRisult(word);
		model.addAttribute("personList", list);
		return "person_list";
	}
	
	
	
	
	
	
	
}
