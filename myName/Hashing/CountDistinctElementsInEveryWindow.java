package myName.Hashing;
import java.util.Scanner;
import java.util.HashMap;
// import java.util.HashSet;
public class CountDistinctElementsInEveryWindow {

    // Naive solution
    // public static void DistinctCountInEveryWindow(int arr[],int k){
    //     for(int i=0;i<=arr.length-k;i++){
    //         HashSet<Integer> h = new HashSet<>();
    //         for(int j=i;j<k+i;j++){
    //             h.add(arr[j]);
    //         }
    //         System.out.println(h.size());
    //     }
    // }
    // time complexity : O(N*K)
    // auxiliary space : O(N)

    // Optimized solution using HashMap
    
    public static void DistinctCountInEveryWindow(int arr[],int k){
        HashMap<Integer,Integer> h = new HashMap<>();
        // first k elements
        for(int i=0;i<k;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1); // count frequency of each element in the first k elements
        }
        System.out.println(h.size()); // print the size of the map which gives the count of distinct elements in the first window

         // Remaining windows
        for(int i=k;i<arr.length;i++){
            int outGoing = arr[i-k]; // element that is going out of the window
            // Decrease the frequency of the outgoing element
            h.put(outGoing,h.getOrDefault(outGoing,0)-1); // decrease the count of the outgoing element
            if(h.get(outGoing)==0){ // if the count becomes zero, remove it from the map
                h.remove(outGoing);
            }
            int inComing = arr[i]; // element that is coming into the window
            // Increase the frequency of the incoming element
            h.put(inComing,h.getOrDefault(inComing,0)+1);
            System.out.println(h.size());
        }
    }
    // time complexity : O(N)
    // auxiliary space : O(N)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of the window");
        int k = sc.nextInt();
        DistinctCountInEveryWindow(arr,k);
        sc.close();
    }
}
