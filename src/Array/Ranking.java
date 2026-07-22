package Array;

class Ranking {
    public static void main(String[] args){
    int a[] = {10,5,20,30,1,4,25};
    int b[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int rank = 1;
            for(int j = 0; j < a.length; j++){
                if(a[j] < a[i]){
                    rank++;
                }
            }
            b[i] = rank;
        }
           for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
    }
}
}
