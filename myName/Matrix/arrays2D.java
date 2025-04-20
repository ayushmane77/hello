import java.util.Scanner;
public class arrays2D {
    // public static void main(String[] args) {
    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("enter the number of rows ");
    //    int rows=sc.nextInt();
    //    System.out.println("enter the number of columns");
    //    int columns=sc.nextInt();
    //    int[][] numbers=new int[rows][columns];
    //    for(int i=0;i<rows;i++){
    //     for(int j=0;j<columns;j++){
    //         numbers[i][j]=sc.nextInt();
    //     }
    //    }
    //    // output
    //    System.out.println("the matrix is");
    //    for(int i=0;i<rows;i++){
    //     for(int j=0;j<columns;j++){
    //         System.out.print(numbers[i][j]+" ");
    //     }
    //     System.out.println();
    //    }
    //    sc.close(); 

    // q3] searching an element from a user input array
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of rows");
        int row=sc.nextInt();
        System.out.println("enter the number of columns");
        int col=sc.nextInt();
        int [][] num = new int[row][col]; 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the number you want to search");
        int searchnum=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==searchnum){
                    System.out.print("the indexes are " + i + " and " + j);
                    
                }
            }
        }
        sc.close();
    }
    }

