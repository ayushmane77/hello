package myName.javaRequiredBasics.polymorphism;

// Polymorphism in java is the ability of an object to take on many forms.
// It allows methods to do different things based on the object it is acting upon, 
// even if the method name is the same.
// This is a key concept in object-oriented programming(OOP) and enables a single interface
// to represent different underlying forms(data types).


// Types of Polymorphism

// Compile-time Polymorphism (Method Overloading):

// Achieved by method overloading, where multiple methods have the same name but different parameters (type, number, or both).
// The method that gets executed is determined at compile time based on the method signature.
// Runtime Polymorphism (Method Overriding):

// Achieved by method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.
// The method that gets executed is determined at runtime based on the object that invokes the method.
// Example of Runtime Polymorphism

class Birds{
    public void flies(){
        System.out.println("birds do fly");
    }
}

class Crows extends Birds{
    @Override
    public void flies(){
        System.out.println("Crows do flies");
    }
}

class Sparrows extends Birds{
    @Override
    public void flies(){
        System.out.println("Sparrows also flies");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Birds obj=new Birds();
        Birds obj2=new Crows();
        Birds obj3=new Sparrows();
        // Crows obj3=new Crows(); can call like this also
        // obj3.flies();

        obj.flies();
        obj2.flies();
        obj3.flies();
        
    }
}
