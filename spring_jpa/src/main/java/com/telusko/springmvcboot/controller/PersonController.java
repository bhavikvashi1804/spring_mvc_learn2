package com.telusko.springmvcboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.springmvcboot.PersonRepo;

@Controller
public class PersonController {

	@Autowired
	PersonRepo repo;
	
	
	@GetMapping("/getPersonJPA")
	public String getAllPersonFROMDB(Model m) {
		m.addAttribute("result", repo.findAll());
		return "showPersons";
	}
}
