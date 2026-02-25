public class StringRevDeli {
    public static void main(String[] args) {
        String input = "Vision,tranz It :  Solutions";
        char[] result = input.toCharArray();
        String letters = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letters = ch + letters;
            }
        }
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (Character.isLetter(result[i])) {
                result[i] = letters.charAt(index);
                index++;
            }
        }
        System.out.println(new String(result));
    }
}
