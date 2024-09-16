package assignment18;

import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Retrieve and print the element at the second index (third element)
        System.out.println("Element at index 2: " + vector.get(4));

        // Print elements in the vector
        System.out.println("All elements: " + vector);
    }
}

