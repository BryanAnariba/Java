package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {
    private static final String FORMATO_FECHA = "dd-MM";
    
    public static String format( Date fecha ) {
        SimpleDateFormat formateoFecha = new SimpleDateFormat( FORMATO_FECHA );
        return formateoFecha.format(fecha);
    } 
    
    public static String format( String fecha ) {
        SimpleDateFormat formateoFecha = new SimpleDateFormat( FORMATO_FECHA );
        return formateoFecha.format(fecha);
    } 
}
