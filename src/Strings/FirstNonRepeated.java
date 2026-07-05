package Strings;

import java.util.*;

class FirstNonRepeated {
    public static void main(String[] args) {
        String s = "aabcdd";
        Map<Character, Integer> freq = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeated character
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println("No unique character found");
    }
}
