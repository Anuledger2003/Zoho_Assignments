package assignment18;

import java.util.Vector;

public class VectorCheck {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();

        vector.add(5.2);
        vector.add(7.8);
        vector.add(9.1);
        vector.add(10.5);
        vector.add(12.3);

        boolean containsValue = vector.contains(10.5);
        System.out.println("Contains 10.5: " + containsValue);

        System.out.println("Size before adding: " + vector.size());

        vector.add(15.6);

        System.out.println("Size after adding: " + vector.size());
    }
}

