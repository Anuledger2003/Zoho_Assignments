import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        String continueShopping;

        do {
            System.out.println("Choose the type of product to add:");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Book");
            System.out.print("Enter the number of your choice: ");
            System.out.println();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addElectronicsProduct(cart, scanner);
                    break;
                case 2:
                    addClothingProduct(cart, scanner);
                    break;
                case 3:
                    addBookProduct(cart, scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
            }
            System.out.println();
            System.out.print("Do you want to add another product? (yes/no): ");
            scanner.nextLine();  // Consume newline
            System.out.println();
            continueShopping = scanner.nextLine().trim().toLowerCase();
        } while (continueShopping.equals("yes"));

        cart.displayCartDetails();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }

    private static void addElectronicsProduct(ShoppingCart cart, Scanner scanner) {
        List<Product> electronicsProducts = new ArrayList<>();
        electronicsProducts.add(new ElectronicsProduct("Laptop", 1200.99, "Dell"));
        electronicsProducts.add(new ElectronicsProduct("Smartphone", 899.99, "Samsung"));
        electronicsProducts.add(new ElectronicsProduct("Tablet", 499.99, "Apple"));
        System.out.println();
        System.out.println("Available Electronics Products:");
        System.out.println();
        for (int i = 0; i < electronicsProducts.size(); i++) {
            System.out.println((i + 1) + ". " + electronicsProducts.get(i).getDescription() + " - Price: $" + electronicsProducts.get(i).getPrice());
        }

        System.out.print("Enter the number of the product you want to add: ");
        int productChoice = scanner.nextInt();
        if (productChoice > 0 && productChoice <= electronicsProducts.size()) {
            cart.addProduct(electronicsProducts.get(productChoice - 1));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void addClothingProduct(ShoppingCart cart, Scanner scanner) {
        List<Product> clothingProducts = new ArrayList<>();
        clothingProducts.add(new ClothingProduct("T-Shirt", 19.99, "M"));
        clothingProducts.add(new ClothingProduct("Jeans", 49.99, "L"));
        clothingProducts.add(new ClothingProduct("Jacket", 89.99, "XL"));
        System.out.println();
        System.out.println("Available Clothing Products:");
        System.out.println();
        for (int i = 0; i < clothingProducts.size(); i++) {
            System.out.println((i + 1) + ". " + clothingProducts.get(i).getDescription() + " - Price: $" + clothingProducts.get(i).getPrice());
        }

        System.out.print("Enter the number of the product you want to add: ");
        int productChoice = scanner.nextInt();
        if (productChoice > 0 && productChoice <= clothingProducts.size()) {
            cart.addProduct(clothingProducts.get(productChoice - 1));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void addBookProduct(ShoppingCart cart, Scanner scanner) {
        List<Product> bookProducts = new ArrayList<>();
        bookProducts.add(new BookProduct("Java Programming", 39.99, "John Doe"));
        bookProducts.add(new BookProduct("Python Essentials", 29.99, "Jane Smith"));
        bookProducts.add(new BookProduct("Effective C++", 49.99, "Scott Meyers"));
        System.out.println();
        System.out.println("Available Books:");
        System.out.println();
        for (int i = 0; i < bookProducts.size(); i++) {
            System.out.println((i + 1) + ". " + bookProducts.get(i).getDescription() + " - Price: $" + bookProducts.get(i).getPrice());
        }

        System.out.print("Enter the number of the book you want to add: ");
        int productChoice = scanner.nextInt();
        if (productChoice > 0 && productChoice <= bookProducts.size()) {
            cart.addProduct(bookProducts.get(productChoice - 1));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
