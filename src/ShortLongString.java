import java.util.Scanner;
public class ShortLongString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result;
        if (a.length() < b.length()) {
            result = a + b + a;
        } else {
            result = b + a + b;
        }
        System.out.println(result);
    }
}
