package app;

public class functionsAndStrings {

  public static int sumar(int numeroUno, int numeroDos) {
    return numeroUno + numeroDos;
  }
  
  public static int restar(int numeroUno, int numeroDos) {
    return numeroUno - numeroDos;
  }
  
  public static int multiplicar(int numeroUno, int numeroDos) {
    return numeroUno * numeroDos;
  }
  
  public static int dividir(int numeroUno, int numeroDos) {
    return numeroUno / numeroDos;
  }

  public static void main(String[] args) {
    int numeroUno = 5;
    int numeroDos = 5;
    
    System.out.println(
      "\nSuma: " + sumar(numeroUno, numeroDos) +
      "\nResta: " + restar(numeroUno, numeroDos) +
      "\nMultiplicacion: " + multiplicar(numeroUno, numeroDos) +
      "\nDividir: " + dividir(numeroUno, numeroDos)
    );
  }
}
