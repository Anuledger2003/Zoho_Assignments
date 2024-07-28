package assignment10;


import java.util.ArrayList;
import java.util.List;

// Superclass: Library Management System
public class LibraryManagementSystem {
    public String userType;
    public String username;
    public String password;

    public LibraryManagementSystem(String userType, String username, String password) {
        this.userType = userType;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println(username + " logged in as " + userType);
    }

    public void register() {
        System.out.println(username + " registered as " + userType);
    }

    public void logout() {
        System.out.println(username + " logged out");
    }
}

// User Class
class User extends LibraryManagementSystem {
    public String name;
    public String id;

    public User(String userType, String username, String password, String name, String id) {
        super(userType, username, password);
        this.name = name;
        this.id = id;
    }

    public void verify() {
        System.out.println("User " + name + " verified");
    }

    public void checkAccount() {
        System.out.println("Checking account for user " + name);
    }

    public void getBookInfo() {
        System.out.println("Getting book info for user " + name);
    }
}

// Librarian Class
class Librarian extends User {
    public String searchString;

    public Librarian(String userType, String username, String password, String name, String id, String searchString) {
        super(userType, username, password, name, id);
        this.searchString = searchString;
    }

    public void verifyLibrarian() {
        System.out.println("Librarian " + name + " verified");
    }

    public void search() {
        System.out.println("Searching books with string: " + searchString);
    }
}

// Book Class
class Book {
    public String title;
    public String author;
    public String ISBN;
    public String publication;

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    public void showDueDate() {
        System.out.println("Showing due date for book: " + title);
    }

    public void reservationStatus() {
        System.out.println("Showing reservation status for book: " + title);
    }

    public void feedback() {
        System.out.println("Providing feedback for book: " + title);
    }

    public void bookRequest() {
        System.out.println("Requesting book: " + title);
    }

    public void renewInfo() {
        System.out.println("Renewing info for book: " + title);
    }
}

// Account Class
class Account {
    public int noBorrowedBooks;
    public int noReservedBooks;
    public int noReturnedBooks;
    public int noLostBooks;
    public double fineAmount;

    public Account(int noBorrowedBooks, int noReservedBooks, int noReturnedBooks, int noLostBooks, double fineAmount) {
        this.noBorrowedBooks = noBorrowedBooks;
        this.noReservedBooks = noReservedBooks;
        this.noReturnedBooks = noReturnedBooks;
        this.noLostBooks = noLostBooks;
        this.fineAmount = fineAmount;
    }

    public void calculateFine() {
        System.out.println("Calculating fine. Current fine amount: $" + fineAmount);
    }
}

// Library Database Class
class LibraryDatabase {
    public List<Book> listOfBooks;

    public LibraryDatabase() {
        this.listOfBooks = new ArrayList<>();
    }

    public void add(Book book) {
        listOfBooks.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void delete(Book book) {
        listOfBooks.remove(book);
        System.out.println("Book deleted: " + book.title);
    }

    public void update(Book oldBook, Book newBook) {
        int index = listOfBooks.indexOf(oldBook);
        if (index != -1) {
            listOfBooks.set(index, newBook);
            System.out.println("Book updated: " + newBook.title);
        }
    }

    public void display() {
        System.out.println("Displaying all books:");
        for (Book book : listOfBooks) {
            System.out.println(book.title);
        }
    }

    public void search(String searchString) {
        System.out.println("Searching books with string: " + searchString);
        for (Book book : listOfBooks) {
            if (book.title.contains(searchString) || book.author.contains(searchString)) {
                System.out.println("Found book: " + book.title);
            }
        }
    }
}

// Staff Class
class Staff extends User {
    public String dept;

    public Staff(String userType, String username, String password, String name, String id, String dept) {
        super(userType, username, password, name, id);
        this.dept = dept;
    }
}

// Student Class
class LibMember extends User {
    public String studentClass;

    public LibMember(String userType, String username, String password, String name, String id, String studentClass) {
        super(userType, username, password, name, id);
        this.studentClass = studentClass;
    }
}

// Main Class to demonstrate the functionality
class Main {
    public static void main(String[] args) {
        // library management system instance
        LibraryManagementSystem lms = new LibraryManagementSystem("Admin", "admin", "admin123");
        lms.login();
        lms.register();
        lms.logout();

        // user instance
        User user = new User("User", "user1", "password1", "John Doe", "U123");
        user.verify();
        user.checkAccount();
        user.getBookInfo();

        // librarian instance
        Librarian librarian = new Librarian("Librarian", "librarian1", "password1", "Jane Smith", "L123", "Harry Potter");
        librarian.verifyLibrarian();
        librarian.search();

        // book instance
        Book book = new Book("Harry Potter", "J.K. Rowling", "123-456-789", "Bloomsbury");
        book.showDueDate();
        book.reservationStatus();
        book.feedback();
        book.bookRequest();
        book.renewInfo();

        // account instance
        Account account = new Account(5, 2, 3, 1, 50.0);
        account.calculateFine();

        // library database instance
        LibraryDatabase libraryDatabase = new LibraryDatabase();
        libraryDatabase.add(book);
        libraryDatabase.display();
        libraryDatabase.search("Harry");
        libraryDatabase.delete(book);
        libraryDatabase.display();

        // staff instance
        Staff staff = new Staff("Staff", "staff1", "password1", "Alice Brown", "S123", "IT");
        System.out.println("Staff department: " + staff.dept);

        // student instance
        LibMember student = new LibMember("Student", "student1", "password1", "Bob White", "ST123", "10th Grade");
        System.out.println("Student class: " + student.studentClass);
    }
}

