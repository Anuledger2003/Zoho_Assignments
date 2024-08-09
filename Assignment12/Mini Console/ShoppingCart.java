import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCartDetails() {
        System.out.println("Shopping Cart:");
        for (Product product : products) {
            System.out.println(product.getDescription() + " - Price: $" + product.getPrice());
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

