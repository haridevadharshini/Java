package Strings;

public class PalindromePossible {
    public static void main(String[] args){
        String str = "aabc";
        int[] freq = new int[26];
        for(int i =0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int i = 0;i<26;i++){
            if(freq[i] % 2 != 0){
                odd++;
            }
        }
        if(odd <= 1) System.out.println("Strings.Palindrome Possible");
        else System.out.println("Strings.Palindrome Not Possible");
    }
}
