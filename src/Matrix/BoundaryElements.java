package Matrix;

import java.util.Scanner;
public class BoundaryElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Get matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        // 2. Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // 3. Print boundary elements
        System.out.println("Boundary Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check if the element is on any of the 4 outer edges
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    // Print spaces for inner elements to maintain the matrix shape
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}