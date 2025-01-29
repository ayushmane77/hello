package myName.javaRequiredBasics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearningStreams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
        // Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, a generator function, or an I/O channel, through a pipeline of computational operations.
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(14);
        number.add(25);
        number.add(32);
        number.add(18);
        number.add(57);
        number.add(61);
        Arrays.sort(args);

        // way to print only even numbers
        for(Integer i:number){
            if(i%2==0){
                System.out.println(i);
            }
        }

        // another way to print only even numbers from the arraylist of Integers
        
        List<Integer> evenNumberSquare=number.stream()
        .filter(e->e % 2 == 0)
        .collect(Collectors.toList());
        System.out.println(evenNumberSquare);

        // ways of creating a stream.
        String names[]={"Ayush","Tushar","Saket","Anish"};
        Stream<String> stream=Arrays.stream(names);
        System.out.println(stream);

        Stream<Integer> values=Stream.of(23,52,13,53,64,61,35);
        System.out.println(values);

        // Stream<Character> chr=Stream.of('a','w');
        // or
        
        
        sc.close(); 
    }
}
