package myName.recursion;
import java.util.Scanner;
public class RopeCutting {

    public static int maxCuts(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<=-1){
            return -1;
        }
        int res=Math.max(maxCuts(n-a, a, b, c),Math.max(maxCuts(n-b, a, b, c),(maxCuts(n-c, a, b, c))));
        if(res==-1){
            return -1;
        }
        return res+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rope");
        int n=sc.nextInt();
        int result=maxCuts(n,11,9,12);
        System.out.println(result);
        sc.close();
    }
}
