package com.bhavik.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {
	
	@GetMapping("/")
	public String showWelcomePage() {
		return "Welcome.jsp";
	}

}
