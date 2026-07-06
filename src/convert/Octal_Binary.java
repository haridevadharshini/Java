package convert;
import java.util.*;
public class Octal_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();
        int decimal = Integer.parseInt(octal,8);
        System.out.println(Integer.toBinaryString(decimal));
    }
}
