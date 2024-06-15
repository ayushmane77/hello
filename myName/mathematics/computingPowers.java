package myName.mathematics;
import java.util.Scanner;
public class computingPowers {
    // public static void giveResult(int n,int m){
    //     //long result=(long)Math.pow(n, m);
    //    // int result=(int)Math.pow(n, m);
    //    double result=Math.pow(n, m);
    //     System.out.println(result);
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n=sc.nextInt();
    //     System.out.println("enter the power to be compute");
    //     int m=sc.nextInt();
    //     giveResult(n,m);
    //     sc.close();
    // }

    // public static int  giveResult(int n, int m){
    //     int res=1;
    //     for(int i=0;i<m;i++){
    //         res=res*n;
    //     }
    //     return res;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n = sc.nextInt();
    //     System.out.println("enter the computing power");
    //     int m = sc.nextInt();
    //     int result=giveResult(n,m);
    //     System.out.println(result);
    //     sc.close();
    // }

    // ------------------------------------------------
    //recursive
    
    // public static int giveResult(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int temp=giveResult(x,n/2);
    //     temp=temp*temp;
    //     if(n%2==0){
    //         return temp;
    //     }
    //     else{
    //         return temp*x;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n=sc.nextInt();
    //     System.out.println("enter the computing power");
    //     int m=sc.nextInt();
    //     int result=giveResult(n,m);
    //     System.out.println(result);
    //     sc.close();
    // }


    // public static int giveResult(int x,int n){
    //     int res=1;
    //     while(n>0){
    //         if(n%2!=0){
    //             res=res*x;
    //         }
    //         x=x*x;
    //         n=n/2;
    //     }
    //     return res;
    // }
    //     public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int n=sc.nextInt();
    //     System.out.println("enter the computing power");
    //     int m=sc.nextInt();
    //     int result=giveResult(n,m);
    //     System.out.println(result);
    //     sc.close();
    // // }


    //-----------------------------------------------

    public static int giveResult(int a,int m)
    {
      //Your code here
      int min=Math.min(a,m);
      while(a>0){
          if(a%min==0||m%min==0){
              if(min==1){
                  for(int i=1;i<m;i++){
                      if((a * i) % m == 1){
                          return i;
                      }
                  }
              }
          }
          min--;
      }
      return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("enter the computing power");
        int m=sc.nextInt();
        int result=giveResult(n,m);
        System.out.println(result);
        sc.close();;
}
}