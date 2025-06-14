package myName.strings;
import java.util.Scanner;
public class NaivePatternSearching {

    public static void findIndexOfPattern(String txt, String ptt){
        int j = 0;
        for(int i = 0;i<txt.length();i++){
            if(txt.charAt(i)==ptt.charAt(j)){
                if(j==ptt.length()-1){
                    System.out.println(i-j);
                    j=0;
                }
                j++;
            }
            else{
                j=0;
            }    
        }
    } // only finds the index of first pattern found in original 'txt' string but misses other indexes pattern.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String txt = sc.nextLine();
        System.out.println("enter the pattern string");
        String ptt = sc.nextLine();
        findIndexOfPattern(txt,ptt);
        sc.close();
    }
}
