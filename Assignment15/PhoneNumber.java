package assignment15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your phone number: ");
            long phoneNumber = scanner.nextLong();
            System.out.println("Phone number entered: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric phone number.");
        } finally {
            scanner.close();
        }
    }
}

