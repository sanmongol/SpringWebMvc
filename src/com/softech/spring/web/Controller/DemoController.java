package com.softech.spring.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("/")
	public String showHome() {
		return "hello";
	}
	@RequestMapping("/rumba")
	public String showHome1() {
		return "rumba";
	}
	@RequestMapping("/stud")
	public String showHome2() {
		return "Student";
	}
	
	
}

