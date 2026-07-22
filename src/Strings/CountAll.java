package Strings;

import java.util.Scanner;

public class CountAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int l=0,d=0,s=0;
        for( int i =0;i<st.length();i++){
            char ch = st.charAt(i);
            if(Character.isLetter(ch)) l++;
            else if(Character.isDigit(ch)) d++;
            else if(ch==' ') s++;
        }
        System.out.println("letter count = "+l+ " digit count = "+d+" space count = "+s);
    }
}
