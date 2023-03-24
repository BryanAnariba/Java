package hn.com.basa.conceptos.basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConceptosBasicos {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader entradaDatosPorConsola = new InputStreamReader( System.in );
        BufferedReader buffer = new BufferedReader( entradaDatosPorConsola );
        
        System.out.println("Escribe tu nombre: ");
        String name = buffer.readLine();
        
        System.out.println("Escribe tu edad: ");
        String edad = buffer.readLine();
        Integer edadUsuario = Integer.parseInt(edad);
        
        if ( edadUsuario < 18 ) {
            System.out.println("No puedes pasar: " + name.trim() );
        } else {
            System.out.println("Bienvenido: " + name.trim() );
        }
        
    }
}
