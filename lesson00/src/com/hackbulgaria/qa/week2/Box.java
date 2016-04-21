package com.hackbulgaria.qa.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Box<T> {
	private T data;
	
	public Box(T data) { this.data = data; }
	public T getData() { return data; }
	
	public static void main(String[] args) {
		Box<Integer> a = new Box<>(1);
	}
}
