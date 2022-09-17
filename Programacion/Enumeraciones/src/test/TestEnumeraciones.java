package test;

import enumeracion.Dias;
import enumeracion.Continentes;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia uno de la semana: " + Dias.LUNES );
        indicarDiaDeLaSemana( Dias.MIERCOLES );
        
        
        System.out.println("IMPRIMIENTO ENUMERACIONES DE CONTINENTES");
        System.out.println( "Continente 1: " + Continentes.AFRICA + ", Habitantes: " + Continentes.AFRICA.getHabitantes() );
        System.out.println( "Continente 2: " + Continentes.AMERICA + ", Habitantes: " + Continentes.AMERICA.getHabitantes() + ", Cantidad De Paises: " + Continentes.AMERICA.getPaises() );
    }
    
    private static void indicarDiaDeLaSemana ( Dias dias ) {
        switch ( dias ) {
            case LUNES:
                System.out.println("Dia 1");
            break;
            case MARTES:
                System.out.println("Dia 2");
            case MIERCOLES:
                System.out.println("Dia 3");
            break;
            case JUEVES:
                System.out.println("Dia 4");
            break;
            case VIERNES:
                System.out.println("Dia 5");
            break;
            case SABADO:
                System.out.println("Dia 6");
            break;
            case DOMINGO:
                System.out.println("Dia 7");
            break;
            default:
                System.out.println("Dia No Valido");
            break;
        }
    }
    
}
