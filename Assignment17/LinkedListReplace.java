package assignment17;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReplace {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("three")) {
                iterator.set("THREE");
            }
        }
        
        System.out.println(list);
    }
}

