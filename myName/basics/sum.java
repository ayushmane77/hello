package myName.basics;
import java.util.*;
public class sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number\n");
        int a=sc.nextInt();
        System.out.println("enter the second number\n");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of " + a + "and" + b + "is" + sum);
        sc.close();
    }
}