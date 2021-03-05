package com.bhavik.springmvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView showResultPage(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result.jsp");
		int sum = i + j;
		mav.addObject("sum", sum);
		return mav;
	}

}
