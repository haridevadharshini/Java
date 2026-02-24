public class FreqWhile {
    public static void main(String[] args) {
        String s = "engineering";
        int max = 0, i = 0;
        char c = '\0';
        int alp[] = new int[26];
        while (i < s.length()) {
            int pos = s.charAt(i) - 'a';
            alp[pos]++;
            if (alp[pos] > max) {
                max = alp[pos];
                c = s.charAt(i);
            }
            i++;
        }
        if (max > 1) {
            System.out.println(c + " " + max);
        } else {
            System.out.println("-1");

        }
    }
}
