import java.util.Scanner;
    public class RepeatChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String first2 = str.substring(0, 2);
            int n = str.length();
            String result = "";
            for (int i = 0; i < n; i++) {
                result = result + first2;
            }
            System.out.println(result);
        }
    }
