package classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {
  
  public int option;
  public ArrayList<Student> students = new ArrayList<>();

  public void addNewStudent() {
    Student newStudent = new Student();
    newStudent.addNewStudent();
    students.add(newStudent);
  }

  public void viewAllStudents() {
    String studentsToString = "";
    for (int i=0; i<students.size(); i++) {
      studentsToString += students.get(i)+"\n";
    }
    JOptionPane.showMessageDialog(null, studentsToString);
  }

  public void deleteAlumno() {
    int studentSelected;
    studentSelected = Integer.parseInt(JOptionPane.showInputDialog("Write account of student do you want to delete (0-" + (students.size() - 1) + "): "));
    students.remove(studentSelected);
    JOptionPane.showMessageDialog(null, "Student Deleted Successfully!!!");
  }
  
  public void updateStudent () {
    int studentSelected;
    System.out.println();
    studentSelected = Integer.parseInt(JOptionPane.showInputDialog("Write account of student do you want to update (0-" + (students.size() - 1) + "): "));
    students.get(studentSelected).addNewStudent();
    JOptionPane.showMessageDialog(null, "Student Updated Successfully!!!");
  }
  
  public main() {
    do {
      option = Integer.parseInt(JOptionPane.showInputDialog("UNAH STUDENTS CONTROL: \n1. Add Student\n2. Update Student\n3. Delete Student\n4. View All Students\n0. Exit\nWrite an option: "));

      switch (option) {
        case 1 -> addNewStudent();
        case 2 -> updateStudent();
        case 3 -> deleteAlumno();
        case 4 -> viewAllStudents();
        case 0 -> JOptionPane.showMessageDialog(null, "Bye!!!");
        default -> JOptionPane.showMessageDialog(null, "Option not valid!");
      }
    } while (option != 0);
  }

  public static void main(String[] args) {
    // WTF how is that posible
    new main();
  }
}
