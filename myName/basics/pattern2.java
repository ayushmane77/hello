package myName.basics;

public class pattern2 {
    public static void main(String[] args) {
    //    for(int i=1;i<=4;i++){

    //     for(int j=1;j<=4-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //    }

    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    // for(int i=5;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    // int num=0;
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         num=num+1;
    //         System.out.print(num+" ");
    //     }
    //     System.out.println();
    // }
       
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         int sum=i+j;
    //         if(sum%2==0){
    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    // }

    int n=5,count=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(count%2==0){
                System.out.print(" 0 ");
            }
            else{
                System.out.print(" 1 ");
            }
            count=count+1;
        }
        System.out.println();
    }
    }
}
