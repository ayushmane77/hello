package myName.mathematics;
import java.util.Scanner;
public class HCF_numbers {
//     public static int get_HCF(int a,int b){
//         int min=Math.min(a, b);
//         while(min>0){
//             if(a%min==0 && b%min==0){
//                 break;
//             }
//             min--;
//         }
//         return min;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter first number");
//         int a=sc.nextInt();
//         System.out.println("enter second number");
//         int b=sc.nextInt();
//         int result=get_HCF(a,b);
//         System.out.println("the HCF of two numbers is "+ result);
//         sc.close();
//     }

// }


    public static int get_HCF(int a,int b){
        while (a!=b) {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    // public static int get_HCF(int a,int b){
    //     int i=1;
    //     int hcf=1;
    //     while(i<=a){
    //         if(a%i==0 && b%i==0){
    //             hcf=i;
                
    //         }
    //         i++;
    //     }
    //     return hcf;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int result=get_HCF(a,b);
        System.out.println("HCF is " + result);
        sc.close();
    }
}
