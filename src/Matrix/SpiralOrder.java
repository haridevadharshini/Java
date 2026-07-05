package Matrix;

import java.util.ArrayList;
public class SpiralOrder {
    public static void main(String[] args) {
        // Predefined M x N matrix
        int[][] matrix = {
                {1,  2,  3},
                {5,5,6},{7,8,9}
        };
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        // Loop until boundaries cross each other
        while (top <= bottom && left <= right) {
            // 1. Traverse from Left to Right along the Top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Move top boundary down
            // 2. Traverse from Top to Bottom along the Right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move right boundary left
            // 3. Traverse from Right to Left along the Bottom row (if rows remain)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // Move bottom boundary up
            }
            // 4. Traverse from Bottom to Top along the Left column (if columns remain)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move left boundary right
            }
        }
        // Print final spiral order
        System.out.println(result);
        // Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
