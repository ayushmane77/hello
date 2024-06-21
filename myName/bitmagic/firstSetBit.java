package myName.bitmagic;
import java.util.Scanner;
public class firstSetBit {

    public static int countOfFirstSetBit(int n){
        int res=1;
        while(n>0){
            if(n%2!=0){
                return res;
            }

            res++;
            n=n>>1;

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int result=countOfFirstSetBit(n);
        System.out.println(result);
        sc.close();
    }
}
