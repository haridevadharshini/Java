package Array;

import java.util.Scanner;

public class Intersection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int n2 =sc.nextInt();
        int b[] = new int[n2];
        for(int i =0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i] +" ");
                }
            }
        }

    }
}
