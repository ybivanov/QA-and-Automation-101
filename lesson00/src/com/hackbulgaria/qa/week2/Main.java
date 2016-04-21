package com.hackbulgaria.qa.week2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void printArray(Object[] arr) {
		StringBuilder b = new StringBuilder();
		b.append("[");
		for (int i = 0; i < arr.length; i++) {
			b.append(arr[i].toString());
			
			if(i != arr.length - 1) {
				b.append(", ");				
			}
		}
		
		b.append("]");
		System.out.println(b.toString());
	}
	
	public static void main(String[] args) {
		Student ivo = new Student("8");
		
		ArrayList<Entity> everything = new ArrayList<>();
		everything.add(new Student("1"));
		everything.add(new Teacher("2"));
		everything.add(ivo);
		System.out.println(everything);
	}
}
