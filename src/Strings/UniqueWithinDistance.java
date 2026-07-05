package Strings;

import java.util.*;

class UniqueWithinDistance {
    public static void main(String[] args) {
        String s = "my name is granar";
        char ch = 'a';

        int first = s.indexOf(ch);
        int last = s.lastIndexOf(ch);

        if (first == -1 || last == -1 || first == last) {
            System.out.println(0);
            return;
        }

        String sub = s.substring(first + 1, last).replace(" ", "");
        Set<Character> unique = new HashSet<>();

        for (char c : sub.toCharArray()) {
            unique.add(c);
        }

        System.out.println(unique.size()); // Output: 7
    }
}
