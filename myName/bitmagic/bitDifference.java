package myName.bitmagic;
import java.util.Scanner;
public class bitDifference {

    public static int noOfBitsToBeFlipped(int n,int m){
        int xOr=n^m;
        if(xOr==0){
            return -1;
        }
        int no_of_bits=0;
        while(xOr>0){
            if(xOr%2!=0){
                no_of_bits++;
                
            }
            xOr=xOr>>1;
        }
        return no_of_bits;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n=sc.nextInt();
        System.out.println("enter the second number");
        int m=sc.nextInt();
        int result=noOfBitsToBeFlipped(n,m);
        System.out.println(result);
        sc.close();
    }
}
