import java.util.Scanner;
public class RepeatLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String lastN = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + lastN;
        }
        System.out.println(result);
    }
}
