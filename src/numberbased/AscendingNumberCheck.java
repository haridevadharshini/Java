package numberbased;

import java.util.Scanner;

public class AscendingNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isAscending = true;
        int prevDigit = 10; // start higher than any digit

        while (num > 0) {
            int currentDigit = num % 10;
            num /= 10;

            // Compare with previous digit (right to left)
            if (currentDigit > prevDigit) {
                isAscending = false;
                break;
            }
            prevDigit = currentDigit;
        }

        if (isAscending)
            System.out.println("Ascending number");
        else
            System.out.println("Not ascending number");
    }
}
