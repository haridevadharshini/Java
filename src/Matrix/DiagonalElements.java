package Matrix;

import java.util.Arrays;
import java.util.Scanner;
public class DiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Get matrix size (Diagonals require a square matrix)
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        // 2. Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Arrays to hold the diagonal elements
        int[] primaryDiagonal = new int[n];
        int[] secondaryDiagonal = new int[n];
        // 3. Extract diagonals in a single pass
        for (int i = 0; i < n; i++) {
            primaryDiagonal[i] = matrix[i][i];       // Row index == Column index
            secondaryDiagonal[i] = matrix[i][n - 1 - i]; // Row increases, Column decreases
        }
        // 4. Print results
        System.out.println("Primary Diagonal (Top-Left to Bottom-Right):");
        System.out.println(Arrays.toString(primaryDiagonal));
        System.out.println("Secondary Diagonal (Top-Right to Bottom-Left):");
        System.out.println(Arrays.toString(secondaryDiagonal));
    }
}