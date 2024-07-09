package myName.javaRequiredBasics;

public class Constructors {
    // 1)constructors are invoked implicitly when you
    // instantiate objects.

    // 2)The two rules for creating a constructor are:
    // a. The name of the constructor should be the same as the class.
    // b. A java constructor must have a return type.

    // 3)If the class doesn't have a constructor , the java compiler 
    // automatically creates a default constructor during run-time. The 
    // default constructor initializes instance variables
    // with default values.

    // 4)Default Constructor - A constructor that is automatically created by the java 
    // compiler if it is not explicitly defined.
    
    // 5)A constructor cannot be abstract or static or final.
    // 6)A constructor can be overloaded but can be not be overidden.

    public static void main(String[] args) {
        Greetings g=new Greetings();
        String name="Tushar";
        g.welcome(name);

      //  Complex objComplex=new Complex();
       // objComplex.print();
       // Complex obj=new Complex();
       // obj.a=4;
       // obj.b=6;
       // obj.print();
        Complex test=new Complex(2, 7);
        test.print();
        Complex testing=new Complex(1);
        testing.print();
    }
}

class Complex{
    int a,b;
    
    // public Complex(){   // default  constructor is created automatically 
    //                                 //  by java
    //     a=0;
    //     b=0;            // but since we created this default constructor, it will work 
    //                     // similar to default constructor in this case, where
    //                     // default value of int a,b is 0,but still we assigned them to 0
    //                     // So final output is 0 + 0i
    // }

    public Complex(int real){
        a=real;
        b=12;
    }

    public Complex(int real,int imaginary){
        a=real;
        b=imaginary;
    }
    void print(){
        System.out.println(a+" + " + b + "i");
    }
}
