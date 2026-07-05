package Strings;

public class StringEncoding {
    public static void main(String[] args){
        String s = "aaaabbcccc";
        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        encoded.append(s.charAt(s.length() - 1)).append(count);

        System.out.println(encoded.toString()); // Output: a4b2c4

    }
}
