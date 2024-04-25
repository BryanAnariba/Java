public class App {
    public static void main(String[] args) throws Exception {
        //1: 50
        /* 
            * VARIABLES
            * byte: -128 to 127, short: -32768 to 32767, int: -2,147,483,648 to 2,147,483,647, long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        */
        int number = 5;
        int textLong = 0;
        int indice = 0;
        double decimals = 10.9999331;
        boolean isActive = true;
        String completeName = "  Bryan Ariel Sanchez Anariba  ";
        String text = "This is a text, asigned to string variable";
        System.out.println("===Variables===: \nNumber: " + number + "\nDecimal: " + decimals + "\nUser Active: " + isActive + "\nName: " + completeName.toUpperCase().trim());
        
        textLong = text.length();
        System.out.println("Text: " + text + ", Longitud: " + textLong + ", First Letter: " + text.charAt(1) + ", SUBSTRING METHOD 1,7: " + text.substring(1, 7));
        
        indice = text.indexOf("string");
        System.out.println("Index of string word in text: " + indice);

        System.out.println("Replace variable to var: " + text.replace("variable", "var"));
        
        System.out.println("Contains string?: " + text.contains("string"));

        /* 
            * Operators: NUMERIC +, -, *, %, / LOGICS &&, ||, >=, <=, ==
        */
    }
}
