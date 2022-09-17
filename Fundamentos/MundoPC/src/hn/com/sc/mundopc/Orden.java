package hn.com.sc.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int MAX_COMPUTADORAS_EN_ORDEN = 10;
    private int contadorComputadoras;
    
    public Orden () {
        this.idOrden = ++Orden.contadorOrdenes;
        this. computadoras = new Computadora[ Orden.MAX_COMPUTADORAS_EN_ORDEN ];
    }
    
    public void agregarComputadora( Computadora computadora ) {
        if ( this.contadorComputadoras < Orden.MAX_COMPUTADORAS_EN_ORDEN ) {
            this.computadoras[ this.contadorComputadoras++ ] = computadora ;
        } else {
            System.out.println("HAZ EXCEDIDO EL MAXIMO DE COMPUTADORAS EN UNA ORDEN QUE SON: " + Orden.MAX_COMPUTADORAS_EN_ORDEN );
        }
    }
    
    public void mostrarOrden () {
        System.out.println("Orden: #" + this.idOrden);
        System.out.println("Computadoras de la orden: #" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[ i ]);
        }
    }
}
