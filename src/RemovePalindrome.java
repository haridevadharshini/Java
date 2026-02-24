public class RemovePalindrome {
    public static void main(String[] args){
        String a = "in india malayalam is best with mom and dad";
        String[] items = a.split(" ");
        String result ="";
        for(int i =0;i<items.length;i++){
            String item = items[i];
            String rev="";
            for(int j=item.length()-1;j>=0;j--){
                rev += item.charAt(j);
            }
            if(!item.equals(rev)){
                result += item +" ";
        }
        }
        System.out.println(result.trim());
    }
}
