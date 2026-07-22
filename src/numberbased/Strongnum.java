package numberbased;

import java.util.Scanner;

public class Strongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        while(temp!=0){
            int digit=  temp%10;
            int fact =1;
            for(int i =1;i<=digit;i++){
            fact *=i;}
            sum +=fact;
            temp /= 10;
        }
        String res = (sum==a)?"Strong Num":"Not Strong";
        System.out.println(res);

    }
}
