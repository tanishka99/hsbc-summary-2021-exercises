package com.example;

public class CommandlineFor {
	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		//System.out.println("-------------------");
		/*
		 * Enhanced For Loop
		 */
		for(String s : args) {
			System.out.println(s);
		}
	}
}