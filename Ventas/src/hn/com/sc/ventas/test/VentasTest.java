package hn.com.sc.ventas.test;

import hn.com.sc.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto( "Camisa", 15.00 );
        Producto producto2 = new Producto( "Pantalon", 35.00 );
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        
        orden1.agregarProducto( producto1 );
        orden1.agregarProducto( producto2 );
        orden1.mostrarOrden();
        
        Producto producto3 = new Producto( "Pantalon", 55.00 );
        orden2.agregarProducto( producto3 );
        orden2.mostrarOrden();
    }
}
