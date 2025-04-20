package myName.basics;
import java.util.Scanner;;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the month");
        int month=sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("it is jan");
                break;
            case 2:
                System.out.println("it is feb");
                break;
            case 3:
                System.out.println("it is march");
                break;  
            case 4:
                System.out.println("it is april");
                break; 
            case 5:
                System.out.println("it is may");
                break;
            case 6:
                System.out.println("it is june");
                break;
            case 7:
                System.out.println("it is july");
                break;
            case 8:
                System.out.println("it is august");
                break;
            case 9:
                System.out.println("it is sept");
                break;  
            case 10:
                System.out.println("it is oct");
                break; 
            case 11:
                System.out.println("it is nov");
                break;
            case 12:
                System.out.println("it is dec");
                break;                          
            default:
                break;
        }
        sc.close();
        }
    }

