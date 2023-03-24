package hn.com.basa.conceptos.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConceptosPoo {

    public static void main(String[] args) {
        
        String nombre = "";
        String apellido = "";
        String email = "";
        String telefono = "";
        Scanner entradaDeDatosCLI = new Scanner( System.in );
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.clear();
        
        for ( int i = 0; i < 3; i++ ) {
            
            System.out.println("Escriba el nombre: ");
            nombre = entradaDeDatosCLI.nextLine();
            
            System.out.println("Escriba el apellido: ");
            apellido = entradaDeDatosCLI.nextLine();
            
            System.out.println("Escriba el email: ");
            email = entradaDeDatosCLI.nextLine();
            
            System.out.println("Escriba el numero de telefono: ");
            telefono = entradaDeDatosCLI.nextLine();
            
            Cliente registroCliente = new Cliente();
            registroCliente.setNombre(nombre);
            registroCliente.setApellido(apellido);
            registroCliente.setEmail(email);
            registroCliente.setTelefono(telefono);
            
            clientes.add(registroCliente);
            
        }
        
        // IMPRESION DE DATOS
        for( Cliente cliente: clientes ) {
            System.out.println(cliente.toString());
        }
    }
}
