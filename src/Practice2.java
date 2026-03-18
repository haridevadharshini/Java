public class Practice2 {
    public static void main(String[] args) {
        int a = 122322;
        int temp = a;
        int rev = 0;
        while(a!=0){
            int b = a%10;
            rev = rev*10+b;
            a=a/10;
        }
        String res = (temp==rev)?"palindrome":"not palindrome";
        System.out.println(res);
    }
}
