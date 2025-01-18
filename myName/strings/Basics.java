package myName.strings;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // how to create a string
        
        // 1. Using String literal
        // 2. Using new keyword
        // 3. Using char array
        // 4. Using StringBuffer
        // 5. Using StringBuilder

    // ------------------------------------------------
        // 1. Using String literal
        String str1="Hello";
        System.out.println(str1);
        String str2="Hello";
        // what is literal?
        // A string literal is a sequence of characters enclosed in double quotes.
        // A string literal is a constant value, it can not be changed.
        // A string literal is an object of the class String.
        // A string literal is stored in the string pool.
        // A string literal is created by JVM at the time of class loading.
        // A string literal is created in the non-heap memory area.
        // A string literal is shared by all the references pointing to it.
        // A string literal is immutable.
        // A string literal is faster than other ways of creating a string.
        // A string literal is created by JVM only once.
        // A string literal is created in the constant pool.

    // ------------------------------------------------
        // 2. Using new keyword
        String str3=new String("Hello");
        System.out.println(str3);

        // comparing two strings
        if(str1==str2){
            System.out.println("str1 and str2 are equal");
        }
        // or
        if(str1.equals(str2)){
            System.out.println("str1 and str2 are equal");
        }


        if(str1==str3){
            System.out.println("str1 and str3 are equal");
        }
        else{
            System.out.println("str1 and str3 are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("str1 and str3 are equal");
        }
        else{
            System.out.println("str1 and str3 are not equal");
        }

        // The string class equals() method compares the two given strings based on the content of the string.
        // The string class == operator, compares the reference of the given strings in the memory.
        // compares the reference of the given strings in the memory.

    // ------------------------------------------------

    // String str = "Hello";
    // String Pool Usage: This creates a string literal in the String Pool, a special memory area inside the heap used for storing unique string literals.
    // Optimization: If a string with the same content ("Hello") already exists in the pool, it will reuse the existing object instead of creating a new one.
    // Reference: str refers to the shared string object in the pool.

    // String str = new String("Hello");
    // String Pool Usage: This creates a string literal in the String Pool, a special memory area inside the heap used for storing unique string literals.
    // Optimization: If a string with the same content ("Hello") already exists in the pool, it will reuse the existing object instead of creating a new one.
    // Reference: str refers to the shared string object in the pool.

    // Comparison:
    // str == str2 will return false because str points to the pool object, while str2 points to the heap object.
    // str.equals(str2) will return true because the content of the strings is the same.

    // ------------------------------------------------

    // what is a string pool?
    // The string pool is a special memory area inside the heap used for storing unique string literals.
    // When a string is created using a string literal, it is stored in the string pool.
    // If a string with the same content already exists in the pool, it will reuse the existing object instead of creating a new one.
    // This helps in saving memory by avoiding duplicate string objects with the same content.
    // Explicit Addition: Strings created with new String("Hello") are not added to the pool unless you explicitly call .intern().


        sc.close();
    }
}
