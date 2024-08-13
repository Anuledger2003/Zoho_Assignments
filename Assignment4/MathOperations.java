package assignment3;

import java.util.Scanner;

public class MathOperations {
	/*
	 * 1. Create a Java class MathOperations with methods for basic mathematical operations such as 
	 * add() , subtract() , multiply() , and divide() . 
	 * Implement method overloading to allow these operations for integers, doubles, and optionally, other types.
	 */
	
	public static void main(String[] args) {
		
		System.out.println(add(1,2));
		System.out.println(add(4.0,2));
		System.out.println(subtract(3,1));
		System.out.println(subtract(3,1.0));
		System.out.println(multiply(6,2));
		System.out.println(multiply(6.0,2.0));
		System.out.println(divide(6,2));
		System.out.println(divide(6.0,2));

	}
	
	static int add(int x, int y) {
		return x+y ;
	}
	static double add(double x, double y) {
		return x+y ;
	}
	static int subtract(int x , int y) {
		return x-y;
	}
	static double subtract(double x, double y) {
		return x-y ;
	}
	static int multiply(int x , int y) {
		return x*y ;
	}
	static double multiply(double x , double y) {
		return x*y ;
	}
	static double divide(double x , double y) {
		return x/y ;
	}
}
