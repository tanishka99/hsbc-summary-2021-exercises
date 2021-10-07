package com.hsbc;

public class ShapeSelect {
	public static void main(String[] args) {
		System.out.println("Area of Circle =");
		Circle c = new Circle();
		FindArea.printArea(c, 6);
		System.out.println("Area of Sphere =");
		Sphere sphere = new Sphere();
		FindArea.printArea(sphere, 8);
	}

}
