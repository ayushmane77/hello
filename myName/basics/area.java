package myName.basics;
import java.util.*;
public class area {
    public static void main(String[] args) {
        System.out.println("enter the radius of circle");
        Scanner S=new Scanner(System.in);
        int radius=S.nextInt();
        double area=3.14*radius*radius;
        System.out.println("the area of circle is " + area);
        S.close();
    }
}
