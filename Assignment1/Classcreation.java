package assignment1;
public class Classcreation{
    public static void main(String[] args) {
        System.out.println("Hi, I am a Main Class");
        
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();
        
        first.displayMessage();
        second.displayMessage();
    }
}

class FirstClass {
    public void displayMessage() {
        System.out.println("I am the FirstClass");
    }
}

class SecondClass {
    public void displayMessage() {
        System.out.println("I am the SecondClass");
    }
}

