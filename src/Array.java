public class Array {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 8, 7};
        int k = 3;
        for(int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            if(arr[i+1] > max)
                max = arr[i+1];
            if(arr[i+2] > max)
                max = arr[i+2];
            System.out.print(max + " ");
        }
    }
}
