package com.bhavik.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping("/person")
	public String showPersonPage() {
		return "PersonForm";
	}
}
