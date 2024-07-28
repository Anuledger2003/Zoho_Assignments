package assignment10;

public class Circle extends Shape {
    public double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayShapeDetails();
    }
}