package numberbased;

import java.util.Scanner;

public class Digitaltime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();  // Input like "07:05:45PM"

            // Extract suffix (AM/PM) and hour
            String ampm = s.substring(8);
            int hour = Integer.parseInt(s.substring(0, 2));
            String minutesSeconds = s.substring(2, 8); // :mm:ss

            if (ampm.equals("AM")) {
                if (hour == 12) {
                    hour = 0; // midnight case
                }
            } else { // PM
                if (hour != 12) {
                    hour += 12; // add 12 for PM except 12 PM
                }
            }

            // Print result in 24-hour format
            System.out.printf("%02d%s%n", hour, minutesSeconds);
        }
    }
