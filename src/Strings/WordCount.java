package Strings;

class WordCount {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String[] words = s.trim().split("\\s+"); // split by one or more spaces
        System.out.println(words.length); // Output: 9
    }
}
