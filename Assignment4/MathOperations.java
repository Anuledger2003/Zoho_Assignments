package assignment3;

import java.util.Scanner;

public class MathOperations {
	/*
	 * 1. Create a Java class MathOperations with methods for basic mathematical operations such as 
	 * add() , subtract() , multiply() , and divide() . 
	 * Implement method overloading to allow these operations for integers, doubles, and optionally, other types.
	 */
	
	public static void main(String[] args) {
		
		MathOperations m = new MathOperations();
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		int a = obj.nextInt();
		System.out.println("Enter the First Number : ");
		int b = obj.nextInt();
		
		System.out.println("The Addition is : "+add(a,b));
		System.out.println("The Subtraction is : "+subtract(a,b));
		System.out.println("The Multiplication is : "+ m.multiply(a,b));
		System.out.println("The Division is : "+m.divide(a,b));
		
	}
	
	static int add(int x, int y) {
		return x+y ;
	}
	
	static int subtract(int x , int y) {
		return x-y;
	}
	
	int multiply(int x , int y) {
		return x*y ;
	}
	
	double divide(double x , double y) {
		return x/y ;
	}

}
