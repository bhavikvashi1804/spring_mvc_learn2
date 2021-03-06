package com.bhavik.springmvc.Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

	@GetMapping("/submitPerson")
	public String showPersonResult(@ModelAttribute("person") Person p) {
		// We do not have to pass the ModelAttribute to next page, it will automatically do it		
		return "personresult";
	}
}
