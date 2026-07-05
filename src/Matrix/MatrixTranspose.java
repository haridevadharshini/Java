package Matrix;

import java.util.*;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Get matrix dimensions from the user
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        // 2. Get matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // 3. Compute the transpose (dimensions become cols x rows)
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // 4. Print the result in the requested format
       /* System.out.print("[");
        for (int i = 0; i < cols; i++) {
            System.out.print("[");
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j]);
                if (j < rows - 1) System.out.print(",");
            }
            System.out.print("]");
            if (i < cols - 1) System.out.print(",");
        }
        System.out.println("]");

        scanner.close();*/
        System.out.println(Arrays.deepToString(transpose));
    }
}