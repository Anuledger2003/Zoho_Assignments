package assignment2;

import java.util.Scanner;

public class largenum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the First number : ");
		int a = obj.nextInt();
		System.out.println("Enter the Second number : ");
		int b = obj.nextInt();
		System.out.println("Enter the Third number : ");
		int c = obj.nextInt();
		
		if((a > b)&&(a>c)) {
			System.out.println("The Number "+a+" is Largest Number ");
		}
		else if ((b > a) && (b > c)) {
			System.out.println("The Number "+b+" is Largest Number ");
		}
		else {
			System.out.println("The Number "+c+" is Largest Number ");
		}

}
}