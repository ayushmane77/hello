package myName.mathematics;
import java.util.Scanner;
public class modularInverse {

    public static int  gcd(int p,int q){
        while(p!=q){
            if(p>q){
                p=p-q;
            }
            else{
                q=q-p;
            }
        }
        return p;
    }

    public static int getResult(int a,int m){
        if(gcd(a,m)==1){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("Enter another number");
        int m=sc.nextInt();
        int x=getResult(a,m);
        if(x==1){
            for(int i=1;i<m;i++){
                if((a*i)%m==1){
                    System.out.println(i);
                    break;
                }
            }
        }
        else{
            System.out.println(x);
        }
        sc.close();
    }
}
