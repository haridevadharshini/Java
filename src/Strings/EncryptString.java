package Strings;

class EncryptString {
    public static void main(String[] args) {
        String s = "aaabccccddaaaaab";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1));
                if (count > 1) result.append(count);
                count = 1;
            }
        }

        // Append last character group
        result.append(s.charAt(s.length() - 1));
        if (count > 1) result.append(count);

        System.out.println(result.toString()); // Output: a3bc4d2a5b
    }
}
