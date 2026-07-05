package Strings;

public class Practice10 {
    public static void main(String[] args) {
        String a ="moom";
        String rev ="";
        for(int i =a.length()-1;i>=0;i--){
            char c = a.charAt(i);
            rev += c;
        }
        String res = (a.equals(rev))?"Strings.Palindrome":"Not Strings.Palindrome";
        System.out.println(res);
    }
}
