public class OddEvenSum {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,30,45};
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        if(evenSum > oddSum) {
            System.out.println("Even has highest sum: " + evenSum);
        } else {
            System.out.println("Odd has highest sum: " + oddSum);
        }
    }
}
