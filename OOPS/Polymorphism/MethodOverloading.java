package OOPS.Polymorphism;

/*
 * 🔹 Definition of Method Overloading:
 * Method Overloading in Java is a feature that allows a class to have more than one method
 * with the same name but different parameter lists (different number of parameters or
 * different types of parameters).
 *
 * ✅ It is an example of Compile-Time Polymorphism (Static Polymorphism).
 * ✅ The compiler decides which method to call based on the method signature (name + parameters).
 *
 * 🔹 Rules of Method Overloading:
 * 1. Methods must have the same name.
 * 2. Methods must differ in the number of parameters OR types of parameters.
 * 3. Return type can be different, but it alone cannot be used to overload methods.
 * 4. It happens within the same class (or child class if not overriding).
 */

// Student1 class demonstrates method overloading
class Student1 {
    String name;
    int age;

    // Non-parameterized constructor
    Student1() {
        // Default constructor (does nothing special here)
    }

    // Method Overloading Example:

    // 1. Method with only name as parameter
    public void printInfo(String name) {
        System.out.println("The name of Student is : " + name);
    }

    // 2. Method with only age as parameter
    public void printInfo(int age) {
        System.out.println("The Student age is : " + age);
    }

    // 3. Method with both name and age as parameters
    public void printInfo(String name, int age) {
        System.out.println("The name of Student and age is : " + name + " " + age);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        // Creating a Student1 object using non-parameterized constructor
        Student1 s1 = new Student1();
        s1.name = "Roshan";  // Setting values later
        s1.age = 21;

        // Calling overloaded methods
        s1.printInfo(s1.name);         // calls printInfo(String name)
        s1.printInfo(s1.age);          // calls printInfo(int age)
        s1.printInfo(s1.name, s1.age); // calls printInfo(String name, int age)
    }
}
