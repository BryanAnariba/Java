package domain;

public class Empleado {
    protected String nombreEmpleado;
    protected double sueldoEmpleado;
    
    public Empleado ( String nombreEmpleado, double sueldoEmpleado ) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }
    
    public String obtenerDetalles () {
        return "Nombre: " + this.nombreEmpleado + ", Sueldo: " + this.sueldoEmpleado;
    }
}
