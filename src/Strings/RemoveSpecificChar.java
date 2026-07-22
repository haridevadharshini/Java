package Strings;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        s = s.replace(Character.toString(ch),"");
        System.out.println(s);
    }
}
