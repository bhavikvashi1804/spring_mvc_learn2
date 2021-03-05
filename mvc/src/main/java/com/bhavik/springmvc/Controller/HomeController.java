package com.bhavik.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
class HomeController {

	@GetMapping("/")
	public String showWelcomePage() {
		return "index";
	}

	@GetMapping("/calculator")
	public String showCalPage() {
		return "cal";
	}

	// ModalAndView
	@GetMapping("/result")
	public ModelAndView showResultPage(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		int sum = i + j;
		mav.addObject("sum", sum);
		return mav;
	}

	// ModalMap
	@GetMapping("/result1")
	public String showResultPage1(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {
		//you can use: ModelMap or Model
		int sum = i+j;
		m.addAttribute("sum", sum);
		return "result";
	}

}
