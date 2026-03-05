import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int k = 2;
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i <= k; i++) {
            res[k - i] = arr[i];
        }
        for (int i = k + 1; i < n; i++) {
            res[n - 1 - (i - (k + 1))] = arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
