package myName.strings;
import java.util.Scanner;
public class RabinKarp {

    static final int d = 256;
    public static void validSubStrings(String txt, String ptt,int q){
        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;
        int i;
        int j;
        int n = txt.length();
        int m = ptt.length();
        for(i=0;i<m-1;i++){ // computing h = d^(m-1) % q
            h = (h * d) % q;
        }
        // Calculate hash value for pattern and first window of text
        for(i=0;i<m;i++){
            p = ((d * p) + ptt.charAt(i)) % q;
            t = ((d * t) + txt.charAt(i)) % q;
        }
        // Slide the pattern over text one by one
        for(i=0;i<=n-m;i++){
            // Check the hash values of current window of text and pattern
            if(p==t){
                // If the hash values match, then only check characters one by one
                for(j=0;j<m;j++){
                    if(txt.charAt(i+j)!=ptt.charAt(j)){
                        break;
                    }
                }
                if(j==m){
                    System.out.println(i);
                }
            }
            // Calculate hash value for next window of text: Remove leading digit, add trailing digit
            if(i<n-m){
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i+m)) % q;
                // We might get negative value of t, converting it to positive
                if(t<0){
                    t = (t + q);
                }
            }
        }
    }
    // time complexity : O(n*m)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text string");
        String txt = sc.nextLine();
        System.out.println("enter the pattern");
        String ptt = sc.nextLine();
        int q = 101;
        validSubStrings(txt,ptt,q);
        sc.close();
    }
}
