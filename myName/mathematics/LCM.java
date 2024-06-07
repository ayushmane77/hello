package myName.mathematics;
import java.util.Scanner;

public class LCM {

    // public static int GetLCM(int a , int b ){
    //     int max=Math.max(a, b);
    //     while(true){
    //         if(max%a==0 && max%b==0){
    //             return max;
    //         }
    //         else{
    //             max++;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter first number");
    //     int a=sc.nextInt();
    //     System.out.println("enter the second number");
    //     int b=sc.nextInt();
    //     int lcm=GetLCM(a,b);
    //     System.out.println("the Lcm of given two numbers are " + lcm);
    //     sc.close();
    // }

// Optimal approach
    public static int getHCF(int a, int b){
       
        if(b==0){
            return a;
        }
        else{
            return getHCF(b, a%b);
        }
       
    }

    public static int getLCM(int a,int b){
        return (a*b)/getHCF(a,b);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a = Sc.nextInt();
        System.out.println("enter second number");
        int b = Sc.nextInt();
        int Lcm=getLCM(a,b);
        System.out.println("the lcm of given numbers are " + Lcm);
        Sc.close();
    }
}
