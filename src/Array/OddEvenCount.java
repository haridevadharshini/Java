package Array;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        int even=0;
        int odd =0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0) even++;
            else odd++;
        }
        System.out.print(even+" ");
        System.out.print(odd);
    }
}
