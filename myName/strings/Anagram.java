package myName.strings;
// import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

    // naive solution

    // public static boolean isAnagram(String str,String str2){
    //     if(str.length()!=str2.length()){
    //         return false;
    //     }
    //     char arr[]=str.toCharArray();
    //     char arr2[]=str2.toCharArray();
    //     Arrays.sort(arr);
    //     Arrays.sort(arr2);
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=arr2[i]){
    //             return false;
    //         }
    //     }

    //     return true;
    // }
    // time complexity : O(nlogn)
    // auxiliary space : O(n)

    public static boolean isAnagram(String str1,String str2){
        int arr[] = new int[256];
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    // time complexity : O(N)
    // Auxiliary space : O(1)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String str=sc.nextLine();
        System.out.println("enter second string");
        String str2=sc.nextLine();
        boolean res=isAnagram(str,str2);
        System.out.println(res);
        sc.close();
    }
}
