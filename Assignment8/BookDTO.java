package assignment8;


//1. Create Book DTO class with attributes like title, ISBN etc. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
public class BookDTO {

    static String title;
    static String ISBN;
    static String author;
    static double price;
    static int publicationYear;


    public void displayBookDetails() {
        System.out.println("Title: Java Programming");
        System.out.println("ISBN: 123-456-789");
        System.out.println("Author: John Doe");
        System.out.println("Price: 59.99");
        System.out.println("Publication Year: 2020");
    }

    public static void main(String[] args) {
        BookDTO book1 = new BookDTO();
        book1.displayBookDetails();
  

    }
}
