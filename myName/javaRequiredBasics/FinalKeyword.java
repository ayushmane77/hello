package myName.javaRequiredBasics;

// import myName.mathematics.soultions;

// import myName.mathematics.soultions;

class ParentClass{
    final int num3=0; //final keyword used mostly to define constants.
    public final void printMessage(){
        int num=4; // these variables can also not be accessed to subclass defined in a final method
        System.out.println("this is number :" + num);
        System.out.println("this is the final message ");
    }
    int num2=5;
    public void printing(final String name){
        // name="saket"; results in compilation error
        System.out.println("hello " + name);
    }
}
class subclass extends ParentClass{
    // void printMessage(){
    //     System.out.println("this is inherited method");
    // }
    // this will result in compilation error
    
    // when you declare a method as final , then that method 
    // cannot be overriden by subclasses. This is useful when 
    // when you want to ensure the specific implementation of 
    // a method remains unchanged.

    ParentClass object=new ParentClass();
    void print(){
        System.out.println(num2); // 5
        System.out.println(num3); // 0
        object.num2=90; // updating the value of num2 in subclass by "object" refernce.
        System.out.println(object.num2); // 90
        // object.num3=45; results in compilation error because the num3 
        // variable is defined with "final" keyword 
       System.out.println(num2); // 5 this is because we are still refering
       // to the num2 variable of ParentClass
    }   
}

final class ABC{
    public void PrintTheMessage(){
        System.out.println("this is a final class and " + 
        "cannot be inherited");
    }
}
// class DEF extends ABC{
//     void Print(){
//         System.out.println("this is the subclass ");
//     }
// }  this will result in compilation error because subclass is defined 
//     with "final" keyword to prevent inheritence


public class FinalKeyword {
    public static void main(String[] args) {
        subclass Subclass=new subclass();
        Subclass.print();
        Subclass.printing("Ayush");
    }
}
