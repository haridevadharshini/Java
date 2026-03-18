public class Practice9 {
    public static void main(String[] args) {
        int a = 18,b=12,x=a,y=b;
        while(y!=0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        int gcd = x;
        int lcm = (a*b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
