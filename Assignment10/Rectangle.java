package assignment10;

public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Blue", 4.0, 7.0);
        rectangle.displayShapeDetails();
    }
}
