package Patterns;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 3; // number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars (2*i - 1 stars)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
