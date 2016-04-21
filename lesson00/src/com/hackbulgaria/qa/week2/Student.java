package com.hackbulgaria.qa.week2;

public class Student extends Entity {
	public Student(String identifier) {
		super(identifier);
	}
	
	@Override
	public String getIdentifier() {
		return "Student::" + getId();
	}
}
