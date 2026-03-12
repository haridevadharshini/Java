import java.util.Scanner;
public class ConcatenateString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            s2 = s2.substring(1);
        }
        String result = s1 + s2;
        System.out.println(result);
    }
}
