package Matrix;
public class MatrixSymmetry {
    public static void main(String[] args) {
        // Predefined square matrix
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        int n = matrix.length;
        boolean isSymmetric = true;
        // Check if the matrix is symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // Only checking the lower triangle against the upper triangle
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }
        // Print the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}