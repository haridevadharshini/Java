import java.util.Scanner;

public class StepNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Convert to string for digit comparison
        String s = String.valueOf(num);
        boolean isStep = true;

        for (int i = 0; i < s.length() - 1; i++) {
            int d1 = s.charAt(i) - '0';
            int d2 = s.charAt(i + 1) - '0';
            if (Math.abs(d1 - d2) != 1) {
                isStep = false;
                break;
            }
        }

        if (isStep) {
            System.out.println(num + " is a Step Number");
        } else {
            System.out.println(num + " is NOT a Step Number");
        }
    }
}
