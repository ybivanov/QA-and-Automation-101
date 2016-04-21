package com.hackbulgaria.qa.week2;

public class PythonRunner extends Runner {
	public PythonRunner(String code, String test) {
		super(code, test);
	}

	public void lint() {}
	public void compile() {}

	public void execute() {
//		Пусни python програмата в OS–а
//		Заедно с тестовете и кода
//		Гледай за някакви неща / while true / fork-loops и т.н
//		Вземи резултата
		result = "OK";
	}
}
