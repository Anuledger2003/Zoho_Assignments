package assignment18;

import java.util.Vector;
import java.util.Arrays;

public class VectorToArray {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("red");
        vector.add("green");
        vector.add("blue");
        vector.add("yellow");

        String[] array = new String[vector.size()];
        vector.toArray(array);

        System.out.println("Array: " + Arrays.toString(array));

        // Convert the array back to a vector
        Vector<String> newVector = new Vector<>(Arrays.asList(array));

        System.out.println("Vector: " + newVector);
    }
}

