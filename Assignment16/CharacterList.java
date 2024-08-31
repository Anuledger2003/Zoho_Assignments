package assignment16;

import java.util.ArrayList;

public class CharacterList {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();

        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('e');
        characters.add('f');
        characters.add('g');
        characters.add('h');
        characters.add('i');
        characters.add('j');

        char target = 'k';
        int index = findCharacterIndex(characters, target);
        if (index != -1) {
            System.out.println("Character '" + target + "' found at index: " + index);
        } else {
            System.out.println("Character '" + target + "' not found in the list. Returned index: " + index);
        }
    }

    public static int findCharacterIndex(ArrayList<Character> list, char target) {
        int index = list.indexOf(target);
        if (index == -1) {
            return -1;
        }
        return index;
    }
}

