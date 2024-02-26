package Exercices;

import java.util.Scanner;

/*
  Definir un arreglo de n componentes de tipo float que representen la altura
  de 5 personas, obtener el:

  1 - El promedio de las mismas
  2 - Contar cuantas personas son mas altas del promedio
  3 - Contar cuantas personas son mas bajas del promedio
*/

public class ExerciseThree {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    float heightsOfPeople[] = new float[5];
    float totalHeightsOfPeople = 0;
    float avgOfHeights = 0;
    int heightsMinorsThanAvg = 0;
    int heightsGreatherThanAvg = 0;
    
    for (int i=0; i<heightsOfPeople.length; i++) {
      System.out.println("Write the " + (i+1) + " height: ");
      heightsOfPeople[i] = inputData.nextFloat();
      totalHeightsOfPeople = totalHeightsOfPeople + heightsOfPeople[i];
    }
    
    avgOfHeights = totalHeightsOfPeople/heightsOfPeople.length; 
    
    System.out.println("\n=======Results=========");
    for (int i=0; i<heightsOfPeople.length; i++) {
      System.out.println("The " + (i+1) + " height is: " + heightsOfPeople[i]);
      if (heightsOfPeople[i] < avgOfHeights) {
        heightsMinorsThanAvg += 1;
      } else {
        heightsGreatherThanAvg += 1;
      }
    }
    System.out.println("Avg or heights: " + avgOfHeights);
    System.out.println("Heights minors than avg: " + heightsMinorsThanAvg);
    System.out.println("Heights greather than avg: " + heightsGreatherThanAvg);
    
  }
  
}
