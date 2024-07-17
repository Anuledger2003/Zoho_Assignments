package assignment2;

import java.util.Scanner;

public class Evennumadd {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the size of array ");
		int num = obj.nextInt();
		
		System.out.println("Enter the elements ");
		int array[] = new int[num];
		for(int i = 0 ; i < num ; i++) {
			array[i] = obj.nextInt();
		}
		
		int even = 0 ;
		
		for (int i = 0; i < array.length; i++) {
		            if (array[i] % 2 == 0) {
		                even += array[i];
		            }
		            if(array[i] %2 != 0) {
		            	continue ;
		            }
		        }
		 
		        System.out.println("Even sum: " + even);
		
	}

}
