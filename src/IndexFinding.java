import java.util.*;
public class IndexFinding {
    public static void main(String[] args) {
        int a[] = {1, 4, 34, 56, 7};
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                res = i;
            } else {
                res=-1;
            }
        }
        System.out.println(res);
    }
}

