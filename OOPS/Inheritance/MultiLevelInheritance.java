package OOPS.Inheritance;

// Grandparent/Base class
class Shape2 {
    String color;

    void displayColor() {
        System.out.println("The color of shape is: " + color);
    }
}

// Parent class inherits Shape
class Triangle2 extends Shape2 {
    int base, height;

    void area() {
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
}

// Child class inherits Triangle (Multi-Level)
class EquilateralTriangle extends Triangle2 {
    void type() {
        System.out.println("This is an equilateral triangle");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating object of child class
        EquilateralTriangle et = new EquilateralTriangle();

        // Accessing Grandparent (Shape) property
        et.color = "Red";

        // Accessing Parent (Triangle) properties
        et.base = 10;
        et.height = 5;

        // Calling Grandparent method
        et.displayColor();

        // Calling Parent method
        et.area();

        // Calling Child method
        et.type();
    }
}
