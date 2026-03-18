public class Practice5 {
    public static void main(String[] args) {
        int a =12345;
        int count =0;
        int b;
        while(a!=0){
            b=a%10;
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
}
