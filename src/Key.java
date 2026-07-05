class Key{
    public static void main(String args[]){
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int[] arr = {input1, input2, input3};
        int total = 0;
        for(int num : arr){
            int min = 9;
            int max =0;
            while(num >0){
                int digit = num % 10;
                if(digit < min){
                    min = digit;
                }
                if(digit > max){
                    max = digit;
                }
                num /= 10;
            }
            total += max + min;
        }
        System.out.println(total);
    }
}