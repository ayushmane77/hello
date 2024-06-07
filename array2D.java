import java.util.Scanner;

// import javax.xml.validation.Schema;
public class array2D {
    public static void main(String[] args) {

        // q1] transpose of the matrix


    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the number of rows");
    //     int row=sc.nextInt();
    //     System.out.println("enter the number of columns");
    //     int col=sc.nextInt();
    //     int [][] matrix=new int[row][col];
    //     System.out.println("enter the values in original matrix");
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             matrix[i][j]=sc.nextInt();
    //         }
    //     }
    //     System.out.println("this is the transpose matrix");
    //     for(int i=0;i<col;i++){
    //         for(int j=0;j<row;j++){
    //             System.out.print(matrix[j][i]+" ");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // 

    // q2] printing the boundary of the matrix


    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the no of rows");
    // int row=sc.nextInt();
    // System.out.println("enter the no of columns");
    // int col=sc.nextInt();
    // int [][] matrix=new int[row][col];
    // System.out.println("enter the values in the matrix");
    // for(int i=0;i<row;i++){
    //     for(int j=0;j<col;j++){
    //         matrix[i][j]=sc.nextInt();
    //     }
    // }
    // System.out.println("the boundary elements in the array are");
    // for(int i=0;i<row;i++){
    //     for(int j=0;j<col;j++){
    //         if(i==0||j==0||i==row-1||j==col-1){
    //             System.out.print(matrix[i][j]+" ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // sc.close();

    // q4] sum of diagonal elements in the matrix

    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the no of rows");
    // int row=sc.nextInt();
    // System.out.println("enter the no of columns");
    // int col=sc.nextInt();
    // int [][] mat=new int[row][col];
    // int PrimaryDiagonalSum=0;
    // int secondaryDiagonalSum=0;
    // System.out.println("enter the elements in the matrix");
    // for(int i=0;i<row;i++){
    //     for(int j=0;j<col;j++){
    //         mat[i][j]=sc.nextInt();
    //     }
    // }
    // for(int i=0;i<row;i++){
    //     for(int j=0;j<col;j++){
    //         if(i==j){
    //             PrimaryDiagonalSum=PrimaryDiagonalSum+mat[i][j];
    //         }
    //     }

    // }

    // for (int i = 0; i < row; i++) {
    //     for (int j = 0; j < col; j++) {
    //         if (i + j == row - 1) {
    //             secondaryDiagonalSum += mat[i][j];
    //         }
    //     }
    // }
    // System.out.println("the sum of diagonal is " + PrimaryDiagonalSum);
    // System.out.println("the sum of diagonal is " + secondaryDiagonalSum);
    // sc.close();


    // q5] matrix multiplication

//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number of rows");
//     int row=sc.nextInt();
//     System.out.println("enter the number of columns");
//     int col=sc.nextInt();
//     int [][] mat1=new int[row][col];
//     System.out.println("enter the values in the matrix 1");
//     for(int i=0;i<row;i++){
//         for(int j=0;j<col;j++){
//             mat1[i][j]=sc.nextInt();
//         }
//     }
//     System.out.println("enter the number of rows");
//     int row2=sc.nextInt();
//     System.out.println("enter the number of columns");
//     int col2=sc.nextInt();
//     int [][] mat2=new int[row2][col2];
//     for(int i=0;i<row2;i++){
//         for(int j=0;j<col2;j++){
//             mat2[i][j]=sc.nextInt();
//         }
//     }
//     if(col==row2){
//         int [][] result=new int[row][col2];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col2;j++){
//                 for(int k = 0; k < row2; k++) {
//                     result[i][j] = result[i][j]+ (mat1[i][k] * mat2[k][j]);
//                 }
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col2;j++){
//                 System.out.print(result[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     sc.close();
// }

        // Or Or    

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of rows of 1st matrix");
    int row1=sc.nextInt();
    System.out.println("enter the no of columns of 2nd matrix");
    int col1=sc.nextInt();
    int [][] matrix1=new int[row1][col1];
    System.out.println("enter the elements inside 1st matrix");
    for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
            matrix1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter the number of rows of 2nd matrix");
    int row2=sc.nextInt();
    System.out.println("enter the number of columns of 2nd matrix");
    int col2=sc.nextInt();
    int [][]matrix2=new int[row2][col2];
    System.out.println("enter the elements inside 2nd matrix");
    for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
            matrix2[i][j]=sc.nextInt();
        }
    }
    if(col1==row2){
        int [][] result=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                int sum=0;
                for(int k=0;k<row2;k++){
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                result[i][j]=sum;
            }
        }
        System.out.println("here is the multiplication of two matrix");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                 System.out.print(result[i][j]+" ");
                }
            System.out.println();
        }
    }
    else{
        System.out.println("the number of columns of first row should be equal to the number of rows of second matrix");
    }
    sc.close();

    }
}

    // q6]addition of two matrix


//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number of rows of 1st matrix");
//     int row=sc.nextInt();
//     System.out.println("enter the number of columns of 1st matrix");
//     int col=sc.nextInt();
//     int [][] matrix=new int[row][col];
//     System.out.println("enter the elemnts of the matrix 1");
//     for(int i=0;i<row;i++){
//         for(int j=0;j<col;j++){
//             matrix[i][j]=sc.nextInt();
//         }
//     }
//     System.out.println("enter the number of rows for 2nd matrix");
//     int row2=sc.nextInt();
//     System.out.println("enter the number of columns of 2nd matrix");
//     int col2=sc.nextInt();
//     System.out.println("enter the elements of the matrix 2");
//     int [][]matrix2=new int[row2][col2];
//     for(int i=0;i<row2;i++){
//         for(int j=0;j<col2;j++){
//             matrix2[i][j]=sc.nextInt();
//         }
//     }
//     if (row==row2 && col==col2 ) {
//         int [][]result=new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 result[i][j]=matrix[i][j]+matrix2[i][j];
//             }
//         }
//         System.out.println("the resultant matrix is ");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print(result[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     else{
//         System.out.println("the number of rows and columns should be equal");
//     }
//     sc.close();
//     }
// }
