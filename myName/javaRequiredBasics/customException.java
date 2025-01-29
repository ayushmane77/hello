package myName.javaRequiredBasics;

import java.util.Scanner;
public class customException {

    // public static void validateAge(int age){
    //     if(age<18){ // custom exception
    //         throw new IllegalArgumentException("age should be above 18"); // throw keyword is used to throw an exception
    //     }
    //     System.out.println("Access granted"); // this line will not be executed if the exception is thrown 
    // }

    public static void divide(int a, int b) throws ArithmeticException{ // throws keyword is used to declare the exception that may be thrown by the method. It is used to delegate the responsibility of exception handling to the caller of the method.
        // throws keyword is declared in the method signature.
        if(a==0 || b==0){ // custom exception
            throw new ArithmeticException("cannot divide by zero"); // throw keyword is used to throw an exception
        }
        System.out.println(a/b); // this line will not be executed if the exception is thrown 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // validateAge(15);
        int a=12;
        int b=0;
        try{ // try block is used to write the code that may throw an exception
            divide(a,b);
        }
        catch(ArithmeticException e){ // catch block is used to catch the exception thrown by the try block
            System.out.println("Error caught: " + e.getMessage()); // e.getMessage() will return the message of the exception
        }
        
        // difference between throw and throws are
        // 1. throw is used to throw an exception explicitly whereas throws is used to declare the exception that may be thrown by the method.
        // 2. throw keyword is used inside a method whereas throws keyword is declared in the method signature.
        // 3. throw keyword is used to throw only one exception at a time whereas throws keyword is used to declare multiple exceptions.
        // 4. throw keyword is used to throw checked or unchecked exceptions whereas throws keyword is used to declare only checked exceptions.
        sc.close();
    }
}
