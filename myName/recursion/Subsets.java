
package myName.recursion;
import java.util.Scanner;
public class Subsets {

    public static void generateSubsets(String str,int index,String currString){
        int n=str.length();
        if(n==index){
            System.out.println(currString);
            return;
        }
        generateSubsets(str, index+1, currString+str.charAt(index));
        generateSubsets(str, index+1, currString);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int index=0;
        String currentString="";
        generateSubsets(str,index,currentString);
        sc.close();
    }
}
