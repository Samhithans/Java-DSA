package Arrays;

import java.util.Scanner;

public class MatrixSpiral {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        System.out.println("Enter the numbers in the matrix");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Entered matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Spiral order of matrix: ");
        int rowStart=0,rowEnd=rows-1,colStart=0,colEnd=columns-1;

        while(colStart<=colEnd && rowStart<=rowEnd){
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(matrix[rowStart][i]+", ");
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(matrix[i][colEnd]+", ");
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                System.out.print(matrix[rowEnd][i]+", ");
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(matrix[i][colStart]+", ");
            }
            colStart++;
        }
    }
}
