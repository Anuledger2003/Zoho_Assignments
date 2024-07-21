package assignment7;

import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Reversecharacter {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = obj.nextLine();
        
        StringBuilder input = new StringBuilder();

        input.append(str);

        input.reverse();

        System.out.println(input);
 
    }
}