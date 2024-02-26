package SobrecargaMetodos;

public class Sobrecarga {

  public Sobrecarga(int edad) {
    System.out.println("La Edad es " + edad);
  }

  public Sobrecarga() {
    System.out.println("Sobrecarga de metodos este no tiene parametros");
  }

  public Sobrecarga(int km, String nombre) {
    System.out.println("La Persona " + nombre + " corre " + km);
  }
  
  public int calcularEdad(int fechaActual,int fechaDeNacimiento) {
    return fechaActual - fechaDeNacimiento;
  }
  
  public int calcular () {
    return 10*10;
  }

}
