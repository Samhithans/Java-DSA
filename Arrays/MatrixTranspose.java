package Arrays;

import java.util.Scanner;

public class MatrixTranspose {
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
        System.out.println("Transpose of the given matrix: ");
        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }
    }
}
