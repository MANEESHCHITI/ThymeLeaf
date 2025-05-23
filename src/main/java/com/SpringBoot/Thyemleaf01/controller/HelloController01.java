package com.SpringBoot.Thyemleaf01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController01 {

	
	//handler method to handle handler request/helloworld request
	//localhost:8080/hello
	
	@GetMapping("/hello")
	public String getMessage(Model model) {
	
		model.addAttribute("message", "Hello World!");
		return "hello-world";
		
	}
}

