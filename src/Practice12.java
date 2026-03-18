public class Practice12 {
    public static void main(String[] args) {
        String a = "krithi";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c))
                count++;
        }
        System.out.println(count);
    }
}
