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
      "\n\"Suma:\" " + sumar(numeroUno, numeroDos) +
      "\n\"Resta:\" " + restar(numeroUno, numeroDos) +
      "\n\"Multiplicacion:\" " + multiplicar(numeroUno, numeroDos) +
      "\n\"Dividir:\" " + dividir(numeroUno, numeroDos)
    );
  }
}
