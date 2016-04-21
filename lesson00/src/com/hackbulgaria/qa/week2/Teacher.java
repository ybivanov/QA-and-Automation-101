package com.hackbulgaria.qa.week2;

public class Teacher extends Entity {

	public Teacher(String identifier) {
		super(identifier);
	}
	
	@Override
	public String getIdentifier() {
		return "Teacher::" + getId();
	}

}
