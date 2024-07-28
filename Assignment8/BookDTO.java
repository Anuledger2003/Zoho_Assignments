package assignment8;


//1. Create Book DTO class with attributes like title, ISBN etc. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
public class BookDTO {


    private String title;
    private String ISBN;
    private String author;
    private double price;
    private int publicationYear;

   
    private static int bookCount = 0;

   
    public BookDTO(String title, String ISBN, String author, double price, int publicationYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Java Programming", "123-456-789", "John Doe", 59.99, 2020);
        BookDTO book2 = new BookDTO("Advanced Java", "987-654-321", "Jane Doe", 69.99, 2021);

        book1.displayBookDetails();
        book2.displayBookDetails();

        System.out.println("Total number of books: " + BookDTO.getBookCount());
    }
}
