package assignment7;

import java.util.Scanner;

class EmailValidator {
    public static boolean isValidEmail(String email) {

        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
            return false;
        }

        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        if (localPart.isEmpty()) {
            return false;
        }

        int dotIndex = domainPart.lastIndexOf('.');
        if (dotIndex <= 0 || dotIndex == domainPart.length() - 1) {
            return false;
        }

        String domainName = domainPart.substring(0, dotIndex);
        String domainExtension = domainPart.substring(dotIndex + 1);

        if (domainName.isEmpty() || domainExtension.isEmpty()) {
            return false;
        }

        for (char c : domainName.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-') {
                return false;
            }
        }

        for (char c : domainExtension.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Email : ");
        String mail = obj.nextLine();
        //example@domain.com
        StringBuilder email = new StringBuilder(mail);
        if (isValidEmail(email.toString())) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }
    }
}