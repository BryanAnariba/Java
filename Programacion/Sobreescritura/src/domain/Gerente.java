package domain;

public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente ( String nombreEmpleado, double sueldoEmpleado, String departamento ) {
        super( nombreEmpleado, sueldoEmpleado );
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Sobreescritura de metodos aqui, va la misma funcion seguida de @override
    @Override
    public String obtenerDetalles () {
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }
}
