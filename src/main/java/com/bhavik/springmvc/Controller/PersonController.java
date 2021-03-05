package com.bhavik.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

	@GetMapping("/person")
	public String showPersonPage() {
		return "PersonForm";
	}

	@GetMapping("/submitPerson")
	public String showPersonResult(ModelMap m, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") int age) {
		m.addAttribute("id", id);
		m.addAttribute("name", name);
		m.addAttribute("age", age);
		return "personresult";
	}
}
