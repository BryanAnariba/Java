package classes;
// 49
import java.util.ArrayList;
import java.util.Scanner;

public class main {
  
  public int option;
  public Scanner inputKeyboard = new Scanner(System.in);
  public ArrayList<Student> students = new ArrayList<Student>();

  public void addNewStudent() {
    Student newStudent = new Student();
    newStudent.addNewStudent(inputKeyboard);
    students.add(newStudent);
  }

  public void viewAllStudents() {
    students.forEach(student -> {
      System.out.println(student.toString());
    });
  }

  public void deleteAlumno() {
    int studentSelected;
    System.out.println("Write account of student do you want to delete (0-" + (students.size() - 1) + "): ");
    studentSelected = inputKeyboard.nextInt();
    inputKeyboard.nextLine();
    students.remove(studentSelected);
    System.out.println("Student Deleted!!!");
  }
  
  public void updateStudent () {
    int studentSelected;
    System.out.println("Write account of student do you want to delete (0-" + (students.size() - 1) + "): ");
    studentSelected = inputKeyboard.nextInt();
    inputKeyboard.nextLine();
    students.get(studentSelected).addNewStudent(inputKeyboard);
  }
  
  public main() {
    do {
      System.out.println("UNAH STUDENTS CONTROL: \n1. Add Student\n2. Update Student\n3. Delete Student\n4. View All Students\n0. Exit\nWrite an option: ");
      option = inputKeyboard.nextInt();
      inputKeyboard.nextLine();

      switch (option) {
        case 1 -> addNewStudent();
        case 2 -> updateStudent();
        case 3 -> deleteAlumno();
        case 4 -> viewAllStudents();
        case 0 -> System.out.println("Bye!!!");
        default -> System.out.println("Option Not Valid!");
      }
    } while (option != 0);
    inputKeyboard.close();
  }

  public static void main(String[] args) {
    // WTF how is that posible
    new main();
  }
}
