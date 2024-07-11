package assignment1;
import java.util.Scanner;

public class Average {
	 public static void main(String[] args) {
	  // Initialize variables for sum and counting
	  long numofperson = 0;
	  long count = 1;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Input the number of Person you want to calculate the average: ");
	  int n = sc.nextInt();
	  
	  while (count <= n) {
	   System.out.println("Person " + "(" + (int) count + ")" + "Weight :");
	   numofperson += sc.nextInt();
	   count += 1;
	  }
	  
	  double avgn = (numofperson / n);

	  System.out.println("Average: " + avgn);
	 }
	}
