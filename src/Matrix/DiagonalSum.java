package Matrix;
public class DiagonalSum {
    public static void main(String[] args) {
        // Predefined square matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;
        int primarySum = 0;
        int secondarySum = 0;
        // Compute diagonal sums in a single pass
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];         // Elements: [0][0], [1][1], [2][2]
            secondarySum += matrix[i][n - 1 - i]; // Elements: [0][2], [1][1], [2][0]
        }
        // Print the results
        System.out.println("Sum of Primary Diagonal: " + primarySum);     // 1 + 5 + 9 = 15
        System.out.println("Sum of Secondary Diagonal: " + secondarySum); // 3 + 5 + 7 = 15
    }
}