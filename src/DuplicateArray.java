import java.util.Arrays;
public class DuplicateArray {
    public static void main(String[] args) {
        int a[] = {9,4,5,6,1,4};
        for(int i = 0; i < a.length; i++) {
            boolean duplicate = false;
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
