package myName.basics;
import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner patt=new Scanner(System.in);
        // int n=4;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1|| j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=4;i++){
        //     for(int j=4;j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        patt.close();
    }
}
