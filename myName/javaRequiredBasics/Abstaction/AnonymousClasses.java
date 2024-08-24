package myName.javaRequiredBasics.Abstaction;

// In java, a class can contain another class known as nested class.
// It's possible to create a nested class without giving any name.

// A nested class that doesn't any name is known as an anonymous class.

// Anonymous classes usually extend subclasses or implement interfaces.

// Here, Type can be

// 1. a superclass that an anonymous class extends.
// 2. an interface that an anonymous class implements.

class ParentClass{ // concrete class
    void print(){
        System.out.println("print from myclass");
    }
}
@FunctionalInterface
interface Interface{ // abstract class
    void printFromInterface();
}

// An interface that contains exactly one abstract method is known as a functional interface.
// Functional interface introduced in java 8 allow us to use a lambda expression to initiate the
// interface's method and avoid using lengthy codes for the anonymous class implementation.
@FunctionalInterface
interface Calculation{
    int addition(int a,int b);
}

public class AnonymousClasses {
    public static void main(String[] args) {
        ParentClass obj=new ParentClass(){ // anonymous class created to overide parentCLass.
            public void print(){
                System.out.println("print from Anonymous class");
            }
        };
        obj.print(); // prints "print from Anonymous class as it is overrided"

        Interface obj2=new Interface() { // anonymous class created to implement interface
            @Override
            public void printFromInterface() { 
                // TODO Auto-generated method stub
                System.out.println("printing form printFromInterface interface");
            }
        };
        obj2.printFromInterface();

        // @SuppressWarnings("unused")
        Interface obj3 = ()->{ // lamda expression
            System.out.println("printing functionalInterface using lambda expression");
        };
        obj3.printFromInterface();

        // Calculation obj4=(int a,int b)->{
        //     return a+b;
        // };
        // obj4.addition(3, 5);

        //OR

        Calculation obj4=(a,b)->{
            System.out.println(a+b );
            return a+b;
        };
        obj4.addition(2, 4);

        //OR

        // Calculation obj4=(int a,int b)->a+b;
        // obj4.addition(4, 7);
    }   
}
