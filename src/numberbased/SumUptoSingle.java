package numberbased;

class SumUptoSingle {
    public static void main(String args[]){
        int input1 = 45678;
        int sum = 0;
        while(input1 > 0){
            sum += input1 % 10;
            input1 /= 10;
        }
        while(sum > 9){
            int temp = sum;
            sum = 0;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
        }
        System.out.println(sum);
    }
}
