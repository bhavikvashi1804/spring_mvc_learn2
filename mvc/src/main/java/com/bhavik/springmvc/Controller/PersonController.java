package com.bhavik.springmvc.Controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bhavik.springmvc.model.Person;

@Controller
public class PersonController {

	
	@ModelAttribute
	public void setDate(ModelMap m) {
		LocalDateTime ldt = LocalDateTime.now();
		m.addAttribute("date", ldt);
	}
	
	@GetMapping("/person")
	public String showPersonPage() {
		return "PersonForm";
	}

	@PostMapping("/submitPerson")
	public String showPersonResult(@ModelAttribute("person") Person p) {
		// We do not have to pass the ModelAttribute to next page, it will automatically do it	
		System.out.println(p.getId());
		return "personresult";
	}
	
	
	@GetMapping("/getPersons")
	public String displayPersons(ModelMap m) {
		List<Person> myList = Arrays.asList(new Person(101,"Bhavik",22), new Person(102,"Raj",18));
		m.addAttribute("persons", myList);
		return "list-person";
	}
}
