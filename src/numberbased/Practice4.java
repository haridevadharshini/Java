package numberbased;

public class Practice4 {
    public static void main(String[] args) {
        int a = 9;int count =0; // divisor 2 a number that is divisible by itself and 1
        for(int i =1;i<=a;i++){
            if(a%i==0){ //9%1 , 9%2 9%3
                count++; // 1 + 1 + 1 = 3
            }
        }
        /*if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }*/
        String res = (count==2)?"prime":"not prime";
        System.out.println(res);
    }
}
