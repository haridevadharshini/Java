public class Practice7 {
    public static void main(String[] args) {
        int a = 9474,b;
        int temp = a,count =0,copy=a;
        double pow=0;
        while(copy!=0) {
            count++;
            copy = copy / 10;
        }
        while(a!=0) {
            b = a % 10;
            a = a / 10;
            pow +=Math.pow((double)b,(double)count);
        }
        String res=(temp==(int)pow)?"Armstrong num":"not armstrong";
        System.out.println(res);
    }
}
