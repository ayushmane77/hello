package myName.strings;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.HashMap;
public class LeftMostNonRepeatingCharacter {

    // Naive solution
    // public static int IndexOfLeftMostNonRepeatingCharacter(String str){
    //     int res = -1;
    //     for(int i=0;i<str.length();i++){
    //         boolean repeated = false;
    //         for(int j=0;j<str.length();j++){
    //             if(i!=j && str.charAt(i)==str.charAt(j)){
    //                 repeated = true;
    //                 break;
    //             }
    //         }
    //         if(repeated==false){
    //             return i;
    //         }
    //     }
    //     return res;
    // }
    // Time complexity : O(N^2)

    
    // better approach
    // public static int IndexOfLeftMostNonRepeatingCharacter(String str){
    //     HashMap<Character,Integer> h = new HashMap<>();
    //     for(int i=0;i<str.length();i++){
    //         h.put(str.charAt(i),h.getOrDefault(str.charAt(i), 0)+1);
    //     }
    //     for(int i=0;i<str.length();i++){
    //         if(h.get(str.charAt(i))==1){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // Time complexity : O(N)
    // Auxiliary space : O(N)

    // Another better approach
    // public static int IndexOfLeftMostNonRepeatingCharacter(String str){
    //     final int len = 256;
    //     int arr[] = new int[len];
    //     for(int i=0;i<str.length();i++){
    //         arr[str.charAt(i)]++;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         if(arr[str.charAt(i)]==1){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // time complexity : O(N)
    // Auxiliary space : O(1)


    // better solution
    public static int IndexOfLeftMostNonRepeatingCharacter(String str){
        
        final int len = 256;
        int arr[] = new int[len];
        Arrays.fill(arr,-1);
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==-1){
                arr[str.charAt(i)] = i;
            }
            else{
                arr[str.charAt(i)] = -2;
            }
        }
        int res =Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(arr[i]>=0){
                res = Math.min(res, arr[i]);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }

    // time complexity : O(N)
    // space complexity O(1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int ans = IndexOfLeftMostNonRepeatingCharacter(str);
        System.out.println("The index of left most non repeating character from the given string is " + ans);
        sc.close();
    }
}
