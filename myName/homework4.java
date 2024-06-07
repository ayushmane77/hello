package myName;
import java.util.*;
public class homework4 {
    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

   public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the size of array");
    // int n=sc.nextInt();
    // String array[]=new String[n];
    // int totalLength=0;
    // System.out.println("enter the names inside array");
    // for(int i=0;i<array.length;i++){
    //     array[i]=sc.next();
    //     totalLength=totalLength+array[i].length();
    // }
    // System.out.println("the total combined length of those strings are " + totalLength);
    // sc.close();


    // Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

    // Scanner sc=new Scanner(System.in);
    // System.out.println("please enter a string");
    // String user=sc.nextLine();
    // System.out.println(user.replace("e", "i"));
    // sc.close();


        // alternate way without using inbuild functions

    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String result="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='e'){
            result=result+'i';
        }
        else{
            result=result+str.charAt(i);
        }
    }
    System.out.println(result);

    sc.close();    


    // Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter your email");
    // String email=sc.next();
    // String userName="";
    // for(int i=0;i<email.length();i++){
    //     if(email.charAt(i)=='@'){
    //         break;
    //     }
    //     else{
    //         userName=userName+email.charAt(i);
    //     }
    // }
    // System.out.println(userName);
    // sc.close();

   }
}
