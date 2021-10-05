package com.example;

public class OddEven {

	public static void main(String[] args) {
		printEven(10, 20);
		System.out.println("\n");
		printOdd(10, 20);
	}
	public static void printOdd(int begin, int end) {
		int start = begin;
		if(start % 2 == 0) {
			start = begin + 1;
		}
		for(int i = start; i <= end; i = i + 2) {
			System.out.println("i = "+i);
		}
	}
	public static void printEven(int begin, int end) {
		int start = begin;
		if(start % 2 == 1) {
			start = begin + 1;
		}
		for(int i = start; i <= end; i = i + 2) {
			System.out.println("i = "+i);
		}
	}

}