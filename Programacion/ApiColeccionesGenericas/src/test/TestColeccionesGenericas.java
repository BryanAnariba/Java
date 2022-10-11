package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        
//        for ( Object diaSemana: miLista ) {
//            System.out.println("Dia: " + diaSemana);
//        }
        
        System.out.println("====== DIAS DE LA SEMANA CON COLECCIONES =====");
        miLista.forEach( diaSemana -> {
            System.out.println("Dia: " + diaSemana);
        });
        
        System.out.println("");
        System.out.println("===== IMPRIMIENDO MESES DEL ANIO CON SET =====");
        Set<String> miSet = new HashSet<>();
        miSet.add( "Enero" );
        miSet.add( "Febrero" );
        miSet.add( "Marzo" );
        miSet.add( "Abril" );
        miSet.add( "Mayo" );
        miSet.add( "Junio" );
        miSet.forEach( mes -> {
            System.out.println("Mes: " + mes);
        });
        
        System.out.println("");
        System.out.println("===== IMPRIMIENDO MESES DEL ANIO CON MAP =====");   
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put( "nombreEmpleado","Bryan Ariel" );
        miMapa.put("apellidoEmpleado", "Sanchez Anariba");
        miMapa.put( "nombreEmpleado1","Erick David" );
        miMapa.put("apellidoEmpleado1", "Sanchez Anariba");
        System.out.println(miMapa.values());
    }
}
