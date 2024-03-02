package ModificadoresAcceso;

public class Modificadores {
  
  private int edad = 0;
  private String nombre = "";
  
  public Modificadores (int edad, String nombre) {
    this.edad = edad;
    this.nombre = nombre;
  }
  
  private void hablar() {
    System.out.println("Hablando!!");
  }
  
  public void despedir() {
    System.out.println("Adios");
  }
  
  public void describir () {
    System.out.println("Datos: nombre=" + this.nombre + ", edad=" + this.edad);
  }
  
}
