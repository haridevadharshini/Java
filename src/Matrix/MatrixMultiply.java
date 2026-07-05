package Matrix;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Get matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] difference = new int[rows][cols];
        // 2. Input for Matrix 1
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        // 3. Input for Matrix 2
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // 4. Subtract matrices (Matrix1 - Matrix2)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        // 5. Print the result cleanly using deepToString
        System.out.println("Resulting Matrix:");
        System.out.println(Arrays.deepToString(difference));
    }
}