package myName.mathematics;
import java.util.Scanner;
public class primeNUmber {

    // brute force method
    // public static boolean isPrimeOrNot(int n){
    //     if(n==1){
    //         return false;
    //     }
    //     else{
    //         for(int i=2;i<n;i++){
    //             if(n%i==0){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n=sc.nextInt();
    //     boolean result=isPrimeOrNot(n);
    //     System.out.println("the given number is " + result);
    //     sc.close();
    // }


    // better approach 

//     class Solution {
//     public boolean isPrime(int N) {
//       // code here
//       if(N==1){
//           return false;
//       }
//       if(N==2|| N==3){
//           return true;
//       }
//       if(N%2==0 || N%3==0){
//           return false;
//       }
//       for(int i=5;i*i<=N;i=i+6){
//           if(N%i==0 || N%(i+2)==0){
//               return false;
//           }
//       }
//       return true;
//     }
// }
    
    public static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        boolean result=checkPrime(n);
        System.out.println("the given number is " +  result);
        sc.close();
    }
}
