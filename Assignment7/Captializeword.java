package assignment7;

import java.util.Arrays; 
import java.util.Scanner;
class Captializeword {
     
     public static String capitalizeWords(String input)  
    { 
        if (input == null || input.isEmpty())  
        { 
            return input; 
        } 
 
        String[] words = input.split("\\s"); 
  
        StringBuilder result = new StringBuilder(); 
  
        for (String word : words)  
        { 
            result.append(Character.toUpperCase(word.charAt(0))) 
                  .append(word.substring(1).toLowerCase()) 
                  .append(" ");
        } 
  
        return result.toString().trim(); 
    } 
  
    public static void main(String[] args)  
    { 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Sentence : ") ;
        String inputString = obj.nextLine() ;
        String capitalizedString = capitalizeWords(inputString); 
  
        System.out.println("Original String: " + inputString); 
        System.out.println("Capitalized String: " + capitalizedString); 

    }
}