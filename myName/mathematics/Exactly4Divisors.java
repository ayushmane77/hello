package myName.mathematics;
import java.util.Scanner;
public class Exactly4Divisors {

    public static int SumOf4Divisors(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==4){
                for(int j=1;j*j<=arr[i];j++){
                    if(arr[i]%j==0 && j!=arr[i]/j){
                        sum=sum+j+arr[i]/j;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=SumOf4Divisors(arr);
        System.out.println(ans);
        sc.close();
    }
}
