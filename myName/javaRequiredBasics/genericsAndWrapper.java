package myName.javaRequiredBasics;
import java.util.Scanner;
public class genericsAndWrapper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // what is a wrapper class?
        // Wrapper classes in Java provide a way to use primitive data types as objects.For each primitive type, there is a corresponding wrapper class.
        // what is autoboxing?
        // The automatic conversion of the primitive data type to the object of their corresponding wrapper classes is 
        // known as autoboxing. For eg, conversion of int to Integer , double to Double
        // Integer a=new Integer(12); depreciated version
        Integer b=2;
        Integer a=Integer.valueOf(12);
        Integer d=Integer.valueOf("124"); // the value of string will be converted to the possible integer.
        // Integer e=Integer.valueOf("f"); // will return an error
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(a+b);

        // what is unboxing?
        // It is just the reverse process of autoboxing. Automatically converting an object of the wrapper class to its corresponding 
        // primitive type is known as unboxing.
        int c=b;
        int e=Integer.parseInt("456"); // the value of string will be converted to the possible integer primitive type.
        System.out.println(e);
        System.out.println(c); 
        
        sc.close();
    }
}
