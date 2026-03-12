import java.util.Scanner;

public class halfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        if (length % 2 == 0) {
            String result = str.substring(0, length / 2);
            System.out.println(result);
        } else {
            System.out.println("null");
        }
    }
}

