package Array;

public class ReverseArray {
    public static void main(String args[]){
        int a[] ={4,5,2};
        int n = a.length;
        for(int i = n-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
    }
}