package myName.bitmagic;
import java.util.Scanner;

public class kthbitSetOrNot {

    // naive solution 

    // public static boolean chechKthBitIsSET(int n,int k){
    //     int x=1;
    //     for(int i=1;i<=k;i++){
    //         x=2*x;
    //     }
    //     if((n&k)!=0){
    //         return true;
    //     }
    //     return false;
    // }

    // efficient solution 

    public static boolean chechKthBitIsSET(int n,int k){
        int bitmask=1<<k;
        if((n&bitmask)!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number n");
        int n=sc.nextInt();
        System.out.println("enter the bit position you want to check if the bit is set or not");
        int k=sc.nextInt();
        boolean result=chechKthBitIsSET(n,k);
        System.out.println(result);
        sc.close();
    }
}
