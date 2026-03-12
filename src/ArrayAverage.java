public class ArrayAverage {
    public static void main(String []a){
        int n[] ={10,20,30,40,50};
        int sum=0; int avg;
        for(int i =0;i<n.length;i++){
            sum += n[i];
        }
        avg = sum/n.length;
        System.out.println(avg);
    }
}
