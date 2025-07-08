package myName.strings;
import java.util.HashSet;
// import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWithDistinctCharacter {
    // Naive solution
    // public static int longestSubString(String str){
    //     int max = 1;
    //     for(int i=0;i<str.length();i++){
    //         HashSet<Character> h = new HashSet<>();
    //         for(int j=i;j<str.length();j++){
    //             if(h.contains(str.charAt(j))){
    //                 max = Math.max(max,h.size());
    //                 break;
    //             }
    //             else{
    //                 h.add(str.charAt(j));
    //                 max = Math.max(max,h.size());
    //             }
    //         }
    //     }
    //     return (str.length()>=1)?max:0;
    // }
    // Time complexity : O(N^2)
    // Space complexity : O(N) 


    // Another Naive solution

    // public static boolean Contains(String str, int i,int j){
    //     boolean visited[] = new boolean[256];
    //     for(int k=i;k<=j;k++){
    //         if(visited[str.charAt(k)]){
    //             return false;
    //         }
    //         visited[str.charAt(k)] = true;
    //     }
    //     return true;
    // }
    // public static int longestSubString(String str){
    //     int max = 1;
    //     for(int i=0;i<str.length();i++){
    //         for(int j=i;j<str.length();j++){
    //             if(Contains(str,i,j)){
    //                 max = Math.max(max,j-i+1);
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    //     return (str.length()>=1)? max : 0;
    // }
    // Time complexity : O(N^2)

    // Optimized solution

    public static int longestSubString(String str){
        int left = 0; 
        int right = 0;
        int max = 0;
        HashSet<Character> h = new HashSet<>();
        while(right<str.length()){
            if(h.contains(str.charAt(right))){
                h.remove(str.charAt(left));
                left++;
            }
            else{
                h.add(str.charAt(right));
                max = Math.max(max,right-left+1);
                right++;
            }
        }
        return max;
    }
    // Time complexity : O(N)
    // Auxiliary space : O(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int ans = longestSubString(str);
        System.out.println(ans);
        sc.close();
    }
}
