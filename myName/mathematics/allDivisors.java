package myName.mathematics;
import java.util.Scanner;
public class allDivisors {
    // naive approach 

    // public static void getResult(int n){
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             System.out.println(i);
    //         }
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter any number");
    //     int n=sc.nextInt();
    //     getResult(n);
    //     sc.close();
    // }

    //  better approach 

    // public static void getDivisors(int n){
    //     for(int i=1;i*i<=n;i++){
    //         if(n%i==0){
    //             System.out.println(i);
    //             if(i!=n/i){
    //                 System.out.println(n/i);
    //             }
    //         }
            
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter any number");
    //     int n=sc.nextInt();
    //     getDivisors(n);
    //     sc.close();
    // }


    public static void getALLDivisors(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            // if(n%i==0 || i!=n/i){
            if(n%i==0){
                if(i!=n/i)
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        getALLDivisors(n);
        sc.close();
    }
}
