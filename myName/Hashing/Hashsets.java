package myName.Hashing;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
public class Hashsets {

    // Hashsets do not have indexes, so need to use iterator for accessing the element inside hashets
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(45); // adds new element inside the hashset with boolean as its return type
        h.add(50);
        h.add(34);
        h.add(50);

        System.out.println("is 45 present in the hashset : " + h.contains(45)); // "contains" method returns 
        // the boolean value that whether the element is present inside the hashset or not.

        System.out.println("is 75 present in the hashset : " + h.contains(75)); // returns false.

        System.out.println("our newly created Hashet is " + h); // returns [45,50,34] in any order, 
        // but no duplicates

        System.out.println(h.size()); // returns an int value of the size of the Hashets.

        h.remove(34); // removes the specified element from the hashets with the return type as boolean.
        System.out.println(h.size());

        Iterator<Integer> i = h.iterator();
        while(i.hasNext()){
            Integer elem=i.next(); // can also work for specifiying int as a datatype.
            System.out.println(elem);
        }

        // or we can also use a for each loop
        for(Integer j : h){
            System.out.println(j);
        }
        sc.close();
    }
}
