package setters_getters;

public class Registro {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(26);
    persona.setNombre("BRYAN");
    persona.setAltura(1.55);
    System.out.println("Persona: Edad=" + persona.getEdad() + ", Nombre=" + persona.getNombre() + ", Altura=" + persona.getAltura());
  }
}
