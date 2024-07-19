package assignment3;

import java.io.*;
import java.util.Scanner;

public class Person {
	String name;
	int age ;
	String address ;

	/*2. Create a class named Person. 
	 * Overload the constructors such that first constructor takes a single String argument for the name, 
	 * second takes a String argument for the name and an int argument for the age and 
	 * third constructor takes a String argument for the name, an int argument for the age, and a String argument for the address.
	 */
	
	
	//First Constructor
	Person(String name){  
		this.name = name;
	}
	
	//Second Constructor
	Person(String name , int age){  
		this.name = name;
		this.age = age ;
	}
	
	//Third Constructor
	Person(String name , int age , String address){  
		this.name = name;
		this.age = age ;
		this.address = address ;
	}
	
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name = obj.nextLine();
		
		System.out.println("Enter the Address : ");
		String address = obj.nextLine();
		
		System.out.println("Enter the Age : ");
		int age = obj.nextInt();

		Person n = new Person (name);
		System.out.println("Name :" + n.name);
		
		Person a = new Person (name , age);
		System.out.println("Name :" + a.name);
		System.out.println("Age :" + a.age);
		
		Person ad = new Person (name , age , address);
		System.out.println("Name :" + ad.name);
		System.out.println("Age :" + ad.age);
		System.out.println("Address :" + ad.address);
		
		
	}

}
