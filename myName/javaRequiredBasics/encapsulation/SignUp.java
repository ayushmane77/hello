package myName.javaRequiredBasics.encapsulation;
import java.util.Scanner;
import java.util.Random;
public class SignUp {
    private String userName;
    private int password;
    private int mobileNumber;
    public void setUserName(String userName){
        this.userName=userName;
        // getUSername();
    }
    // private String getUSername(){
    //     return userName;
    // }
    public void setMobileNumber(int mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public void setPassword(int password){
        this.password=password;
    }
    public boolean isAuthenticated(String Username, int Password){
        if(userName.equals(Username) && password == Password){
            return true;
        }
        else{
            return false;
        }
    }
    private void ModifyPassword(){
        System.out.println("enter the new password");
        Scanner sc=new Scanner(System.in);
        int newPassword=sc.nextInt();
        setPassword(newPassword);
        System.out.println("passord updated");
        System.out.println("enter new password");
        boolean result=isAuthenticated(userName, newPassword);
        System.out.println(result);
        sc.close();
    }
    private void verificationCode(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int code=rand.nextInt(10000);
        System.out.println("this is the verification code " + code);
        System.out.println("enter the verification code");
        int verifyCode=sc.nextInt();
        if(code==verifyCode){
            System.out.println("code matched");
            ModifyPassword();
        }
        else{
            System.out.println("verification code failed .. it is invalid");
        }
        sc.close();
    }
    public void forgetPassword(){
        System.out.println("this is your username " + userName);
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your mobile number");
        int mNumber=sc.nextInt();
        if(mobileNumber==mNumber){
            verificationCode();
        }
        else{
            System.out.println("invalid mobile number");
        }
        sc.close();
    }
}
