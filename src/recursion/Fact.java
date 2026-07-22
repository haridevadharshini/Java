package recursion;

import java.util.Scanner;

public class Fact {
    public static int getFact(int n){
        if(n==0 || n==1) return 1;
        return n*getFact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFact(n));
    }
}
