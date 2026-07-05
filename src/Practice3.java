public class Practice3 {
    public static void main(String[] args) {
        int a = 10, sum = 0; //1 + 2+ 3 ...+10
        for(int i = 0;i<=a;i++){
            sum += i; // sum = sum + i == 0 + 0 ,0 + 1 = 1 ; 1 + 2 = 3
        }
        System.out.println(sum); //55
    }
}
