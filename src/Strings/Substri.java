package Strings;

import java.util.Scanner;

public class Substri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = sc.nextLine();
        if(s.contains(a)){
            System.out.println(a +" is a substring of " + s);
        }
        else{
            System.out.println(a+" is not a substring of "+s);
        }

    }
}
