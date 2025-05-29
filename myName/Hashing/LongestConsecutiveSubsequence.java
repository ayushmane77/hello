package myName.Hashing;
// import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class LongestConsecutiveSubsequence {

    // NAIVE SOLUTION

    // public static int TheLongestConsecutiveSubSequence(int arr[]){
    //     int res=1;
    //     int current=1;
    //     Arrays.sort(arr);
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]==arr[i-1]+1){
    //             current++;
    //         }
    //         else if(arr[i]!=arr[i-1]){
    //             res=Math.max(res,current);
    //         }
    //     }
    //     return res;
    // }

    // OPTIMIZED SOLUTION

    public static int TheLongestConsecutiveSubSequence(int arr[]){
        int res=1;
        HashSet<Integer> h = new HashSet<>(); // using HashSet for O(1) lookups
        // Adding all elements to the HashSet
        for(int x: arr){ 
            h.add(x);  // O(1) average time complexity for insertion
        }
        for(int x: h){
            if(h.contains(x-1)==false){ // Check if x is the start of a sequence
                // If x-1 is not present, then x is the start of a new sequence
                int i=1;
                while(h.contains(x+i)){ // Check for consecutive elements
                    // If x+i is present, increment i
                    i++;
                    res=Math.max(res,i); // Update the result with the maximum length found
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=TheLongestConsecutiveSubSequence(arr);
        System.out.println("the longest consecutive sub sequence is " + ans);
        sc.close();
    }
}
