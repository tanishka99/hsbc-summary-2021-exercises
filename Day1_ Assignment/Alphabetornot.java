package com.example;

public class Alphabetornot {

	public static void main(String[] args) {
	checkAlphabet('*');
	checkAlphabet('E');
}
public static void checkAlphabet(char c) {
	if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
		System.out.println(c+" is an alphabet");
	} else {
		System.out.println(c+" is not an alphabet");
	}
}
}
