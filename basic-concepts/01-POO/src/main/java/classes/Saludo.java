package classes;

import java.util.Scanner;

public class Saludo {

  public void saludar () {
    System.out.println("Hello bsanchez@gmail.com!");
  }
  
  public void despedir () {
    System.out.println("Bye, see you later!");
  }
  
  public int sumarNumeros(int numeroUno, int numeroDos) {
    return numeroUno + numeroDos;
  }
  
  public void sumar(int numeroUno, int numero2) {
    int suma = numeroUno + numero2;
    System.out.println("Suma es: "+suma);
  }
  
  public void restar(int numeroUno, int numero2) {
    int resta = numeroUno - numero2;
    System.out.println("Resta es: "+resta);
  }
  
  public void multiplicar(int numeroUno, int numero2) {
    int mutiplicacion = numeroUno * numero2;
    System.out.println("Multiplicacion es: "+mutiplicacion);
  }
  
  public void menu () {
    Scanner inputData = new Scanner(System.in);
    int opcion = 0;
    System.out.println("1. Sumar numeros");
    System.out.println("2. Restar numeros");
    System.out.println("3. Multiplicar numeros");
    opcion = inputData.nextInt();
    
    int numeroUno = pedirNumeros("Digite el primer numero: ");
    int numeroDos = pedirNumeros("Digite el segundo numero: ");
    
    switch (opcion) {
      case 1:
        sumar(numeroUno, numeroDos);
      break;
      case 2:
        restar(numeroUno, numeroDos);
      break;
      case 3:
        multiplicar(numeroUno, numeroDos);
      break;
      default:
        System.out.println("OPCION NO VALIDA");
      break;
    }
    
  }
  
  public int pedirNumeros(String mensaje) {
    Scanner inputData = new Scanner(System.in);
    int numero = 0;
    System.out.println(mensaje);
    numero = inputData.nextInt();
    return numero;
  }
  
}
