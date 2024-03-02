package Constantes;

public class Persona {
  private final int edad = 10;
  private final String nombre = "Bryan";
  
  public void saludar () {
    System.out.println("Hola mi nombre es: " + this.nombre + ", y tengo: " + this.edad + " years");
  }
}
