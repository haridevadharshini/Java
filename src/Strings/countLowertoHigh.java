package Strings;

public class countLowertoHigh {
    public static void main(String[] args) {
        String s = "accept Van";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);

            // Skip non-letter characters
            if (!Character.isLetter(c1)) continue;

            // Find next letter (skip spaces or non-letters)
            int j = i + 1;
            while (j < s.length() && !Character.isLetter(s.charAt(j))) {
                j++;
            }

            if (j < s.length()) {
                char c2 = s.charAt(j);
                if (Character.isLowerCase(c1) && Character.isUpperCase(c2)) {
                    count++;
                }
            }
        }

        System.out.println(count); // Output: 2
    }
}
