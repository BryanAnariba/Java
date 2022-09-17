package EjercicioCaja;

public class Caja {
    private int alto;
    private int ancho;
    private int profundidad;
    
    public Caja ( int ancho, int alto, int produndidad ) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = produndidad;
    }
    
    public Caja () {
        System.out.println( "SE EJECUTO EL CONSTRUCTOR QUE NO TIENE " );
    }
    
    public void setAlto( int alto ) {
        this.alto = alto;
    }
    
    public void setAncho( int ancho ) {
        this.ancho = ancho;
    }
    
    public void setProfundidad( int profundidad ) {
        this.profundidad = profundidad;
    }
    
    public int getVolumenCaja () {
        return ( this.ancho * this.alto * this.profundidad );
    }
}
