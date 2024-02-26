package classes;

public class Lavadora {

  private int numeroSerie;
  private String modelo;
  private String color;
  private float precio;
  
  public Lavadora() {
    
  }
  
  public int getNumeroSerie() {
    return numeroSerie;
  }

  public void setNumeroSerie(int numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }
  
  @Override
  public String toString() {
    return "Lavadora{" + "numeroSerie=" + numeroSerie + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + '}';
  }

}
