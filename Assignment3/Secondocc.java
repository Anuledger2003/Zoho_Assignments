package assignment2;

import java.util.Scanner;

public class Secondocc {
	public static void main(String[] args) {
		int[] array = {4, 2, 7, 2, 5, 9, 3, 8};

		int keyelement = 2;	
		int c = 0 ;
		int i = 0;
		for( i = 0 ;i < array.length ; i++) {
			if(array[i] == keyelement) {		
				c++ ;
				if(c == 2) break ;
			}
		}
		if(c == 2)System.out.println("The second occurance of key element is located at "+ i );	
	}
}
	
