package assignment16;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        //ArrayList to an array
        String[] fruitsArray = fruits.toArray(new String[0]);

        System.out.println("Array: " + Arrays.toString(fruitsArray));

        //Array to an ArrayList
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        System.out.println("ArrayList: " + fruitsList);
    }
}

