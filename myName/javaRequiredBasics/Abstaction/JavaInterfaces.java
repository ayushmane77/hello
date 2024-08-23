package myName.javaRequiredBasics.Abstaction;

import java.util.Scanner;

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
    
}
class Ayush implements humans{
    Scanner sc=new Scanner(System.in);
    final String name=sc.nextLine();
    public void reading(){
        System.out.println(name + " is reading ");
    }
    public void writing(){
        System.out.println(name + " is writing ");
    }
    
}
