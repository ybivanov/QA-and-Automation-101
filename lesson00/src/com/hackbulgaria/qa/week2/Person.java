package com.hackbulgaria.qa.week2;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append("(");
		b.append(name);
		b.append(", ");
		b.append(age);
		b.append(")");
		
		return b.toString();
	}

	@Override
	public int compareTo(Person o) {
		if(this.age == o.age) {
			return 0;
		}
		
		if(this.age < o.age) {
			return -1;
		}
		
		return 1;
	}
}










