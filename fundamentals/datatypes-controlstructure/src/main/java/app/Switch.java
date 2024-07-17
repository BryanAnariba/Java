package app;

public class Switch {
  public static void main(String[] args) {
    int mes = 8;
    String nombreMes = "";
    switch (mes) {
      case 1:
        nombreMes = "ENERO";
      break;
      case 2:
        nombreMes = "FEBRERO";
      break;
      case 3:
        nombreMes = "MARZO";
      break;
      case 4:
        nombreMes = "ABRIL";
      break;
      case 5:
        nombreMes = "MAYO";
      break;
      case 6:
        nombreMes = "JUNIO";
      break;
      case 7:
        nombreMes = "JULIO";
      break;
      case 8:
        nombreMes = "AGOSTO";
      break;
      case 9:
        nombreMes = "SEPTIEMBRE";
      break;
      case 10:
        nombreMes = "OCTUBRE";
      break;
      case 11:
        nombreMes = "NOVIEMBRE";
      break;
      case 12:
        nombreMes = "DICIEMBRE";
      break;
      default:
        nombreMes = "Opcion no valida";
      break;
    }
    
    System.out.println("Mes: " + nombreMes);
  }
}
