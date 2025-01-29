package myName.javaRequiredBasics;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=9;
        int b=0;
        try{ // try block is used to write the code that may throw an exception
            int ans=a/b; // this line will throw an exception
            System.out.println(ans); 
        }
        catch(ArithmeticException e){ // catch block is used to catch the exception thrown by the try block
            System.out.println("invalid division" + e.getMessage()); // e.getMessage() will return the message of the exception
        }
        finally{ // finally block will always be executed whether there is an exception or not
            System.out.println("finally block will always be executed");
        }

        int arr[]=new int[3];
        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will always be executed no matter whether there is no exception or a caught exception");
        };

        try{
            int invalidNumber=Integer.parseInt("123ABC");
            System.out.println(invalidNumber);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("operation tried for converting a string to an int primitive type");
        };
        sc.close();
    }
}

// // 1️⃣ Checked Exceptions (Compile-time Exceptions)
// ✅ Definition:
// Checked exceptions are exceptions that must be either handled using try-catch or declared using throws. If not handled, the program won't compile.

// 📌 Characteristics:
// Checked at compile-time.
// Must be handled explicitly.
// Mostly occurs due to external factors (e.g., I/O operations, database access).
// exampke: IOException, SQLException, ClassNotFoundException, FileNotFoundException, etc.

// // 2️⃣ Unchecked Exceptions (Runtime Exceptions)
// ✅ Definition:
// Unchecked exceptions occur during runtime and are usually caused by logical errors. These exceptions do not need explicit handling.

// 📌 Characteristics:
// Checked at runtime.
// Extends RuntimeException class.
// Usually caused by bugs in the code (e.g., invalid inputs, null references).
// example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
