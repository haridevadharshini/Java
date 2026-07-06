package convert;
import java.util.*;
public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println(Integer.toBinaryString(decimal));
    }
}
