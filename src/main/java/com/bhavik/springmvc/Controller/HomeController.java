package com.bhavik.springmvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	public String showResultPage(HttpServletRequest req) {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int sum = i + j;
		
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);
		return "result.jsp";
	}

}
