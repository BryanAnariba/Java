package classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Student {
  private int age;
  private String account;
  private String firstName;
  private String lastName;
  private Carrer carrer;
  private ArrayList<Subject> subjects;
  
  public Student () {
    this.subjects = new ArrayList<Subject>();
  }

  public Student(String account, String firstName, String lastName, int age, Carrer carrer) {
    this.account = account;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.carrer = carrer;
    this.subjects = new ArrayList<Subject>();
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

  public Carrer getCarrer() {
    return carrer;
  }

  public void setCarrer(Carrer carrer) {
    this.carrer = carrer;
  }
  
  public void addNewStudent () {
    int selectedCarrer;
    System.out.println("===ADDING NEW STUDENT===");
    this.account = JOptionPane.showInputDialog("Write the student account: ", this.account);
    this.firstName = JOptionPane.showInputDialog("Write the student first name: ", this.firstName);
    this.lastName = JOptionPane.showInputDialog("Write the student last name: ", this.lastName);
    this.age = Integer.parseInt(JOptionPane.showInputDialog("Write the student age: ", this.age));
    selectedCarrer = Integer.parseInt(JOptionPane.showInputDialog("Write the student carrer: (0-" + (App.carrers.size() - 1) + ")"));
    this.carrer = App.carrers.get(selectedCarrer);
  }
  
   public void addSubject (Subject subject) {
    subjects.add(subject);
  }

  @Override
  public String toString() {
    return "Student{" + "account=" + account + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", carrer=" + carrer + ", subjects=" + subjects + '}';
  }
}
