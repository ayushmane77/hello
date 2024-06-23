package myName.bitmagic;
import java.util.Scanner;
public class updateBit {

    public static void updateTheBit(int n,int m,int k){
        int bitmask=1;
        if(m==0 || m==1){
            if(m==0){
                bitmask=bitmask<<k;
                bitmask=~bitmask;
                System.out.println(n&bitmask);
            }
            else{
                m=1;
                bitmask=bitmask<<k;
                System.out.println(n|bitmask);
            }
        }
        else{
            System.out.println("please enter value between 0 or 1 for m");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the value either (0 or 1)");
        int m=sc.nextInt();
        System.out.println("enter the position you want to update bit");
        int k=sc.nextInt();
        updateTheBit(n,m,k);
        sc.close();
    }
}
