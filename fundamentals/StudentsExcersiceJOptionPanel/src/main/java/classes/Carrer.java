package classes;

public class Carrer {
  
  private int carrerCode;
  private int subjectsQuantity;
  private String carrerName;
  
  public Carrer () {}

  public Carrer(int carrerCode, int subjectsQuantity, String carrerName) {
    this.carrerCode = carrerCode;
    this.subjectsQuantity = subjectsQuantity;
    this.carrerName = carrerName;
  }

  public int getCarrerCode() {
    return carrerCode;
  }

  public void setCarrerCode(int carrerCode) {
    this.carrerCode = carrerCode;
  }

  public int getSubjectsQuantity() {
    return subjectsQuantity;
  }

  public void setSubjectsQuantity(int subjectsQuantity) {
    this.subjectsQuantity = subjectsQuantity;
  }

  public String getCarrerName() {
    return carrerName;
  }

  public void setCarrerName(String carrerName) {
    this.carrerName = carrerName;
  }

  @Override
  public String toString() {
    return "Carrer{" + "carrerCode=" + carrerCode + ", subjectsQuantity=" + subjectsQuantity + ", carrerName=" + carrerName + '}';
  }
}
