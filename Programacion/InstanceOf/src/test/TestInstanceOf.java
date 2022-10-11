package test;

import domain.Gerente;
import domain.Empleado;

public class TestInstanceOf {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente( "Bryan", 5000, "Informatica" );
        //System.out.println(gerente1.obtenerDetalles());
        determinarTipo(gerente1);
        
        Empleado empleado1 = new Empleado("Ariel", 2000);;
        //System.out.println(empleado1.obtenerDetalles());
        determinarTipo(empleado1);
    }
    
    // POLIMORFISMEANDO AQUI
    public static void determinarTipo ( Empleado empleado ) {
//        System.out.println("Empleado: " + empleado.obtenerDetalles());
        if ( empleado instanceof Gerente ) {
            System.out.println("Este man es un gerente");
            System.out.println("Departamento Gerente: " + ((Gerente) empleado).getDepartamento());
        } else if ( empleado instanceof Empleado ) {
            System.out.println("Este man es un empleado");
            System.out.println("No tiene departamento relacionado por que no es empleado no es instancia de gerente, es al reves");
        } else if ( empleado instanceof Object ) {
            System.out.println("Que pedo Este man que loco es un objeto");
        }
    }
}
