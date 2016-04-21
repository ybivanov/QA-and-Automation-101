package com.hackbulgaria.qa.week2;

public abstract class Runner {
	protected String result;
	protected String code;
	protected String test;
	
	public Runner(String code, String test) {
		this.code = code;
		this.test = test;
	}
	
	public String run() {
		lint();
		compile();
		execute();
		
		return result;
	}
	
	public abstract void lint();
	public abstract void compile();
	public abstract void execute();
}
