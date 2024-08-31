package assignment16;

import java.util.ArrayList;

public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        String thirdFruit = fruits.get(2); 
        System.out.println("The third fruit in the list is: " + thirdFruit);
    }
}
