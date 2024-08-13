package assignment6;

import java.util.Scanner;

public class Login {
	//Write a java program to mimic login of a person (Get username and password from the user and authenticate). 
	//The username and password should be hardcoded in a static block.
	
	static String validusername ;
	static String validpassword ;
	
	static {
		
		validusername = "Anu";
		validpassword ="Password";
		
	}
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the User name : ");
		String username = obj.next();
		
		System.out.println("Enter the PassWord : ");
		String password = obj.next();
		
		if((username.equals(validusername))&&(password.equals(validpassword))) {
			
			System.out.println("You are an Authenticated User !!!");
			
		}
		else {
			
			System.out.println("You are not an Authenticated User !!!");
			
		}
		
	}

}
