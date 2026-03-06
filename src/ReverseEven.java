import java.util.Arrays;
public class ReverseEven {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,30,45};
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            while(left < right && arr[left] % 2 != 0) {
                left++;
            }
            while(left < right && arr[right] % 2 != 0) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
