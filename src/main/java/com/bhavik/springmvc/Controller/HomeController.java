package com.bhavik.springmvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class HomeController {
	
	@GetMapping("/")
	public String showWelcomePage() {
		return "Welcome.jsp";
	}
	
	@GetMapping("/calculator")
	public String showCalPage() {
		return "cal.jsp";
	}
	
	@GetMapping("/result")
	public String showResultPage(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session) {
		int sum = i + j;
		session.setAttribute("sum", sum);
		return "result.jsp";
	}

}
