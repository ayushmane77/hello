package myName.javaRequiredBasics.encapsulation;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SignUp obj=new SignUp();
        System.out.println("please sign up ");
        System.out.print("enter the username : ");
        String userNAME=sc.nextLine();
        obj.setUserName(userNAME);

        System.out.print("enter the mobile number: ");
        int MOBILE=sc.nextInt();
        obj.setMobileNumber(MOBILE);
        sc.nextLine();
        
        System.out.print("enter the password: ");
        int PASSWORD=sc.nextInt();
        obj.setPassword(PASSWORD);
        sc.nextLine();

        System.out.println("welcome to the login process");

        System.out.print("enter the username: ");
        String userNAME1=sc.nextLine();

        System.out.print("enter the password: ");
        int PASSWORD1=sc.nextInt();

        System.out.println(obj.isAuthenticated(userNAME1, PASSWORD1));
        if(obj.isAuthenticated(userNAME1, PASSWORD1)==false){
            System.out.println("Authentication failed");
            System.out.println("click forgot password for 1 or click anything to exit ");
            int forgetPASSWORD=sc.nextInt();
            if(forgetPASSWORD==1){
                obj.forgetPassword();
            }
            else{
                System.out.println("process terminated");
            }
        }
        sc.close();
    }
}
