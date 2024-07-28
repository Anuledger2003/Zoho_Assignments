package assignment9;

import java.util.ArrayList;

public class BookDTO {
    private String title;
    private String ISBN;
    private String author;
    private double price;
    private int publicationYear;

    public BookDTO(String title, String ISBN, String author, double price, int publicationYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        ArrayList<BookDTO> books = new ArrayList<>();

        books.add(new BookDTO("Java Programming", "123-456-789", "John Doe", 59.99, 2020));
        books.add(new BookDTO("Effective Java", "987-654-321", "Joshua Bloch", 45.00, 2018));
        books.add(new BookDTO("Clean Code", "192-837-465", "Robert C. Martin", 49.99, 2008));

        for (BookDTO book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }
}

