package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 100;
        System.out.println("Variable: " + miVariable);
        
        // esto no se puede hacer con variables final
//        miVariable = 101;
//        System.out.println("Variable: " + miVariable);

//            Persona.MI_CONSTANTE = 15;
            System.out.println("Constante: " + Persona.MI_CONSTANTE);
            
            final Persona persona1 = new Persona();
            persona1.setNombre("Arielito");
            System.out.println("Persona: " + persona1.getNombre());
    }
}