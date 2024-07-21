pacakge assignment7;

import java.util.Scanner;
class Vowelnumbers {
    public static void main(String[] args){
    	Scanner obj = new Scanner(System.in);
    	System.out.println("Enter the String : ");
    	String str = obj.nextLine();
    	
		int vowel=0;
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) { 
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("Vowels: " + vowel);
 
    }
}