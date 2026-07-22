package numberbased;

public class FindKey {
    public static void main(String[] args){
        int a = 3521;
        int b = 2452;
        int c = 1352;
        int[] nums = {a,b,c};
        int l = 0, sl =0;
        for(int num:nums){
            int []digits = new int[4];
            int temp = num;
            for(int i =3;i>=0;i--){
                digits[i] = temp%10;
                temp/=10;
            }
            int largest = -1, secondLargest = -1;
            for(int d : digits){
                if(d>largest){
                    secondLargest = largest;
                    largest = d;
                }else if(d>secondLargest && d!=largest){
                    secondLargest = d;
                }
            }
            l+=largest;
            sl+=secondLargest;
        }
        int key = l + sl;
        System.out.println(key);
    }
}
