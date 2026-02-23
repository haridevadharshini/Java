public class StringFrquency {
    public static void main(String[] args){
        String a ="engineering";
        int maxcount = 0;
        char c = a.charAt(0);
        for(int i =0;i<a.length();i++){
            char b = a.charAt(i);
            int count = 0;

            for(int j =0;j<a.length();j++){
                if(a.charAt(j)==b){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                c = b;
            }
        }
        System.out.println(c);
        System.out.println(maxcount);
    }
}
