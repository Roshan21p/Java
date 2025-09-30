package OOPS.Inheritance;

// Parent/Base class
class Shape1 {
    String color;

    void displayColor() {
        System.out.println("The color of shape is: " + color);
    }
}

// First child class
class Triangle1 extends Shape1 {
    int base, height;

    void area() {
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
}

// Second child class
class Circle extends Shape1 {
    int radius;

    void area() {
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Triangle object
        Triangle1 t = new Triangle1();
        t.color = "Red";
        t.base = 10;
        t.height = 5;
        t.displayColor();
        t.area();

        // Circle object
        Circle c = new Circle();
        c.color = "Blue";
        c.radius = 7;
        c.displayColor();
        c.area();
    }
}
