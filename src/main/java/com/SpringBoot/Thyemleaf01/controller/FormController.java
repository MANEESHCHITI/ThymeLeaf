package com.SpringBoot.Thyemleaf01.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringBoot.Thyemleaf01.model.UserForm;

@Controller
public class FormController {

	@GetMapping("/register")
	public String userRegistrationPage(Model model) {
	
		UserForm userForm =new UserForm();
		
		model.addAttribute("userForm", userForm);
		List <String> listProfession=Arrays.asList("Developer","Tester","Architect");
		model.addAttribute("listProfession", listProfession);
		return "register-form";
		
	}
	
	@PostMapping("/register/success")
	public String registerSuccess(Model model,@ModelAttribute("userForm") UserForm userform) 
	{
		model.addAttribute("userForm", userform);
		return "register-success";
	}
	


	
	
}
