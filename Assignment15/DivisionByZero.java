package assignment15;

//1. Write a program for division with proper divide-by-zero exception handling

public class DivisionByZero {
	public static void main(String[] args) {

        try {
            
            int numerator = 10;
            int denominator = 0;

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
        	System.out.println("Final Message ");
        }
    }
}



