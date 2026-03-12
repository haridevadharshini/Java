public class MaxMin2 {
    public static void main(String[] args) {
        int a[] = {70,30,50,40,60};
        int max1=a[0],max2=Integer.MIN_VALUE,min1=a[0],min2=Integer.MAX_VALUE;
        for(int i =1;i<a.length;i++) {
            if (a[i] > max1) {
                max2 =max1;
                max1 = a[i];
            }
            else if(a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }

            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(min1);
        System.out.println(min2);

    }
}
