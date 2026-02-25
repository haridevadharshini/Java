public class StrRev {
    public static void main(String[] args) {
        String str = "Indian Institute of Technology";
        String a[] = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            String word = a[i];
            String rev = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }
            System.out.print(rev + " ");
        }
    }
}
