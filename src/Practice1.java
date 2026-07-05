
public class Practice1 {
    public static void main(String[] args) {
        int a = 1234;
        int rev=0;
        while (a != 0) {
            int b = a % 10; // 1234 % 10 --> 4 123% 10 --> 3 12%10 --> 2 -> 1
            rev = rev * 10 + b; //0 x 10 =0 + 4 =4 3 2 1
            a = a / 10;
        }
        System.out.println(rev);
    }
}
