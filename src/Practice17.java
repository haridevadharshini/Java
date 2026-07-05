public class Practice17 {
    public static void main(String[] args) {
        int a[] = {1,2,3,6,5};
        int max=a[0],max2=max;
        for(int i =1;i<a.length;i++) {
            if (a[i] > max){
                max = a[i];
            }
            else if(a[i]>max2 && a[i] != max)
                max2 = a[i];
        }
        System.out.println(max2);
    }
}
