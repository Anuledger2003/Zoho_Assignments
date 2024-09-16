package assignment17;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        reverseList(list);
    }

    public static void reverseList(LinkedList<Character> list) {
        Collections.reverse(list);
        System.out.println(list);
    }
}
