package myName.strings;

import java.util.Scanner;

public class Panaram {

    public static boolean isPanagram(String s){
        String str = s.toLowerCase();
        String newStr = str.replaceAll("[^a-z]", "");
        int count[] = new int[26];
        for(int i=0;i<newStr.length();i++){
            count[newStr.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                return false;
            }
        }
        return true;
    }
    // Time complexity : O(N)
    // Auxiliary space : O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        boolean res = isPanagram(s);
        System.out.println(res);
        sc.close();
    }
}
