package hn.com.sc.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductosEnUnaOrden = 0;
    private static final int MAX_PRODUCTO = 10;
    
    public Orden () {
        this.idOrden = ++Orden.contadorOrdenes; // para obtener el id de la orden
        this.productos = new Producto[ Orden.MAX_PRODUCTO ]; // toda orden debe tener un max de 10 producto por ahora, cuando se vean las listas estos sera dinamico
    }
    
    // AGREGANDO UN PRODUCTO AL ARREGLO DE PRODUCTOS EN UNA ORDEN ES COMO AGREGAR PRODUCTOS AL CARRITO
    public void agregarProducto ( Producto producto ) {
        if ( this.contadorProductosEnUnaOrden < Orden.MAX_PRODUCTO ) { // aqui agregamos al carrito por asi decirlo siempre y cuando no pase el limite
            this.productos[ this.contadorProductosEnUnaOrden++ ] = producto;
        } else {
            System.out.println( "Se ha superado el maximo de productos en una orden: " + Orden.MAX_PRODUCTO );
        }
    }
    
    // MOSTRANDO EL TOTAL DE LOS PRODUCTOS EN UNA ORDEN, ES DECIR EL TOTAL DEL CARRITO
    public double calcularTotal () {
        double totalSumatoriaProductosEnOrden = 0;
        for ( int i = 0; i < this.contadorProductosEnUnaOrden; i++ ) {
            Producto producto = this.productos[ i ];
            totalSumatoriaProductosEnOrden += producto.getPrecioProducto();
        }
        return totalSumatoriaProductosEnOrden;
    }    
    
    
   // MOSTRANDO TODA LA ORDEN, RESUMEN DEL CARRITO
    public void mostrarOrden () {
       System.out.println( "Id Orden: " + this.idOrden );
       double totalOrden = this.calcularTotal();
       System.out.println( "Total Orden: $" +  totalOrden );
        System.out.println("Productos del carrito: ");
        for (int i = 0; i < this.contadorProductosEnUnaOrden; i++) {
            System.out.println( this.productos[ i ].toString() );
        }
    } 
   
}
