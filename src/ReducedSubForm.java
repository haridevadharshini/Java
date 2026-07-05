public class ReducedSubForm {
    public static void main(String[] args) {
        String s = "6928";
        while(s.length()>2){
            String res = "";
            for(int i =0;i<s.length()-1;i++){
                int a = s.charAt(i) - '0';
                int b = s.charAt(i+1) -'0';
                res += Math.abs(a-b);
            }
            s = res;
        }
        System.out.println(s);
    }
}
