package assignment10;

public class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }


    public void displayShapeDetails() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}