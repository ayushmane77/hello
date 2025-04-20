package myName.basics;
import java.util.Scanner;
public class homework2 {
//     public static void Average(int num1,int num2,int num3){
//         float avg=(float)(num1+num2+num3)/3;
//         System.out.println("the average of three numbers is " + avg);
//     }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter first number");
//     int num1=sc.nextInt();
//     System.out.println("enter second number");
//     int num2=sc.nextInt();
//     System.out.println("enter third number");
//     int num3=sc.nextInt();
//     Average(num1,num2,num3);
//     sc.close();
// }

//////////   function to print the sum of all n odd numbers from 1 to n


// public static void odd(int n){
//     int sum=0;
//     int i=1;
//     while(i<=n){
//         if(i%2!=0){
//             sum=sum+i;
            
//         }
//         i++;
//     }
//     System.out.println("the sum of all odd numbers is " + sum);
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     odd(n);
//     sc.close();
// }

/////////// function which takes two numbers as input and returns the greatest number


// public static void Greater(int num1,int num2){
//     if (num1>num2) {
//         System.out.println("the number " + num1 + " is greater " );
//     }
//     else{
//         System.out.println("the number " + num2 + " is greater");
//     }
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter first number");
//     int num1=sc.nextInt();
//     System.out.println("enter second number");
//     int num2=sc.nextInt();
//     Greater(num1,num2);

//     sc.close();
// }

///////// An infinite loop using do while loop
// public static void main(String[] args) {
//     int n=1;
//     do{
//         System.out.println("I will always be executed");
//     }while(n<2);
// }


// fibonacci series
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i=0;
    int j=1;
    
    int n=sc.nextInt();
    System.out.print(i+" ");
    for(int x=1;x<=n;x++){
        int sum=i+j;
        System.out.print(sum+" ");
        // int temp=i;
        i=j;
        j=sum;
        
    }
    sc.close();
}
}
