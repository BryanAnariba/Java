package app;

public class Arrays {
  public static void main(String[] args) {
    char[] genders = new char[2];
    genders[0] = 'F';
    genders[1] = 'M';
    
    int[] intNumbers = new int[5];
    intNumbers[0] = 1;
    intNumbers[1] = 2;
    intNumbers[2] = 3;
    intNumbers[3] = 4;
    intNumbers[4] = 5;
    
    int[][] matriz = new int[4][4];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (i+1) * (j+1);
      }
    }
    
    for (int i=0; i<intNumbers.length; i++) {
      System.out.println("i="+intNumbers[i]);
    }
    
    for (int i=0; i<genders.length; i++) {
      System.out.println("Gender: " + genders[i]);
    }
    
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
