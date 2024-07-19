package assignment3;

import java.util.Scanner;

public class Main {
	/*Create a Main class with a main method to test the Person class by creating objects using each constructor and 
	 *printing their details.
	 */
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name = obj.nextLine();
		
		System.out.println("Enter the Age : ");
		int age = obj.nextInt();
		
		NewPerson person1 = new NewPerson (name , age);
		System.out.println("Person 1 Information:");
        person1.display();
		
	}
}

class NewPerson {
			static String name;
			static int age ;
			
			//First Constructor
			NewPerson(String name){  
				this.name = name;
			}
			
			//Second Constructor
			NewPerson(String name , int age){  
				this.name = name;
				this.age = age ;
			}
				
			public static void display() {
				System.out.println("Name :" + name);
				System.out.println("Age :" + age);
						
			}
		
	}

