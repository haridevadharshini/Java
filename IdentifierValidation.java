public class IdentifierValidation {
    public static boolean isValidIdentifier(String s){
       if(s==null||s.isEmpty()){
        return false;
       }
       if(!Character.isJavaIdentifierPart(s.charAt(0))){
        return false;
       }
       for(int i = 1;i< s.length();i++){
        if(!Character.isJavaIdentifierPart(s.charAt(i))){
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        String test = "my,variable1";
        if(isValidIdentifier(test)) {
            System.out.println(test + " is a valid identifier.");
        } else {
            System.out.println(test + " is not a valid identifier.");
        }

    }
}
