package assignment2;

import java.util.Scanner;

public class Primenum {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num = obj.nextInt();
		
		for(int i = 2 ; i <= num ; i++) {
			boolean isprime = true ;
			for(int j = 2 ; j <= i/2 ; j++) {
				if(i%j == 0) {
					isprime = false ;
					break ;
				}
			}
			if(isprime) {
				System.out.println("The Prime Numbers are " + i);
	    	}
		}
	}

}
