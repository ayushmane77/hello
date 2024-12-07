package myName.mathematics;
import java.util.Arrays;
import java.util.Scanner;
public class sieveOfEratosthenes {

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
    // public static void printAllPrimeNumbers(int n){
    //     int i=1;
    //     while(n>i){
    //         if(isPrime(i)){
    //             System.out.println(i);
    //         }
    //         i=i+1;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n= sc.nextInt();
    //     printAllPrimeNumbers(n);
    //     sc.close();

    // }

    // time complexity =  O(n*n^1/2)
// -------------------------------------------------------------------
    // public static boolean isPrime(int m){
    //     for(int i=2;i*i<=m;i++){
    //         if(m%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void sieve(int n){
    //     boolean isprime[]=new boolean[n+1];
    //     Arrays.fill(isprime, true);
    //     for(int i=2;i*i<=n;i++){
    //         if(isPrime(i)){
    //             for(int j=2*i;j<=n;j=j+i){
    //                 isprime[j]=false;
    //             }
    //         }
    //     }
    //     for(int i=2;i<=n;i++){
    //         if(isprime[i]){
    //             System.out.println(i);
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter any number");
    //     int n=sc.nextInt();
    //     sieve(n);
    //     sc.close();
    // }
// ----------------------------------------------------------------------
    // public static boolean isPrime(int m){
    //     for(int i=2;i*i<=m;i++){
    //         if(m%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void printPrime(int n){
    //     boolean Array[]=new boolean[n+1];
    //     Arrays.fill(Array, true);
    //     for(int i=2;i<=n;i++){
    //         if(isPrime(i)){
    //             for(int j=i*i;j<=n;j=j+i){
    //                 Array[j]=false;
    //             }
    //         }
    //     }
    //     for(int i=2;i<=n;i++){
    //         if(Array[i]){
    //             System.out.println(i);
    //         }
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n=sc.nextInt();
    //     printPrime(n);
    //     sc.close();
    // }

// ------------------------------------------------------------------------
    public static boolean isPrime(int m){
        for(int i=2;i*i<=m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int n){
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        printPrime(n);
        sc.close();
    }
}
