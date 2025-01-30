package myName.javaRequiredBasics.CollectionFrameWorks.lists;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class listInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> li=new ArrayList<Integer>();
        li.add(43);
        li.add(13);
        li.add(23);
        li.add(73);
        li.add(53);
        System.out.println(li);
        li.add(2, 77); // adds particular element at the required and specified index
        System.out.println(li);
        System.out.println(li.get(2));
        System.out.println(li.indexOf(73));
        li.set(1, 18);
        System.out.println(li);
        sc.close();
    }
}
