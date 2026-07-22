package recursion;
import java.util.Scanner;
public class digSum {
    public static int getSum(int n){
        if(n==0) return 0;
        return  (n%10)+getSum(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }
}
