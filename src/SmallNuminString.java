public class SmallNuminString {
    public static void main(String[] args){
        String s = "laptop 100;mobile 21;tv 123";
        String[] items = s.split(";");
        int minvalue=Integer.MAX_VALUE;
        String minitem="";
        for(String item:items){
            String parts[] = item.split(" ");
            int value=Integer.parseInt(parts[1]);
            if(value<minvalue){
                minvalue=value;
                minitem=parts[0];
            }
        }
        System.out.println(minitem);
    }
}
