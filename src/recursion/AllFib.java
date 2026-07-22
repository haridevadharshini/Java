package recursion;
import java.util.Scanner;
public class AllFib {
    public static int getAllFib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return getAllFib(n-1)+ getAllFib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println(getAllFib(i) + " ");
        }
    }
}
