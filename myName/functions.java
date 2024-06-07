package myName;
import java.util.Scanner;
import java.lang.Math;
public class functions {

    // public static int product(int num1,int num2){
    //     int mult=num1*num2;
    //     return mult;
    // }
    // public static void main(String[] args) {
    //    Scanner sc=new Scanner(System.in);
    //    int num1=sc.nextInt();
    //    int num2=sc.nextInt();
    //    int x=product(num1,num2);
    //    System.out.println(x);


    // factorial of a number

//     public static int factorial(int n){
//         int product=1;
//         if(n==0||n==1){
//             return 1;
//         }
//         else{
//             for(int i=1;i<=n;i++){
//                 product=product*i;
//             }
//             return product;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int fact=sc.nextInt();
//         System.out.println("the factorial of the number "+ fact + " is " + factorial(fact));
//         sc.close();
//     }

    // even or odd

    // public static void evenOdd(int n){
    //     if(n%2==0){
    //         System.out.println("it is even");
    //     }
    //     else{
    //         System.out.println("it is odd");
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println("enter a number");
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     evenOdd(num);
    //     sc.close();
    // }

    // to print a table of a given number

    public static void table(int n){
        for(int i =1;i<=10;i++){
            System.out.println(n+ " X " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        table(num);
        System.out.println(Math.pow(2, 3));
        sc.close();

    }
}