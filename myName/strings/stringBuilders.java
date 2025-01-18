package myName.strings;
import java.util.Scanner;
public class stringBuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        // for inserting any char or string in a current stringBuilder, we use .insert(index,char) or insert(index,String) method
        System.out.println(sb.insert(2,'f'));

        // for changing the char at the required current StringBuider index, we use .setCharAt(index,char);
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // for deleting the char or substring from the currect StringBuilder , we use .delete() method
        System.out.println(sb.delete(2, 3));
        sc.close();
    }
}
