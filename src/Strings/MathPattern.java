package Strings;

public class MathPattern {
    public static void main(String[] args) {
        String inp1 = "fi_er";
        String inp2 = "Fever:Filer:Filter:FIxer:Fiber:Fibre:Tailor:Offer";

        // Convert pattern to regex: '_' → '.'
        String regex = inp1.replace("_", ".");

        for (String word : inp2.split(":")) {
            if (word.toLowerCase().matches(regex)) {
                // Capitalcase: first letter uppercase, rest lowercase
                String capital = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
                System.out.println(capital);
            }
        }
    }
}
