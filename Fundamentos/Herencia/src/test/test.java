package test;

import java.util.*;
import domain.Empleado;
import domain.Cliente;

public class test {
    public static void main(String[] args) {
        Date fechaIngresoRegistro = new Date();
        Empleado empleado1 = new Empleado( "Bryan Ariel Sanchez Anariba", 25000.00 );
        System.out.println( empleado1 );
        
//        Cliente cliente1 = new Cliente( "Ariel Sanchez", 'M', 25, "Villa Olimpica", fechaIngresoRegistro, true );
//        System.out.println(cliente1);
    }
}
