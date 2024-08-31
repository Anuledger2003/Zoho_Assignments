package assignment15;

public class ArrayIndexOutOfBoundsExample {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
