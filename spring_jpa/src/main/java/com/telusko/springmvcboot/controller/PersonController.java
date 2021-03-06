package com.telusko.springmvcboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.springmvcboot.PersonRepo;
import com.telusko.springmvcboot.model.Person;

@Controller
public class PersonController {

	@Autowired
	PersonRepo repo;
	
	
	@GetMapping("/getPersonJPA")
	public String getAllPersonFROMDB(Model m) {
		m.addAttribute("result", repo.findAll());
		return "showPersons";
	}
	
	@GetMapping("/getPerson")
	public String getPersonFROMDB(Model m,@RequestParam int id) {
		m.addAttribute("result", repo.getOne(id));
		return "showPersons";
	}
	
	@GetMapping("/addPerson")
	public String addPerson(Model m,@RequestParam int id,@RequestParam String name,@RequestParam int age) {
	
		Person p1 = new Person(id,name,age);
		repo.save(p1);
		m.addAttribute("result", repo.findAll());
		return "showPersons";
	}
	
	@GetMapping("/findPerson")
	public String findPersonByName(Model m,@RequestParam String name) {
		
		m.addAttribute("result", repo.findByName(name));
		return "showPersons";
	}
	
	@GetMapping("/getPersonOrderName")
	public String getPersonOrderAge(Model m) {
		
		m.addAttribute("result", repo.findByNameOrderByAgeDesc("Bhavik"));
		return "showPersons";
	}
	
	@GetMapping("/getPersonQuery")
	public String getPersonQuery(Model m) {
		
		m.addAttribute("result", repo.findByName1("Bhavik"));
		return "showPersons";
	}
	// to accept the result in XML
	// in postman use: Accept: application/xml
}
