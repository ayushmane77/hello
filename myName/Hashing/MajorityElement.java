package myName.Hashing;
import java.util.Scanner;
import java.util.HashMap;
public class MajorityElement {

    public static void majorityElement(int arr[]){
        int count=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }
        for(int x:h.keySet()){
            if(h.get(x)>arr.length/3){
                System.out.println(x +  " is majority element");
                count++;
            }
        }
        if(count==0){
            System.out.println("no majority element exist");
        }

        // time complexity : O(N) 
        // auxiliary space : O(N)
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element inside array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        majorityElement(arr);
        sc.close();
    }
}
