package OOPS;

// Blueprint for Pen objects
class Pen {
    String color;
    String type;  // Example: ballpoint, gel

    // Method to simulate writing
    public void write() {
        System.out.println("writing something ");
    }

    // Method to print the pen's color
    public void printColor() {
        System.out.println("The color of pen is " + this.color);
    }
}

// Blueprint for Student objects
class Student {
    String name;
    int age;

    // Non-parameterized constructor
    // Called when we create a Student object without arguments
    Student() {
        System.out.println("The non parameterized constructor is called.");
    }

    // Parameterized constructor
    // Allows initialization of 'name' and 'age' when creating an object
    Student(String name, int age) {
        // 'this' refers to the current object's instance variables
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    // Creates a new Student object by copying values from another Student object
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // Method to print student details
    public void printInfo() {
        System.out.println("The name of Student and age is : " + this.name + " " + this.age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Creating first Pen object
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        // Creating second Pen object
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        // Calling methods on Pen objects
        pen1.write();
        pen1.printColor();
        pen2.printColor();

        // ----------- Student Class Demonstrations -----------

        // 1. Non-parameterized constructor
        Student s0 = new Student();   // will call non-parameterized constructor
        s0.name = "Aman";             // setting values later
        s0.age = 19;
        s0.printInfo();

        // 2. Parameterized constructor
        Student s1 = new Student("Roshan", 21);  // directly passing values
        s1.printInfo();

        // 3. Copy constructor
        Student s2 = new Student(s0);   // copies values from s0
        s2.printInfo();
    }
}
