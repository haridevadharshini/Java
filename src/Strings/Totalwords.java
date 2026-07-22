package Strings;

public class Totalwords {
    public static void main(String[] args){
        String str = "Hello everyone, welcome to the world of programming.";
        String[] words = str.trim().split("\\s+");
        int count = str.trim().isEmpty() ? 0 : words.length;
        System.out.println("Total number of words: " + count);
    }
}
