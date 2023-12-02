package Arrays;

import java.util.Scanner;

public class MatrixSearchNumber {
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
        System.out.println("Enter the number to be searched");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Entered matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (n == matrix[i][j]) {
                    System.out.print("The element " + n + " is at " + "[ " + i + " , " + j + " ]");
                    System.exit(0);
                }

            }
        }
        System.out.println("Not found");
    }
}
