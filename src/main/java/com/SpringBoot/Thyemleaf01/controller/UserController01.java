package com.SpringBoot.Thyemleaf01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SpringBoot.Thyemleaf01.model.Person;
import com.SpringBoot.Thyemleaf01.model.User;

@Controller
public class UserController01 {

	//localhost:8080/variable-expression
	@GetMapping("/variable-expression")
	public String variableExpression(Model model) {
		User user=new User(1,"maneesh","chiti",24);
		model.addAttribute("userattribute", user);
		return "variable-expression";
	}
	
	
	//localhost:8080/selection-expression
	@GetMapping("/selection-expression")
	public String selectionExpression(Model model) {
		User user=new User(2,"amar","bekkanti",24);
		model.addAttribute("userattribute", user);
		return "selection-expression";
	}
	
	@GetMapping("/message-expression")
	public String messageExpression(Model model) {
		return "message-expression";
	}
	
	@GetMapping("/link-expression")
	public String linkExpression(Model model) {
		
		model.addAttribute("idd", 1);
		return "link-expression";
	}
	
	@GetMapping("/fragment-expression")
	public String fragmentExpression() {
		return "fragment-expression";
	}
	
	@GetMapping("/theachstatus-expression")
	public String thEachStatusExpression(Model model) {
		
		User user01=new User(3,"Ajay","thimma",24);
		User user02=new User(4,"Arun","k",24);
		User user03=new User(5,"Abhinash","n",24);
		User user04=new User(6,"asif","u",24);
		List <User> user=new ArrayList();
		user.add(user01);
		user.add(user02);
		user.add(user03);
		user.add(user04);
		model.addAttribute("userattribute", user);
		
		return "theachstatus-expression";
	}
	
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		
		Person p01=new Person(1,"Maneesh","M@gmail.com","STUDENT");
		Person p02=new Person(2,"Amar","A@gmail.com","ADMIN");
		Person p03=new Person(3,"Atchyth","AA@gmail.com","STUDENT");
		Person p04=new Person(4,"Vamshi","V@gmail.com","ADMIN");
		List <Person> person=new ArrayList();
		person.add(p01);
		person.add(p02);
		person.add(p03);
		person.add(p04);
		model.addAttribute("personattribute", person);
		
		return "if-unless";
		
	}
	
	@GetMapping("/switch-case")
	public String switchCase(Model model) {
		Person p=new Person(5,"Arjun","A@gmail.com","USE");
		model.addAttribute("personattribute", p);
		return "switch-case";
	}
	
	
}
