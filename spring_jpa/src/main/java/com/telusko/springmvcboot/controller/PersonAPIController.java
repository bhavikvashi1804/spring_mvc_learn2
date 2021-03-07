package com.telusko.springmvcboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telusko.springmvcboot.PersonRepo;
import com.telusko.springmvcboot.model.Person;

@Controller
public class PersonAPIController {

	@Autowired
	PersonRepo repo;
	
	@GetMapping("/personAPI")
	@ResponseBody
	public List<Person> listOfPerson(){
		return repo.findAll();
	}
}
