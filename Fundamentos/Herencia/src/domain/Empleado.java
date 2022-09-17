package domain;

public class Empleado extends Persona {
    private static int contadorEmpleado = 0;
    private int idEmpleado = 0;
    private double sueldoEmpleado = 0.00;

    public Empleado () {
        // de momento recurrimos a un metodo statico para incrementar como un id
        Empleado.contadorEmpleado += 1;
        this.idEmpleado = Empleado.contadorEmpleado;
    }
    public Empleado ( String nombreEmpleado, double sueldoEmpleado ) {
        // llamamos al otro constructor de persona para inicializar el nombre
        //super( nombreEmpleado );
        this(); // ejecutamos al constructor con 0 argumentos esto es sobrecarga de constructores
        this.nombrePersona = nombreEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }
    
    // sobrecarga del metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append( this.idEmpleado );
        sb.append(", sueldoEmpleado=").append( this.sueldoEmpleado );
        sb.append(", ").append(super.toString()).append("}"); // aqui llamamos el toString de persona
        sb.append('}');
        return sb.toString();
    }
    
   
}
