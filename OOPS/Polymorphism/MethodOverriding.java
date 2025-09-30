package OOPS.Polymorphism;

/*
 * 🔹 Definition of Method Overriding:
 * Method Overriding in Java occurs when a subclass provides its own implementation of a method
 * that is already defined in its parent (superclass).
 *
 * ✅ Rules of Overriding:
 * 1. Method name must be the same.
 * 2. Parameter list must be the same.
 * 3. Return type must be the same (or covariant).
 * 4. It happens in an inheritance relationship (child class extends parent).
 *
 * 👉 It is an example of Runtime Polymorphism (Dynamic Polymorphism), because
 *    the method that gets executed is decided at runtime based on the object type.
 */

class Animal {
    // Parent method
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    // Overriding the sound() method of Animal
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound() method of Animal
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Runtime polymorphism: reference type is Animal, but object is Dog
        Animal a1 = new Dog();
        a1.sound(); // Dog's version of sound() will run

        Animal a2 = new Cat();
        a2.sound(); // Cat's version of sound() will run

        Animal a3 = new Animal();
        a3.sound(); // Animal's version of sound() will run
    }
}
