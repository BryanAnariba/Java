package domain;

// esto no se puede hacer con una clase con final no se puede extender o no puede ser padre de ninguna otra
//public class Empleado extends Persona {

public class Empleado extends Persona {
        @Override
       public void imprimir () {
           System.out.println("Metodo imprimir desde clase hija");
       }
}
