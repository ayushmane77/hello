package myName.javaRequiredBasics;

public class Parents {

    // Inheritance is one of the key features of OOPS that 
    // allow us to create a new class from an existing class.

    // the new class that is created is known as subclass(Child)
    // or derived class ) and the existing class from where the 
    // child class is derived is known as superclass(parent or base class)
    // Key Points about Inheritance:
    // Superclass and Subclass: The superclass is the class being inherited from, and the subclass is the class that inherits.

    // extends Keyword: In Java, inheritance is implemented using the extends keyword.

    // Access to Superclass Members: The subclass inherits all public and protected members of the superclass.
    // Private members are not inherited directly but can be accessed through public or protected methods.

    // Method Overriding: The subclass can provide a specific implementation of a method that is already defined in its superclass. 
    //This is known as method overriding.

    // super Keyword: This keyword is used within a subclass to call methods and constructors of its superclass.

    protected String vehicle;

    private double pie=3.14;
    public Parents(String VehicleName){
        this.vehicle=VehicleName;
        System.out.println(vehicle + "is running in parent class constructor");
        System.out.println(pie);
    }
    public Parents(){
        System.out.println("this is parent class constructor");
    }
    void start(){
        System.out.println("vehicle is running");
        // System.out.println("vehicle " + vehicle +" is starting");
    }
}


