package assignment3;

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

		Person n = new Person ("ANU");
		System.out.println("Name :" + n.name);
		
		Person a = new Person ("ANU" , 21);
		System.out.println("Name :" + a.name);
		System.out.println("Age :" + a.age);
		
		Person ad = new Person ("ANU" , 21 , "PERAVURANI");
		System.out.println("Name :" + ad.name);
		System.out.println("Age :" + ad.age);
		System.out.println("Address :" + ad.address);
		
		
	}

}
