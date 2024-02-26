package Exercices;

// Calcular el promedio de dos arreglos de 10 elementos e indicar el promedio mayor

public class ExerciseFour {
    
  public static void main(String[] args) {
    
    double elementsArrayOne[] = new double[10];
    double elementsArrayTwo[] = new double[10];
    double totalValuesArrayOne = 0;
    double totalValuesArrayTwo = 0;
    double avgArrayOne = 0;
    double avgArrayTwo = 0;
    String greaterArray = "";
    
    elementsArrayOne[0] = 1;
    elementsArrayOne[1] = 1;
    elementsArrayOne[2] = 1;
    elementsArrayOne[3] = 1;
    elementsArrayOne[4] = 1;
    elementsArrayOne[5] = 1;
    elementsArrayOne[6] = 1;
    elementsArrayOne[7] = 1;
    elementsArrayOne[8] = 1;
    elementsArrayOne[9] = 1;
    
    elementsArrayTwo[0] = 2;
    elementsArrayTwo[1] = 2;
    elementsArrayTwo[2] = 2;
    elementsArrayTwo[3] = 2;
    elementsArrayTwo[4] = 2;
    elementsArrayTwo[5] = 2;
    elementsArrayTwo[6] = 2;
    elementsArrayTwo[7] = 2;
    elementsArrayTwo[8] = 2;
    elementsArrayTwo[9] = 2;
    
    for (int i = 0; i < elementsArrayOne.length; i++) {
      totalValuesArrayOne += elementsArrayOne[i];
    }
    
    for (int i = 0; i < elementsArrayTwo.length; i++) {
      totalValuesArrayTwo += elementsArrayTwo[i];
    }
    
    avgArrayOne = totalValuesArrayOne / elementsArrayOne.length;
    avgArrayTwo = totalValuesArrayTwo / elementsArrayTwo.length;
   
    System.out.println("===========RESULTS=========");
    System.out.println("Total ARRAY one: " + totalValuesArrayOne);
    System.out.println("Total ARRAY two: " + totalValuesArrayTwo);
    System.out.println("Avg ARRAY one: " + avgArrayOne);
    System.out.println("Avg ARRAY two: " + avgArrayTwo);
    
    if (avgArrayOne > avgArrayTwo) {
      greaterArray = "First";
    } else {
      greaterArray = "Second";
    }
    
    System.out.println("With ARRAY is greater: " + greaterArray);
  }
  
}
