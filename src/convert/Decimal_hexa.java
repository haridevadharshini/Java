package convert;
import java.util.Scanner;
public class Decimal_hexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println(Integer.toHexString(decimal).toUpperCase());
    }
}
