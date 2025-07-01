package myName.strings;
import java.util.Scanner;
public class checkForRotation {

    public static String rotateByOne(String str){
        char arr[] = str.toCharArray();
        char temp = arr[0];
        for(int i=1;i<str.length();i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        String newStr = new String(arr);
        return newStr;
    }

    public static boolean isRotated(String str, String rts){
        if(str.equals(rts)){
            return true;
        }
        String rotated=str;
        for(int i = 0;i<str.length();i++){
            rotated = rotateByOne(rotated);
            if(rotated.equals(rts)){
                return true;
            }
        }
        return false;
    }
    // Time complexity : O(N^2)
    // Auxiliary space : O(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        System.out.println("enter the rotated string");
        String rts = sc.nextLine();
        boolean res = isRotated(str,rts);
        System.out.println(res);
        sc.close();
    }
}
