package myName.strings;
// import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
public class LeftMostrepeatingCharacter {

    // Naive solution
    // public static int indexOfLeftMostRepeatingCharacter(String str){
    //     for(int i=0;i<str.length();i++){
    //         for(int j=i+1;j<str.length();j++){
    //             if(str.charAt(i)==str.charAt(j)){
    //                 return i;
    //             }
    //         }
    //     }
    //     return -1;
    // }
    // time complexity : O(N^2)
    // Auxiliary space : O(1)


    // Better solution

    // public static int indexOfLeftMostRepeatingCharacter(String str){
    //     HashMap<Character,Integer> h = new HashMap<>();
    //     for(int i=0;i<str.length();i++){
    //         h.put(str.charAt(i),h.getOrDefault(str.charAt(i), 0)+1);
    //     }
    //     for(int i=0;i<str.length();i++){
    //         if(h.get(str.charAt(i))>1){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // time complexity : O(N)
    // Auxiliary space : O(N)

    // Another better solution

    // public static int indexOfLeftMostRepeatingCharacter(String str){
    //     int res = -1;
    //     final int len = 256;
    //     int arr[] = new int[len];
    //     for(int i=0;i<str.length();i++){
    //         arr[str.charAt(i)]++;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         if(arr[str.charAt(i)]>1){
    //             return i;
    //         }
    //     }
    //     return res;
    // }
    // Time complexity : O(N)
    // Auxiliary space : O(1) , if we consider len = 256 as a constant(always fixed)


    // Another efficient solution
    // public static int indexOfLeftMostRepeatingCharacter(String str){
    //     int res = Integer.MAX_VALUE;
    //     final int len = 256;
    //     int arr[] = new int[len];
    //     Arrays.fill(arr,-1);
    //     for(int i=0;i<str.length();i++){
    //         int firstIndex = arr[str.charAt(i)];
    //         if(firstIndex==-1){
    //             arr[str.charAt(i)]=i;
    //         }
    //         else{
    //             res = Math.min(res,firstIndex);
    //         }
    //     }
    //     return (res==Integer.MAX_VALUE)?-1:res;
    // }
    // Time complexity : O(N)
    // Auxiliary space : O(1)


    // Efficient solution

    public static int indexOfLeftMostRepeatingCharacter(String str){
        final int len = 256;
        int res=-1;
        boolean visited[] = new boolean[len];
        Arrays.fill(visited,false);
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]==false){
                visited[str.charAt(i)]=true;
            }
            else{
                res=i;
            }
        }
        return res;
    }
    // time complexity : O(N)
    // Auxiliary space : O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int ans = indexOfLeftMostRepeatingCharacter(str);
        System.out.println("the index of left most repeating character from the given string is " + ans);
        sc.close();
    }
}
