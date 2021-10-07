package com.hsbc;

public class Circle implements Shape {
	@Override
	public String area(int radius) {
		System.out.println("3.14 * radius * radius");
		return "3.14 * radius * radius";
		
	}

}
