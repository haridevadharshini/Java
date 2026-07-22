package numberbased;

public class Practice15 {
    public static void main(String[] args) {
        int n = 5,r=2;
        int a = n-r;
        int fact1 =1,fact2=1,fact3 = 1;
        for(int i = 1;i<=n;i++){
            fact1 *= i;
        }
        for(int j = 1;j<=r;j++){
            fact2 *= j;
        }
        for(int k =1;k<=a;k++){
            fact3 *= k;
        }
        int res = fact1 / (fact3*fact2);
        System.out.println(res);
    }
}
