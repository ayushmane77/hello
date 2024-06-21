package myName.mathematics;
import java.util.Scanner;
public class primeFactors {

    // public static boolean isPrime(int m){
    //     if(m==1){
    //         return false;
    //     }
    //     else{
    //         for(int i=2;i*i<=m;i++){
    //             if(m%i==0){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    // public static void getAllPrimeFactors(int n){
    //     for(int i=2;i<n;i++){
    //         if(isPrime(i)){
    //             int x=i;
    //             while(n%x==0){

    //                 System.out.println(i);
    //                 x=x*i;
    //             }
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n=sc.nextInt();
    //     getAllPrimeFactors(n);
    //     sc.close();

    // }

    //---------------------------------------------------------

// efficient solution 

    // public static void printPrimeFactors(int n){
    //     if(n<2){
    //         return;
    //     }
    //     else{
    //         for(int i=2;i*i<=n;i++){
    //             while(n%i==0){
    //                 System.out.println(i);
    //                 n=n/i;
    //             }
    //         }
    //     }
    //     if(n>1){

    //         System.out.println(n); 
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number ");
    //     int n=sc.nextInt();
    //     printPrimeFactors(n);
    //     sc.close();
    // }

    // ---------------------------------------------------------------------

    // more efficient solution 
    public static void printPrimeFactors(int n){
        if(n<=1){
            return;
        }
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        printPrimeFactors(n);
        sc.close();
    }
}
