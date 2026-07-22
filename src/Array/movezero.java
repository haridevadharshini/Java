package Array;

import java.util.Arrays;
import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int[] temp = new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[index++]=arr[i];
            }
        }
        for(int i =0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
