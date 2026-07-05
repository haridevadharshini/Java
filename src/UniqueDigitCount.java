public class UniqueDigitCount {
    public static void main(String[] args){
        int n = 123225;
        boolean[] seen = new boolean[10];
        if(n==0){
            seen[0] = true;
        }
        while(n>0){
            int digit = n%10;
            seen[digit] = true;
            n/=10;
        }
        int count = 0;
        for(int i =0;i<10;i++){
            if(seen[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
