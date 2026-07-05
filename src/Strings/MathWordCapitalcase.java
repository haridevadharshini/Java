package Strings;

class MatchWordCapitalcase {
    public static void main(String[] args) {
        String input = "apple banana mango apple grape";
        String match = "banana";
        StringBuilder result = new StringBuilder();

        for (String word : input.split(" ")) {
            if (word.equalsIgnoreCase(match)) {
                // Convert to Capitalcase
                word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            }
            result.append(word).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
