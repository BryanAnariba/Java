package hn.com.sc.ventas;

public class Producto {
   private int idProducto = 0;
   private String nombreProducto = "";
   private double precioProducto = 0;
   private static int contadorProductos = 0;
   
   private Producto() {
       this.idProducto = ++Producto.contadorProductos; // esto sera el id
   }
   
   public Producto ( String nombreProducto, double precioProducto ) {
       this(); // llamamos al constructor privado para siempre aumentar el contador
       this.nombreProducto = nombreProducto;
       this.precioProducto = precioProducto;
   }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    public int getIdProducto () {
        return this.idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }
}
