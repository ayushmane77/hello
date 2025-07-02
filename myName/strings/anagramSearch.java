package myName.strings;

import java.util.Scanner;

public class anagramSearch {

    // public static boolean Anagram(String str,String ptt, int i){
    // int Char[] = new int[256];
    // for(int j=0;j<ptt.length();j++){
    // Char[ptt.charAt(j)]++;
    // Char[str.charAt(i+j)]--;
    // }
    // for(int j=0;j<Char.length;j++){
    // if(Char[j]!=0){
    // return false;
    // }
    // }
    // return true;
    // }

    // public static boolean isAnagram(String str, String ptt){
    // for(int i=0;i<=str.length()-ptt.length();i++){
    // if(Anagram(str,ptt,i)){
    // return true;
    // }
    // }
    // return false;
    // }

    // Time complexity : O((n-m+1)*m)
    // Space complexity : O(1)

    // Optimized approach

    public static boolean isSame(int StrArr[], int PttArr[]) {
        for (int i = 0; i < StrArr.length; i++) {
            if (StrArr[i] != PttArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String str, String ptt) {
        if(ptt.length()>str.length()){
            return false;
        }
        int StrArr[] = new int[256];
        int PttArr[] = new int[256];
        for (int i = 0; i < ptt.length(); i++) {
            StrArr[str.charAt(i)]++;
            PttArr[ptt.charAt(i)]++;
        }
        if (isSame(StrArr, PttArr)) {
            return true;
        }
        for (int i = ptt.length(); i < str.length(); i++) {
            StrArr[str.charAt(i)]++;
            StrArr[str.charAt(i - ptt.length())]--;
            if (isSame(StrArr, PttArr)) {
                return true;
            }
        }
        return false;
    }

    // Time complexity : O(N*CHAR) where CHAR = 256 (fixed)
    // Auxiliary space : O(1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text string");
        String str = sc.nextLine();
        System.out.println("enter the patterns");
        String ptt = sc.nextLine();
        boolean res = isAnagram(str, ptt);
        System.out.println(res);
        sc.close();
    }
}
