public class VowelConsoCount {
    public static void main(String[] args) {
        int vowels=0,conso=0;
        String a ="Hari";
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            c= Character.toUpperCase(c);
            if(c =='A'|| c=='E'||c=='I'||c=='O'||c=='U')
                vowels++;
            else
                conso++;
        }
        System.out.println(vowels+" "+ conso);

    }
}
