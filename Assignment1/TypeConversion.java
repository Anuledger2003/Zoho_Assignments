package assignment1;

public class TypeConversion {
	public static void main(String[]args) {
		
		int intnum = 4 ;
		double doublenum = intnum ;
		
		System.out.println("The integer type value is\t"+intnum);
		System.out.println("The Double type value is\t"+doublenum);
		
		double num1 = 86.6745341267 ;
		float num2 = (float)num1 ;
		int num3 = (int)num2 ;
		
		System.out.println("The integer type value is\t"+num1);
		System.out.println("The Double type value is\t"+num2);
		System.out.println("The Double type value is\t"+num3);		
		
	}

}
