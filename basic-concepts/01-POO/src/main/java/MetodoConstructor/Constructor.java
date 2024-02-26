package MetodoConstructor;

public class Constructor {
  
  public int edad;
  public float altura;
  public String nombre;
  
  public Constructor (int edad, float altura, String nombre) {
    System.out.println("Inicializando valores de clase Constructor");
    this.nombre = nombre;
    this.edad = edad;
    this.altura = altura;
  }

  @Override
  public String toString() {
    return "Constructor{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + '}';
  }
  
}
