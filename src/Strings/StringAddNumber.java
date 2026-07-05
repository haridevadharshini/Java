package Strings;

public class StringAddNumber {
    public static void main(String[] a) {
        String s = "5ingt44t3";
        int sum = 0;
        String temp = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c;
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.isEmpty()) sum += Integer.parseInt(temp);
        System.out.println(sum); // Output: 52

    }
}