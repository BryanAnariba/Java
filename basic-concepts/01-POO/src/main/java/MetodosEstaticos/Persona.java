package MetodosEstaticos;

public class Persona {
  
  private int edad = 30;
  private final String nombre = "Bryan Ariel Sanchez Anariba";
  private final int id = 1000;
  private double altura = 1.50;
  
  public void saludar () {
    System.out.println("Hola...");
    System.out.println("Mi nombre es: " + this.nombre + ", edad: " + this.edad + ", id: " + this.id + ", altura: " + this.altura);
  }
  
  public static void despedida () {
    System.out.println("Adios!!!");
  }
}
