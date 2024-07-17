package app;

public class UnaryOperators {
  
  public static void main(String[] args) {
    final int ALTURA_MAXIMA = 100;
    int a = 2;
    int b = 2;
    System.out.println(a++);
    System.out.println(++b);
    
    System.out.println("Estado Final (a): ");
    System.out.println(a);
    System.out.println("Estado Final (b): ");
    System.out.println(b);
    System.out.println("Constante Altura: " + ALTURA_MAXIMA);
  }
}
