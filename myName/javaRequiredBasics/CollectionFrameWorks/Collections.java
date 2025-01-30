package myName.javaRequiredBasics.CollectionFrameWorks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Collections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // creating a new collection of arraylist and implementing its collection methods
        List<Integer> arr=new ArrayList<>();
        // these are some of the methods which are contained in the collection interface 
        arr.add(98);
        arr.add(34);
        arr.add(42);
        System.out.println(arr.contains(34));
        System.out.println(arr.size());
        System.out.println(arr);
        arr.remove(1); // removes an element from a specified index
        System.out.println(arr);
        arr.remove(Integer.valueOf(42)); // removes an element by passing an object.
        System.out.println(arr);
        arr.add(66);
        System.out.println(arr);
        Iterator<Integer> it=arr.iterator(); // iterator present in collections to iterate over collections and lists and many
        // other interfaces and data collection.
        while(it.hasNext()){
            System.out.println(it.next());
        }
        sc.close();
    }
}
