package classes;

import java.util.Scanner;

public class Student {
  private int age;
  private String account;
  private String firstName;
  private String lastName;
  private String carrer;
  
  public Student () {}
  
  public Student (String account) {}

  public Student(String account, String firstName, String lastName, int age, String carrer) {
    this.account = account;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.carrer = carrer;
  }
  
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCarrer() {
    return carrer;
  }

  public void setCarrer(String carrer) {
    this.carrer = carrer;
  }
  
  public void addNewStudent (Scanner inputKeyboard) {
    System.out.println("===ADDING NEW STUDENT===");
    System.out.println((this.account != null) ? "Write the student account ["+ this.account +"]: " : "Write the student account: ");
    this.account = inputKeyboard.nextLine();
    System.out.println((this.firstName != null) ? "Write the student first name ["+ this.firstName +"]: " : "Write the student first name: ");
    this.firstName = inputKeyboard.nextLine();
    System.out.println("Write the student last name: ");
    this.lastName = inputKeyboard.nextLine();
    System.out.println("Write the student age: ");
    this.age = inputKeyboard.nextInt();
    inputKeyboard.nextLine();
    System.out.println("Write the student carrer: ");
    this.carrer = inputKeyboard.nextLine();
  }

  @Override
  public String toString() {
    return "Student{" + "account=" + account + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", carrer=" + carrer + '}';
  }
}
