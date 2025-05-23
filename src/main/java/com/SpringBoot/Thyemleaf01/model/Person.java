package com.SpringBoot.Thyemleaf01.model;

public class Person {

	private int id;
	private String name;
	private String gmail;
	private String role;
	public Person(int id, String name, String gmail, String role) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}

