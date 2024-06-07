package myName;

public class homework {
    public static void main(String[] args) {

        // half pyramid 


        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // inverted half pyramid

        // int n=4;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){ 
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=4;j>=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){ 
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // int n=4,count=1;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(count+" ");
                
        //     }
        //     count++;
        //     System.out.println();
        // }
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
