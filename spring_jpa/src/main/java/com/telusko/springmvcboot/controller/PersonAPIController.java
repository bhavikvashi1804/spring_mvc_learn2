package com.telusko.springmvcboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springmvcboot.PersonRepo;
import com.telusko.springmvcboot.model.Person;

@RestController
public class PersonAPIController {

	@Autowired
	PersonRepo repo;

	@GetMapping(path="/personAPI", produces = {"application/xml"})
	public List<Person> listOfPerson() {
		return repo.findAll();
	}

	@GetMapping("/personAPI/{id}")
	public Person getPerson(@PathVariable("id") int id) {
		Person p = repo.findById(id).orElse(new Person());
		return p;
	}

	@PostMapping("/personAPI")
	public Person addPerson(Person p) {
		repo.save(p);
		return p;
	}
}
