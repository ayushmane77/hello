package myName.javaRequiredBasics.Abstaction;

import java.util.Scanner;
 
// An interface is a fully abstract class. It includes a group of abstract methods(methods without a body).

// An interface is a reference type in java that can contain only abstract methods(until 8) and static, default, or
// private methods (from 8 onwards).

// Classes that implements an interface must provide implementation for all its methods.

// Interfaces support multiple inheritance, which means a cladd can implement multiple interfaces.

public class JavaInterfaces {
    public static void main(String[] args) {
        Ayush obj=new Ayush();
        
        System.out.println(obj.name);
        obj.reading();
        obj.writing();
        obj.eating();
        humans.sleeping(); //you can have static methods in an interface that can be invoked
        // without an instance. If you want to call a static method inside an interface, you can do so directly using the interface name.
        
        // obj.sleeping(); cannot call this call as the method is defined as static in 
        // in the abstract interface humans.

        System.out.println(humans.name);

        obj.running();
        obj.hunting();
        obj.reproduce();
    }
}
interface humans{
    public static final String name="Ayush";
    void reading();
    void writing();
    public static void sleeping(){ // interfaces can accept only static and default methods
        System.out.println("humans are sleeping , AI is evolving");
    }
    default void eating(){ // default method
        System.out.println("humans are eating");
    }
    public void reproduce(); // same reproduce abstract methods in animals
}

interface animals{
    public void running();

    default void hunting(){
        System.out.println("animals are wild");
    }
    void reproduce(); // same abstract method in humans interfaces
}

class Ayush implements humans,animals{  // interfaces support multiple inheritance
    Scanner sc=new Scanner(System.in);
    
    final String name=sc.nextLine();
    @Override
    public void reading() {
        // TODO Auto-generated method stub
        System.out.println(name + " is reading ");
    }
    @Override
    public void writing() {
        // TODO Auto-generated method stub
        System.out.println(name + " is writing ");
    }

    @Override
    public void running() {
        // TODO Auto-generated method stub
        System.out.println("Animals are running");
    }   

    @Override
    public void reproduce() { // implements both method by single statement without any ambiguity and diamond problem.
        // TODO Auto-generated method stub
        System.out.println("all organisms reproduce"); 
    }
}
