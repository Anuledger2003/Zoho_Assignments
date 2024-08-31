package assignment16;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 30) {
                iterator.remove();
            }
        }

        System.out.println("Modified list: " + numbers);
    }
}

