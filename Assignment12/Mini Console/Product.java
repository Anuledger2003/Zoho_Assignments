abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double getPrice();

    public abstract String getDescription();
}


class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + " (Brand: " + brand + ")";
    }
}

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + " (Size: " + size + ")";
    }
}

class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + " (Author: " + author + ")";
    }
}

