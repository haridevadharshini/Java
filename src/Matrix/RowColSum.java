package Matrix;
import java.util.Arrays;
public class RowColSum {
        public static void main(String[] args) {
            // Predefined matrix (can be rectangular or square)
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[] rowSums = new int[rows];
            int[] colSums = new int[cols];
            // Calculate sums in a single nested loop pass
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rowSums[i] += matrix[i][j];
                    colSums[j] += matrix[i][j];
                }
            }
            // Print the results using Arrays.toString()
            System.out.println("Row Sums:    " + Arrays.toString(rowSums)); // [6, 15]
            System.out.println("Column Sums: " + Arrays.toString(colSums)); // [5, 7, 9]
        }
    }
