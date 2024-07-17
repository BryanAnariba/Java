package app;

public class DatatypesControlstructure {

  public static void main(String[] args) {
    int numeroUno = 12;
    int numeroDos = 10;
    int suma = numeroUno + numeroDos;
    int resta = numeroUno - numeroDos;
    int multiplicacion = numeroUno * numeroDos;
    int modulo = numeroUno % numeroDos;
    
    // CASTEO: debido a que como son int numero uno y dos division aunque sea float lo hace int la respuesta
    float division = (float)numeroUno / (float)numeroDos;
    
    System.out.println(
      "Suma: " + suma
      + "\nResta: " + resta
      + "\nMultiplicacion: " + multiplicacion
      + "\nDivision: " + division
      + "\nModulo: " + modulo
    );
  }
}
