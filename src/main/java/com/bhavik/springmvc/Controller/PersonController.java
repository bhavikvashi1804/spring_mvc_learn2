package com.bhavik.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhavik.springmvc.model.Person;

@Controller
public class PersonController {

	@GetMapping("/person")
	public String showPersonPage() {
		return "PersonForm";
	}

	@GetMapping("/submitPerson")
	public String showPersonResult(ModelMap m, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") int age) {
		
		//use the object to pass the information from Controller to View
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		m.addAttribute("person", p);
		return "personresult";
	}
}
