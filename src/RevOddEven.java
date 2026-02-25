public class RevOddEven {
        public static void main(String[] args) {
            String inp1 = "chennaicity";
            String inp2 = "odd";
            char[] result = inp1.toCharArray();
            String temp = "";
            for (int i = 0; i < inp1.length(); i++) {
                if ((i % 2 == 1 && inp2.equals("odd")) ||
                        (i % 2 == 0 && inp2.equals("even"))) {
                    temp = inp1.charAt(i) + temp;
                }
            }
            int index = 0;
            for (int i = 0; i < result.length; i++) {
                if ((i % 2 == 1 && inp2.equals("odd")) ||
                        (i % 2 == 0 && inp2.equals("even"))) {
                    result[i] = temp.charAt(index++);
                }
            }
            System.out.println(new String(result));
        }
    }
