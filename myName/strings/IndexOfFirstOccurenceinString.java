package myName.strings;
import java.util.Scanner;
public class IndexOfFirstOccurenceinString {

    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int temp=-1;
        int j=0;
        int k;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                k=i;
                while(k<haystack.length() && j<needle.length() && haystack.charAt(k)==needle.charAt(j)){
                    if(j==needle.length()-1){
                        return i;    
                    }
                    k++;
                    j++;
                }
                //
            }
            temp=-1;
            j=0;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.nextLine();
        System.out.println("enter the second string");
        String str2=sc.nextLine();
        int ans=strStr(str1,str2);
        System.out.println("the first occurence is " + ans);
        sc.close();
    }
}
