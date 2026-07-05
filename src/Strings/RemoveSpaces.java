package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String text = "  Learn  Java  Programming  ";
        String result = text.replace(" ", "");

        System.out.println(result);
// Output: LearnJavaProgramming
    }
}
