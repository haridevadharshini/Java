package Array;

public class ReplaceWithNextSmall {
    public static int[] nextSmallerNumber(int[] a) {
        if (a == null) {
            return null;
        }
        int n = a.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    result[i] = a[j];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {3, 2, 11, 7, 6, 5, 6, 1};
        int[] ans = nextSmallerNumber(a);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
