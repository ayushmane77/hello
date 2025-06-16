package myName.strings;
import java.util.Scanner;
public class NaivePatternSearching {

    // public static void findIndexOfPattern(String txt, String ptt){  
    //     for(int i=0;i<=txt.length()-ptt.length();i++){               
    //         int j;
    //         for(j=0;j<ptt.length();j++){
    //             if(txt.charAt(i+j)!=ptt.charAt(j)){
    //                 break;
    //             }
    //         }
    //         if(j==ptt.length()){
    //             System.out.println(i);
    //         }
    //     }
    // }
    // Time complexity : O((n-m+1)*m)

    // Improved naive pattern searching , only for patterns which are distinct
    public static void findIndexOfPattern(String txt, String ptt){
        for(int i=0;i<=txt.length()-ptt.length();){
            int j;
            for(j=0;j<ptt.length();j++){
                if(txt.charAt(i+j)!=ptt.charAt(j)){
                    break;
                }
            }
            if(j==ptt.length()){
                System.out.println(i);
            }
            if(j==0){
                i++;
            }
            else{
                i=i+j;
            }
        }
    }
    // Time complexity : O(N)
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
