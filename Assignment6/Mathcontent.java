package assignment6;

public class Mathcontent {
	/*
	 * 2. Write a program to calculate Math operations with Math contents initialized in static block.
	 */
	static int num1 ;
	static int num2 ;
	static double Maximum ;
	static double Squarerootofnum1 ;
	static double Squarerootofnum2 ;
	static double Power ;
	static double Logarithm ;
	static double Logarithm10 ;
	static double Exp ;
	
	static {
		
		num1 = 24 ;
		num2 = 4 ;
		
	    Maximum = Math.max(num1,num2);
		Squarerootofnum1 = Math.sqrt(num1);
		Squarerootofnum2 = Math.sqrt(num2);
		Power = Math.pow(num1,num2);
		Logarithm = Math.log(num1);
		Logarithm10 = Math.log10(num2);
		Exp = Math.exp(num2);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("The Maximum between "+num1+" and "+num2+" is : " + Maximum);
		System.out.println("The Square root of Number 1 : " +Squarerootofnum1 );
		System.out.println("The Square root of Number 2 : " +Squarerootofnum2 );
		System.out.println("The Power between "+num1+" and "+num2+" is : " +Power);
		System.out.println("The Logarithm of Number 1 is : " +Logarithm);
		System.out.println("The Logarithm10 of Number 2 is : " +Logarithm10);
		System.out.println("The Exponential of Number 2 is : " +Exp);
		
	}

}
