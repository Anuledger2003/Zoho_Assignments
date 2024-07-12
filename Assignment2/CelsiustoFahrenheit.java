package assignment1;

import java.util.Scanner;

public class CelsiustoFahrenheit {
	public static void main (String[] args) {
		
		Scanner obj = new Scanner (System.in);  
		System.out.println("Enter the Celsius ( C ): ") ;
		float celsius = obj.nextFloat() ;
		
		float conversion ;
		conversion = (celsius *9) / 5 ;
		conversion += 32 ;
		System.out.println("The Coversion from Celsius to Fahrenhit is " + conversion+"F") ;
		
	}

}
