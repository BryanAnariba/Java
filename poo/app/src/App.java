import classes.Carrer;
import classes.Person;
3 52
public class App {
    public static void main(String[] args) throws Exception {
        String[] tecnologies = new String[3];
        tecnologies[0] = "Node";
        tecnologies[1] = "Javascript";
        tecnologies[2] = "Angular";

        Person studentOne = new Person("Student One", "Last Name One", 20, true, tecnologies);
        Carrer studentOneCarrer = new Carrer("Systems Enginner", 5);

        System.out.println(studentOne + " " + studentOneCarrer);
    }
}
