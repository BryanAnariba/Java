package test;

import manejoarchivos.ManejoArchivos;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String archivo = "prueba.txt"; // windows
//        String archivo = "c:\\datos\\externos\\prueba.txt"; // windows
//        String archivo = "/datos/externos/prueba.txt"; // linux
        //ManejoArchivos.crearArchivo( archivo );
        
        // esto sobreescribe el archivo
        //ManejoArchivos.escribirArchivo(archivo, "Hola desde java");
        //ManejoArchivos.escribirArchivo(archivo, "Hola desde java Works");
        
        // esto agrega cada linea al archivo
        //ManejoArchivos.anexarInformacionArchivo(archivo, "Hola desde java");
        //ManejoArchivos.anexarInformacionArchivo(archivo, "Hola desde java Works");
        
        // LEER INFORMACION DEL ARCHIVO
        ManejoArchivos.leyendoArchivo(archivo);
    }
}
