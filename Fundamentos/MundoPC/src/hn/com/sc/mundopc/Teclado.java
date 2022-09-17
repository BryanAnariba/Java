package hn.com.sc.mundopc;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclados;
    
    public Teclado ( String tipoEntrada, String marca ) { 
        super( tipoEntrada, marca );
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    public static void setContadorTeclados(int contadorTeclados) {
        Teclado.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ',' + super.toString() + '}';
    }
    
}
