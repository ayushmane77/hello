package myName.bitmagic;
import java.util.Scanner;
public class sparseOrNor {

    public static boolean isSparse(int n){
        while(n>0){
            int count=0;
            while(n%2!=0){
                count++;
                n=n>>1;
            }
            if(count>=2){
                return false;
            }
            n=n>>1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean result=isSparse(n);
        System.out.println(result);
        sc.close();
    }
}
