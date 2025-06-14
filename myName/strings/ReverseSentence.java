package myName.strings;
import java.util.Scanner;
public class ReverseSentence {

    // public static void reverseTheString(String str){
    //     String newstr = str.trim();
    //     String arr[] = newstr.split("\\s+");
    //     StringBuilder sb = new StringBuilder("");
    //     System.out.println(arr.length);
    //     for(int i=arr.length-1;i>=0;i--){
    //         sb.append(arr[i]);
    //         if(i!=0){
    //             sb.append(" ");
    //         }
    //     }
    //     System.out.println(sb);
    // }
    // time complexity : O(N)
    // Auxiliary space : O(N)


    public static void reverseTheString(String str){
        int start = 0;
        StringBuilder sb = new StringBuilder(str);
        for(int end = 0;end<str.length();end++){
            if(sb.charAt(end)==' '){
                reverse(sb,start,end-1);
                start = end + 1;
            }
            
        }
        reverse(sb,start,str.length()-1);
        reverse(sb,0,str.length()-1);
        System.out.println(sb);
    }

    public static void reverse(StringBuilder sb,int low, int high){
        char temp = ' ';
        while(low<high){
            temp = sb.charAt(low);
            sb.setCharAt(low, sb.charAt(high));
            sb.setCharAt(high, temp);
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        reverseTheString(str);
        sc.close();
    }
}
