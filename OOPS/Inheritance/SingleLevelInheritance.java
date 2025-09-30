package OOPS.Inheritance;

// Parent/Base class (Superclass)
class Shape {
    String color;

    // Method to display color
    void displayColor() {
        System.out.println("The color of shape is: " + color);
    }
}

// Child/Derived class (Subclass) – Single-Level Inheritance
class Triangle extends Shape {
    int base;
    int height;

    // Method to calculate area of triangle
    void area() {
        double a = 0.5 * base * height;
        System.out.println("The area of triangle is: " + a);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        // Creating object of child class
        Triangle t1 = new Triangle();

        // Accessing parent class property
        t1.color = "Red";

        // Accessing child class properties
        t1.base = 10;
        t1.height = 5;

        // Calling parent class method
        t1.displayColor();

        // Calling child class method
        t1.area();
    }
}
