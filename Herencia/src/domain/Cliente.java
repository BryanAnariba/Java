package domain;

import java.util.*;

public class Cliente extends Persona {
    protected int idCliente = 0;
    protected Date fechaRegistro;
    protected boolean vip;
    private static int contadorCliente;
    
    public Cliente( String nombrePersona, char generoPersona, int edadPersona, String direccionPersona, Date fechaRegistro, boolean vip ) {
        super( nombrePersona, generoPersona, edadPersona, direccionPersona );
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        Cliente.contadorCliente += 1;
        this.idCliente = Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append( super.toString() ).append("}");
        sb.append('}');
        return sb.toString();
    }
    
    
}
