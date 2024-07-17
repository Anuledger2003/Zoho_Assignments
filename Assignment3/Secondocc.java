package assignment2;

import java.util.Scanner;

public class Secondocc {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of elements ");
		int num = obj.nextInt();
		
		System.out.println("Enter the array elements ");
		int array[] = new int[num] ;
		for(int i = 0 ; i < num ; i++) {
			array[i] = obj .nextInt();
		}
		System.out.println("Enter the Key elements ");
		int keyelement = obj.nextInt();
		
		int count = 0 ;
		int i = 0;
		for( i = 0 ;i < array.length ; i++) {
			if(array[i] == keyelement) {
				count = count + 1; ;
			}
			if(count == 2) {
				break ;
			}
		}
		if(count == 2) {
			System.out.println("The second occurance of key element is located at "+ i );
			
		}
		
	}

}
	
