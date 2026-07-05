package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n =5;
        for (int i = n; i >= 1; i--) {
            // Print spaces for right alignment
            for (int s = n; s > i; s--) {
                System.out.print("  "); // two spaces for alignment
            }
            // Print letters from i down to 1
            for (int j = i; j >= 1; j--) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
