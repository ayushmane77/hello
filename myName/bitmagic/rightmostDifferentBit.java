package myName.bitmagic;
import java.util.Scanner;
public class rightmostDifferentBit {
    public static int positionOfRightMostDefferentBit(int n,int m){
        int xOr=n^m;
        if(xOr==0){
            return -1;
        }
        int _xOr=~xOr + 1;
        int result=xOr & _xOr;
        int count=1;
        while(result>1){
            result=result>>1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int n=sc.nextInt();
        System.out.println("enter second number");
        int m=sc.nextInt();
        int position=positionOfRightMostDefferentBit(n,m);
        System.out.println(position);
        sc.close();
    }
}
