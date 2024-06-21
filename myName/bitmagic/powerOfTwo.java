package myName.bitmagic;
import java.util.Scanner;
public class powerOfTwo {

    // public static boolean checkPowerOfTwo(int n){
    //     if(n!=0 && (n&(n-1))==0){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the number to check whether it is a power of 2");
    //     int n=sc.nextInt();
    //     boolean result=checkPowerOfTwo(n);
    //     System.out.println(result);
    //     sc.close();
    // }

    public static boolean checkPowerOfTwo(int n){
        while(n%2==0){
            n=n/2;
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check whether it is a power of 2");
        int n=sc.nextInt();
        boolean result=checkPowerOfTwo(n);
        System.out.println(result);
        sc.close();
    }
}
