package numberbased;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp =a;
        int sum =0;
        while(a!=0){
            a = a%10;
            sum +=a;
            a /=10;
        }
        String res = (temp==sum?"perfect":"Not perfect");
        System.out.println(res);
    }
}
