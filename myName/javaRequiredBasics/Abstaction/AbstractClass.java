package myName.javaRequiredBasics.Abstaction;

// Java Abstraction

// Abstraction is one of the core principles of object-oriented programming(OOP) in java.
// It refers to the concept of hiding the complex implementation details and showing only the 
// essential features of an object. By using abstraction, a user can interact with an object at
// high level without needing to understand the underlying complexities.

// In java, abstraction is achieved using abstract classes and interfaces.

// 1. An abstract class cannot be instantiated, meaning you cannot create objects of this class.

// 2. It can have both abstract methods(without implementation) and non-abstract methods(with implementaion).

// 3. subclasses are responsible for providing implementations for abstract methods.

// Key Differences Between Abstract Class and Interface

// Abstract Class: Can have both abstract and non-abstract methods, instance variables, and constructors. Supports single inheritance.
// Interface: Can only have abstract methods (until Java 8), static, default, or private methods, and no instance variables. Supports multiple inheritance.

public class AbstractClass {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eating();
        cat.sound();
    }
}
abstract class Animal{
    abstract void sound();

    public void eating(){
        System.out.println("animal is eating");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat moews");
    }   
}