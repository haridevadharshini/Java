package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n =5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
