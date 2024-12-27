package myName.searching;
import java.util.Scanner;

public class BookAllocation {
    // Efficient solution
    public static int MinimumofMaximumStudentAllocation(int arr[],int m){
        if(m>arr.length){
            return -1;
        }
        int ans=-1;
        int sum=0,Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            Max=Math.max(Max, arr[i]);
        }
        int low=Max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(arr,m,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    // Time complexity : O(n* log(S-M)) , where n is the number of books(size of array)
    //                   and S is the overall sum of the pages of books and M is the 
    //                   maximum book pages

    public static boolean isValid(int arr[],int m,int maxAllowedPages){
        int student=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxAllowedPages){
                return false;
            }
            if(arr[i]+pages<=maxAllowedPages){
                pages=pages+arr[i];
            }
            else{
                student++;
                pages=arr[i];
            }
        }
        return (student>m)?false:true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no of students for book alloction");
        int m=sc.nextInt();
        int ans=MinimumofMaximumStudentAllocation(arr,m);
        System.out.println("the minimum pages from maximum allocated pages are "+ans);
        sc.close();
    }
}
