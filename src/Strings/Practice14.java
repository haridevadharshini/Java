package Strings;

public class Practice14 {
    public static void main(String[] args) {
        String a = "hello";
        for (int i = 0; i < a.length(); i++) {
            if (i != a.length() - 1) {
                System.out.print(a.charAt(i) + ",");
            } else
                System.out.println(a.charAt(i));
        }
    }
}