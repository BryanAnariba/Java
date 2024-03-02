package setters_getters;

public class Persona {
  
  private int edad = 0;
  private String nombre = "";
  private double altura = 0;

  public Persona() {
  }
  
  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  public int getEdad() {
    return this.edad;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  public double getAltura() {
    return this.altura;
  }
  
}
