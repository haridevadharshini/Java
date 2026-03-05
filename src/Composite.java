public class Composite {
    public static void main(String[] args){
        int a = 15;
        int count =0;
        for(int i =1;i<=a;i++){
            if(a%i==0)
            count++;
        }
        String res = (count>3)?"composite":"not";
        System.out.println(res);
    }
}
