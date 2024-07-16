package assignment2;

import java.util.Scanner;

public class Multipletable {
	public static void main(String[] args) {
		System.out.println("Enter the table value you want to start : ");
		Scanner obj = new Scanner(System.in);
		int startnum = obj.nextInt();
		System.out.println("Enter the table value you want to stop : ");
		int endnum = obj.nextInt();
		System.out.println("The Multiplication table for " + startnum + " is \n");
		for (int i = 0 ; i<=endnum ; i++) {
			int multableval = startnum * i ;
			System.out.println(startnum +" * "+i+"   =   "+multableval);
		}
	}
}
