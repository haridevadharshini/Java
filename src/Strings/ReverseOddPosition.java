package Strings;

class ReverseOddPosition {
    public static void main(String[] args) {
        String s = "I love programming in python language";
        String pos = "odd";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            boolean isOdd = (i + 1) % 2 == 0; // 1-based odd positions
            if (pos.equalsIgnoreCase("odd") && isOdd) {
                result.append(new StringBuilder(words[i]).reverse());
            } else if (pos.equalsIgnoreCase("even") && !isOdd) {
                result.append(new StringBuilder(words[i]).reverse());
            } else {
                result.append(words[i]);
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
