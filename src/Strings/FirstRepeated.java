package Strings;

import java.util.*;

class FirstRepeated {
    public static void main(String[] args) {
        String s = "ababa";
        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                System.out.println(c); // first repeated character
                return;
            }
            seen.add(c);
        }

        System.out.println("No repeated character");
    }
}
