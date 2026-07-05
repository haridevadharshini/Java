package Patterns;

public class HourglassPattern {
    public static void main(String[] args) {
        int n = 5;

        // Top half
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
