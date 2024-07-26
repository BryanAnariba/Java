package classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
  
  public int option;
  public ArrayList<Student> students = new ArrayList<>();
  public static ArrayList<Carrer> carrers = new ArrayList<>();
  private ArrayList<Subject> subjects = new ArrayList<>();

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
  
  public void addSubjectToStudent () {
    int studentSelected;
    int subjectSelected;
    
    studentSelected = Integer.parseInt(JOptionPane.showInputDialog("Select the student: (0-" + (students.size() - 1) + ")"));
    subjectSelected = Integer.parseInt(JOptionPane.showInputDialog("Select the subjeect: (0-" + (subjects.size() - 1) + ")"));
    
    students.get(studentSelected).addSubject(subjects.get(subjectSelected));
    
    JOptionPane.showMessageDialog(null, "Subject added Successfully!!!");
  }
  
  public App() {
    carrers.add(new Carrer(1, 54, "Systems Enginner"));
    carrers.add(new Carrer(2, 54, "Civil Enginner"));
    carrers.add(new Carrer(3, 54, "Chemical Enginner"));
    carrers.add(new Carrer(4, 54, "Electric Enginner"));
    carrers.add(new Carrer(5, 54, "Industrial Enginner"));
    carrers.add(new Carrer(6, 54, "Mechanical Enginner"));
    
    subjects.add(new Subject(1, "Matematica I", 5));
    subjects.add(new Subject(2, "Geometria y Trigonometria", 5));
    subjects.add(new Subject(3, "Calculo I", 5));
    subjects.add(new Subject(4, "Calculo II", 5));
    subjects.add(new Subject(5, "Vectores y Matrices", 3));
    subjects.add(new Subject(3, "Ecuaciones Diferenciales", 3));
    
    do {
      option = Integer.parseInt(JOptionPane.showInputDialog("UNAH STUDENTS CONTROL: \n1. Add Student\n2. Update Student\n3. Delete Student\n4. View All Students\n5. Add Subject\n6. Add Carrer\n0. Exit\nWrite an option: "));

      switch (option) {
        case 1 -> addNewStudent();
        case 2 -> updateStudent();
        case 3 -> deleteAlumno();
        case 4 -> viewAllStudents();
        case 5 -> addSubjectToStudent();
        case 0 -> JOptionPane.showMessageDialog(null, "Bye!!!");
        default -> JOptionPane.showMessageDialog(null, "Option not valid!");
      }
    } while (option != 0);
  }

  public static void main(String[] args) {
    // WTF how is that posible
    new App();
  }
}
