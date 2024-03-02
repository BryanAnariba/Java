package ToString;

public class Persona {

  public static int edad = 14;
  public final static String nombre = "Cristian";
  public static float altura = 1.70f;
  
  @Override
  public String toString () {
    return "Edad: " + this.edad + "\nNombre:" + this.nombre + "\nAltura: " + this.altura;
  }
}
