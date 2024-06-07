package myName;
import java.util.Scanner;;
public class ifelse {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the age");
        // int age=sc.nextInt();
        // if(age<18){
        //     System.out.println("you cannot vote");
        // }
        // else{
        //     System.out.println("you can vote");
        // }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("same numbers");
        }
        else if (a>b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        sc.close();
    }
}
