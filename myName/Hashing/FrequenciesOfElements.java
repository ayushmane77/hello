package myName.Hashing;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class FrequenciesOfElements {

    // naive solution
    // public static void countOfEachElements(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         boolean flag=true;
    //         for(int j=0;j<i;j++){
    //             if(arr[i]==arr[j]){
    //                 flag=false;
    //                 break;
    //             }
    //         }
    //         if(flag){
    //             int freq=1;
    //             for(int j=i+1;j<arr.length;j++){
    //                 if(arr[i]==arr[j]){
    //                     freq++;
    //                 }
    //             }
    //             System.out.println("the frequency of element " + arr[i] + " is " + freq);
    //         }
    //     }
    // }
    // time complexity : O(n^2);

    public static void countOfEachElements(int arr[]){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:arr){
            h.put(x, h.getOrDefault(x, 0)+1);
        }
        // for(int e:arr){
        //     System.out.println("the frequency of " + e + " is " + h.get(e));
        // }
        for(Map.Entry<Integer,Integer> m : h.entrySet()){
            System.out.println(m.getKey() + " frequency is " + m.getValue());
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        countOfEachElements(arr);
        sc.close();
    }
}
