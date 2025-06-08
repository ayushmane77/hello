package myName.Hashing;
// import java.util.HashMap;
import java.util.Scanner;
// import java.util.Arrays;
public class charactersFrequencyInSortedOrder {

    // public static void CharacterCountInSortedOrder(String str){
    //     HashMap<Character,Integer> h = new HashMap<>();
    //     for(int i=0;i<str.length();i++){
    //         h.put(str.charAt(i),h.getOrDefault(str.charAt(i), 0)+1);
    //     }

    //     char arr[] = str.toCharArray();
    //     Arrays.sort(arr);
        
    //     System.out.println(arr[0] + " count is " + h.get(arr[0]));
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]!=arr[i-1]){
    //             System.out.println(arr[i] + " count is " + h.get(arr[i]));
    //         }
    //     }
    // }
    // time complexity : O(nlogn)
    // auxiliary space : O(N)

    public static void CharacterCountInSortedOrder(String str){
        int ch[] = new int[26];
        for(int i=0;i<str.length();i++){
            ch[str.charAt(i)-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]>0){
                System.out.println((char)(i+'a') + " count is " + ch[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        CharacterCountInSortedOrder(str);
        sc.close();
    }
}
