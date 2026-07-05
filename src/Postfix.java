import java.util.Stack;
public class Postfix {
    public static int evalPostfix(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String input = "34-5+";
        int result = evalPostfix(input);
        System.out.println("Result: " + result);
    }
}
