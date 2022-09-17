package test;

// 1 MANERA DE IMPORTAR
import mx.com.globalmentoring.Utileria;

// 2 MANERA DE IMPORTAR
//import static mx.com.globalmentoring.Utileria.imprimir;


public class TestUtileria {
    public static void main(String[] args) {
        // DESCOMENTANDO LA PRIMERA MANERA DE IMPORTAR
        Utileria.imprimir( "Works" );
        
        // DESCOMENTANDO LA SEGUNDA MANERA DE IMPORTAR        
        //imprimir( "Works" );
        
        // ESTA ES OTRA MANERA DE USAR: no recomendable
        //mx.com.globalmentoring.Utileria.imprimir("work");
    }
}
