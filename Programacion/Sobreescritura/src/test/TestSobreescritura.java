package test;

import domain.Gerente;
import domain.Empleado;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente( "Bryan", 5000, "Informatica" );
        //System.out.println(gerente1.obtenerDetalles());
        imprimir(gerente1);
        
        Empleado empleado1 = new Empleado("Ariel", 2000);;
        //System.out.println(empleado1.obtenerDetalles());
        imprimir(empleado1);
    }
    
    // POLIMORFISMEANDO AQUI
    public static void imprimir ( Empleado empleado ) {
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }
}
