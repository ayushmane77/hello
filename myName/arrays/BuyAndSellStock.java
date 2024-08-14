package myName.arrays;
import java.util.Scanner;
public class BuyAndSellStock {

    public static int maximumProfit(int price[]){
        int maxProfit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                maxProfit=maxProfit+(price[i]-price[i-1]);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.println("enter the prices inside array");
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int res=maximumProfit(price);
        System.out.println("the maximum profit is " + res);
        sc.close();
    }
}
