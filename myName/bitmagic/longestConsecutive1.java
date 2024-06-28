package myName.bitmagic;
import java.util.Scanner;
public class longestConsecutive1 {

    public  static int consecutive1(int n){
        int max=0;
        while(n>0){
            int count=0;
            while(n%2!=0){
                count++;
                n=n>>1;
            }
            if(count>max){
                max=count;
            }
            n=n>>1;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=consecutive1(n);
        System.out.println(result);
        sc.close();
    }
}
