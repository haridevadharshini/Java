import java.util.Scanner;
public class MixString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = "";
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }
        if (a.length() > b.length()) {
            result = result + a.substring(minLength);
        } else {
            result = result + b.substring(minLength);
        }
        System.out.println(result);
    }
}
