package myName;

public class advancepattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){// outer loop
            for(int j=1;j<=i;j++){ // 1st star part
                System.out.print("*");
            } 
            for(int j=1;j<=2*(n-i);j++){ //spaces part
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ // 2nd star part
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=n;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }



        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print(i+" ");
        //         }
        //         System.out.println();
        // }



        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     for(int j=2;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();


            // }

            // for(int i=n;i>=1;i--){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     for(int j=2;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();

                
        }
            // }
    }

