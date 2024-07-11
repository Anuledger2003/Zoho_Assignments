package assignment1;

public class TypeConversion {
	public static void main(String[]args) {
		
		//Widening Casting
		
		int intnum = 4 ;
		double doublenum = intnum ;
		
		System.out.println("The integer type value is\t"+intnum);
		System.out.println("The Double type value is\t"+doublenum);
		
		//Narrowing Casting
		
		double num1 = 86.6745341267 ;// double upto 15 decimals
		float num2 = (float)num1 ;
		int num3 = (int)num2 ;
		
		System.out.println("The integer type value is\t"+num1);
		System.out.println("The Double type value is\t"+num2);
		System.out.println("The Double type value is\t"+num3);
		
		
	}

}
