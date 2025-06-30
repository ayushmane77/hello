package myName.strings;
import java.util.Scanner;
public class KMP {

    public static void LPS(String ptt, int lps[]){
        lps[0] = 0; // lps[0] is always 0, as there is no proper prefix for a single character
        int i = 1; // i is the index for the pattern string
        // lps[i] will store the length of the longest prefix suffix for the pattern string
        int len = 0; // len is the length of the previous longest prefix suffix
        while(i<lps.length){
            if(ptt.charAt(i)==ptt.charAt(len)){ // if the characters match
                len++; // increment the length of the previous longest prefix suffix
                lps[i] = len; // set lps[i] to the length of the previous longest prefix suffix
                i++;
            }
            else{
                if(len==0){
                    lps[i] = 0; // if len is 0, we can just set lps[i] to 0
                    i++;
                }
                else{
                    len = lps[len-1]; // if the characters do not match, we can reset len to the last matched character's lps value
                    // this is the key step in KMP algorithm, we do not need to check the
                    // characters at i and j again, we can just check the next character in the pattern
                }
            }
        }
    }

    public static void kmp(String txt,String ptt){
        int lps[] = new int[ptt.length()]; // lps array to store the longest prefix suffix
        // for the pattern string
        LPS(ptt, lps);
        int i=0,j=0; //i is the index for txt and j is the index for ptt
        while(i<txt.length()){ 
            if(txt.charAt(i)==ptt.charAt(j)){ // if the characters match
                i++;
                j++;
            }
            if(j==ptt.length()){ // if we have found the pattern
                System.out.println("Patern found at index " + (i-j)); // print the index where the pattern is found
                j = lps[j-1]; // reset j to the last matched character's lps value
            }
            else if(i<txt.length() && txt.charAt(i)!=ptt.charAt(j)){ // if the characters do not match
                if(j==0){ // if j is 0, we can just increment i
                    i++;
                }
                else{
                    j = lps[j-1]; // reset j to the last matched character's lps value
                    // this is the key step in KMP algorithm, we do not need to check the 
                    i++; // character at i again, we can just check the next character in the pattern
                }
            }
        }
    }
    // Time complexity : O(N+M)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text string");
        String txt = sc.nextLine();
        System.out.println("enter the pattern string");
        String ptt = sc.nextLine();
        kmp(txt,ptt);
        sc.close();
    }
}
