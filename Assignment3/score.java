package assignment2;

import java.util.Scanner;

public class score {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Your Score : ");
		int score = obj.nextInt();
		
		if((score <= 100) && (score > 90)) {
			System.out.println("Your Grade is \"A\"");
		}
		else if ((score <= 90) && (score > 80)) {
			System.out.println("Your Grade is \"B\"");
		}
		else if ((score <= 80) && (score > 70)) {
			System.out.println("Your Grade is \"C\"");
		}
		else if ((score <= 70) && (score > 60)) {
			System.out.println("Your Grade is \"D\"");
		}
		else if ((score <= 60) && (score >= 50)) {
			System.out.println("Your Grade is \"E\"");
		}
		else if (score < 50) {
			System.out.println("Your are fail in this subject");
		}
		else {
			System.out.println("Enter a valid score");
		}
			
	}

}
