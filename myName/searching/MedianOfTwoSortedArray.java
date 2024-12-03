package myName.searching;
import java.util.*;
public class MedianOfTwoSortedArray {

    // NAIVE SOLUTION 

    // public static float findMedian(int arr1[],int arr2[]){
    //     int temp[]=new int[arr1.length+arr2.length];
    //     int i;
    //     for(i=0;i<arr1.length;i++){
    //         temp[i]=arr1[i];
    //     }
    //     int k=i;
    //     int r=0;
    //     for(int j=k;j<temp.length;j++){
    //         temp[j]=arr2[r];
    //         r++;
    //     }
    //     Arrays.sort(temp);
    //     if(temp.length%2==0){
    //         return (temp[temp.length/2]+temp[temp.length/2 - 1])/2;
    //     }
    //     else{
    //         return temp[temp.length/2];
    //     }
    // }

    // TIME COMPLEXITY: O((n+m)log(n*m))
    // where n is the size of first array and m is the size of second array

    //------------------------------------------------------------------------------------------------

    // Optimized approach :- Binary search

    public static double findMedian(int arr1[],int arr2[]){
        if(arr1.length>arr2.length){
            return findMedian(arr2, arr1);
        }
        int x=arr1.length;
        int y=arr2.length;
        int low=0;
        int high=x;
        while(low<=high){
            int partionX=(low+high)/2;
            int partionY=(x+y+1)/2 - partionX;
            int leftMaxOfX=(partionX==0)?Integer.MIN_VALUE:arr1[partionX-1];
            int RightMinOfX=(partionX==x)?Integer.MAX_VALUE:arr1[partionX];
            int leftMaxOfY=(partionY==0)?Integer.MIN_VALUE:arr2[partionY-1];
            int RightMinOfY=(partionY==y)?Integer.MAX_VALUE:arr2[partionY];
            if(leftMaxOfX<=RightMinOfY && leftMaxOfY<=RightMinOfX){
                if((x+y)%2==0){
                    return (double)(Math.max(leftMaxOfX,leftMaxOfY) + Math.min(RightMinOfX,RightMinOfY))/2;
                }
                else{
                    return (double)Math.max(leftMaxOfX, leftMaxOfY);
                }
            }
            else if(leftMaxOfX>RightMinOfY){
                high=partionX-1;
            }
            else{
                low=partionX+1;
            }
        }
        throw new IllegalArgumentException("Input array not sorted");
    }

    // Time complexity : O(log(min(m,n)))
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n1=sc.nextInt();
        System.out.println("enter the elements first array");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the elements inside second array");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        double median=findMedian(arr1,arr2);
        System.out.println("the median of two sorted array is " + median);
        sc.close();
    }
}
