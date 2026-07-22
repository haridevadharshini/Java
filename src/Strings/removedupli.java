package Strings;

import java.util.Scanner;

public class removedupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res ="";
        for(char ch : s.toCharArray()){
            if(res.indexOf(ch)==-1) res +=ch;
        }
        System.out.println(res);
    }
}
