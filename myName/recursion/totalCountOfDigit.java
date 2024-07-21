package myName.recursion;

public class totalCountOfDigit {

    public static int countTotalDigit(int n){
        if(n==0){
            return 0;
        }
        return 1+countTotalDigit(n/10);
    }
    public static void main(String[] args) {
        int res=countTotalDigit(124);
        System.out.println(res);
    }
}
