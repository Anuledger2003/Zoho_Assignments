package assignment12;
/*
 4. Create 'Document' abstract class. 
 Create subclasses like PDFDocument, TextDocument, ImageDocument, etc. 
 Create abstract methods and concrete methods and demonstrate how they work.
 */
import java.util.Scanner;

abstract class Document {
 protected String title;

 public Document(String title) {
     this.title = title;
 }

 public void displayTitle() {
     System.out.println("Title: " + title);
 }

 public abstract void open();
 public abstract void save();
 public abstract void close();
}

//PDFDocument
class PDFDocument extends Document {

 public PDFDocument(String title) {
     super(title);
 }

 public void open() {
     System.out.println("Opening PDF document: " + title);
 }

 public void save() {
     System.out.println("Saving PDF document: " + title);
 }

 public void close() {
     System.out.println("Closing PDF document: " + title);
 }
}

class TextDocument extends Document {

 public TextDocument(String title) {
     super(title);
 }

 public void open() {
     System.out.println("Opening text document: " + title);
 }

 public void save() {
     System.out.println("Saving text document: " + title);
 }

 public void close() {
     System.out.println("Closing text document: " + title);
 }
}

//ImageDocument
class ImageDocument extends Document {

 public ImageDocument(String title) {
     super(title);
 }

 public void open() {
     System.out.println("Opening image document: " + title);
 }

 public void save() {
     System.out.println("Saving image document: " + title);
 }

 public void close() {
     System.out.println("Closing image document: " + title);
 }
}

public class Documents {
 public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     Document document = null;

     System.out.println("Select the type of document:");
     System.out.println("1. PDF Document");
     System.out.println("2. Text Document");
     System.out.println("3. Image Document");

     int choice = obj.nextInt();
     obj.nextLine(); 

     System.out.println("Enter the title of the document:");
     String title =obj.nextLine();

     switch (choice) {
         case 1:
             document = new PDFDocument(title);
             break;
         case 2:
             document = new TextDocument(title);
             break;
         case 3:
             document = new ImageDocument(title);
             break;
         default:
             System.out.println("Invalid choice");
             System.exit(1);
     }

     // Display title and demonstrate functionality
     document.displayTitle();
     document.open();
     document.save();
     document.close();
 }
}

