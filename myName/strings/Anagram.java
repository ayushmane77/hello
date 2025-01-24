package myName.strings;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

    public static boolean isAnagram(String str,String str2){
        if(str.length()!=str2.length()){
            return false;
        }
        char arr[]=str.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }
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
