import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of rows");
      int row=sc.nextInt();
      System.out.println("enter the number of columns");
      int col=sc.nextInt();
      int [][] matrix = new int[row][col];
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
      }
      System.out.println("the transpose matrix is");
      for(int j=0;j<col;j++){
        for(int i=0;i<row;i++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
      sc.close();   
    }

    
}
