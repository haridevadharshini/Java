package Strings;

class SplitOnHyphen {
    public static void main(String[] args) {
        String s = "Emma-is-a-data-scientist";
        String[] words = s.split("-");

        for (String word : words) {
            String capital = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            System.out.println(capital);
        }
    }
}
