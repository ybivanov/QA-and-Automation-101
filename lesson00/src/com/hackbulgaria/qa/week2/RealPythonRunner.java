package com.hackbulgaria.qa.week2;

public class RealPythonRunner extends PythonRunner {
	public RealPythonRunner(String code, String test) {
		super(code, test);
	}
	@Override
	public void execute() {
		super.execute();
		result = "NOT OK";
	}
}
