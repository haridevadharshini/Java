package convert;
import java.util.Scanner;
public class Numbers_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<num.length();i++){
            System.out.print(words[num.charAt(i)-'0']+ " ");
        }
    }
}
