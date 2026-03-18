public class Practice8 {
    public static void main(String[] args) {
        int n = 7;
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=n;i++){
            int next = a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
}
