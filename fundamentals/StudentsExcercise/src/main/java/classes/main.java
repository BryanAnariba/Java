package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner inputKeyboard = new Scanner(System.in);
    ArrayList students = new ArrayList<Student>();
    int age;
    int option;
    String account;
    String firstName;
    String lastName;
    String carrer;

    do {
      System.out.println("UNAH STUDENTS CONTROL: \n1. Add Student\n2. Update Student\n3. Delete Student\n4. View All Students\n0. Exit\nWrite an option: ");
      option = inputKeyboard.nextInt();
      inputKeyboard.nextLine();

      switch (option) {
        case 1:
          System.out.println("===ADDING NEW STUDENT===");
          System.out.println("Write the student account: ");
          account = inputKeyboard.nextLine();
          System.out.println("Write the student first name: ");
          firstName = inputKeyboard.nextLine();
          System.out.println("Write the student last name: ");
          lastName = inputKeyboard.nextLine();
          System.out.println("Write the student age: ");
          age = inputKeyboard.nextInt();
          inputKeyboard.nextLine();
          System.out.println("Write the student carrer: ");
          carrer = inputKeyboard.nextLine();
          students.add(new Student(account, firstName, lastName, age, carrer));
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          students.forEach(student -> {
            System.out.println(student.toString());
          });
          break;
        default:
          System.out.println("Option Not Valid!");
          break;
      }
    } while (option != 0);
    inputKeyboard.close();
  }
}
