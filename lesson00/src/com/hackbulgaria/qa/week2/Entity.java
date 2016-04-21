package com.hackbulgaria.qa.week2;

public abstract class Entity {
	private String id;
	
	protected String getId() { return id; }
	
	public abstract String getIdentifier();
	
	public Entity(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return getIdentifier();
	}
}
