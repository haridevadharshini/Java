package Strings;

import java.util.*;
public class FreqHightoLow {
    public static void main(String[] args){
        String s = "repeatable";
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Sort by frequency (descending)
        freq.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
