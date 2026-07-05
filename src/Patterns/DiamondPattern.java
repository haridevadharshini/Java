package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Top half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
