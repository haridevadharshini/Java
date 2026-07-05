public class NonRepeatedCount {
    public static void main(String[] args) {
        int n = 1223450;
        int[] freq = new int[10];
        if (n == 0) {
            freq[0]++;
        }
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1) count++;
        }
        System.out.println(count);
    }
}
