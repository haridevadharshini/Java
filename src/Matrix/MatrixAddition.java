package Matrix;

import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Get matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
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
        // 4. Add matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // 5. Print the result in nested bracket format
        /*System.out.print("[");
        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j]);
                if (j < cols - 1) System.out.print(",");
            }
            System.out.print("]");
            if (i < rows - 1) System.out.print(",");
        }
        System.out.println("]");
        scanner.close(); */
        System.out.println(Arrays.deepToString(sum));
    }
}