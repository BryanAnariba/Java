package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 claseUno = new Clase1("Publico");
        //        System.out.println("Clase 1: " + claseUno.atributoPublico);
        //        claseUno.metodoPublico();

        ClaseHija claseHija = new ClaseHija();
        System.out.println("Clase Hija: " + claseHija);
    }
}
