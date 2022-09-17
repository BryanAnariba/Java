package mundopc;

import hn.com.sc.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor( "HP", 13 );
        Teclado tecladoHP = new Teclado(  "Bluetooth", "HP" );
        Raton ratonHP = new Raton( "Bluetooth", "HP" );
        Computadora computadoraHP = new Computadora( "Computadora HP", monitorHP, tecladoHP, ratonHP );
        
        Monitor monitorDELL = new Monitor( "DELL", 13 );
        Teclado tecladoDELL = new Teclado(  "Bluetooth", "DELL" );
        Raton ratonDELL = new Raton( "Bluetooth", "DELL" );
        Computadora computadoraDELL = new Computadora( "Laptop DELL", monitorDELL, tecladoDELL, ratonDELL );
        
        Orden nuevaOrden = new Orden();
        nuevaOrden.agregarComputadora(computadoraHP);
        nuevaOrden.agregarComputadora(computadoraDELL);
        
        nuevaOrden.mostrarOrden();
                
    }
}
