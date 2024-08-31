package assignment15;

class CustomExceptionExample extends Exception {
    public CustomExceptionExample(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new CustomExceptionExample("Custom exception.");
        } catch (CustomExceptionExample e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}

