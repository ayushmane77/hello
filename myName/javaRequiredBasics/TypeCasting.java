package myName.javaRequiredBasics;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=3.14;
        int b=(int)a;  // explicit type casting (narrowing)

        System.out.println("the value of double is " + a);
        System.out.println("the value of int typcasted from double a is " + b);

        // 2️⃣ Explicit Type Casting (Narrowing)
        // 🔹 Must be done manually because a larger type may not fit into a smaller one.
        // 🔹 Data loss may occur.
        // 🔹 Example: double → int, long → short, etc.

        // Implicit type casting (widening)
        int c=100;
        double d=c;
        System.out.println("the value of int is " + c);
        System.out.println("the value of double type casted implicitly from int of " + c + " is " + d);
        sc.close();
    }
}
