package myName.javaRequiredBasics;

import java.util.Scanner;

public class Matrix {
    public static void helper(int mat[][],int n,int m){
        
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<m;j++){
                if(isPrime(mat[i][j])){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println("not valid");
                return;
            }
        }
        System.out.println("valid");
    }
    public static boolean isPrime(int x){
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=sc.nextInt();
        System.out.println("enter the no of columns");
        int m=sc.nextInt();   
        if(m<1 || n<1){
            System.out.println("invalid");
        }                           // a00,a01,a02,a03
        // a10,a11,a12,a13
        // a20,a21,a22,a23
        else{
            int mat[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            helper(mat,n,m);
        }
        sc.close();
    }
}
