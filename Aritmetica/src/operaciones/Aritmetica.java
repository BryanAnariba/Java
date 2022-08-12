package operaciones;

public class Aritmetica {
    // ATRIBUTOS O PROPIEDADES
    private int a;
    private int b;
    
    // CONSTRUCTOR
    public Aritmetica ( int a, int b ) {
        System.out.println( "Constructor Con Parametros Ejecutado" );
        this.a = a;
        this.b = b;
    }
    
    // SOBRECARGA DE CONSTRUCTORES
    public Aritmetica () {
        System.out.println( "Constructor Sin Parametros Ejecutado" );
    }
    
    // METODOS
    public void setA ( int a ) {
        this.a = a;
    }
    
    public void setB ( int b ) {
        this.b = b;
    }
    
    public int getA () {
        return this.a;
    }
    
    public int getB () {
        return this.b;
    }
    
    public int getSuma () {
        return this.a + this.b;
    }
    
    public void getResta () {
        System.out.println( 
            "Resta " + 
            this.a + 
            "-" + 
            this.b + 
            "="  + 
            ( this.a - this.b ) 
        );
    }
}


