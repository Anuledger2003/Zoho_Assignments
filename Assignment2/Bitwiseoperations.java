package assignment1;

import java.util.Scanner;

public class Bitwiseoperations {
	public static void main (String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstnum = obj.nextInt();
		System.out.println("Enter the Second Number");
		int secondnum = obj.nextInt();
		
		int bitand = firstnum & secondnum;
		int bitor = firstnum | secondnum;
		int bitxor = firstnum ^ secondnum;
		int bitfirstnot = ~ firstnum ;
		int bitsecondnot = ~ secondnum ;
		int bitrightshift = firstnum >> 2 ;
		int bitleftshift = secondnum >> 2 ;
		
		System.out.println("AND OPERATION : " +bitand);
		System.out.println("OR OPERATION : "+bitor);
		System.out.println("XOR OPERATION : "+bitxor);
		System.out.println("NOT FIRST NUMBER : "+bitfirstnot);
		System.out.println("NOT SECOND NUMBER : "+bitsecondnot);
		System.out.println("FIRST NUMBER'S RIGHT SHIFT : "+bitrightshift);
		System.out.println("SECOND NUMBER'S LEFT SHIFT : "+bitleftshift);
		
	}

}
