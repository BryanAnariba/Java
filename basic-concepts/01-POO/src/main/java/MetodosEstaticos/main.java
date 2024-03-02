package MetodosEstaticos;

public class main {
  
  public static int calcular (int fechaActual, int fechaNac) {
    return fechaActual - fechaNac;
  }
  
  public void saludar(String nombre) {
    System.out.println("Hola: " + nombre);
  }
  
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.saludar();
    
    Persona.despedida();
    
    System.out.println("Edad: " + main.calcular(2024, 1997));
  }
}
