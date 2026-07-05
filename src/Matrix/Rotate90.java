package Matrix;

import java.util.Arrays;
public class Rotate90 {
    public static void main(String[] args) {
        // Predefined square matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        // Directly map elements to their rotated positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        // Print the result
        System.out.println(Arrays.deepToString(rotated));
    }
}
