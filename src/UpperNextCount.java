public class UpperNextCount {
        public static void main(String[] args) {
            String input = "accept Van";
            int count = 0;
            boolean low = false;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isUpperCase(ch)) {
                    low = true;
                }
                else if (Character.isLowerCase(ch) && low ) {
                        count++;
                    }
                else{
                    low = false;
                }
            }
            System.out.println(count);
        }
    }

