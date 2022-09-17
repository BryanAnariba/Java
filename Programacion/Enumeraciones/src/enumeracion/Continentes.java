package enumeracion;

public enum Continentes {
    AMERICA( 34, "1.2 Billones" ),
    AFRICA( 53, "1.4 Billones" ),
    EUROPA( 46, "1.6 Billones" ),
    ASIA( 44, "1.8 Billones" ),
    OCEANIA( 14, "2.0 Billones" );
    
    private final int paises;
    private String habitantes;
    Continentes ( int paises, String habitantes ) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises () {
        return this.paises;
    }
    
    public String getHabitantes () {
        return this.habitantes;
    }
    
}
