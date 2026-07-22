package Array;

public class MissingNumbers {
    public static void main(String args[]){
        int a[] ={3,7,1,2,8,4,5};
        int n = a.length;
        int total = (n +2)  * (n + 1) / 2;
        for(int i = 0;i<n;i++){
            total -= a[i];
        }
        System.out.println("Missing number is :" + total);
    }
}
