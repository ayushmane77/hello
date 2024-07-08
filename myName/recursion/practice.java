package myName.recursion;

public class practice {

    // public static void fun(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     fun(n-1);
    //     System.out.println(n);
    // }

    public static int fun(int n){
        if(n==1){
            return 0;
        }
        return 1+fun(n/2);
    }
    public static void main(String[] args) {
        int res=fun(16);
        System.out.println(res);

       // int[] arr1[],arr2[][]=new int[5][4]; invalid 
    }
}
