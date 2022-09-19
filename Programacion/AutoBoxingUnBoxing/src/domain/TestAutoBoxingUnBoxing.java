package domain;

public class TestAutoBoxingUnBoxing {
    public static void main(String[] args) {
        // CLASES ENVOLVENTES DE TIPOS PRIMITIVOS
        /*
            int: Integer
            long: Long
            float: Float
            double: Double
            char: Character
            short: Short
        */
        
        Integer entero = 10; // autoboxing
        System.out.println("Entero: " + entero);
        System.out.println("Entero: " + entero.toString());
        
        int entero2 = entero; // unboxing
        
    }
}
